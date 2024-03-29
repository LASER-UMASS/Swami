/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 00:01:45 GMT 2018
 */

package org.mozilla.javascript.typedarrays;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeTypedArrayView;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeFloat32Array_ESTest extends NativeFloat32Array_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(3304);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeFloat32Array0, nativeFloat32Array0, 0, 4);
      NativeTypedArrayView nativeTypedArrayView0 = nativeFloat32Array0.realThis(nativeFloat32Array0, idFunctionObject0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(nativeArrayBuffer0, (-1104), 1985);
      // Undeclared exception!
      try { 
        nativeFloat32Array0.exportAsJSClass(3083, (Scriptable) null, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(58);
      Float float0 = nativeFloat32Array0.set(2, (Float) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(991);
      Object object0 = nativeFloat32Array0.js_set((-1), nativeFloat32Array0.DONTENUM);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(991);
      Object object0 = nativeFloat32Array0.js_get((-1));
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(nativeArrayBuffer0, 1, (-697));
      // Undeclared exception!
      try { 
        nativeFloat32Array0.get(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeFloat32Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(991);
      Float float0 = nativeFloat32Array0.get(0);
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(991);
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeTypedArrayView nativeTypedArrayView0 = nativeFloat32Array0.construct(nativeArrayBuffer0, (-2524), 0);
      assertEquals((-2524), nativeTypedArrayView0.getByteOffset());
      assertEquals(0, nativeTypedArrayView0.getByteLength());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(0);
      Float float0 = new Float((float) 8);
      // Undeclared exception!
      try { 
        nativeFloat32Array0.set(0, float0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeFloat32Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        NativeFloat32Array.init(context0, (Scriptable) null, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
