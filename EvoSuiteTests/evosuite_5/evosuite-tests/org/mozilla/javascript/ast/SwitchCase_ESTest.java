/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 17:08:19 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.SwitchCase;
import org.mozilla.javascript.ast.WithStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SwitchCase_ESTest extends SwitchCase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(13);
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringBuilder stringBuilder0 = new StringBuilder(charBuffer0);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      switchCase0.addStatement(arrayLiteral0);
      switchCase0.visit(astNode_DebugPrintVisitor0);
      assertEquals("\u0000\u0000-1\tCASE -1 15\n13\t  ARRAYLIT 14 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(15, switchCase0.getLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(13);
      switchCase0.addStatement(arrayLiteral0);
      switchCase0.toSource(8);
      assertEquals(15, switchCase0.getLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      ContinueStatement continueStatement0 = new ContinueStatement();
      switchCase0.setExpression(continueStatement0);
      switchCase0.toSource((-2906));
      assertFalse(switchCase0.isDefault());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      WithStatement withStatement0 = new WithStatement(15, 4);
      switchCase0.setExpression(withStatement0);
      StringBuilder stringBuilder0 = new StringBuilder("U@pUfG9M4)1lrC7nTcp");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        switchCase0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.WithStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      boolean boolean0 = switchCase0.isDefault();
      assertTrue(boolean0);
      assertEquals(116, switchCase0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      switchCase0.getStatements();
      assertEquals("116", switchCase0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      switchCase0.getExpression();
      assertEquals("116", switchCase0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase(827, 827);
      assertEquals("116", switchCase0.toString());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase(827);
      assertEquals("116", switchCase0.toString());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SwitchCase switchCase0 = new SwitchCase();
      FunctionCall functionCall0 = new FunctionCall((-15));
      functionCall0.addArgument(switchCase0);
      List<AstNode> list0 = functionCall0.arguments;
      switchCase0.setStatements(list0);
      switchCase0.setStatements(list0);
      assertEquals(0, switchCase0.getPosition());
  }
}
