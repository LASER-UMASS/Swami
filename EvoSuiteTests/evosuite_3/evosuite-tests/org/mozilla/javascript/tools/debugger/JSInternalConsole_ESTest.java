/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 20:52:45 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.event.ActionEvent;
import java.io.InputStream;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.JSInternalConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSInternalConsole_ESTest extends JSInternalConsole_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Copy");
      PrintStream printStream0 = jSInternalConsole0.getOut();
      assertNotNull(printStream0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Copy");
      InputStream inputStream0 = jSInternalConsole0.getIn();
      assertEquals(0, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Copy");
      PrintStream printStream0 = jSInternalConsole0.getErr();
      assertNotNull(printStream0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Paste");
      ActionEvent actionEvent0 = new ActionEvent("Paste", (-1615731484), "Paste", (-1615731484));
      jSInternalConsole0.actionPerformed(actionEvent0);
      assertEquals((-1615731484), actionEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Copy");
      ActionEvent actionEvent0 = new ActionEvent("Copy", 1362, "Copy");
      jSInternalConsole0.actionPerformed(actionEvent0);
      assertFalse(jSInternalConsole0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("");
      ActionEvent actionEvent0 = new ActionEvent("", 0, "Cut", 0, 2);
      jSInternalConsole0.actionPerformed(actionEvent0);
      assertTrue(jSInternalConsole0.isFocusTraversalPolicySet());
  }
}