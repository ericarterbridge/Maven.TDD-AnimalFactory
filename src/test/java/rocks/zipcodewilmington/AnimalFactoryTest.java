package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog(){
        //Given
        String expectedName = "Fluffy";
        Date expectedDOB = new Date(2019, 04, 14);

        //When
        Dog dog = new Dog(expectedName, expectedDOB, null);

        //Then
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDOB, actualDate);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat(){
        //Given
        String expectedName = "Snowball";
        Date expectedDOB = new Date(2019, 04, 15);

        //When
        Cat cat = new Cat(expectedName, expectedDOB, null);

        //Then
        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDOB, actualDate);
    }
}
