package com.axxes.exercises.produce_consume;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleObject {

    private final String field1;
    private final int field2;

    public SimpleObject(@JsonProperty(value = "field1") final String field1,
                        @JsonProperty(value = "field2") final int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public int getField2() {
        return field2;
    }

    @Override
    public String toString() {
        return "SimpleObject{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                '}';
    }
}
