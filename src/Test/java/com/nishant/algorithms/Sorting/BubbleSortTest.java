package com.nishant.algorithms.sorting;

import com.nishant.algorithms.sorting.bubblesort.BubbleSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

  private int[] arr;

  @Before
  public void setup() {
    arr = new int[]{5, 3, 2, 1, 5};
  }

  @Test
  public void test() {
    BubbleSort.sort(arr);
    assertArrayEquals(new int[]{1, 2, 3, 5, 5}, arr);
  }
}
