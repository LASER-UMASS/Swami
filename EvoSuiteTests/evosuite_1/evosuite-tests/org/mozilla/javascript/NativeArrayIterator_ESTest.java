/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 03:29:58 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArrayIterator_ESTest extends NativeArrayIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ScriptableObject scriptableObject0 = context0.initSafeStandardObjects();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(scriptableObject0, scriptableObject0);
      Object object0 = nativeArrayIterator0.nextValue(context0, scriptableObject0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(0);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeUint8Array0, nativeUint8Array0);
      String string0 = nativeArrayIterator0.getClassName();
      assertEquals("Array Iterator", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = Context.enter();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(4);
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 9, 12);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(scriptableObject0, nativeInt8Array0);
      boolean boolean0 = nativeArrayIterator0.isDone(context0, nativeArrayBuffer0);
      assertFalse(boolean0);
  }
}
