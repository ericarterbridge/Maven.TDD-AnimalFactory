package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat(){
        //Given
        String name = "Fluffy";
        Date dob = new Date();
        Cat kitty = AnimalFactory.createCat(name, dob);

        //When
        CatHouse.add(kitty);
        CatHouse.add(kitty);
        int expected = 2;

        //Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
@Test
    public void testRemoveID(){
        //Given
        String name = "Fluffy";
        Date dob = new Date();
        Cat cat = new Cat(name, dob, 36);
        String name1 = "Snowball";
        Date dob1 = new Date();
        Cat cat1 = new Cat(name1, dob1, 58);

        //When
        CatHouse.add(cat);
        CatHouse.add(cat1);
        CatHouse.remove(58);
        int expected = 1;

        //Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);

}
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat(){
        //Given
        String name = "Fluffy";
        Date dob = new Date();
        Cat cat = new Cat(name, dob, 36);
        String name1 = "Snowball";
        Date dob1 = new Date();
        Cat cat1 = new Cat(name1, dob1, 58);

        //When
        CatHouse.add(cat);
        CatHouse.add(cat1);
        CatHouse.remove(cat);
        int expected = 1;

        //Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testCatById(){
        //Given
        String name = "Fluffy";
        Date dob = new Date();
        Cat cat = new Cat(name, dob, 36);
        String name1 = "Snowball";
        Date dob1 = new Date();
        Cat cat1 = new Cat(name1, dob1, 58);

        //When
        CatHouse.add(cat);
        CatHouse.add(cat1);
        Cat expected = cat1;

        //Then
        Cat actual = CatHouse.getCatById(58);
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testNumberOfCats(){
        //Given
        String name = "Fluffy";
        Date dob = new Date();
        Cat cat = new Cat(name, dob, 36);
        String name1 = "Snowball";
        Date dob1 = new Date();
        Cat cat1 = new Cat(name1, dob1, 58);

        //When
        CatHouse.add(cat);
        CatHouse.add(cat1);
        int expected = 2;

        //Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }


}
