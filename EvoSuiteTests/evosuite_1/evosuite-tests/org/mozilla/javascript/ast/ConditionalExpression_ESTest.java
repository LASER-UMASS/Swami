/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:32:52 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ConditionalExpression;
import org.mozilla.javascript.ast.ContinueStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ConditionalExpression_ESTest extends ConditionalExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      ContinueStatement continueStatement0 = new ContinueStatement();
      conditionalExpression0.setFalseExpression(continueStatement0);
      conditionalExpression0.setTrueExpression(continueStatement0);
      conditionalExpression0.setTestExpression(continueStatement0);
      StringBuilder stringBuilder0 = new StringBuilder(719);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      conditionalExpression0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tHOOK -1 1\n-1\t  CONTINUE 0 1\n-1\t  CONTINUE 0 1\n-1\t  CONTINUE 0 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("103", conditionalExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      ContinueStatement continueStatement0 = new ContinueStatement();
      conditionalExpression0.setFalseExpression(continueStatement0);
      conditionalExpression0.setTrueExpression(continueStatement0);
      conditionalExpression0.setTestExpression(continueStatement0);
      String string0 = conditionalExpression0.toSource(124);
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals("103", conditionalExpression0.toString());
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                continue;\n ? continue;\n : continue;\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      conditionalExpression0.setQuestionMarkPosition(15);
      assertEquals(15, conditionalExpression0.getQuestionMarkPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(0);
      assertEquals((-1), conditionalExpression0.getColonPosition());
      
      conditionalExpression0.setColonPosition(0);
      assertEquals(0, conditionalExpression0.getColonPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      ContinueStatement continueStatement0 = new ContinueStatement();
      conditionalExpression0.setFalseExpression(continueStatement0);
      conditionalExpression0.setTrueExpression(continueStatement0);
      conditionalExpression0.setTestExpression(continueStatement0);
      boolean boolean0 = conditionalExpression0.hasSideEffects();
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertTrue(boolean0);
      assertEquals("103", conditionalExpression0.toString());
      assertEquals((-1), conditionalExpression0.getColonPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      // Undeclared exception!
      try { 
        conditionalExpression0.hasSideEffects();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression((-2886));
      conditionalExpression0.getTrueExpression();
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals("103", conditionalExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(92);
      conditionalExpression0.getTestExpression();
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals("103", conditionalExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(2092);
      conditionalExpression0.getFalseExpression();
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals("103", conditionalExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(0, 0);
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals("103", conditionalExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(2092);
      int int0 = conditionalExpression0.getColonPosition();
      assertEquals((-1), int0);
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals("103", conditionalExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      int int0 = conditionalExpression0.getQuestionMarkPosition();
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals((-1), int0);
      assertEquals("103", conditionalExpression0.toString());
  }
}
