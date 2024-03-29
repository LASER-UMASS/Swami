/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 16:15:11 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.EmptyExpression;
import org.mozilla.javascript.ast.ParenthesizedExpression;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.UnaryExpression;
import org.mozilla.javascript.ast.XmlLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnaryExpression_ESTest extends UnaryExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnaryExpression unaryExpression0 = new UnaryExpression((-808), (-808));
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        unaryExpression0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.UnaryExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlLiteral xmlLiteral0 = new XmlLiteral(13);
      UnaryExpression unaryExpression0 = new UnaryExpression(13, 13, xmlLiteral0, true);
      String string0 = unaryExpression0.toSource(13);
      assertEquals(0, xmlLiteral0.getPosition());
      assertEquals("                          !=", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnaryExpression unaryExpression0 = new UnaryExpression((-1481), (-1481));
      unaryExpression0.setOperator(31);
      // Undeclared exception!
      try { 
        unaryExpression0.toSource(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.UnaryExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression((-92), 104);
      UnaryExpression unaryExpression0 = null;
      try {
        unaryExpression0 = new UnaryExpression((-92), (-92), parenthesizedExpression0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid token: -92
         //
         verifyException("org.mozilla.javascript.ast.UnaryExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnaryExpression unaryExpression0 = new UnaryExpression((-1481), (-1481));
      unaryExpression0.setIsPostfix(false);
      assertFalse(unaryExpression0.isPostfix());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnaryExpression unaryExpression0 = new UnaryExpression((-1481), (-1481));
      boolean boolean0 = unaryExpression0.isPrefix();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnaryExpression unaryExpression0 = new UnaryExpression((-1481), (-1481));
      boolean boolean0 = unaryExpression0.isPostfix();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnaryExpression unaryExpression0 = new UnaryExpression((-1481), (-1481));
      int int0 = unaryExpression0.getOperator();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmptyExpression emptyExpression0 = new EmptyExpression();
      UnaryExpression unaryExpression0 = new UnaryExpression(32, 1, emptyExpression0);
      assertEquals((-2), emptyExpression0.getPosition());
      assertEquals((-1), unaryExpression0.getLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnaryExpression unaryExpression0 = new UnaryExpression((-1481), (-1481));
      AstNode astNode0 = unaryExpression0.getOperand();
      assertNull(astNode0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnaryExpression unaryExpression0 = new UnaryExpression(0);
      Scope scope0 = new Scope(2870, 14);
      unaryExpression0.setOperand(scope0);
      String string0 = unaryExpression0.debugPrint();
      assertEquals("0\tERROR 0 1\n2870\t  BLOCK 2870 14\n", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnaryExpression unaryExpression0 = new UnaryExpression();
      assertEquals(0, Node.END_UNREACHED);
  }
}
