/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:04:28 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NewExpression;
import org.mozilla.javascript.ast.ObjectLiteral;
import org.mozilla.javascript.ast.Yield;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewExpression_ESTest extends NewExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(693);
      Yield yield0 = new Yield(2, 16);
      newExpression0.setTarget(yield0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      newExpression0.setInitializer(objectLiteral0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      newExpression0.visit(astNode_DebugPrintVisitor0);
      assertEquals("693\tNEW 693 1\n2\t  YIELD -691 16\n-1\t  OBJECTLIT -694 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("30", newExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(693);
      Yield yield0 = new Yield((-960), (-1));
      newExpression0.setTarget(yield0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      newExpression0.addArgument(objectLiteral0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      newExpression0.visit(astNode_DebugPrintVisitor0);
      assertEquals("693\tNEW 693 1\n-960\t  YIELD -1653 -1\n-1\t  OBJECTLIT -694 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("693\tNEW 693 1\n-960\t  YIELD -1653 -1\n-1\t  OBJECTLIT -694 1\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(693);
      Yield yield0 = new Yield(2, 16);
      newExpression0.setTarget(yield0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      newExpression0.setInitializer(objectLiteral0);
      assertEquals((-694), objectLiteral0.getPosition());
      
      String string0 = newExpression0.toSource(27);
      assertEquals("                                                      new yield() {}", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(693);
      Yield yield0 = new Yield(2, 16);
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      newExpression0.arguments = (List<AstNode>) linkedList0;
      newExpression0.setTarget(yield0);
      String string0 = newExpression0.toSource(27);
      assertEquals("                                                      new yield()", string0);
      assertEquals("30", newExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression((-1329), (-1329));
      newExpression0.getInitializer();
      assertEquals(30, newExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      assertEquals(30, newExpression0.getType());
  }
}