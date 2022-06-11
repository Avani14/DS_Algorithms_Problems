package BalancedParentheses;

import Common.IStack;
import Common.Stack;

import java.util.Scanner;

public class BalancedParenthesesService{
    static Scanner sc = new Scanner(System.in);
    public boolean check()
    {
        IStack<Character> stack = new Stack<Character>();
        String input = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        System.out.println("The string is "+input);
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c == '('|| c == '[' || c == '{'){
            stack.push(c);
            continue;
            }
            if(stack.isEmpty())
            {
                return false;
            }
            else{
            char check;
            switch (c) {
                case ')' -> {
                    check = stack.pop();
                    if (check == '(')
                        return true;
                }
                case '}' -> {
                    check = stack.pop();
                    if (check == '{')
                        return true;
                }
                case ']' -> {
                    check = stack.pop();
                    if (check == '[')
                        return true;
                }
            }
            }
        }
        boolean ans = false;
        if(stack.isEmpty())
        {
            ans = true;
        }
        return ans;
    }
}
