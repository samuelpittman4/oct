package com.company;

public class Main {


	public static void main( String[] args ) {
        //declare variables here before we use them
        int x, y, answer;
        //all three variables will be declared as integers
        double GPA;
        float Temp;
        //a float uses less memory than a double
        String firstName , lastName;
        String movie = "Juice";     //question is initialized</p>
        //assign values to the variables here
        x = 20;
        y = 2147483647; //you could also use the constant Integer.MAX_VALUE
        answer = 42;
        firstName = "Samuel";
        lastName = "Pittman";
        // String question = "unknown"; //question is initialized
        GPA = 3.0;
        Temp = 32.0f;

        //Use the variables here
            System.out.println("My name is " + firstName + " " + lastName );
            System.out.println( "I am " + x + " years old." );
        System.out.println( "My GPA is " + GPA );


        System.out.println("The last movie I saw was " + movie);




    }

}
