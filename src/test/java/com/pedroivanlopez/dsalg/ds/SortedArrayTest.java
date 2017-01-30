package com.pedroivanlopez.dsalg.ds;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class SortedArrayTest
{
    static private int[][] intSorted;
    private int[][] intUnsorted;

    @BeforeClass
    public static void SortedIntArraysFixture()
    {
            int[] sortedBig = new int[]
                { 000, 111, 222, 333, 444, 555, 666,777, 888, 999 };
            int[] sortedTwo = new int[] { 222, 888 };
            int[] sortedOne = new int[] { 999 };
            int[] sortedThree = new int[] { 000, 333, 999 };
            int[] sortedFour = new int[] { 111, 444, 555, 666 };
            int[] sortedEmpty = new int[] { };
            intSorted = new int[][] { sortedOne, sortedTwo, sortedThree,
                sortedFour, sortedBig, sortedEmpty};
    }

    @Before
    public void IntArraySortingTests()
    {
        int[] unsortedBig =
                new int[] { 888, 222, 333, 000, 999, 777, 555, 111, 666, 444 };
            int[] unsortedTwo = new int[] { 888, 222 };
            int[] unsortedOne = new int[] { 999 };
            int[] unsortedThree = new int[] { 333, 000, 999 };
            int[] unsortedFour = new int[] { 555, 111, 666, 444 };
            int[] unsortedEmpty = new int[] { };

            intUnsorted = new int[][] { unsortedOne, unsortedTwo,
                unsortedThree, unsortedFour, unsortedBig, unsortedEmpty };
    }

    @Test
    public void SelectionSortTests()
    {
            int i = 0;
            for (int[] unsortedArr : intUnsorted)
            {
                int j = 0;
                SortedArray.SelectionSort(unsortedArr);
                for (int value : unsortedArr)
                {
                    assertEquals(value, intSorted[i][j++]);
                }
                i++;
            }
    }
}