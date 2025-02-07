package oop_hus.finalexam.mymath;

import java.util.Stack;
import java.util.function.Function;

public class UnivariateRealFunction implements AbstractFunction {
    private String function;
    private UnivariateRealFunction derivative;
    public UnivariateRealFunction() {
    }

    public UnivariateRealFunction(String function) {
        this.function = function;
    }

    public UnivariateRealFunction(String function, String derivative) {
        this.function = function;
        this.derivative = new UnivariateRealFunction(derivative);
    }

    @Override
    public UnivariateRealFunction getDerivative() {
        return derivative;
    }

    @Override
    public void setDerivative(AbstractFunction derivative) {
        this.derivative = (UnivariateRealFunction) derivative;
    }

    @Override
    public double evaluate(double x) {
        Stack<Double> st = new Stack<>();
        Stack<String> op = new Stack<>();
        boolean may_be_unary = true;
        for(int i = 0; i < function.length(); i++) {
            char c = function.charAt(i);
            if(isDelimiter(c)) {
                continue;
            }

            if(c == '(') {
                op.push("(");
                may_be_unary = true;
            } else if(c == ')') {
                while(!op.peek().equals("(")) {
                    st.push(processOperator(op.pop(), st));
                }
                op.pop();
                may_be_unary = false;
            } else if(isOperator(c)) {
                String currentOp = "" + c;
                if(may_be_unary && isUnary(c)) {
                    if(c == '-') {
                        currentOp = "neg";
                    } else {
                        currentOp = "pos";
                    }
                } else if(c == '^') {
                    currentOp = "" + c;
                } else
                if(c == 's') {
                    i += 2;
                    currentOp = "sin";
                } else if(c == 'c') {
                    i += 2;
                    if(function.charAt(i) == 't') {
                        currentOp = "cot";
                    } else {
                        currentOp = "cos";
                    }
                } else if(c == 't') {
                    i += 2;
                    currentOp = "tan";
                }
                while(!op.isEmpty() && getPriority(op.peek().charAt(0)) >= getPriority(c)) {
                    st.push(processOperator(op.pop(), st));
                }
                op.push(currentOp);
            } else if(c == 'x') {
                st.push(x);
            } else {
                double number = 0;
                while(i < function.length() && isNumber(function.charAt(i))) {
                    number = number * 10 + (function.charAt(i) - '0');
                    i++;
                }
                i--;
                st.push(number);

            }
        }

        while(!op.isEmpty()) {
            st.push(processOperator(op.pop(), st));
        }

        return st.pop();

    }

    boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == 's' || c == 'c' || c == 't';
    }

    boolean isOperand(char c) {
        return c >= '0' && c <= '9';
    }

    boolean isDelimiter(char c) {
        return c == ' ';
    }

    private double processOperator(String op, Stack<Double> st) {
        switch(op) {
            case "+":
                return st.pop() + st.pop();
            case "-":
                return -st.pop() + st.pop();
            case "*":
                return st.pop() * st.pop();
            case "/":
                return 1 / st.pop() * st.pop();
            case "sin":
                return MyMath.sin(st.pop());
            case "cos":
                return MyMath.cos(st.pop());
            case "tan":
                return Math.tan(st.pop());
            case "cot":
                return 1 / Math.tan(st.pop());
            case "^":
                System.out.println(st.peek() + " " + st.peek());
                double b = st.pop();
                double a = st.pop();
                return Math.pow(a, b);
            case "neg":
                return -st.pop();
            case "pos":
                return st.pop();
        }
        return 0;
    }

    private boolean isUnary(char c) {
        return c == '+' || c == '-';
    }

    int getPriority(char c) {
        if(c == '+' || c == '-') {
            return 1;
        } else if(c == '*' || c == '/') {
            return 2;
        } else if(c == '^') {
            return 3;
        } else if(c == 's' || c == 'c' || c == 't') {
            return 4;
        }
        return 0;
    }

    public static void main(String[] args) {
        UnivariateRealFunction function = new UnivariateRealFunction("sin(x)*x - 3");
        System.out.println(function.evaluate(10));
    }
}
