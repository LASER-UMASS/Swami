/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 01:43:06 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ResolvedOverload;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ResolvedOverload_ESTest extends ResolvedOverload_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      ResolvedOverload resolvedOverload0 = new ResolvedOverload(objectArray0, 1);
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) resolvedOverload0;
      boolean boolean0 = resolvedOverload0.matches(objectArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
      ResolvedOverload resolvedOverload0 = new ResolvedOverload(objectArray0, 1);
      boolean boolean0 = resolvedOverload0.matches(objectArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[16];
      ResolvedOverload resolvedOverload0 = new ResolvedOverload(objectArray0, (-1));
      Object[] objectArray1 = new Object[3];
      boolean boolean0 = resolvedOverload0.matches(objectArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      ResolvedOverload resolvedOverload0 = new ResolvedOverload(objectArray0, 1);
      resolvedOverload0.hashCode();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      ResolvedOverload resolvedOverload0 = new ResolvedOverload(objectArray0, 5080);
      boolean boolean0 = resolvedOverload0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Object[] objectArray0 = new Object[16];
      ResolvedOverload resolvedOverload0 = new ResolvedOverload(objectArray0, (-1));
      boolean boolean0 = resolvedOverload0.equals(resolvedOverload0);
      assertTrue(boolean0);
  }
}