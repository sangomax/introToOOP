package collections.list;

import java.util.*;

public class StackExamples {

    public static void main(String[] args) {

        //Stack class is a legacy class (v1.0)
        Stack<String> s1 = new Stack<>();

        // 1.6 better stack
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("Tenet");
        stack.push("Catch me if yoou can");
        stack.push("Forrest Gump");
        stack.push("Back to the future");
        stack.push("Star Wars");
        stack.push("Home Alone");
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println(checkBalance("if (a(4) > 9) { foo(a(2)); }"));
        System.out.println(checkBalance("for  (i=0;i<(3};i++) { foo{)); )"));
        System.out.println(checkBalance("if (x)  {"));

    }

    /**
     * Write a function checkBalance that accepts a string of
     * source code and checks whether the braces/parentheses are balanced.
     *
     * Every ( or { must be closed by a } or ) in the opposite order
     * Return the index at which an imbalance occurs, or -1 if balanced
     * If any ( or { are never closed, return the string’s length
     *
     * (Examples)  index: 0123456789012345678901234567890
     *  checkBalance(“if (a(4) > 9) { foo(a(2)); }”) returns -1
     *  checkBalance(“for  (i=0;i<(3};i++) { foo{)); )”) returns 14
     *  checkBalance(“if (x)  {”) returns 8
     * @param src
     * @return
     */
    public static int checkBalance(String src) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < src.length(); i++) {
            list.add(src.substring(i,i+1));
        }

        ArrayDeque<String> stack = new ArrayDeque<>();
        for(int i = 0; i < list.size(); i++) {
            switch (list.get(i)) {
                case "(" : stack.push(list.get(i));
                            break;
                case "{" : stack.push(list.get(i));
                            break;
                case ")" : if(stack.peek().equals("(")) {
                                stack.pop();
                                break;
                            } else {
                                return i;
                            }

                case "}" :  if(stack.peek().equals("{")) {
                                stack.pop();
                                break;
                            } else {
                                return i;
                            }
            }
        }
        if(stack.isEmpty()) {
            return -1;
        } else {
            return src.length() -1;
        }
    }


}
