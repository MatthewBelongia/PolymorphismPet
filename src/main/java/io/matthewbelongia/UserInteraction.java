package io.matthewbelongia;

import java.util.Scanner;

/**
 * Created by matthewb on 5/6/16.
 */
public class UserInteraction  {

    public String promptUserInputForString(){
        boolean success = false;
        Scanner promptUser = new Scanner(System.in);
        while(!success) {
            String input = promptUser.next();
            String pattern =  "[a-zA-Z][a-zA-Z ]*";

            if (input.matches(pattern)) {
                return input;
            } else {
                System.out.println("Letters and spaces only please");
                continue;
            }
        }
        return "error";
    }

    public int promptUserInputForInteger(){
        boolean success = false;
        Scanner promptUser = new Scanner(System.in);
        while(!success) {
            String input = promptUser.next();
            if (input.matches("\\d+")) {
                return Integer.parseInt(input);
            } else {
                System.out.println("Please type an Integer");
                continue;
            }
        }
        return Integer.parseInt("0");
    }


}
