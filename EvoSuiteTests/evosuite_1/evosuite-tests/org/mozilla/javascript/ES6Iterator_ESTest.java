/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 00:00:54 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ES6Iterator_ESTest extends ES6Iterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeBoolean0, nativeBoolean0);
      // Undeclared exception!
      try { 
        nativeArrayIterator0.initPrototypeId(13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.ES6Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeArrayIterator.init(importerTopLevel0, true);
      assertEquals("object", importerTopLevel0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeUint8ClampedArray0, nativeUint8ClampedArray0);
      SymbolKey symbolKey0 = SymbolKey.SPLIT;
      int int0 = nativeArrayIterator0.findPrototypeId(symbolKey0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeBoolean0, nativeBoolean0);
      int int0 = nativeArrayIterator0.findPrototypeId("error reporter");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeUint8ClampedArray0, nativeUint8ClampedArray0);
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeUint8ClampedArray0, nativeBoolean0, 4, 8);
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        nativeArrayIterator0.execIdCall(idFunctionObject0, (Context) null, nativeBoolean0, idFunctionObject0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=4 MASTER=org.mozilla.javascript.typedarrays.NativeUint8ClampedArray@0
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }
}
