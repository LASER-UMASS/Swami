/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:53:43 GMT 2018
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
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.InterpreterData;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContextFactory contextFactory0 = new ContextFactory();
      contextFactory0.enterContext();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array((NativeArrayBuffer) null, 3, 120);
      Delegator delegator0 = new Delegator(nativeUint32Array0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(65534, "Exceeded maximum stack depth", (String) null, false);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-3233), "", "", false);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context.enter((Context) null, contextFactory0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.reportRuntimeError("U", "", (-28), "Hqu", 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      contextFactory0.makeContext();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1139, "B#yh,&ZS.HS?'sww-h", "B#yh,&ZS.HS?'sww-h", true);
  }
}
