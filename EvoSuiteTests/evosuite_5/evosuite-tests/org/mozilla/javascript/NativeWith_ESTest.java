/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 04:48:35 GMT 2018
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
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeWith_ESTest extends NativeWith_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, (-1), 0);
      NativeWith nativeWith0 = new NativeWith(nativeInt8Array0, nativeInt32Array0);
      // Undeclared exception!
      try { 
        nativeWith0.updateDotQuery(false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeWith", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      // Undeclared exception!
      try { 
        NativeWith.newWithSpecial(context0, nativeArray0, objectArray0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot convert null to an object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[0];
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod(memberBoxArray0, "With");
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeJavaMethod0, "With", 1, "With", 1, nativeJavaMethod0);
      boolean boolean0 = NativeWith.isWithFunction(idFunctionObject0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeWith nativeWith0 = new NativeWith(nativeError0, nativeError0);
      NativeWith.init(nativeWith0, true);
      assertEquals("With", nativeWith0.getClassName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeCall0, (Object) null, (-1943), "4h^u;", 1, nativeCall0);
      NativeWith nativeWith0 = new NativeWith(idFunctionObject0, idFunctionObject0);
      // Undeclared exception!
      try { 
        nativeWith0.hasInstance((Scriptable) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: 'prototype' property of 4h^u; is not an object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeWith nativeWith0 = new NativeWith(nativeError0, nativeError0);
      boolean boolean0 = nativeWith0.has("O|WCdh5>(EMI2", (Scriptable) nativeError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeWith nativeWith0 = new NativeWith(nativeError0, nativeError0);
      ScriptableObject.putProperty((Scriptable) nativeWith0, (-1001), (Object) nativeWith0);
      assertEquals("With", nativeWith0.getClassName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      NativeWith nativeWith0 = new NativeWith(nativeInt16Array0, nativeInt16Array0);
      Object[] objectArray0 = nativeWith0.getIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(0);
      NativeWith nativeWith0 = new NativeWith(nativeInt16Array0, nativeInt16Array0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        nativeWith0.getDefaultValue(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      NativeWith nativeWith0 = new NativeWith(nativeInt16Array0, nativeInt16Array0);
      String string0 = nativeWith0.getClassName();
      assertEquals("With", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      NativeWith nativeWith0 = new NativeWith(nativeInt16Array0, nativeInt16Array0);
      Class<String> class0 = String.class;
      String string0 = ScriptableObject.getTypedProperty((Scriptable) nativeWith0, 1, class0);
      assertEquals("undefined", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MemberBox[] memberBoxArray0 = new MemberBox[0];
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod(memberBoxArray0, "With");
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeJavaMethod0, "With", 1, "With", 1, nativeJavaMethod0);
      NativeWith nativeWith0 = new NativeWith(nativeJavaMethod0, nativeJavaMethod0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeWith0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeJavaMethod0, context0.emptyArgs);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Function \"With\" must be called directly, and not by way of a function of another name.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeWith nativeWith0 = new NativeWith(nativeIterator_StopIteration0, nativeIterator_StopIteration0);
      nativeWith0.delete("org.mozilla.javascript.ScriptRuntime$NoSuchMethodShim");
      assertEquals("With", nativeWith0.getClassName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(0);
      NativeWith nativeWith0 = new NativeWith(nativeInt16Array0, nativeInt16Array0);
      nativeWith0.delete(2763);
      assertEquals("With", nativeWith0.getClassName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeWith nativeWith0 = new NativeWith(nativeError0, nativeError0);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeWith0, nativeError0, 2, "O|WCdh5>(EMI2", 13, nativeError0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      // Undeclared exception!
      try { 
        nativeWith0.execIdCall(idFunctionObjectES6_0, context0, idFunctionObjectES6_0, idFunctionObjectES6_0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=2 MASTER=org.mozilla.javascript.NativeWith@4
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }
}
