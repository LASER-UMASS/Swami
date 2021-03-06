/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 00:54:09 GMT 2018
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
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.Interpreter;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ES6Iterator_ESTest extends ES6Iterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(120);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeUint16Array0, nativeUint16Array0);
      // Undeclared exception!
      try { 
        nativeArrayIterator0.next(context0, nativeUint16Array0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ES6Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeUint8ClampedArray0, nativeUint8ClampedArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      NativeObject nativeObject0 = (NativeObject)nativeArrayIterator0.next(context0, nativeUint8ClampedArray0);
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeUint8ClampedArray0, nativeUint8ClampedArray0);
      // Undeclared exception!
      try { 
        nativeArrayIterator0.initPrototypeId(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.ES6Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(nativeArrayBuffer0, 8, 4);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeInt16Array0, nativeArrayBuffer0);
      SymbolKey symbolKey0 = SymbolKey.HAS_INSTANCE;
      int int0 = nativeArrayIterator0.findPrototypeId(symbolKey0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeUint8ClampedArray0, nativeUint8ClampedArray0);
      int int0 = nativeArrayIterator0.findPrototypeId("value");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeArrayIterator.init(nativeArrayBuffer0, true);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeArrayBuffer0, nativeArrayBuffer0);
      // Undeclared exception!
      try { 
        ScriptableObject.getPropertyIds(nativeArrayIterator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      Interpreter interpreter0 = new Interpreter();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeArrayBuffer0, nativeArrayBuffer0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArrayBuffer0, interpreter0, 1, "value", 8, nativeArrayBuffer0);
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
