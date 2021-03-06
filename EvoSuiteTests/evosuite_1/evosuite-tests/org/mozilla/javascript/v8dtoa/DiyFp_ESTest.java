/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:52:26 GMT 2018
 */

package org.mozilla.javascript.v8dtoa;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.v8dtoa.DiyFp;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DiyFp_ESTest extends DiyFp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DiyFp diyFp0 = new DiyFp();
      String string0 = diyFp0.toString();
      assertEquals("[DiyFp f:0, e:0]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DiyFp diyFp0 = new DiyFp();
      diyFp0.setE(0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DiyFp diyFp0 = new DiyFp((-1116), (-1116));
      diyFp0.setF(317L);
      DiyFp diyFp1 = DiyFp.normalize(diyFp0);
      assertNotSame(diyFp1, diyFp0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DiyFp diyFp0 = new DiyFp();
      DiyFp diyFp1 = DiyFp.times(diyFp0, diyFp0);
      assertNotSame(diyFp1, diyFp0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DiyFp diyFp0 = new DiyFp();
      DiyFp diyFp1 = DiyFp.minus(diyFp0, diyFp0);
      assertNotSame(diyFp1, diyFp0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DiyFp diyFp0 = new DiyFp(435L, 64);
      long long0 = diyFp0.f();
      assertEquals(435L, long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DiyFp diyFp0 = new DiyFp((-1461L), 0);
      int int0 = diyFp0.e();
      assertEquals(0, int0);
  }
}
