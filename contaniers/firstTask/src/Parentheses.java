//Task 1.3.4

import java.util.Scanner;
import java.util.Stack;

public class Parentheses
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = scanner.nextLine();
        Stack<Character>openBrackets = new Stack<>();

        for(char bracket : string.toCharArray()) {
            if(bracket == '(' || bracket == '{' || bracket == '[') {
                openBrackets.push(bracket);
            }
            else if (bracket == '}' || bracket == ']' || bracket == ')') {

                if (openBrackets.isEmpty()) {
                    System.out.println("False");
                    return;
                }

                char top = openBrackets.peek();

                if((bracket == ')' && top == '(') ||
                        (bracket == '}' && top == '{') ||
                        (bracket == ']' && top == '[')){
                    openBrackets.pop();
                }
                else {
                    System.out.println("False");
                    return;
                }

            }

        }


        if (openBrackets.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();


    }


}
