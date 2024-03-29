/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:27:01 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ErrorCollector;
import org.mozilla.javascript.ast.ParseProblem;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ErrorCollector_ESTest extends ErrorCollector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        errorCollector0.warning("org.mozilla.javascript.ast.ErrorCollector", "org.mozilla.javascript.ast.ErrorCollector", 1761, "X}<4", 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      errorCollector0.warning("EbggU5Fc<}rbchJ", "EbggU5Fc<}rbchJ", (-100), (-100));
      String string0 = errorCollector0.toString();
      assertEquals("EbggU5Fc<}rbchJ:offset=-100,length=-100,warning: EbggU5Fc<}rbchJ\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        errorCollector0.runtimeError("1(;m7' ", "Warning", (-984), "", 107);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      List<ParseProblem> list0 = errorCollector0.getErrors();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        errorCollector0.error("", "", 2371, "", 2371);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ErrorCollector errorCollector0 = new ErrorCollector();
      errorCollector0.error("pO>?f7C", "", 213, (-1833));
  }
}
