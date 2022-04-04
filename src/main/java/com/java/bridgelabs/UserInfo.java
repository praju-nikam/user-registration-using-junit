package com.java.bridgelabs;

import java.util.Scanner;
import java.util.regex.Pattern;
/*
  * purpose : Use of java Regular Expression Patterns to Solve User Registration Problem.
  * @author : Prajakta
  * @Since : 01-04-2022
 */
public class UserInfo
{

    /*
       Added  first name method to check first name
    */
    public  boolean userFirstName(String firstName)
    {
        boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}",firstName);
        if (result)
        {
            System.out.println("Correct");
        }
        else{
            System.out.println("Please enter valid first name : ");
        }

        return result;
    }

    /*
         Added last name method to check last name
     */
    public boolean userLastName(String lastName)
    {

        boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}",lastName);
        if(result)
        {
            System.out.println("Correct");
        }
        else {
            System.out.println("Please enter valid last name : ");
        }
        return result;
    }

    /*
     Added email id method to check email id
   */
    public boolean userEmailId(String emailId)
    {

        boolean result = Pattern.matches("[a-z A-Z 0-9]+[@][a-z A-Z 0-9]+[.][a-z]{2,3}$",emailId);
        if (result)
        {
            System.out.println("Correct");
        }
        else {
            System.out.println("Please enter correct email id : " );
        }
        return result;
    }

    /*
        Added phone number method to check phone number
    */
    public boolean userPhoneNumber(String phoneNumber)
    {

        boolean result = Pattern.matches("[6-9]{1}[0-9]{9}",phoneNumber);
        if (result) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Please enter correct phone number");
        }
        return result;
    }

     /*
        Added Password method to check password
    */

    public boolean userPassword(String password)
    {

        boolean result =  Pattern.matches( "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",password);

        if (result) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Please enter correct password");
        }
        return result;
    }
}
