import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class SortOfSortTester{
	/*
	At least 5 test cases
	 */

	//TEST 1
    //Simple array of positive integers EVEN
	@Test
    public void Test1(){
	    //Instance of SortOfSort Class

        //main stores all methods
        SortOfSort main = new SortOfSort();

        int [] array1 = {4, 3, 1, 2};
        int [] expect = {2, 1, 3, 4};
        main.SortOfSort(array1);

//        Used to check on errors
//        for(int i = 0; i < array1.length; i++){
//            System.out.print(array1[i] + " ");
//        }
        assertArrayEquals(expect,array1);
    }


    //TEST 2
    //Mix of positive and negative integers ODD
    @Test
    public void Test2() {
        //Instance of SortOfSort Class

        //main stores all methods
        SortOfSort main = new SortOfSort();

        int[] array2 = {-35, 277, 6, -9, 8, 12, -1999};
        int[] expect = {8, 6, -1999, -35, -9, 12, 277};
        main.SortOfSort(array2);
        assertArrayEquals(expect,array2);

//        main.SortOfSort(array2);
//        for (int i = 0; i < array2.length; i++) {
//            assertEquals(expect[i], array2[i]);
//        }
    }

    //TEST 3
    //Negative integers with repeated values ODD
    @Test
    public void Test3() {
        //Instance of SortOfSort Class

        //main stores all methods
        SortOfSort main = new SortOfSort();

        int[] array3 = {-99, -999, -9999, -999, -99, -66, -666, -6666, -666, -66, -33, -333, -3333, -333, -33};
        int[] expect = {-66, -66, -333, -333, -999, -999, -9999, -6666, -3333, -666, -666, -99, -99, -33, -33};
        main.SortOfSort(array3);
        assertArrayEquals(expect, array3);
    }

    //TEST 4
    //Array is from lowest to highest value EVEN
    @Test
    public void Test4() {
        //Instance of SortOfSort Class

        //main stores all methods
        SortOfSort main = new SortOfSort();

        int[] array4 = {-654, -491, -349, 5, 24, 129, 725, 925};
        int[] expect = {129, 24, -491, -654, -349, 5, 725, 925};
        main.SortOfSort(array4);
        assertArrayEquals(expect, array4);
    }

    //TEST 5
    //Array is from highest to lowest value ODD
    @Test
    public void Test5() {
        //Instance of SortOfSort Class

        //main stores all methods
        SortOfSort main = new SortOfSort();

        int[] array5 = {18, 10, 0, -2, -10};
        int[] expect = {0, -2, -10, 10, 18};
        main.SortOfSort(array5);
        assertArrayEquals(expect, array5);
    }
}