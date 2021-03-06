/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 02:17:51 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Arguments;
import org.mozilla.javascript.ArrowFunction;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.FieldAndMethods;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.NativeJavaConstructor;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaMembers_ESTest extends JavaMembers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<NativeMath> class0 = NativeMath.class;
      JavaMembers javaMembers0 = new JavaMembers((Scriptable) null, class0);
      // Undeclared exception!
      try { 
        javaMembers0.put((Scriptable) null, "isEmpty", class0, class0, false);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Java method \"isEmpty\" cannot be assigned to.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<NativeWith> class0 = NativeWith.class;
      JavaMembers javaMembers0 = new JavaMembers((Scriptable) null, class0, false);
      // Undeclared exception!
      try { 
        javaMembers0.put((Scriptable) null, (String) null, class0, (Object) null, false);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Java class \"org.mozilla.javascript.NativeWith\" has no public instance field or method named \"null\".
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<String> class0 = String.class;
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      JavaMembers javaMembers0 = JavaMembers.lookupClass(importerTopLevel0, class0, class0, true);
      JavaMembers javaMembers1 = JavaMembers.lookupClass(importerTopLevel0, class0, class0, true);
      assertNotNull(javaMembers1);
      assertSame(javaMembers1, javaMembers0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<InterpretedFunction>[] classArray0 = (Class<InterpretedFunction>[]) Array.newInstance(Class.class, 7);
      Class<InterpretedFunction> class0 = InterpretedFunction.class;
      classArray0[0] = class0;
      // Undeclared exception!
      try { 
        JavaMembers.liveConnectSignature(classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<NativeMath> class0 = NativeMath.class;
      JavaMembers javaMembers0 = new JavaMembers((Scriptable) null, class0);
      boolean boolean0 = javaMembers0.has("isEmpty", false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<ArrowFunction> class0 = ArrowFunction.class;
      JavaMembers javaMembers0 = new JavaMembers((Scriptable) null, class0);
      Map<String, FieldAndMethods> map0 = javaMembers0.getFieldAndMethodsObjects((Scriptable) null, "org.mozilla.javascript.ArrowFunction", true);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      Class<BaseFunction> class0 = BaseFunction.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeUint32Array0, class0);
      NativeBoolean nativeBoolean0 = new NativeBoolean(true);
      NativeJavaConstructor nativeJavaConstructor0 = (NativeJavaConstructor)javaMembers0.get(nativeUint32Array0, "()", nativeBoolean0, true);
      assertFalse(nativeJavaConstructor0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<NativeWith> class0 = NativeWith.class;
      JavaMembers javaMembers0 = new JavaMembers((Scriptable) null, class0, false);
      boolean boolean0 = javaMembers0.has("()", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      Class<Arguments> class0 = Arguments.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeUint32Array0, class0);
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeUint32Array0, (Object) null, (-24743057), "getendsWith", 130, nativeUint32Array0);
      Object object0 = javaMembers0.get(nativeUint32Array0, "()", idFunctionObjectES6_0, true);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(nativeArrayBuffer0, 13, 8);
      Class<InterpretedFunction> class0 = InterpretedFunction.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeUint16Array0, class0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<ArrowFunction> class0 = ArrowFunction.class;
      JavaMembers javaMembers0 = new JavaMembers((Scriptable) null, class0);
      Object object0 = javaMembers0.get((Scriptable) null, "Vk9E>+", class0, false);
      assertNotNull(object0);
  }
}
