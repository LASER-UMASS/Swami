/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 23:31:32 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Icode;
import org.mozilla.javascript.Interpreter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Icode_ESTest extends Icode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Icode.bytecodeName(2343);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2343
         //
         verifyException("org.mozilla.javascript.Icode", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = Icode.bytecodeName((-25));
      assertEquals("-25", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Interpreter interpreter0 = new Interpreter();
  }
}
