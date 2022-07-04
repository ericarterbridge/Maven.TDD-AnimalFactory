package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //Given
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";

        //When
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthdate(){
        //Given
        Dog dog = new Dog(null, null, null);
        Date expected = new Date(1983,5,17);

        //When
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        //Given
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        int expected = 2;

        //When
        dog.eat(food);
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        //Given
        Dog dog = new Dog(null, null, 58);
        int expected = 58;

        //When
        int actual = dog.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testInstanceOfAnimal(){
        //Given
        Dog dog = new Dog(null, null, null);

        //Then
        Assert.assertTrue(dog instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testInstanceOfMammal(){
        //Given
        Dog dog = new Dog(null, null, null);

        //Then
        Assert.assertTrue(dog instanceof Mammal);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
