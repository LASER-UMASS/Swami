/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 01:48:12 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.security.ProtectionDomain;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.RhinoSecurityManager;
import org.mozilla.javascript.SecurityUtilities;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SecurityUtilities_ESTest extends SecurityUtilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        SecurityUtilities.getSystemProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ProtectionDomain protectionDomain0 = SecurityUtilities.getScriptProtectionDomain();
      assertNull(protectionDomain0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<RhinoSecurityManager> class0 = RhinoSecurityManager.class;
      ProtectionDomain protectionDomain0 = SecurityUtilities.getProtectionDomain(class0);
      assertNotNull(protectionDomain0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SecurityUtilities securityUtilities0 = new SecurityUtilities();
  }
}
