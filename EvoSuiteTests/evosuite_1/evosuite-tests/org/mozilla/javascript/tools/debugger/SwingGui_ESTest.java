/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 20:45:04 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.JSplitPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.SwingGui;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SwingGui_ESTest extends SwingGui_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSplitPane jSplitPane0 = new JSplitPane();
      SwingGui.setResizeWeight(jSplitPane0, (-765.4507));
      assertTrue(jSplitPane0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSplitPane jSplitPane0 = new JSplitPane();
      SwingGui.setResizeWeight(jSplitPane0, 1.401298464324817E-45);
      assertFalse(jSplitPane0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = SwingGui.getShortName("&lKuXBA?");
      assertEquals("&lKuXBA?", string0);
  }
}
