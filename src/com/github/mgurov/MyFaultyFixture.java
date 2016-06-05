package com.github.mgurov;

public class MyFaultyFixture {

    private Object value;

    public void setFail(String withMessage) {
        throw new RuntimeException(withMessage);
    }

    public void setValue(Object newValue) {
        this.value = newValue;
    }

    public Object getValue() {
        return value;
    }
}
