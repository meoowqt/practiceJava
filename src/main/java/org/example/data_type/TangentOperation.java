package org.example.data_type;

public class TangentOperation extends Operation {

    @Override
    double apply(double number) {
        return Math.tan(number);
    }
}
