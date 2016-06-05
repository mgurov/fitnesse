package com.github.mgurov;

import fitnesse.slim.fixtureInteraction.DefaultInteraction;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StopOnException extends DefaultInteraction {

    @Override
    public Object newInstance(Constructor<?> constructor, Object... initargs) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        try {
            return super.newInstance(constructor, initargs);
        } catch (Throwable e) {
            throw new StopTestException("Instantiation failed", e);
        }
    }

    @Override
    public Object methodInvoke(Method method, Object instance, Object... convertedArgs) throws InvocationTargetException, IllegalAccessException {
        try {
            return super.methodInvoke(method, instance, convertedArgs);
        } catch (Throwable e) {
            throw new StopTestException(e.getMessage(), e);
        }
    }

    public static class StopTestException extends RuntimeException {

        public StopTestException(String s, Throwable e) {
            super(s, e);
        }
    }
}
