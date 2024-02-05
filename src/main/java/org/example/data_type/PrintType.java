package org.example.data_type;

public class PrintType {
    public static void printType(byte a) {
        System.out.println("byte");
    }

    public static void printType(char a) {
        System.out.println("char");
    }

    public static void printType(short a) {
        System.out.println("short");
    }

    public static void printType(int a) {
        System.out.println("int");
    }

    public static void printType(long a) {
        System.out.println("long");
    }

    public static void printType(float a) {
        System.out.println("float");
    }

    public static void printType(double a) {
        System.out.println("double");
    }

    public static void printType(boolean a) {
        System.out.println("boolean");
    }

    public static void printType(Object a) {
        if (a == null) {
            System.out.println("null");
        } else System.out.println(a.getClass());
    }

    public static void main(String[] args) {
        int a = 1;
        boolean b = true;
        printType((byte) a);
        printType((char) a);
        printType((short) a);
        printType((long) a);
        printType((float) a);
        printType(b);
        printType(a);
        printType((Integer) a);
        printType(null);


    }
}
