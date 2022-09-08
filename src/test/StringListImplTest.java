package test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import secondCourse.task2_14.StringList;
import secondCourse.task2_14.StringListImpl;

import java.util.NoSuchElementException;

public class StringListImplTest {
    StringList stringList;
    StringList stringList1;

    @Test
    public void addTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");

        String[] expected = {"1", "2", "3", "4", "5"};

        Assertions.assertArrayEquals(expected, stringList.toArray());
        Assertions.assertSame(5, stringList.size());
    };

    @Test
    public void addNullTest(){
        stringList = new StringListImpl();
        Assertions.assertThrows(NullPointerException.class, () -> stringList.add(null));
    };

    @Test
    public void addByIndexTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("4");
        stringList.add(2, "3");

        String[] expected = {"1", "2", "3", "4"};

        Assertions.assertArrayEquals(expected, stringList.toArray());
        Assertions.assertSame(4, stringList.size());
    };

    @Test
    public void addByIndexNullTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("4");

        Assertions.assertThrows(NullPointerException.class, () -> stringList.add(2, null));
    };

    @Test
    public void addByInvalidIndexTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("4");

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> stringList.add(315, "2"));
    };

    @Test
    public void setTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.set(2, "5");

        String[] expected = {"1", "2", "5", "4"};

        Assertions.assertArrayEquals(expected, stringList.toArray());
        Assertions.assertSame(4, stringList.size());
    };

    @Test
    public void setNullTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("4");

        Assertions.assertThrows(NullPointerException.class, () -> stringList.set(2, null));
    };

    @Test
    public void setByInvalidIndexTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("4");

        Assertions.assertThrows(NullPointerException.class, () -> stringList.set(315, null));
    };

    @Test
    public void removeByItemTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");

        stringList.remove("2");

        String[] expected = {"1", "3", "4"};

        Assertions.assertArrayEquals(expected, stringList.toArray());
        Assertions.assertSame(3, stringList.size());
    };

    @Test
    public void removeByNullItemTest(){
        stringList = new StringListImpl();

        Assertions.assertThrows(NullPointerException.class, () -> stringList.remove(null));
    };

    @Test
    public void removeUnexcitingItemTest(){
        stringList = new StringListImpl();

        Assertions.assertThrows(NoSuchElementException.class, () -> stringList.remove("2"));
    };

    @Test
    public void removeByIndexTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");

        stringList.remove(1);

        String[] expected = {"1", "3", "4"};

        Assertions.assertArrayEquals(expected, stringList.toArray());
        Assertions.assertSame(3, stringList.size());
    };

    @Test
    public void removeByInvalidIndexTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("4");

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> stringList.remove(315));
    };

    @Test
    public void containsTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        Assertions.assertTrue(stringList.contains("2"));
        Assertions.assertFalse(stringList.contains("4"));
    };

    @Test
    public void containsNullTest(){
        stringList = new StringListImpl();

        Assertions.assertThrows(NullPointerException.class, () -> stringList.contains(null));
    };

    @Test
    public void indexOfTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("2");

        Assertions.assertSame(1, stringList.indexOf("2"));
        Assertions.assertSame(-1, stringList.indexOf("5"));
    };

    @Test
    public void indexOfNullTest(){
        stringList = new StringListImpl();

        Assertions.assertThrows(NullPointerException.class, () -> stringList.indexOf(null));
    };

    @Test
    public void lastIndexOfTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("2");

        Assertions.assertSame(4, stringList.lastIndexOf("2"));
        Assertions.assertSame(-1, stringList.lastIndexOf("5"));
    };

    @Test
    public void lastIndexOfNullTest(){
        stringList = new StringListImpl();

        Assertions.assertThrows(NullPointerException.class, () -> stringList.lastIndexOf(null));
    };

    @Test
    public void getTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");

        Assertions.assertEquals("2", stringList.get(1));
    }

    @Test
    public void getByInvalidIndexTest(){
        stringList = new StringListImpl();

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> stringList.get(315));
    };

    @Test
    public void equalsTest(){
        stringList = new StringListImpl();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        Assertions.assertTrue(stringList.equals(stringList));

        stringList1 = new StringListImpl();
        stringList1.add("1");
        stringList1.add("2");
        stringList1.add("3");

        Assertions.assertTrue(stringList.equals(stringList1));
        Assertions.assertTrue(stringList1.equals(stringList));

        stringList1.add("4");

        Assertions.assertFalse(stringList.equals(stringList1));
        Assertions.assertFalse(stringList1.equals(stringList));

        stringList1.remove("4");
        stringList1.set(1, "5");

        Assertions.assertFalse(stringList.equals(stringList1));
        Assertions.assertFalse(stringList1.equals(stringList));
    }

    @Test
    public void isEmptyTest(){
        stringList = new StringListImpl();

        Assertions.assertTrue(stringList.isEmpty());

        stringList.add("1");

        Assertions.assertFalse(stringList.isEmpty());
    }
}
