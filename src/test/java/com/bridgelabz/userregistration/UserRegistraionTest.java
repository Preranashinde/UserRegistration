package com.bridgelabz.userregistration;
import org.junit.Assert;
import org.junit.Test;
public class UserRegistraionTest {
    UserRegistration object = new UserRegistration();
    @Test
    public void givenUserFirstName_validThenTrue() {
        boolean firstName = object.checkName("FirstName");
        Assert.assertTrue(firstName);
    }
    @Test
    public void givenUserFirstName_invalidThenFalse() {
        boolean firstName = object.checkName("firstname");
        Assert.assertFalse(firstName);
    }
    @Test
    public void givenUserLastName_validThenTrue() {
        boolean lastName = object.checkName("LastName");
        Assert.assertTrue(lastName);
    }
    @Test
    public void givenUserLastName_invalidThenFalse() {
        boolean lastName = object.checkName("lastname");
        Assert.assertFalse(lastName);
    }
    @Test
    public void email_ValidThenTrue() {
        String validEmails[] = {"abc.xyz@bl.co.in", "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@gmail.com.com", "abc+100@gmail.com"};
        for (int index = 0; index < validEmails.length; index++) {
            boolean email = object.checkEmail(validEmails[index]);
            Assert.assertTrue(email);
        }
    }
    @Test
    public void email_InvalidThenFalse() {
        String invalidEmails[] = {"abc", "abc()*@gmail.com", "abc@.com.my", "abc123@gmail.a",
                "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
                "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
                "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
        for (int index1 = 0; index1 < invalidEmails.length; index1++) {
            boolean Email = object.checkEmail(invalidEmails[index1]);
            Assert.assertFalse(Email);
        }
    }
    @Test
    public void mobileNumber_ValidThenTrue() {
        boolean MobileNumber=object.checkMobile("91 1234567890");
        Assert.assertTrue(MobileNumber);
    }

    @Test
    public void mobileNumber_ValidThenFalse() {
        boolean MobileNumber=object.checkMobile("234567890");
        Assert.assertFalse(MobileNumber);
    }

    @Test
    public void password_ValidThenTrue() {
        boolean Password=object.checkPassword("12345678");
        Assert.assertTrue(Password);
    }

    @Test
    public void password_InvalidThenFalse() {
        boolean Password=object.checkPassword("1234");
        Assert.assertFalse(Password);
    }

    @Test
    public void password2_ValidThenTrue() {
        boolean Password2=object.checkPassword2("PreranaShinde");
        Assert.assertTrue(Password2);
    }

    @Test
    public void password2_InvalidThenFalse() {
        boolean Password2=object.checkPassword2("preranashinde");
        Assert.assertFalse(Password2);
    }

    @Test
    public void password3_ValidThenTrue() {
        boolean Password3=object.checkPassword3("Prerana30");
        Assert.assertTrue(Password3);
    }

    @Test
    public void password3_InvalidThenFalse() {
        boolean Password3=object.checkPassword3("prerana30");
        Assert.assertFalse(Password3);
    }

    @Test
    public void password4_ValidThenTrue() {
        boolean Password4=object.checkPassword4("Prerana@30");
        Assert.assertTrue(Password4);
    }

    @Test
    public void password4_InvalidThenFalse() {
        boolean Password4=object.checkPassword4("prerana@30$shinde");
        Assert.assertFalse(Password4);
    }
}