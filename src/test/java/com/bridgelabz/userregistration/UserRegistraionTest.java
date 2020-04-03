package com.bridgelabz.userregistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistraionTest {
    UserRegistration object=new UserRegistration();

    @Test
    public void givenUserFirstName_validThenTrue(){
        boolean firstName=object.checkName("FirstName");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenUserFirstName_invalidThenFalse(){
        boolean firstName=object.checkName("firstname");
        Assert.assertFalse(firstName);
    }
}
