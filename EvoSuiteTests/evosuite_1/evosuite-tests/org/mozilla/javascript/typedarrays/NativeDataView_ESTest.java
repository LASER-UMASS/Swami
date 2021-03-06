/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 00:30:47 GMT 2018
 */

package org.mozilla.javascript.typedarrays;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeDataView;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeDataView_ESTest extends NativeDataView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 13, 11);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeDataView0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: missing required offset parameter
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 21, 11);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 21
         //
         verifyException("org.mozilla.javascript.typedarrays.NativeDataView", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 17, 11);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 16, 0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 15, 43);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 14, 11);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 10, 11);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, (Scriptable) null, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 9, 11);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 8, 4);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 7, 11);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 6, 11);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 5, 11);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 3, 11);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 2, 11);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Method \"\" called on incompatible object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(15);
      NativeDataView nativeDataView0 = new NativeDataView(nativeArrayBuffer0, 4038, 8);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArrayBuffer0, nativeDataView0, 0, 13);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        nativeDataView0.execIdCall(idFunctionObject0, context0, (Scriptable) null, nativeArrayBuffer0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=0 MASTER=org.mozilla.javascript.typedarrays.NativeArrayBuffer@3
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeDataView nativeDataView0 = new NativeDataView();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeDataView0, "DataView", 4, "DataView", 1, nativeDataView0);
      Context context0 = Context.getCurrentContext();
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        idFunctionObject0.call(context0, nativeDataView0, nativeDataView0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // RangeError: offset out of range
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }
}
