package oop;

public class Operation {
    Operator operator;
    public Operation(Operator operator){//objecct는 아무거나 다 받을 수 있게
        this.operator = operator;
    }

    public int excute(int a, int b){
        return this.operator.excute(a, b);
    }
}