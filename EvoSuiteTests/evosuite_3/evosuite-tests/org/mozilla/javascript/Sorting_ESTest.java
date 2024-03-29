/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 01:53:42 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Sorting;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sorting_ESTest extends Sorting_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[11];
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2, 0, 0).when(comparator0).compare(any() , any());
      int int0 = Sorting.median(objectArray0, 0, 2, comparator0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[23];
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1592, 0, 0, 0, 0).when(comparator0).compare(any() , any());
      Sorting.insertionSort(objectArray0, comparator0);
      assertEquals(23, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[21];
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(6, 6, 6, (-424), 6).when(comparator0).compare(any() , any());
      Sorting.hybridSort(objectArray0, comparator0);
      assertEquals(21, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[21];
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(6, 6, 6, 6, (-424)).when(comparator0).compare(any() , any());
      Sorting.hybridSort(objectArray0, comparator0);
      assertEquals(21, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Sorting sorting0 = new Sorting();
  }
}
