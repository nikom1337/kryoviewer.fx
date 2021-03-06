package com.thecookiezen.kryoviewerfx.bussiness.schema.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import lombok.ToString;

import java.util.LinkedHashMap;
import java.util.Map;

@ToString
public class ObjectSchema extends RootSchema {

    @JsonProperty
    public String name;

    @JsonProperty
    public Map<String, ClassJsonSchema> properties = new LinkedHashMap<>();

    public ObjectSchema() {
        properties = new LinkedHashMap<>();
    }

    public Map<String, ClassJsonSchema> getProperties() {
        return properties;
    }

    @Override
    public Class<Object> getType() {
        return Object.class;
    }

    @Override
    public String getTypeString() {
        return JsonFormatTypes.OBJECT.value();
    }

    @Override
    public boolean isPrimitive() {
        return false;
    }
}
