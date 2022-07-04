package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDog(){
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        DogHouse.add(animal);
        DogHouse.add(animal);
        int expected = 3;

        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveID() {
        //Given
        String name = "Fluffy";
        Date dob = new Date();
        Dog dog = new Dog(name, dob, 36);
        String name1 = "Snowball";
        Date dob1 = new Date();
        Dog dog1 = new Dog(name1, dob1, 58);

        //When
        DogHouse.add(dog);
        DogHouse.add(dog1);
        DogHouse.remove(58);
        int expected = 1;

        //Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDog() {
        //Given
        String name = "Fluffy";
        Date dob = new Date();
        Dog dog = new Dog(name, dob, 36);
        String name1 = "Snowball";
        Date dob1 = new Date();
        Dog dog1 = new Dog(name1, dob1, 58);

        //When
        DogHouse.add(dog);
        DogHouse.add(dog1);
        DogHouse.remove(dog);
        int expected = 1;

        //Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById() {
        //Given
        String name = "Fluffy";
        Date dob = new Date();
        Dog dog = new Dog(name, dob, 36);
        String name1 = "Snowball";
        Date dob1 = new Date();
        Dog dog1 = new Dog(name1, dob1, 58);

        //When
        DogHouse.add(dog);
        DogHouse.add(dog1);
        Dog expected = dog1;

        //Then
        Dog actual = DogHouse.getDogById(58);
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        int expected = 1;

        // Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
}
