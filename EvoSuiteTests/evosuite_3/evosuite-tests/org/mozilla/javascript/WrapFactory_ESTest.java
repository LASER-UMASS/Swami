/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 00:54:57 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ArrowFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.WrapFactory;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WrapFactory_ESTest extends WrapFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WrapFactory wrapFactory0 = new WrapFactory();
      Context context0 = Context.enter();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      NativeArray nativeArray0 = new NativeArray(context0.emptyArgs);
      wrapFactory0.wrapNewObject(context0, nativeUint32Array0, nativeArray0);
      assertTrue(wrapFactory0.isJavaPrimitiveWrap());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WrapFactory wrapFactory0 = new WrapFactory();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        wrapFactory0.wrapNewObject(context0, (Scriptable) null, context0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = Context.enter();
      WrapFactory wrapFactory0 = context0.getWrapFactory();
      Class<IdFunctionObjectES6> class0 = IdFunctionObjectES6.class;
      // Undeclared exception!
      try { 
        wrapFactory0.wrapJavaClass(context0, (Scriptable) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      WrapFactory wrapFactory0 = context0.getWrapFactory();
      ImporterTopLevel importerTopLevel0 = (ImporterTopLevel)context0.scratchScriptable;
      Class<IdFunctionObject> class0 = IdFunctionObject.class;
      // Undeclared exception!
      try { 
        wrapFactory0.wrap(context0, importerTopLevel0, context0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      WrapFactory wrapFactory0 = context0.getWrapFactory();
      ImporterTopLevel importerTopLevel0 = (ImporterTopLevel)context0.scratchScriptable;
      Class<ArrowFunction> class0 = ArrowFunction.class;
      Object object0 = wrapFactory0.wrap(context0, importerTopLevel0, importerTopLevel0, class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WrapFactory wrapFactory0 = new WrapFactory();
      Context context0 = Context.getCurrentContext();
      Object object0 = new Object();
      Class<Float> class0 = Float.TYPE;
      wrapFactory0.wrap(context0, (Scriptable) null, object0, class0);
      assertTrue(wrapFactory0.isJavaPrimitiveWrap());
  }
}
