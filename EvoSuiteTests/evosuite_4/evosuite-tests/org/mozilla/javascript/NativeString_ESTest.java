/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:46:45 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeString_ESTest extends NativeString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(1966);
      StringBuilder stringBuilder1 = stringBuilder0.append((long) 0);
      NativeString nativeString0 = new NativeString(stringBuilder1);
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      nativeString0.put(0, (Scriptable) nativeInt16Array0, (Object) stringBuilder0);
      assertEquals("0", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      NativeString nativeString0 = new NativeString(stringBuffer0);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeString0, nativeString0);
      nativeString0.put(4, (Scriptable) nativeArrayIterator0, (Object) "done");
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("");
      StringBuilder stringBuilder1 = stringBuilder0.append("/fiQTCXlA#A");
      NativeString nativeString0 = new NativeString(stringBuilder1);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(nativeArrayBuffer0, 4, 0);
      boolean boolean0 = nativeString0.has(0, (Scriptable) nativeUint16Array0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(22);
      NativeString nativeString0 = new NativeString(charBuffer0);
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(8);
      boolean boolean0 = nativeString0.has((-71), (Scriptable) nativeFloat64Array0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeString nativeString0 = new NativeString("language version");
      int int0 = nativeString0.getLength();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeString nativeString0 = new NativeString("language version");
      Object object0 = nativeString0.getInstanceIdValue(1);
      assertEquals(16, object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      NativeString nativeString0 = new NativeString(stringBuilder0);
      // Undeclared exception!
      try { 
        nativeString0.getInstanceIdValue(2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 2
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      NativeString nativeString0 = new NativeString(stringBuffer0);
      // Undeclared exception!
      try { 
        nativeString0.getInstanceIdName(13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeString nativeString0 = new NativeString("language version");
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeString0, 4);
      assertEquals("u", object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      NativeString nativeString0 = new NativeString(stringBuilder0);
      int int0 = nativeString0.findPrototypeId("ArrayBuffer");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeString nativeString0 = new NativeString((CharSequence) null);
      int int0 = nativeString0.findPrototypeId("|Q;b)O&Y,");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeString nativeString0 = new NativeString("");
      int int0 = nativeString0.findPrototypeId("P)KYEy)M");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeString nativeString0 = new NativeString((CharSequence) null);
      int int0 = nativeString0.findPrototypeId("Boolean");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("Ueoy");
      NativeString nativeString0 = new NativeString(stringBuilder0);
      int int0 = nativeString0.findPrototypeId("Ueoy");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(22);
      NativeString nativeString0 = new NativeString(charBuffer0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeString0, (Object) null, (-635), 6);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeString0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=-635 MASTER=\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }
}
