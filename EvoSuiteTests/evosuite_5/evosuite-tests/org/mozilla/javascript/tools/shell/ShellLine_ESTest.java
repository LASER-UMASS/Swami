/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 18:55:36 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.tools.shell.ShellLine;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ShellLine_ESTest extends ShellLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      InputStream inputStream0 = ShellLine.getStream(importerTopLevel0);
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ShellLine shellLine0 = new ShellLine();
  }
}
