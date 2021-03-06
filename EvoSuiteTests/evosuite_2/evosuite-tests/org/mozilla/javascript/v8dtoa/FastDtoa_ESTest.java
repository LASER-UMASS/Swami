/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:55:33 GMT 2018
 */

package org.mozilla.javascript.v8dtoa;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.v8dtoa.FastDtoa;
import org.mozilla.javascript.v8dtoa.FastDtoaBuilder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FastDtoa_ESTest extends FastDtoa_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FastDtoaBuilder fastDtoaBuilder0 = new FastDtoaBuilder();
      fastDtoaBuilder0.append('\u001E');
      boolean boolean0 = FastDtoa.roundWeed(fastDtoaBuilder0, 0, '\u001E', (-345L), '\u001E', 5L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = FastDtoa.biggestPowerTen(28, (-60));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long long0 = FastDtoa.biggestPowerTen(7, 10);
      assertEquals(4294967296L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = FastDtoa.biggestPowerTen('\u001E', '\u001E');
      assertEquals(42949672961L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long long0 = FastDtoa.biggestPowerTen(100031, 7);
      assertEquals(429496729602L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastDtoaBuilder fastDtoaBuilder0 = new FastDtoaBuilder();
      boolean boolean0 = FastDtoa.grisu3(0.7864544163732047, fastDtoaBuilder0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastDtoaBuilder fastDtoaBuilder0 = new FastDtoaBuilder();
      boolean boolean0 = FastDtoa.grisu3(5L, fastDtoaBuilder0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastDtoaBuilder fastDtoaBuilder0 = new FastDtoaBuilder();
      boolean boolean0 = FastDtoa.numberToString((double) 4294967296L, fastDtoaBuilder0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = FastDtoa.numberToString(549.649044);
      assertEquals("549.649044", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = FastDtoa.numberToString((-4960.488653364155));
      assertEquals("-4960.488653364155", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = FastDtoa.biggestPowerTen(1000000099, 31);
      assertEquals(4294967296000000009L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      long long0 = FastDtoa.biggestPowerTen(100000004, 30);
      assertEquals(429496729600000008L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long long0 = FastDtoa.biggestPowerTen((-60), 28);
      assertEquals(4294967295L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastDtoa fastDtoa0 = new FastDtoa();
  }
}
