package org.hillel.courses.objects;

public class Calculator {
    private int operand1;
    private int operand2;
    private String name = "Default";

    public int addition(){
        int result = operand1 + operand2;
        return result;
    }

    public Calculator(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public Calculator(int operand1, int operand2, String name){
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int subtraction() {
        return operand1 - operand2;
    }
}
