/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 21:38:03 GMT 2018
 */

package org.mozilla.javascript.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.event.ActionEvent;
import java.io.InputStream;
import java.io.PrintStream;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.debugger.JSInternalConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class JSInternalConsole_ESTest extends JSInternalConsole_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Cut");
      PrintStream printStream0 = jSInternalConsole0.getOut();
      assertNotNull(printStream0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("");
      InputStream inputStream0 = jSInternalConsole0.getIn();
      assertEquals(0, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Cut");
      PrintStream printStream0 = jSInternalConsole0.getErr();
      assertNotNull(printStream0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("{bw&");
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      ActionEvent actionEvent0 = new ActionEvent(integer0, 1122, "Copy", 1122);
      jSInternalConsole0.actionPerformed(actionEvent0);
      assertFalse(jSInternalConsole0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole("Cut");
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      ActionEvent actionEvent0 = new ActionEvent(integer0, (-1644), "Cut", (-1644), (-1644));
      jSInternalConsole0.actionPerformed(actionEvent0);
      assertFalse(jSInternalConsole0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JSInternalConsole jSInternalConsole0 = new JSInternalConsole((String) null);
      ActionEvent actionEvent0 = new ActionEvent("Paste", 5, "Paste", 5);
      jSInternalConsole0.actionPerformed(actionEvent0);
      assertEquals(5, actionEvent0.getID());
  }
}
