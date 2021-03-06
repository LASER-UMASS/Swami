/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:31:34 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.ArrayComprehension;
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.GeneratorExpressionLoop;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.LetNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NodeVisitor;
import org.mozilla.javascript.ast.PropertyGet;
import org.mozilla.javascript.ast.SwitchStatement;
import org.mozilla.javascript.ast.UnaryExpression;
import org.mozilla.javascript.ast.WhileLoop;
import org.mozilla.javascript.ast.WithStatement;
import org.mozilla.javascript.ast.XmlPropRef;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Jump_ESTest extends Jump_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Jump jump0 = new Jump((-1081));
      // Undeclared exception!
      try { 
        jump0.visit((NodeVisitor) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // -1081
         //
         verifyException("org.mozilla.javascript.ast.Jump", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Jump jump0 = new Jump(0, 0);
      // Undeclared exception!
      try { 
        jump0.toSource(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 0
         //
         verifyException("org.mozilla.javascript.ast.Jump", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Label label0 = new Label();
      GeneratorExpressionLoop generatorExpressionLoop0 = new GeneratorExpressionLoop();
      label0.setLoop(generatorExpressionLoop0);
      assertEquals(0, Node.NON_SPECIALCALL);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement((-817), (-817));
      breakStatement0.setJumpStatement(breakStatement0);
      assertNull(breakStatement0.getJsDoc());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayComprehension arrayComprehension0 = new ArrayComprehension();
      Name name0 = new Name(1, 1, "");
      PropertyGet propertyGet0 = new PropertyGet(82, 82, arrayComprehension0, name0);
      Jump jump0 = new Jump(82, propertyGet0);
      // Undeclared exception!
      try { 
        jump0.setFinally(arrayComprehension0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement();
      UnaryExpression unaryExpression0 = new UnaryExpression();
      // Undeclared exception!
      try { 
        switchStatement0.setDefault(unaryExpression0);
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
      WithStatement withStatement0 = new WithStatement();
      FunctionNode functionNode0 = new FunctionNode();
      // Undeclared exception!
      try { 
        functionNode0.setContinue(withStatement0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Label label0 = new Label();
      Jump jump0 = label0.getLoop();
      assertNull(jump0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement((-817), (-817));
      Jump jump0 = breakStatement0.getJumpStatement();
      assertNull(jump0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      // Undeclared exception!
      try { 
        letNode0.getFinally();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement((-1338), (-2775));
      Node node0 = switchStatement0.getDefault();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WhileLoop whileLoop0 = new WhileLoop();
      // Undeclared exception!
      try { 
        whileLoop0.getContinue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlPropRef xmlPropRef0 = new XmlPropRef(2994, 2994);
      ExpressionStatement expressionStatement0 = new ExpressionStatement(xmlPropRef0);
      Jump jump0 = new Jump(2994, expressionStatement0, 22);
      assertEquals(22, jump0.getLineno());
      assertEquals("2994", jump0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayComprehension arrayComprehension0 = new ArrayComprehension();
      Name name0 = new Name(1, 1, "");
      PropertyGet propertyGet0 = new PropertyGet(82, 82, arrayComprehension0, name0);
      Jump jump0 = new Jump(82, propertyGet0);
      Node node0 = jump0.getFinally();
      assertNull(node0);
  }
}
