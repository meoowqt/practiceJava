package org.example.data_type;

public class IntGeneratorImpl implements IntGenerator {
    public int numberOfCalls;

    public IntGeneratorImpl() {
        this.numberOfCalls = 0;
    }

    @Override
    public int nextInt() {
        return numberOfCalls++;
    }
}
