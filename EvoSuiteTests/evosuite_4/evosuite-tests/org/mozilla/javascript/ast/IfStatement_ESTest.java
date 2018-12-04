/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:43:06 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Block;
import org.mozilla.javascript.ast.IfStatement;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.ThrowStatement;
import org.mozilla.javascript.ast.UnaryExpression;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IfStatement_ESTest extends IfStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement();
      // Undeclared exception!
      try { 
        ifStatement0.debugPrint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.IfStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement(130);
      Label label0 = new Label(998, 17);
      ifStatement0.setCondition(label0);
      // Undeclared exception!
      try { 
        ifStatement0.toSource(32);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.IfStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement();
      UnaryExpression unaryExpression0 = new UnaryExpression();
      ifStatement0.setThenPart(unaryExpression0);
      assertEquals((-1), ifStatement0.getRp());
      assertEquals((-1), ifStatement0.getLp());
      assertEquals(113, ifStatement0.getType());
      assertEquals((-1), ifStatement0.getElsePosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement((-1927), (-1927));
      assertEquals((-1), ifStatement0.getRp());
      
      ifStatement0.setRp(0);
      assertEquals(0, ifStatement0.getRp());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement();
      ifStatement0.setLp(32);
      assertEquals(32, ifStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement();
      ifStatement0.setElsePosition((-1));
      assertEquals((-1), ifStatement0.getRp());
      assertEquals(113, ifStatement0.getType());
      assertEquals((-1), ifStatement0.getElsePosition());
      assertEquals((-1), ifStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement();
      ThrowStatement throwStatement0 = new ThrowStatement();
      ifStatement0.setElsePart(throwStatement0);
      assertEquals(0, throwStatement0.getPosition());
      assertEquals((-1), ifStatement0.getRp());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement();
      Block block0 = new Block(1431);
      ifStatement0.setCondition(block0);
      StringBuilder stringBuilder0 = new StringBuilder(1);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        ifStatement0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.IfStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement();
      ifStatement0.getThenPart();
      assertEquals((-1), ifStatement0.getElsePosition());
      assertEquals((-1), ifStatement0.getRp());
      assertEquals((-1), ifStatement0.getLp());
      assertEquals(113, ifStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement();
      int int0 = ifStatement0.getRp();
      assertEquals((-1), int0);
      assertEquals((-1), ifStatement0.getElsePosition());
      assertEquals((-1), ifStatement0.getLp());
      assertEquals(113, ifStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement();
      int int0 = ifStatement0.getLp();
      assertEquals((-1), ifStatement0.getRp());
      assertEquals((-1), ifStatement0.getElsePosition());
      assertEquals((-1), int0);
      assertEquals("113", ifStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement();
      int int0 = ifStatement0.getElsePosition();
      assertEquals(113, ifStatement0.getType());
      assertEquals((-1), int0);
      assertEquals((-1), ifStatement0.getRp());
      assertEquals((-1), ifStatement0.getLp());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement((-1927), (-1927));
      ifStatement0.getElsePart();
      assertEquals((-1), ifStatement0.getElsePosition());
      assertEquals((-1), ifStatement0.getRp());
      assertEquals((-1), ifStatement0.getLp());
      assertEquals("113", ifStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement(130);
      ifStatement0.setParens(0, 0);
      assertEquals(0, ifStatement0.getLp());
      assertEquals(0, ifStatement0.getRp());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IfStatement ifStatement0 = new IfStatement();
      ifStatement0.getCondition();
      assertEquals((-1), ifStatement0.getRp());
      assertEquals(113, ifStatement0.getType());
      assertEquals((-1), ifStatement0.getElsePosition());
      assertEquals((-1), ifStatement0.getLp());
  }
}