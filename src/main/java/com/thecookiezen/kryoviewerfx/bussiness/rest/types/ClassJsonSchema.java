package com.thecookiezen.kryoviewerfx.bussiness.rest.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.thecookiezen.kryoviewerfx.bussiness.rest.JsonSchemaIdResolver;
import lombok.ToString;

@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeIdResolver(JsonSchemaIdResolver.class)
public abstract class ClassJsonSchema {

    @JsonProperty
    public String name;

    @JsonProperty
    public String type;

    public abstract Class<?> getType();

    public abstract String getTypeString();
}
