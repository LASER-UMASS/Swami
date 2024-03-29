/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 03:07:04 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeJavaConstructor;
import org.mozilla.javascript.NativeJavaPackage;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseFunction_ESTest extends BaseFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Synchronizer synchronizer0 = new Synchronizer(baseFunction0);
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(1);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(baseFunction0, synchronizer0, 1, "C7g>p9M/6OD", 8, nativeUint8ClampedArray0);
      baseFunction0.setInstanceIdValue(1, idFunctionObject0);
      assertFalse(idFunctionObject0.isSealed());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(1059);
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[5];
      Object object0 = baseFunction0.call((Context) null, nativeArrayBuffer0, nativeFloat64Array0, objectArray0);
      baseFunction0.setInstanceIdValue(4, object0);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeJavaConstructor nativeJavaConstructor0 = new NativeJavaConstructor((MemberBox) null);
      nativeJavaConstructor0.setInstanceIdAttributes(5, 5);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      baseFunction0.setInstanceIdAttributes(4, 2);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeJavaConstructor nativeJavaConstructor0 = new NativeJavaConstructor((MemberBox) null);
      // Undeclared exception!
      try { 
        nativeJavaConstructor0.initPrototypeId(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.BaseFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeArrayBuffer0, nativeArrayBuffer0, 1, "ArrayBuffer", 1, nativeArrayBuffer0);
      // Undeclared exception!
      try { 
        idFunctionObjectES6_0.hasInstance(nativeArrayBuffer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: 'prototype' property of ArrayBuffer is not an object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      String string0 = baseFunction0.getTypeOf();
      assertEquals("function", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object object0 = baseFunction0.getInstanceIdValue(1);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        baseFunction0.getInstanceIdValue(86);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 86
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeArrayBuffer0, nativeArrayBuffer0, 1, "ArrayBuffer", 1, nativeArrayBuffer0);
      Object[] objectArray0 = idFunctionObjectES6_0.getIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(1023);
      BaseFunction baseFunction0 = new BaseFunction();
      NativeWith nativeWith0 = new NativeWith(baseFunction0, nativeArrayBuffer0);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(baseFunction0, nativeWith0, 2, "ArrayBuffer", 2, nativeArrayBuffer0);
      // Undeclared exception!
      try { 
        idFunctionObjectES6_0.setInstanceIdAttributes(13, 13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(false, "error reporter", (ClassLoader) null);
      baseFunction0.setInstanceIdValue(5, nativeJavaPackage0);
      Object object0 = baseFunction0.getInstanceIdValue(5);
      assertSame(object0, nativeJavaPackage0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      int int0 = baseFunction0.findPrototypeId("arse");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeContinuation0, nativeContinuation0, 13, "u.s2sQF2a9~Ww# *N", 13, nativeContinuation0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        idFunctionObject0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=13 MASTER=org.mozilla.javascript.NativeContinuation@3
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      String string0 = baseFunction0.decompile(17, 180);
      assertEquals("function () {\n\t[native code, arity=0]\n}\n", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(1059);
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[5];
      Object object0 = baseFunction0.call((Context) null, nativeArrayBuffer0, nativeFloat64Array0, objectArray0);
      NativeObject nativeObject0 = (NativeObject)baseFunction0.construct((Context) null, ((Undefined) object0).SCRIPTABLE_UNDEFINED, objectArray0);
      assertEquals("object", nativeObject0.getTypeOf());
  }
}
