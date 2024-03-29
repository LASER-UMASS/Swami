/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:38:18 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.InfixExpression;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ObjectProperty;
import org.mozilla.javascript.ast.PropertyGet;
import org.mozilla.javascript.ast.Yield;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyGet_ESTest extends PropertyGet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InfixExpression infixExpression0 = new InfixExpression((-53));
      Name name0 = new Name();
      PropertyGet propertyGet0 = new PropertyGet((-53), (-53), infixExpression0, name0);
      propertyGet0.setTarget(name0);
      assertEquals("33", propertyGet0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet();
      // Undeclared exception!
      try { 
        propertyGet0.setTarget((AstNode) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // arg cannot be null
         //
         verifyException("org.mozilla.javascript.ast.AstNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty(905, 1);
      Name name0 = new Name(2, 1767, "xOzWdkWJ$5pH|f&Y");
      PropertyGet propertyGet0 = new PropertyGet(objectProperty0, name0, 1);
      propertyGet0.setProperty(name0);
      assertEquals("33", propertyGet0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet();
      StringBuilder stringBuilder0 = new StringBuilder("");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        propertyGet0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.PropertyGet", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet();
      propertyGet0.getProperty();
      assertEquals(33, propertyGet0.getOperator());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Name name0 = new Name(0, 0, "");
      PropertyGet propertyGet0 = new PropertyGet(name0, name0, 75);
      String string0 = propertyGet0.toSource(2);
      assertEquals("    .", string0);
      assertEquals(33, propertyGet0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Yield yield0 = new Yield(1);
      Name name0 = new Name(2823, 4, "org.mozilla.javascript.ast.PropertyGet");
      PropertyGet propertyGet0 = new PropertyGet(1, 1, yield0, name0);
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "org.mozilla.javascript.ast.PropertyGet");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      propertyGet0.visit(astNode_DebugPrintVisitor0);
      assertEquals("org.mozilla.javascript.ast.PropertyGet1\tGETPROP 1 1\n1\t  YIELD 0 1\n2823\t  NAME 2822 38 org.mozilla.javascript.ast.PropertyGet\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("33", propertyGet0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet(86, 86);
      // Undeclared exception!
      try { 
        propertyGet0.toSource(86);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.PropertyGet", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet(129);
      assertEquals(33, propertyGet0.getType());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet();
      Name name0 = new Name((-1), 7, "");
      PropertyGet propertyGet1 = new PropertyGet(propertyGet0, name0);
      assertEquals("33", propertyGet1.toString());
      assertEquals(33, propertyGet0.getType());
  }
}
