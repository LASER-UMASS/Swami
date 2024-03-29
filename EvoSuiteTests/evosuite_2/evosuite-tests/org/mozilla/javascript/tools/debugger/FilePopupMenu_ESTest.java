/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 21:52:19 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.JComponent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.FilePopupMenu;
import org.mozilla.javascript.tools.debugger.FileTextArea;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FilePopupMenu_ESTest extends FilePopupMenu_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FilePopupMenu filePopupMenu0 = new FilePopupMenu((FileTextArea) null);
      filePopupMenu0.show((JComponent) null, (-659), (-659));
      assertFalse(filePopupMenu0.isFocusTraversalPolicyProvider());
  }
}
