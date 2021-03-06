/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 03:40:50 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.WrapFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class WrapFactory_ESTest extends WrapFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.enter();
      WrapFactory wrapFactory0 = context0.getWrapFactory();
      Character character0 = new Character('\u0089');
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        wrapFactory0.wrap(context0, (Scriptable) null, character0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WrapFactory wrapFactory0 = new WrapFactory();
      assertTrue(wrapFactory0.isJavaPrimitiveWrap());
      
      wrapFactory0.setJavaPrimitiveWrap(false);
      assertFalse(wrapFactory0.isJavaPrimitiveWrap());
  }
}
