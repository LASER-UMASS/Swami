/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 23:31:15 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.FunctionObject;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.InterpreterData;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeDate;
import org.mozilla.javascript.NativeJavaArray;
import org.mozilla.javascript.NativeJavaConstructor;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaMembers_ESTest extends JavaMembers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(0);
      Class<NativeJavaArray> class0 = NativeJavaArray.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeInt8Array0, class0, true);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Class<FunctionObject> class0 = FunctionObject.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeBoolean0, class0, false);
      // Undeclared exception!
      try { 
        javaMembers0.put(nativeBoolean0, "wait", "wait", (Object) null, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Java method \"wait\" cannot be assigned to.
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      Class<NativeJavaConstructor> class0 = NativeJavaConstructor.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeInt8Array0, class0, false);
      // Undeclared exception!
      try { 
        javaMembers0.put(nativeInt8Array0, "", nativeInt8Array0.UNINITIALIZED_CONST, nativeInt8Array0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Java class \"org.mozilla.javascript.NativeJavaConstructor\" has no public instance field or method named \"\".
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<JavaMembers>[] classArray0 = (Class<JavaMembers>[]) Array.newInstance(Class.class, 4);
      Class<JavaMembers> class0 = JavaMembers.class;
      JavaMembers javaMembers0 = new JavaMembers((Scriptable) null, class0, true);
      // Undeclared exception!
      try { 
        javaMembers0.put((Scriptable) null, "(org.mozilla.javascript.JavaMembers,org.mozilla.javascript.JavaMembers,org.mozilla.javascript.JavaMembers,org.mozilla.javascript.JavaMembers)", (Object) null, classArray0[0], true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Java class \"org.mozilla.javascript.JavaMembers\" has no public instance field or method named \"(org.mozilla.javascript.JavaMembers,org.mozilla.javascript.JavaMembers,org.mozilla.javascript.JavaMembers,org.mozilla.javascript.JavaMembers)\".
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      Class<NativeDate> class0 = NativeDate.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeUint8ClampedArray0, class0, false);
      boolean boolean0 = javaMembers0.has("get", false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      Class<NativeDate> class0 = NativeDate.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeUint8ClampedArray0, class0, false);
      Object[] objectArray0 = javaMembers0.getIds(false);
      assertEquals(68, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Class<FunctionObject> class0 = FunctionObject.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeBoolean0, class0, false);
      Object object0 = javaMembers0.get(nativeBoolean0, "()", nativeBoolean0, false);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      Class<FunctionObject> class0 = FunctionObject.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeBoolean0, class0, false);
      boolean boolean0 = javaMembers0.has("()", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(nativeArrayBuffer0, 13, 8);
      Class<InterpretedFunction> class0 = InterpretedFunction.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeUint16Array0, class0, true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(875, "l", "l", false);
      // Undeclared exception!
      try { 
        InterpretedFunction.createScript(interpreterData0, "l");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
