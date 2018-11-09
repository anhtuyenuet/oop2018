package week3;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Week3Test {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of max method, of class Week3.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        int m = 0;
        int n = 0;
        int expResult = 0;
        int result = Week3.max(m, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of minOfArray method, of class Week3.
     */
    @Test
    public void testMinOfArray() {
        System.out.println("minOfArray");
        int[] array = null;
        int expResult = 0;
        //int result = Week3.minOfArray(array);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculateBMI method, of class Week3.
     */
    /*@Test
    public void testCalculateBMI() {
    System.out.println("calculateBMI");
    double weight = 0.0;
    double height = 0.0;
    String expResult = "";
    String result = Week3.calculateBMI(weight, height);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    //fail("The test case is a prototype.");
    }*/

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void maxTest() {
        assertEquals(0, Week3.max(0, 0));
        assertEquals(-10, Week3.max(-10, -60));
        assertEquals(355, Week3.max(34, 355));
        assertEquals(90, Week3.max(90, -10));
        assertEquals(4, Week3.max(1, 4));
    }

    /*// TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void minOfArrayTest() {
    int[] array = {0, 0, 0, 0};
    assertEquals(0, Week3.minOfArray(array));
    int[] array2 = {1};
    assertEquals(1, Week3.minOfArray(array2));
    int[] array3 = {8, 2, 5, 3};
    assertEquals(2, Week3.minOfArray(array3));
    int[] array4 = {45, 65, 0, 8};
    assertEquals(0, Week3.minOfArray(array4));
    int[] array5 = {999, 90, 80, 3};
    assertEquals(3, Week3.minOfArray(array5));
    }*/

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void calculatebmiTest() {
        assertEquals("Beo phi", Week3.calculateBMI(73, 1.63));
        assertEquals("Thieu can", Week3.calculateBMI(40, 1.7));
        assertEquals("Thua can", Week3.calculateBMI(68, 1.7));
        assertEquals("Binh thuong", Week3.calculateBMI(68, 1.8));
        assertEquals("Beo phi", Week3.calculateBMI(98, 1.8));
    }
}
