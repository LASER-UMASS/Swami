/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 02:04:47 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.RhinoSecurityManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RhinoSecurityManager_ESTest extends RhinoSecurityManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RhinoSecurityManager rhinoSecurityManager0 = new RhinoSecurityManager();
      Class<?> class0 = rhinoSecurityManager0.getCurrentScriptClass();
      assertNull(class0);
  }
}
