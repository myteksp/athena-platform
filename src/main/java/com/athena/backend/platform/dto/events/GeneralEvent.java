package com.athena.backend.platform.dto.events;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gf.collections.GfCollections;

public final class GeneralEvent {
	public String name;
	public Map<String, Object> params;
	
	public GeneralEvent(){}
	
	public GeneralEvent(final String name, final Map<String, Object> params){
		this.name = name;
		this.params = params;
	}
	
	public GeneralEvent(final String name){
		this(name, new HashMap<String, Object>());
	}
	
	public GeneralEvent(final String name, final List<Object> params){
		final Map<String, Object> map = new HashMap<String, Object>(params.size());
		boolean isKey = true;
		String key = null;
		for (int i = 0; i < params.size(); i++) {
			if (isKey){
				final Object obj = params.get(i);
				if (obj != null){
					key = obj.toString();
					isKey = false;
				}
			}else{
				map.put(key, params.get(i));
				isKey = true;
			}
		}
		this.name = name;
		this.params = map;
	}
	
	public GeneralEvent(final String name, final Object ...params){
		this(name, GfCollections.asArrayCollection(params));
	}

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((params == null) ? 0 : params.hashCode());
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
		final GeneralEvent other = (GeneralEvent) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (params == null) {
			if (other.params != null)
				return false;
		} else if (!params.equals(other.params))
			return false;
		return true;
	}
	@Override
	public final String toString() {
		return "GeneralEvent [name=" + name + ", params=" + params + "]";
	}
}
