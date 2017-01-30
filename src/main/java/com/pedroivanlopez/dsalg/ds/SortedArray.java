package com.pedroivanlopez.dsalg.ds;

public class SortedArray
{
    public static void SelectionSort(int[] a)
    {
        for(int o = 0, min = 0; o < a.length - 1; min = ++o)
        {
            for(int i = o + 1; i < a.length; i++)
            {
                if(a[i] < a[min])
                {
                    min = i;
                }
            }
            if(o != min)
            {
                int tmp = a[o];
                a[o] = a[min];
                a[min] = tmp;
            }
        }
    }
}