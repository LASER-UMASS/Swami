/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 22:16:22 GMT 2018
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
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SpecialRef;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SpecialRef_ESTest extends SpecialRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Short short0 = new Short((short)1984);
      // Undeclared exception!
      try { 
        SpecialRef.createSpecial(context0, nativeArray0, short0, "__proto__");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.SpecialRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(12);
      Double double0 = new Double(496.3228);
      Ref ref0 = SpecialRef.createSpecial(context0, nativeUint32Array0, double0, "__parent__");
      // Undeclared exception!
      try { 
        ref0.set(context0, (Object) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.SpecialRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      Double double0 = new Double(130);
      // Undeclared exception!
      try { 
        SpecialRef.createSpecial(context0, nativeUint32Array0, double0, "__parent__");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.SpecialRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      // Undeclared exception!
      try { 
        SpecialRef.createSpecial(context0, nativeArray0, 2, "error reporter");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // error reporter
         //
         verifyException("org.mozilla.javascript.SpecialRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        SpecialRef.createSpecial(context0, (Scriptable) null, (Object) null, "error reporter");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot read property \"error reporter\" from null
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
