package com.stt;

public class Person {
    protected static int totalCount = 0;
    int instanceCount = 0;


    public static void incrementTotalCount() {
        totalCount++;
    }
    public void incrementInstanceCount() {
        instanceCount++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "instanceCount=" + instanceCount +
                " "+
                "totalCount=" + totalCount +
                '}';
    }
}
