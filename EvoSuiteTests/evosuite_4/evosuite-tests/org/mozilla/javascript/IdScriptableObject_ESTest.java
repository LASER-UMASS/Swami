/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 02:10:51 GMT 2018
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
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.NativeErrors topLevel_NativeErrors0 = TopLevel.NativeErrors.URIError;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)importerTopLevel0.getNativeErrorCtor(topLevel_NativeErrors0);
      // Undeclared exception!
      try { 
        idFunctionObject0.setInstanceIdValue(200, (Object) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 200
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      SymbolKey symbolKey0 = SymbolKey.IS_CONCAT_SPREADABLE;
      // Undeclared exception!
      try { 
        nativeArrayBuffer0.initPrototypeValue(1190, (Symbol) symbolKey0, (Object) null, 1190);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(10);
      // Undeclared exception!
      try { 
        nativeFloat32Array0.initPrototypeValue(10, (String) null, (Object) null, 898);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(0);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeInt32Array0, nativeInt32Array0);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeInt32Array0, nativeInt32Array0, (-1128), "done", 1109, nativeArrayIterator0);
      // Undeclared exception!
      try { 
        nativeArrayIterator0.initPrototypeConstructor(idFunctionObjectES6_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, nativeIterator_StopIteration0, 2204, "tRCqP;?", 2204, nativeIterator_StopIteration0);
      // Undeclared exception!
      try { 
        IdScriptableObject.incompatibleCallError(idFunctionObject0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"tRCqP;?\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, (Object) null);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeString nativeString0 = new NativeString("H?");
      // Undeclared exception!
      try { 
        nativeString0.getInstanceIdValue(361);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 361
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod((MemberBox) null, "error reporter");
      // Undeclared exception!
      try { 
        nativeJavaMethod0.setInstanceIdAttributes(150, 3199);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 150
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      Object[] objectArray0 = nativeArrayBuffer0.getAllIds();
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ScriptableObject scriptableObject0 = importerTopLevel0.getOwnPropertyDescriptor(context0, "");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 65535, 13);
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeInt8Array0, true);
      SymbolKey symbolKey0 = SymbolKey.IS_CONCAT_SPREADABLE;
      // Undeclared exception!
      try { 
        nativeGenerator0.delete((Symbol) symbolKey0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot modify a property of a sealed object: org.mozilla.javascript.SymbolKey@0000000013.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      SymbolKey symbolKey0 = SymbolKey.TO_STRING_TAG;
      nativeArrayBuffer0.delete((Symbol) symbolKey0);
      assertEquals(0, nativeArrayBuffer0.getLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.delete("eH%B_`S9");
      assertEquals("StopIteration", nativeIterator_StopIteration0.getClassName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(0);
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(nativeArrayBuffer0, 4, 13);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      nativeArrayBuffer0.defineOwnProperty(context0, "language version", nativeUint8Array0);
      assertEquals(13, nativeUint8Array0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      nativeBoolean0.defaultPut("Changing attributes not supported for ", "Changing attributes not supported for ");
      assertFalse(nativeBoolean0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeUint8Array0, true);
      boolean boolean0 = nativeGenerator0.defaultHas("qy:|71jAZeu^q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeCall nativeCall0 = new NativeCall();
      // Undeclared exception!
      try { 
        importerTopLevel0.exportAsJSClass(110, nativeCall0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }
}
