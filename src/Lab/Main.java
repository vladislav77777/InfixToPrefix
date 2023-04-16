package Lab;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scanner.nextLine();
        MyStack<Integer> stack = new MyStack();
        String[] elems = (infixToPrefix(str)).split(" ");

        for (String elem : elems) {
            if (Character.isDigit(elem.charAt(0))) {
                stack.push(Integer.parseInt(elem));
            } else if (elem.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (elem.equals("-")) {
                int op2 = stack.pop();
                stack.push(stack.pop() - op2);
            } else if (elem.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (elem.equals("/")) {
                int op2 = stack.pop();
                if (op2 == 0.0) {
                    System.out.println("Dividing by zero is undefined\n");
                } else {
                    stack.push(stack.pop() / op2);
                }
            } else if (elem.equals("min")) {
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push((op1 < op2) ? op1 : op2);
            } else if (elem.equals("max")) {
                int op1 = stack.pop();
                int op2 = stack.pop();
                stack.push((op1 > op2) ? op1 : op2);
            }
        }
        System.out.println(stack.pop());
    }

    public static String infixToPrefix(String exp) {
        MyStack<String> stk = new MyStack();
        String output = new String("");
        String[] expression = exp.split(" ");
        String rm = "";

        for (int i = 0; i < expression.length; i++) {
            String c = expression[i];

            if (c.equals(",")) {
                while (!stk.isStackEmpty() && !stk.peek().equals("(")) {
                    output += stk.pop() + " ";
                }

            } else if (c.equals("max")) {
                stk.push("max");
            } else if (c.equals("min")) {
                stk.push("min");
            } else if (Character.isDigit(c.charAt(0))) {
                output += (c + " ");
            } else if (c.equals("(")) {
                stk.push(c);

            } else if (c.equals(")")) {
                while (!stk.isStackEmpty() && !stk.peek().equals("(")) {
                    output += stk.pop() + " ";
                }
                stk.pop();
            } else {
                while (!stk.isStackEmpty() && getPrecedence(c) <= getPrecedence(stk.peek())) {
                    if (stk.peek().equals("("))
                        return "This expression is invalid";
                    output += (stk.pop() + " ");
                }
                stk.push(c);
            }

        }
        while (!stk.isStackEmpty()) {
            output += (stk.pop() + " ");
        }

        return output;
    }

    static int getPrecedence(String ch) {
        if (ch.equals("+") || ch.equals("-"))
            return 1;
        else if (ch.equals("*") || ch.equals("/"))
            return 2;
        else if (ch.equals("min") || ch.equals("max")) {
            return 3;
        } else
            return -1;
    }
}

