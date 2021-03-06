/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:03:57 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.RegExpLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegExpLiteral_ESTest extends RegExpLiteral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      String string0 = regExpLiteral0.debugPrint();
      assertEquals("-1\tREGEXP -1 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(0);
      String string0 = regExpLiteral0.toSource(0);
      assertEquals("/null/", string0);
      assertEquals("48", regExpLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(0);
      regExpLiteral0.setValue("");
      assertEquals("48", regExpLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      regExpLiteral0.setFlags("/null/");
      assertEquals(48, regExpLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(0);
      regExpLiteral0.getValue();
      assertEquals(48, regExpLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(141, 1062);
      assertEquals("48", regExpLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      regExpLiteral0.getFlags();
      assertEquals(48, regExpLiteral0.getType());
  }
}
