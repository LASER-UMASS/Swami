/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 18:36:47 GMT 2018
 */

package org.mozilla.javascript.tools.jsc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.mozilla.javascript.tools.jsc.Main;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Main_ESTest extends Main_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "!-u%\nvP|m&.js";
      Main.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[0];
      main0.processSource(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-o";
      main0.processSource(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-d";
      // Undeclared exception!
      try { 
        main0.processOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-implements";
      stringArray0[1] = "org.mozilla.javascript.tools.jsc.Main";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-implements";
      stringArray0[1] = "-implements";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // java.lang.ClassNotFoundException: Class '-implements.class' should be in target project, but could not be found!
         //
         verifyException("org.mozilla.javascript.tools.jsc.Main", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-extends";
      stringArray0[1] = "org.mozilla.javascript.ast.ElementGet";
      // Undeclared exception!
      try { 
        main0.processOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-extends";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // java.lang.ClassNotFoundException: 
         //
         verifyException("org.mozilla.javascript.tools.jsc.Main", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-package";
      stringArray0[1] = "-package";
      String[] stringArray1 = main0.processOptions(stringArray0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[16];
      stringArray0[0] = "-observe-instruction-count";
      String[] stringArray1 = main0.processOptions(stringArray0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-encoding";
      // Undeclared exception!
      try { 
        main0.processOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-main-method-class";
      // Undeclared exception!
      try { 
        main0.processOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-nosource";
      Main main0 = new Main();
      // Undeclared exception!
      try { 
        main0.processOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-O";
      Main main0 = new Main();
      String[] stringArray1 = main0.processOptions(stringArray0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-version";
      stringArray0[1] = "0";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-version";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[14];
      stringArray0[0] = "-o";
      stringArray0[1] = "msg.no.old.octal.strict";
      stringArray0[2] = "msg.no.old.octal.strict";
      String[] stringArray1 = main0.processOptions(stringArray0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Main main0 = new Main();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-o";
      stringArray0[1] = "[Yb}M?m";
      String[] stringArray1 = main0.processOptions(stringArray0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[19];
      stringArray0[0] = "-help";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Main main0 = new Main();
      String string0 = main0.getClassName("9kjrrJ//;");
      assertEquals("_9kjrrJ___", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("msg.extension.not.js");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "F");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-package";
      stringArray0[1] = "msg.extension.not.js";
      stringArray0[2] = "-debug";
      stringArray0[3] = "msg.extension.not.js";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
