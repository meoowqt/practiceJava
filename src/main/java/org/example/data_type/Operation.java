package org.example.data_type;

abstract class Operation {
    abstract double apply(double number);

    public double applyTriple(double number) {
        for (int i = 0; i < 3; i++) {
            number = apply(number);
        }
        return number;
    }
}
