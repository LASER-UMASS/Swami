/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 00:36:36 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.PolicySecurityController;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SecurityController_ESTest extends SecurityController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolicySecurityController policySecurityController0 = new PolicySecurityController();
      SecurityController.initGlobal(policySecurityController0);
      // Undeclared exception!
      try { 
        SecurityController.initGlobal(policySecurityController0);
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // Cannot overwrite already installed global SecurityController
         //
         verifyException("org.mozilla.javascript.SecurityController", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = SecurityController.hasGlobal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PolicySecurityController policySecurityController0 = new PolicySecurityController();
      Context context0 = Context.enter();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(nativeArrayBuffer0, 15, (-1309));
      // Undeclared exception!
      try { 
        policySecurityController0.execWithDomain(context0, nativeUint8ClampedArray0, (Script) null, nativeArrayBuffer0.CLASS_NAME);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // callWithDomain should be overridden
         //
         verifyException("org.mozilla.javascript.SecurityController", e);
      }
  }
}
