package com.athena.backend.platform.dto.geometry;

import java.util.List;

import com.gf.collections.GfCollections;
import com.gf.collections.functions.MapFunction;

public final class PolygonDTO {
	public List<PointDTO> points;

	public PolygonDTO(){
		this.points = GfCollections.asArrayCollection();
	}

	public PolygonDTO(final List<PointDTO> points){
		this.points = GfCollections.asArrayCollection(points)
				.map(new MapFunction<PointDTO, PointDTO>() {
					@Override
					public final PointDTO map(final PointDTO p) {
						return p.clone();
					}
				});
	}

	public PolygonDTO(final PointDTO ...points){
		this.points = GfCollections.asArrayCollection(points)
				.map(new MapFunction<PointDTO, PointDTO>() {
					@Override
					public final PointDTO map(final PointDTO p) {
						return p.clone();
					}
				});
	}

	public PolygonDTO(final PolygonDTO polygon){
		this(polygon.points);
	}

	public final double perimeter() {
		double sum = 0.0;
		for (int i = 0; i < points.size() - 1; i++)
			sum = sum + points.get(i).distance(points.get(i + 1));
		return sum;
	}

	public final double area(){
		double sum = 0.0;
		for (int i = 0; i < points.size() - 1; i++){
			final PointDTO a = points.get(i);
			final PointDTO b = points.get(i + 1);
			sum = sum + (a.x * b.y) - (a.y * b.x);
		}
		return 0.5 * sum;
	}

	public final boolean contains(final PointDTO point){
		int crossings = 0;
		for (int i = 0; i < points.size() - 1; i++){
			final PointDTO a = points.get(i);
			final PointDTO b = points.get(i + 1);
            if (((a.y <= point.y) && (point.y < b.y)) || ((b.y <= point.y) && (point.y < a.y))) 
                if (point.x < (b.x - a.x) * (point.y - a.y) / (b.y - a.y) + a.x)
                    crossings++;
		}
		if (crossings % 2 == 1) 
			return true;
		else 
			return false; 
	}

	@Override
	public PolygonDTO clone(){
		return new PolygonDTO(this);
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((points == null) ? 0 : points.hashCode());
		return result;
	}
	@Override
	public final boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final PolygonDTO other = (PolygonDTO) obj;
		if (points == null) {
			if (other.points != null)
				return false;
		} else if (!points.equals(other.points))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PolygonDTO [points=" + points + "]";
	}
}
