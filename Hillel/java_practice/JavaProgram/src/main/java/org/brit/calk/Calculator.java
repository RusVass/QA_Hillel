package org.brit.calk;

public class Calculator  {
    private Double firstOperand;
    private Double secondOperand;
    private Operation operation;
    private Double result = 0.0;

    public Calculator firstOperand(Double firstOperand) {
        this.firstOperand = firstOperand;
        return this;
    }

    public Calculator secondOperand(Double secondOperand) {
        this.secondOperand = secondOperand;
        return this;
    }

    public Calculator operation(Operation operation) {
        this.operation = operation;
        return this;
    }


   public Calculator plus() {
        return operation(Operation.PLUS);
    }

    public Calculator minus() {
        return operation(Operation.MINUS);
   }

    public Calculator div() {
        return operation(Operation.DIV);
    }

    public Calculator multy() {
        return operation(Operation.MULTY);
    }


    public Calculator equal() {
        calculate();
        return this;
    }

    public Double getResult() {
        return result;
    }
    public  Calculator clear(){
        firstOperand = 0.0;
        secondOperand = 0.0 ;
        result = 0.0;
        operation=Operation.NA;
        return this;
    }


    public void calculate() {
        switch (operation) {
            case PLUS -> result = firstOperand + secondOperand;
            case MINUS -> result = firstOperand - secondOperand;
            case MULTY -> result = firstOperand * secondOperand;
            case DIV -> {
                if (secondOperand == 0) {
                    System.out.println("Cannot divide by 0");
                    result = null;
                } else {
                    result = firstOperand / secondOperand;
                }
            }
            case NA-> System.out.println("i cannot apply this operation");
        }

    }
}
