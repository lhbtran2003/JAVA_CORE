package bai2;

public class Calculator {
    int a,b,c;

    public Calculator(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int  add(int a, int b, int c) {
        return a+b+c;
    }
}
