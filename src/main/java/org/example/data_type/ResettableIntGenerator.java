package org.example.data_type;

public class ResettableIntGenerator implements IntGenerator, Resettable {
    public int numberOfCalls;

    public ResettableIntGenerator() {
        this.numberOfCalls = 0;
    }

    @Override
    public int nextInt() {
        return numberOfCalls++;
    }

    @Override
    public void reset() {
        numberOfCalls = 0;
    }
}
