/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 19:37:51 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.tools.shell.Runner;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Runner_ESTest extends Runner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Runner runner0 = new Runner(importerTopLevel0, (Function) null, context0.emptyArgs);
      // Undeclared exception!
      try { 
        runner0.run(context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.shell.Runner", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      Runner runner0 = new Runner(nativeUint8Array0, (Script) null);
      // Undeclared exception!
      try { 
        runner0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.shell.Runner", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      BaseFunction baseFunction0 = new BaseFunction();
      Runner runner0 = new Runner(importerTopLevel0, baseFunction0, context0.emptyArgs);
      Object object0 = runner0.run(context0);
      assertNotNull(object0);
  }
}