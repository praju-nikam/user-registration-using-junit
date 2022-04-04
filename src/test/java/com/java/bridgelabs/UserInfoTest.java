package com.java.bridgelabs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserInfoTest
{
    UserInfo userInfo = new UserInfo();
    @Test
   public void  whenFirstName_ShouldProper_ShouldReturnTrue() {

        boolean result = userInfo.userFirstName("Prajakta");
        Assertions.assertTrue(result);
    }
    @Test
    public void  whenFirstName_ShouldProper_ShouldReturnFalse() {

        boolean result = userInfo.userFirstName("prajakta");
        Assertions.assertFalse(result);
    }

    public void  whenLastName_ShouldProper_ShouldReturnTrue() {

        boolean result = userInfo.userLastName("Nikam");
        Assertions.assertTrue(result);
    }
    @Test
    public void  whenLastName_ShouldProper_ShouldReturnFalse() {

        boolean result = userInfo.userLastName("nikam");
        Assertions.assertFalse(result);
    }
    @Test
    public void  when_emailId_ShouldProper_ShouldReturnTrue() {

        boolean result = userInfo.userEmailId("sawantprajakta84@gmail.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void  when_emailId_ShouldProper_ShouldReturnFalse() {

        boolean result = userInfo.userEmailId("sawantprajaktgmail.com");
        Assertions.assertFalse(result);
    }
    @Test
    public void  when_phoneNumber_ShouldProper_ShouldReturnTrue() {

        boolean result = userInfo.userPhoneNumber("8485821504");
        Assertions.assertTrue(result);
    }
    @Test
    public void  when_phoneNumber_ShouldProper_ShouldReturnFalse() {

        boolean result = userInfo.userPhoneNumber("996022467p");
        Assertions.assertFalse(result);
    }

    @Test
    public void  when_password_ShouldProper_ShouldReturnTrue() {

        boolean result = userInfo.userPassword("8485@Praju");
        Assertions.assertTrue(result);
    }
    @Test
    public void  when_password_ShouldProper_ShouldReturnFalse() {

        boolean result = userInfo.userPassword("12anvi");
        Assertions.assertFalse(result);
    }
}
