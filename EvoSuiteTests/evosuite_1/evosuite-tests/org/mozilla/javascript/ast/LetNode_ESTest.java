/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:12:42 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.LetNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.VariableDeclaration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LetNode_ESTest extends LetNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      Name name0 = new Name(27, "org.mozilla.javascript.ast.XmlExpression");
      letNode0.setBody(name0);
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(0, 0);
      letNode0.setVariables(variableDeclaration0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      letNode0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tLETEXPR -1 1\n0\t  VAR 1 0\n27\t  NAME 28 40 org.mozilla.javascript.ast.XmlExpression\n", astNode_DebugPrintVisitor0.toString());
      assertEquals((-1), letNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      // Undeclared exception!
      try { 
        letNode0.toSource(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.LetNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(0, 0);
      letNode0.setVariables(variableDeclaration0);
      String string0 = letNode0.toSource(2);
      assertEquals((-1), letNode0.getLp());
      assertEquals("159", letNode0.toString());
      assertEquals((-1), letNode0.getRp());
      assertEquals("    let () ", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LetNode letNode0 = new LetNode(40, (-2529));
      letNode0.setRp((-681));
      assertEquals((-681), letNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LetNode letNode0 = new LetNode((-1805));
      letNode0.setParens(0, 0);
      assertEquals(0, letNode0.getRp());
      assertEquals(0, letNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LetNode letNode0 = new LetNode(0, 0);
      assertEquals((-1), letNode0.getLp());
      
      letNode0.setLp(0);
      assertEquals(0, letNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      Name name0 = new Name(27, "org.mozilla.javascript.ast.XmlExpression");
      letNode0.setBody(name0);
      assertEquals(1, name0.depth());
      
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(0, 0);
      letNode0.setVariables(variableDeclaration0);
      String string0 = letNode0.toSource(2);
      assertEquals("    let ()     org.mozilla.javascript.ast.XmlExpression", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LetNode letNode0 = new LetNode(0, 0);
      letNode0.getVariables();
      assertEquals((-1), letNode0.getRp());
      assertEquals(159, letNode0.getType());
      assertEquals((-1), letNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LetNode letNode0 = new LetNode(40, (-2529));
      int int0 = letNode0.getLp();
      assertEquals("159", letNode0.toString());
      assertEquals((-1), int0);
      assertEquals((-1), letNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LetNode letNode0 = new LetNode(1819);
      letNode0.getBody();
      assertEquals("159", letNode0.toString());
      assertEquals((-1), letNode0.getLp());
      assertEquals((-1), letNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      int int0 = letNode0.getRp();
      assertEquals((-1), letNode0.getLp());
      assertEquals(159, letNode0.getType());
      assertEquals((-1), int0);
  }
}
