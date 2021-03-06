/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 00:18:08 GMT 2018
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
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IdFunctionObject_ESTest extends IdFunctionObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeInt8Array0, nativeInt8Array0, (-910), 0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        idFunctionObject0.call(context0, (Scriptable) null, nativeInt8Array0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=-910 MASTER=org.mozilla.javascript.typedarrays.NativeInt8Array@0
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeInt32Array0, nativeBoolean0, 46, "", 0, nativeBoolean0);
      idFunctionObject0.getTag();
      assertEquals(0, idFunctionObject0.getArity());
      assertEquals(46, idFunctionObject0.methodId());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeUint8Array0, nativeUint8Array0);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeArrayIterator0, (Object) null, 2, "next", 4, nativeUint8Array0);
      idFunctionObjectES6_0.getPrototype();
      assertEquals(2, idFunctionObjectES6_0.methodId());
      assertEquals(4, idFunctionObjectES6_0.getLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeInt32Array0, nativeBoolean0, 46, "", 0, nativeBoolean0);
      int int0 = idFunctionObject0.getLength();
      assertEquals(46, idFunctionObject0.methodId());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      NativeString nativeString0 = new NativeString(stringBuilder0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeString0, stringBuilder0, 13, "cU8MYjC;V|]$xIuu>e8", 0, nativeString0);
      String string0 = idFunctionObject0.decompile(13, (-20));
      assertEquals(13, idFunctionObject0.methodId());
      assertEquals("function cU8MYjC;V|]$xIuu>e8() { [native code for String.cU8MYjC;V|]$xIuu>e8, arity=0] }\n", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      IdFunctionObject idFunctionObject0 = null;
      try {
        idFunctionObject0 = new IdFunctionObject(nativeFloat32Array0, nativeJavaClass0, 13, (String) null, 1, nativeFloat32Array0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeInt8Array0, nativeInt8Array0, 8, 0);
      IdFunctionObjectES6 idFunctionObjectES6_0 = null;
      try {
        idFunctionObjectES6_0 = new IdFunctionObjectES6(idFunctionObject0, nativeInt8Array0, 7, "language version", (-1), idFunctionObject0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-1253.3399243154693));
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = null;
      try {
        idFunctionObject0 = new IdFunctionObject(nativeNumber0, nativeContinuation0, 4, (-489));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }
}
