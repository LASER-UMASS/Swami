/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 03:19:21 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.FunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.MemberBox;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.UniqueTag;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeJavaMethod_ESTest extends NativeJavaMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      objectArray0[3] = (Object) uniqueTag0;
      String string0 = NativeJavaMethod.scriptSignature(objectArray0);
      assertEquals("null,null,null,org.mozilla.javascript.UniqueTag,null,null,null", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      objectArray0[2] = (Object) nativeIterator_StopIteration0;
      String string0 = NativeJavaMethod.scriptSignature(objectArray0);
      assertEquals("null,null,object,null,null", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Object[] objectArray0 = new Object[7];
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      nativeJavaObject0.javaObject = (Object) uniqueTag0;
      objectArray0[4] = (Object) nativeJavaObject0;
      String string0 = NativeJavaMethod.scriptSignature(objectArray0);
      assertEquals("null,null,null,null,org.mozilla.javascript.UniqueTag,null,null", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array((NativeArrayBuffer) null, 2059, 2059);
      Class<FunctionObject> class0 = FunctionObject.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeUint16Array0, class0);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      Object[] objectArray0 = new Object[3];
      objectArray0[1] = (Object) nativeJavaMethod0;
      String string0 = NativeJavaMethod.scriptSignature(objectArray0);
      assertEquals("null,function,null", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      objectArray0[2] = (Object) "/*\norg.mozilla.javascript.FunctionObject(java.lang.String,java.lang.reflect.Member,org.mozilla.javascript.Scriptable)\n*/\n";
      String string0 = NativeJavaMethod.scriptSignature(objectArray0);
      assertEquals("null,null,string", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      objectArray0[4] = (Object) 4;
      String string0 = NativeJavaMethod.scriptSignature(objectArray0);
      assertEquals("null,null,null,null,number", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeUint8ClampedArray0, nativeUint8ClampedArray0, 13, "nc7io| ", 13, nativeUint8ClampedArray0);
      Class<String> class0 = String.class;
      JavaMembers javaMembers0 = new JavaMembers(idFunctionObjectES6_0, class0, true);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      Context context0 = Context.getCurrentContext();
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        nativeJavaMethod0.call(context0, nativeUint8ClampedArray0, idFunctionObjectES6_0, objectArray0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // The choice of Java constructor java.lang.String matching JavaScript argument types (null,null) is ambiguous; candidate constructors are: 
         //     String(byte[],java.lang.String)
         //     String(byte[],java.nio.charset.Charset)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(2055);
      Class<FunctionObject> class0 = FunctionObject.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeUint16Array0, class0);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      Object[] objectArray0 = new Object[5];
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        nativeJavaMethod0.call(context0, (Scriptable) null, nativeUint16Array0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.reflect.Constructor cannot be cast to java.lang.reflect.Method
         //
         verifyException("org.mozilla.javascript.MemberBox", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(2055);
      Class<FunctionObject> class0 = FunctionObject.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeUint16Array0, class0);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      String string0 = nativeJavaMethod0.decompile(2055, 0);
      assertEquals("function FunctionObject() {/*\norg.mozilla.javascript.FunctionObject(java.lang.String,java.lang.reflect.Member,org.mozilla.javascript.Scriptable)\n*/}\n", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array((NativeArrayBuffer) null, 2059, 2059);
      Class<FunctionObject> class0 = FunctionObject.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeUint16Array0, class0);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      Object[] objectArray0 = new Object[3];
      objectArray0[2] = (Object) "/*\norg.mozilla.javascript.FunctionObject(java.lang.String,java.lang.reflect.Member,org.mozilla.javascript.Scriptable)\n*/\n";
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeJavaMethod0.call(context0, (Scriptable) null, nativeUint16Array0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.reflect.Constructor cannot be cast to java.lang.reflect.Method
         //
         verifyException("org.mozilla.javascript.MemberBox", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeJavaMethod nativeJavaMethod0 = new NativeJavaMethod((MemberBox) null, ".");
      assertEquals(13, ScriptableObject.CONST);
  }
}