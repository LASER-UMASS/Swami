/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:29:12 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BoundFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.xml.XMLLib;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeJSON_ESTest extends NativeJSON_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(5);
      XMLLib.Factory xMLLib_Factory0 = contextFactory0.getE4xImplementationFactory();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArrayBuffer0, false);
      NativeString nativeString0 = new NativeString("ArrayBuffer");
      // Undeclared exception!
      try { 
        NativeJSON.stringify(context0, nativeGenerator0, xMLLib_Factory0, context0, nativeString0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(130);
      NativeNumber nativeNumber0 = new NativeNumber(0);
      // Undeclared exception!
      try { 
        NativeJSON.stringify(context0, nativeArray0, nativeArray0, context0, nativeNumber0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Float float0 = new Float((double) 160);
      Object[] objectArray0 = new Object[8];
      objectArray0[3] = (Object) "false";
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      Object object0 = NativeJSON.stringify(context0, nativeBoolean0, float0, nativeArray0, nativeJavaTopPackage0);
      assertEquals("160", object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      StringBuilder stringBuilder0 = new StringBuilder("language version");
      NativeString nativeString0 = new NativeString(stringBuilder0);
      // Undeclared exception!
      try { 
        NativeJSON.stringify(context0, nativeBoolean0, nativeString0, 12, nativeBoolean0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, nativeContinuation0, 4, 13);
      BoundFunction boundFunction0 = null;
      try {
        boundFunction0 = new BoundFunction(context0, nativeIterator_StopIteration0, idFunctionObject0, nativeContinuation0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(4);
      Object object0 = NativeJSON.stringify(context0, nativeFloat64Array0, nativeFloat64Array0, contextFactory0, (Object) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeArray nativeArray0 = new NativeArray(8);
      Object object0 = NativeJSON.stringify(context0, nativeBoolean0, nativeIterator_StopIteration0, nativeArray0, "!=");
      assertEquals("{}", object0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(130);
      Long long0 = new Long(1);
      Object object0 = NativeJSON.stringify(context0, nativeArray0, nativeArray0, context0, long0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      Long long0 = new Long(8);
      Object object0 = NativeJSON.stringify(context0, nativeArray0, nativeArray0, context0, long0);
      assertEquals("[]", object0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Context context0 = Context.enter();
      NativeArray nativeArray0 = new NativeArray(130);
      Long long0 = new Long((-1));
      Object object0 = NativeJSON.stringify(context0, nativeArray0, nativeArray0, context0, long0);
      assertNotNull(object0);
  }
}
