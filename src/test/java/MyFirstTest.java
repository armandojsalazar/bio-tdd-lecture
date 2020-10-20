import org.junit.Test;
import static org.junit.Assert.*;


public class MyFirstTest {
    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect(){
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertEquals(4.9, price - discount, 0.6);

    }

    @Test
    public void testIfObjectAreDifferent(){
        Object dog = new Object();
        Object sheep = new Object();
        Object clonedSheep = sheep;

        System.out.println("dog = " + dog);
        System.out.println("sheep = " + sheep);
        System.out.println("clonedSheep = " + clonedSheep);

        assertNotSame(sheep, dog);
        assertSame(sheep, clonedSheep);

    }

    @Test
    public void testIfArrayEquals(){
        char[] expected = {'J', 'u', 'n', 'i', 't'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test

    public void testIfGreaterOrLesserThanWorks(){

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testIfInstanceIsNull(){
        Device phone = new Device();
        Device mac = null;

        assertNull(mac);
        assertNotNull(phone);
    }

    @Test
    public void testIfDeviceNameIsPossible(){
        Device phone = new Device("Pixel 5");
        assertEquals("Pixel 5", phone.getName());
        }
    }

