/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:21:47 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.NodeVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ErrorNode_ESTest extends ErrorNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode(1275);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      errorNode0.visit(astNode_DebugPrintVisitor0);
      assertEquals("1275\tERROR 1275 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("-1", errorNode0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode();
      // Undeclared exception!
      try { 
        errorNode0.visit((NodeVisitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ErrorNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode();
      errorNode0.toSource();
      assertEquals((-1), errorNode0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode(0);
      errorNode0.setMessage("Fg$p*q");
      assertEquals((-1), errorNode0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode(24, 24);
      assertEquals("-1", errorNode0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ErrorNode errorNode0 = new ErrorNode();
      errorNode0.getMessage();
      assertEquals("-1", errorNode0.toString());
  }
}
