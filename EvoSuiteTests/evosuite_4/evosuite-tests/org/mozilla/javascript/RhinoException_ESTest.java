/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 04:31:51 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.DefaultErrorReporter;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.ScriptStackElement;
import org.mozilla.javascript.StackStyle;
import org.mozilla.javascript.WrappedException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RhinoException_ESTest extends RhinoException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = RhinoException.usesMozillaStackStyle();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("VP@hMc@2?|XrN'# Ie ", "", 1768, "VP@hMc@2?|XrN'# Ie ", 1768);
      String string0 = evaluatorException0.sourceName();
      assertEquals(1768, evaluatorException0.getLineNumber());
      assertNotNull(string0);
      assertEquals(1768, evaluatorException0.columnNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("", "org.mozilla.javascript.ScriptableObject$SlotAccess", "8+q_B", 714, "", 2);
      MockFile mockFile0 = new MockFile("8+q_B");
      Object object0 = new Object();
      ecmaError0.interpreterStackInfo = object0;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      // Undeclared exception!
      try { 
        ecmaError0.printStackTrace((PrintWriter) mockPrintWriter0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to [Lorg.mozilla.javascript.Interpreter$CallFrame;
         //
         verifyException("org.mozilla.javascript.Interpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("", "org.mozilla.javascript.ScriptableObject$SlotAccess", "8+q_B", 714, "", 2);
      MockFile mockFile0 = new MockFile("8+q_B");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      ecmaError0.printStackTrace((PrintWriter) mockPrintWriter0);
      assertEquals(2, ecmaError0.getColumnNumber());
      assertEquals(714, ecmaError0.lineNumber());
      assertEquals("", ecmaError0.lineSource());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("", "", "", 1468, "", 1468);
      MockFile mockFile0 = new MockFile("]&bKHI j8*WyA^i4[Qbo");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      ecmaError0.printStackTrace((PrintStream) mockPrintStream0);
      assertEquals(1468, ecmaError0.columnNumber());
      assertEquals(1468, ecmaError0.lineNumber());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.reportRuntimeError("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // 
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      EvaluatorException evaluatorException0 = defaultErrorReporter0.runtimeError("", "DELPROP", 264, "DELPROP", 1960);
      int int0 = evaluatorException0.lineNumber();
      assertEquals(1960, evaluatorException0.getColumnNumber());
      assertEquals(264, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackStyle stackStyle0 = RhinoException.getStackStyle();
      assertEquals(StackStyle.RHINO, stackStyle0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("<zf=4s!vO+}9N}", "<zf=4s!vO+}9N}", "<zf=4s!vO+}9N}", 1970, "/o'h+%nl)rD~h^1kx", 1970);
      WrappedException wrappedException0 = new WrappedException(ecmaError0);
      String string0 = wrappedException0.getScriptStackTrace((FilenameFilter) null);
      assertEquals(1970, ecmaError0.getLineNumber());
      assertEquals(1970, ecmaError0.columnNumber());
      assertEquals("", string0);
      assertEquals("/o'h+%nl)rD~h^1kx", ecmaError0.getLineSource());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavaScriptException javaScriptException0 = new JavaScriptException("(sCsNtY[P6Ha'mYi", "(sCsNtY[P6Ha'mYi", 67);
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[9];
      StackTraceElement stackTraceElement0 = new StackTraceElement("(sCsNtY[P6Ha'mYi", "(sCsNtY[P6Ha'mYi", "(sCsNtY[P6Ha'mYi", 67);
      stackTraceElementArray0[0] = stackTraceElement0;
      stackTraceElementArray0[1] = stackTraceElement0;
      stackTraceElementArray0[2] = stackTraceElement0;
      stackTraceElementArray0[3] = stackTraceElementArray0[2];
      stackTraceElementArray0[4] = stackTraceElement0;
      stackTraceElementArray0[5] = stackTraceElement0;
      StackTraceElement stackTraceElement1 = new StackTraceElement("(sCsNtY[P6Ha'mYi", "_c_scr4Ept_0", "msg.java.no_such_m<thod", 67);
      stackTraceElementArray0[6] = stackTraceElement1;
      stackTraceElementArray0[7] = stackTraceElement0;
      stackTraceElementArray0[8] = stackTraceElement1;
      javaScriptException0.setStackTrace(stackTraceElementArray0);
      ScriptStackElement[] scriptStackElementArray0 = javaScriptException0.getScriptStack(67, (String) null);
      assertEquals(67, javaScriptException0.lineNumber());
      assertEquals(0, javaScriptException0.columnNumber());
      assertEquals(2, scriptStackElementArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      JavaScriptException javaScriptException0 = new JavaScriptException(object0, "XEVn!:x", 8);
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("XEVn!:x", "java.lang.Object@0000000003", 8);
      javaScriptException0.interpreterStackInfo = (Object) scriptStackElement0;
      // Undeclared exception!
      try { 
        javaScriptException0.getScriptStack(8, "java.lang.Object@0000000003");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.ScriptStackElement cannot be cast to [Lorg.mozilla.javascript.Interpreter$CallFrame;
         //
         verifyException("org.mozilla.javascript.Interpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(714);
      JavaScriptException javaScriptException0 = new JavaScriptException(integer0, "Rhino", 111);
      javaScriptException0.getScriptStack();
      assertEquals(0, javaScriptException0.columnNumber());
      assertEquals(111, javaScriptException0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(722);
      JavaScriptException javaScriptException0 = new JavaScriptException(integer0, ";hino", 722);
      String string0 = javaScriptException0.getMessage();
      assertEquals(0, javaScriptException0.columnNumber());
      assertEquals("722 (;hino#722)", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(716);
      EcmaError ecmaError0 = new EcmaError("?Rhi", "", "", 716, "?Rhi", (int) integer0);
      Object object0 = new Object();
      ecmaError0.interpreterStackInfo = object0;
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.evosuite.runtime.mock.java.lang.MockThrowable");
      // Undeclared exception!
      try { 
        ecmaError0.printStackTrace((PrintStream) mockPrintStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to [Lorg.mozilla.javascript.Interpreter$CallFrame;
         //
         verifyException("org.mozilla.javascript.Interpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ScriptStackElement[] scriptStackElementArray0 = new ScriptStackElement[3];
      ScriptStackElement scriptStackElement0 = new ScriptStackElement(" F]-|tOZ(w+Gn#9MZZ(", " F]-|tOZ(w+Gn#9MZZ(", 1);
      scriptStackElementArray0[0] = scriptStackElement0;
      scriptStackElementArray0[1] = scriptStackElement0;
      scriptStackElementArray0[2] = scriptStackElement0;
      String string0 = RhinoException.formatStackTrace(scriptStackElementArray0, " F]-|tOZ(w+Gn#9MZZ(");
      assertEquals("\tat  F]-|tOZ(w+Gn#9MZZ(:1 ( F]-|tOZ(w+Gn#9MZZ()\n\tat  F]-|tOZ(w+Gn#9MZZ(:1 ( F]-|tOZ(w+Gn#9MZZ()\n\tat  F]-|tOZ(w+Gn#9MZZ(:1 ( F]-|tOZ(w+Gn#9MZZ()\n", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StackStyle stackStyle0 = StackStyle.V8;
      ScriptStackElement[] scriptStackElementArray0 = new ScriptStackElement[3];
      ScriptStackElement scriptStackElement0 = new ScriptStackElement(" F]-|tOZ(w+Gn#9MZZ(", " F]-|tOZ(w+Gn#9MZZ(", 1);
      scriptStackElementArray0[0] = scriptStackElement0;
      RhinoException.setStackStyle(stackStyle0);
      // Undeclared exception!
      try { 
        RhinoException.formatStackTrace(scriptStackElementArray0, " F]-|tOZ(w+Gn#9MZZ(");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RhinoException.useMozillaStackStyle(true);
      ScriptStackElement[] scriptStackElementArray0 = new ScriptStackElement[4];
      ScriptStackElement scriptStackElement0 = new ScriptStackElement("3+n6Cs?4H/'", "3+n6Cs?4H/'", (-4111));
      scriptStackElementArray0[0] = scriptStackElement0;
      // Undeclared exception!
      try { 
        RhinoException.formatStackTrace(scriptStackElementArray0, "3+n6Cs?4H/'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.RhinoException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvaluatorException evaluatorException0 = new EvaluatorException("<wJ$[8@H*L(m", "<wJ$[8@H*L(m", (-1), "<wJ$[8@H*L(m", 4188);
      String string0 = evaluatorException0.getMessage();
      assertEquals("<wJ$[8@H*L(m", string0);
      assertEquals(4188, evaluatorException0.columnNumber());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EcmaError ecmaError0 = new EcmaError("_c_", "_c_", "_c_", 0, "_c_", 0);
      int int0 = ecmaError0.columnNumber();
      assertEquals(0, int0);
      assertEquals(0, ecmaError0.getLineNumber());
  }
}
