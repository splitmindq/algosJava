package org.example;
import java.util.Scanner;
import java.util.Stack;
public class Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        boolean isBalanced = checkBalancedBrackets(input);
        if (isBalanced) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }

    private static boolean checkBalancedBrackets(String input) {
        Stack<Character>openBrackets = new Stack<>();

        for (char bracket : input.toCharArray()) {
            if (isOpeningBracket(bracket)) {
                openBrackets.push(bracket);
            }

            else if (isClosingBracket(bracket)) {
                if (openBrackets.isEmpty()) {
                    return false;
                }
                char top = openBrackets.peek();
                if (isBracketClosed(top, bracket)) {
                    openBrackets.pop();
                } else {
                    return false;
                }
            }
        }

        return openBrackets.isEmpty();
    }

    private static boolean isOpeningBracket(char bracket) {
        return bracket == '(' || bracket == '{' || bracket == '[';
    }

    private static boolean isClosingBracket(char bracket) {
        return bracket == ')' || bracket == '}' || bracket == ']';
    }

    private static boolean isBracketClosed(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }
}