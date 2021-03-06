/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 22:15:30 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.InterpreterData;
import org.mozilla.javascript.debug.DebuggableScript;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InterpreterData_ESTest extends InterpreterData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(0, "Llsf`+pF|4zbdq+O&", "Llsf`+pF|4zbdq+O&", false);
      boolean boolean0 = interpreterData0.isTopLevel();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-153), "", "", true);
      boolean boolean0 = interpreterData0.isGeneratedScript();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(0, "1F*Q$8`Hm_C", "1F*Q$8`Hm_C", true);
      boolean boolean0 = interpreterData0.isFunction();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1, "jgPBqlhUq9", "jgPBqlhUq9", false);
      String string0 = interpreterData0.getSourceName();
      assertEquals("jgPBqlhUq9", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(2453, "", "", false);
      DebuggableScript debuggableScript0 = interpreterData0.getParent();
      assertNull(debuggableScript0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-3333), "", "", true);
      // Undeclared exception!
      try { 
        interpreterData0.getParamOrVarName(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.InterpreterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(0, "Z04KE(}YDuFcTbFZF", "Z04KE(}YDuFcTbFZF", false);
      // Undeclared exception!
      try { 
        interpreterData0.getParamOrVarConst(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.InterpreterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(0, "Llsf`+pF|4zbdq+O&", "Llsf`+pF|4zbdq+O&", false);
      int int0 = interpreterData0.getParamCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(0, "", "", false);
      // Undeclared exception!
      try { 
        interpreterData0.getParamAndVarCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.InterpreterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(114, "Y^Mjgn=X7i0ro@`<y", "Y^Mjgn=X7i0ro@`<y", false);
      int[] intArray0 = interpreterData0.getLineNumbers();
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1024, "", "rC?nom[", true);
      String string0 = interpreterData0.getFunctionName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-17), "", "", false);
      // Undeclared exception!
      try { 
        interpreterData0.getFunction((-17));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.InterpreterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(0, "Llsf`+pF|4zbdq+O&", "Llsf`+pF|4zbdq+O&", false);
      InterpreterData interpreterData1 = new InterpreterData(interpreterData0);
      assertNull(interpreterData1.getFunctionName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(0, "1F*Q$8`Hm_C", "1F*Q$8`Hm_C", true);
      int int0 = interpreterData0.getFunctionCount();
      assertEquals(0, int0);
  }
}
