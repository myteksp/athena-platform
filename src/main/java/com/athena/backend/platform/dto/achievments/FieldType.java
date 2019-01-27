package com.athena.backend.platform.dto.achievments;

import java.time.temporal.Temporal;


public enum FieldType {
	STRING,
    NUMBER,
    DATE,
    BOOLEAN,
    ARRAY;

    public static FieldType getFieldType(Object object){
        if (null == object){
            return STRING;
        }
        if(object instanceof Number){
            return NUMBER;
        }
        if(object instanceof Boolean){
            return BOOLEAN;
        }
        if(object instanceof Temporal){
            return DATE;
        }
        if(object.getClass().isArray()){
            return ARRAY;
        }
        return STRING;
    }
}
