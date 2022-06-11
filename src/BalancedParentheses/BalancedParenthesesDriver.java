package BalancedParentheses;

import Common.*;

import java.util.Scanner;

public class BalancedParenthesesDriver {
    public static void main(String[] args) {
        BalancedParenthesesService obj = new BalancedParenthesesService();
        if(obj.check())
        {
            System.out.println("The parenthesis are balanced");
        }
        else {
            System.out.println("The parenthesis are not balanced");
        }
    }
}
