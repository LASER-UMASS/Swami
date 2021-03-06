/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 17:30:00 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.Assignment;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.InfixExpression;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.ObjectProperty;
import org.mozilla.javascript.ast.PropertyGet;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.StringLiteral;
import org.mozilla.javascript.ast.XmlDotQuery;
import org.mozilla.javascript.ast.XmlPropRef;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InfixExpression_ESTest extends InfixExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty();
      StringLiteral stringLiteral0 = new StringLiteral();
      objectProperty0.setLeftAndRight(stringLiteral0, stringLiteral0);
      assertEquals(0, stringLiteral0.getPosition());
      
      String string0 = objectProperty0.debugPrint();
      assertEquals("-1\tCOLON -1 1\n-1\t  STRING 0 1\n-1\t  STRING 0 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Label label0 = new Label(1508, 1508, "3nxLB2{");
      Assignment assignment0 = new Assignment(1508, 1508, label0, label0);
      // Undeclared exception!
      try { 
        assignment0.toSource(2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid operator: -1
         //
         verifyException("org.mozilla.javascript.ast.AstNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Label label0 = new Label(1508, 1508, "3nxLB2{");
      Assignment assignment0 = new Assignment(1508, 1508, label0, label0);
      assignment0.setOperator(20);
      assignment0.toSource(2);
      assertEquals(20, assignment0.getType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty();
      StringLiteral stringLiteral0 = new StringLiteral();
      objectProperty0.setLeftAndRight(stringLiteral0, stringLiteral0);
      assertEquals(0, stringLiteral0.getPosition());
      
      objectProperty0.setType(105);
      boolean boolean0 = objectProperty0.hasSideEffects();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty();
      objectProperty0.setType(90);
      boolean boolean0 = objectProperty0.hasSideEffects();
      assertFalse(boolean0);
      assertEquals((-1), objectProperty0.getOperatorPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlDotQuery xmlDotQuery0 = new XmlDotQuery(0, 0);
      xmlDotQuery0.getRight();
      assertEquals((-1), xmlDotQuery0.getOperatorPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlPropRef xmlPropRef0 = new XmlPropRef();
      InfixExpression infixExpression0 = new InfixExpression(956, xmlPropRef0, xmlPropRef0, (-553));
      int int0 = infixExpression0.getOperatorPosition();
      assertEquals(0, xmlPropRef0.getPosition());
      assertEquals((-552), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InfixExpression infixExpression0 = new InfixExpression();
      infixExpression0.getOperator();
      assertEquals((-1), infixExpression0.getOperatorPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Scope scope0 = new Scope(906);
      InfixExpression infixExpression0 = new InfixExpression(scope0, scope0);
      assertEquals(0, scope0.getPosition());
      assertEquals(1, infixExpression0.getLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Label label0 = new Label(1508, 1508, "3nxLB2{");
      Assignment assignment0 = new Assignment(1508, 1508, label0, label0);
      AstNode astNode0 = assignment0.getLeft();
      assertEquals((-1), assignment0.getOperatorPosition());
      assertNotNull(astNode0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet(17);
      // Undeclared exception!
      try { 
        propertyGet0.setOperator(1003);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid token: 1003
         //
         verifyException("org.mozilla.javascript.ast.InfixExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty();
      objectProperty0.hasSideEffects();
      assertEquals((-1), objectProperty0.getOperatorPosition());
  }
}
