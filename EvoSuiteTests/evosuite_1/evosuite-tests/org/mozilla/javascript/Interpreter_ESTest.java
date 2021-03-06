/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:47:16 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.InterpreterData;
import org.mozilla.javascript.NativeContinuation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      contextFactory0.makeContext();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(815, "", (String) null, true);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(2411, "ml", "ml", true);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      contextFactory0.makeContext();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-689), ",yf`", "42D4>?T3", false);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Context.enter();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-49), "[+hTne>ght/", "[+hTne>ght/", false);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-40);
      interpreterData0.itsICode = byteArray0;
      // Undeclared exception!
      try { 
        interpreterData0.getLineNumbers();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/mozilla/javascript/Interpreter
         //
         verifyException("org.mozilla.javascript.InterpreterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-49), "[+hTne>ght/", "[+hTne>ght/", false);
      // Undeclared exception!
      try { 
        interpreterData0.getLineNumbers();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/mozilla/javascript/Interpreter
         //
         verifyException("org.mozilla.javascript.InterpreterData", e);
      }
  }
}
