package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName() {
        //Given
        Cat cat = new Cat(null, null, null);
        String expected = "PrettyKitty";

        //When
        cat.setName(expected);
        String actual = cat.getName();

        //Then
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //Given
        Cat cat = new Cat(null, null, null);
        String expected = "meow!";

        //When
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthdate(){
        //Given
        Cat cat = new Cat(null, null, null);
        Date expected = new Date(1984,8,24);

        //When
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        //Given
        Cat cat = new Cat(null, null, null);
        int expected = 4;
        Food food = new Food();

        //When
        cat.eat(food);
        cat.eat(food);
        cat.eat(food);
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testID(){
        //Given
        Cat cat = new Cat(null, null, 36);
        Integer expectedID = 36;

        //When

        Integer actualID = cat.getId();

        //Then
        Assert.assertEquals(expectedID, actualID);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testInstanceOfAnimal(){
        //Given
        Cat cat = new Cat(null, null, null);

        //Then
        Assert.assertTrue(cat instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testInstanceOfMammal(){
        //Given
        Cat cat = new Cat(null, null, null);

        //Then
        Assert.assertTrue(cat instanceof Mammal);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
