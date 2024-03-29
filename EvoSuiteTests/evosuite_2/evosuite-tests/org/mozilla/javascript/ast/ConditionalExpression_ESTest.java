/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:15:57 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.ConditionalExpression;
import org.mozilla.javascript.ast.XmlMemberGet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConditionalExpression_ESTest extends ConditionalExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      BreakStatement breakStatement0 = new BreakStatement(4);
      conditionalExpression0.setTrueExpression(breakStatement0);
      conditionalExpression0.setTestExpression(breakStatement0);
      // Undeclared exception!
      try { 
        conditionalExpression0.debugPrint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ConditionalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      BreakStatement breakStatement0 = new BreakStatement(4);
      conditionalExpression0.setTrueExpression(breakStatement0);
      conditionalExpression0.setTestExpression(breakStatement0);
      // Undeclared exception!
      try { 
        conditionalExpression0.toSource(22);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ConditionalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(103);
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      
      conditionalExpression0.setQuestionMarkPosition(0);
      assertEquals(0, conditionalExpression0.getQuestionMarkPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(3247, 3247);
      conditionalExpression0.setColonPosition(3247);
      assertEquals(3247, conditionalExpression0.getColonPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet();
      BreakStatement breakStatement0 = new BreakStatement(18);
      conditionalExpression0.setTrueExpression(breakStatement0);
      conditionalExpression0.setTestExpression(breakStatement0);
      conditionalExpression0.setFalseExpression(xmlMemberGet0);
      boolean boolean0 = conditionalExpression0.hasSideEffects();
      assertFalse(boolean0);
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals(103, conditionalExpression0.getType());
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
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(154);
      conditionalExpression0.getTestExpression();
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals(103, conditionalExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(0, (-1413));
      int int0 = conditionalExpression0.getQuestionMarkPosition();
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals((-1), int0);
      assertEquals("103", conditionalExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression((-1770), (-1770));
      conditionalExpression0.getTrueExpression();
      assertEquals((-1), conditionalExpression0.getColonPosition());
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals("103", conditionalExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(0);
      conditionalExpression0.getFalseExpression();
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals(103, conditionalExpression0.getType());
      assertEquals((-1), conditionalExpression0.getColonPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConditionalExpression conditionalExpression0 = new ConditionalExpression();
      int int0 = conditionalExpression0.getColonPosition();
      assertEquals((-1), int0);
      assertEquals((-1), conditionalExpression0.getQuestionMarkPosition());
      assertEquals("103", conditionalExpression0.toString());
  }
}
