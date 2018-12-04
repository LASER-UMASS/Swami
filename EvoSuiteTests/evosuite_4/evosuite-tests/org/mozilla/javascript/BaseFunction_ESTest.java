/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 03:09:59 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.BoundFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.UniqueTag;
import org.mozilla.javascript.typedarrays.NativeInt32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseFunction_ESTest extends BaseFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeNumber nativeNumber0 = new NativeNumber(1);
      // Undeclared exception!
      try { 
        baseFunction0.setInstanceIdValue(0, nativeNumber0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      baseFunction0.setInstanceIdValue(1, (Object) null);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeInt32Array0, nativeInt32Array0, 13, 0);
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      // Undeclared exception!
      try { 
        idFunctionObject0.setInstanceIdValue(5, uniqueTag0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      baseFunction0.setInstanceIdAttributes(4, 4);
      assertFalse(baseFunction0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeInt32Array0, nativeInt32Array0, 13, 0);
      boolean boolean0 = BaseFunction.isApply(idFunctionObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        baseFunction0.initPrototypeId(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.BaseFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Synchronizer synchronizer0 = new Synchronizer(baseFunction0);
      // Undeclared exception!
      try { 
        baseFunction0.hasInstance(synchronizer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: 'prototype' property of  is not an object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[1];
      BoundFunction boundFunction0 = null;
      try {
        boundFunction0 = new BoundFunction((Context) null, baseFunction0, baseFunction0, baseFunction0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object object0 = baseFunction0.getInstanceIdValue(2);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      baseFunction0.setInstanceIdValue(5, nativeIterator_StopIteration0);
      NativeIterator.StopIteration nativeIterator_StopIteration1 = (NativeIterator.StopIteration)baseFunction0.getInstanceIdValue(5);
      assertFalse(nativeIterator_StopIteration1.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeContinuation0, nativeContinuation0, 8, "}.eoe", 13, nativeContinuation0);
      Object[] objectArray0 = idFunctionObjectES6_0.getIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object object0 = baseFunction0.getPrototypeProperty();
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(baseFunction0, "Function", 8, "Function", 2, ((Undefined) object0).SCRIPTABLE_UNDEFINED);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        baseFunction0.execIdCall(idFunctionObject0, context0, nativeObject0, nativeObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8
         //
         verifyException("org.mozilla.javascript.BaseFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      String string0 = baseFunction0.decompile(0, 0);
      assertEquals("function () {\n\t[native code, arity=0]\n}\n", string0);
  }
}