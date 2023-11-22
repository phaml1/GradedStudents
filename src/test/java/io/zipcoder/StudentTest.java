package io.zipcoder;
import org.junit.Test;
import org.junit.Assert;
public class StudentTest {
    Double[] expectedTest = new Double[2];
    Student actual = new Student("Anthony", "Pham", expectedTest);
    @Test
    public void constructorTest(){
        String expectedFirst = "Anthony";
        String expectedLast = "Pham";
        //Student actual = new Student("Anthony", "Pham", expectedTest);

        Assert.assertEquals(expectedFirst, actual.getFirstName());
        Assert.assertEquals(expectedLast, actual.getLastName());
    }

    @Test
    public void getFirstNameTest(){
        String expectedFirst = "Anthony";
        //Student actual = new Student("Anthony", "Pham", expectedTest);
        Assert.assertEquals(expectedFirst, actual.getFirstName());
    }

    @Test
    public void setFirstNameTest(){
        String expectedFirst = "Anthony";
        actual.setFirstName("Anthony");
        Assert.assertEquals(expectedFirst, actual.getFirstName());
    }

    @Test
    public void setLastNameTest(){
        String expectedLast = "Pham";
        actual.setLastName("Pham");
        Assert.assertEquals(expectedLast, actual.getLastName());
    }
    @Test
    public void getLastNameTest(){
        String expectedLast = "Pham";
        Assert.assertEquals(expectedLast, actual.getLastName());
    }
}