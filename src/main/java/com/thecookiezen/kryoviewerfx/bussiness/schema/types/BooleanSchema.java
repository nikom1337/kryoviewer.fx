package com.thecookiezen.kryoviewerfx.bussiness.schema.types;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

public class BooleanSchema extends PrimitiveSchema {

    @Override
    public Class<Boolean> getType() {
        return boolean.class;
    }

    @Override
    public String getTypeString() {
        return JsonFormatTypes.BOOLEAN.value();
    }
}
