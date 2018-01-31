package com.athena.backend.platform.dto.geometry;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PointDTO {
	public double x;
	public double y;
	
	public PointDTO(final double x, final double y){
		this.x = x;
		this.y = y;
	}
	
	public PointDTO(){}
	
	public PointDTO(final PointDTO point){
		this(point.x, point.y);
	}
	
	@Override
	public final PointDTO clone(){
		return new PointDTO(this);
	}
	
	public final double distance(final PointDTO point){
		return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		final PointDTO other = (PointDTO) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "PointDTO [x=" + x + ", y=" + y + "]";
	}
}
