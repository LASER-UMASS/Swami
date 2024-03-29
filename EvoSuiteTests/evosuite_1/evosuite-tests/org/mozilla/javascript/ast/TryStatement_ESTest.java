/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:59:45 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.CatchClause;
import org.mozilla.javascript.ast.KeywordLiteral;
import org.mozilla.javascript.ast.ParenthesizedExpression;
import org.mozilla.javascript.ast.SwitchCase;
import org.mozilla.javascript.ast.TryStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TryStatement_ESTest extends TryStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      KeywordLiteral keywordLiteral0 = new KeywordLiteral(2);
      tryStatement0.setFinallyBlock(keywordLiteral0);
      assertEquals(3, keywordLiteral0.getPosition());
      
      tryStatement0.setTryBlock(keywordLiteral0);
      StringBuilder stringBuilder0 = new StringBuilder(27);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      tryStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals("82", tryStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      KeywordLiteral keywordLiteral0 = new KeywordLiteral((-305));
      LinkedList<CatchClause> linkedList0 = new LinkedList<CatchClause>();
      CatchClause catchClause0 = new CatchClause(18);
      linkedList0.add(catchClause0);
      tryStatement0.setCatchClauses(linkedList0);
      tryStatement0.setTryBlock(keywordLiteral0);
      StringBuilder stringBuilder0 = new StringBuilder(27);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        tryStatement0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.CatchClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement(1, 800);
      SwitchCase switchCase0 = new SwitchCase(14, 4);
      tryStatement0.setTryBlock(switchCase0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      tryStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals("1\tTRY 1 800\n14\t  CASE 13 4\n", astNode_DebugPrintVisitor0.toString());
      assertEquals((-1), tryStatement0.getFinallyPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression();
      tryStatement0.setFinallyBlock(parenthesizedExpression0);
      SwitchCase switchCase0 = new SwitchCase(0);
      tryStatement0.setTryBlock(switchCase0);
      // Undeclared exception!
      try { 
        tryStatement0.toSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ParenthesizedExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement(92, 92);
      assertEquals((-1), tryStatement0.getFinallyPosition());
      
      tryStatement0.setFinallyPosition(1);
      assertEquals(1, tryStatement0.getFinallyPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      LinkedList<CatchClause> linkedList0 = new LinkedList<CatchClause>();
      CatchClause catchClause0 = new CatchClause(1, 2);
      linkedList0.add(catchClause0);
      tryStatement0.setCatchClauses(linkedList0);
      tryStatement0.setCatchClauses(linkedList0);
      assertEquals((-1), tryStatement0.getFinallyPosition());
      assertEquals(82, tryStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      tryStatement0.setCatchClauses((List<CatchClause>) null);
      assertEquals((-1), tryStatement0.getFinallyPosition());
      assertEquals("82", tryStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      tryStatement0.getTryBlock();
      assertEquals((-1), tryStatement0.getFinallyPosition());
      assertEquals("82", tryStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      int int0 = tryStatement0.getFinallyPosition();
      assertEquals("82", tryStatement0.toString());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      tryStatement0.getFinallyBlock();
      assertEquals((-1), tryStatement0.getFinallyPosition());
      assertEquals("82", tryStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      SwitchCase switchCase0 = new SwitchCase();
      tryStatement0.setTryBlock(switchCase0);
      String string0 = tryStatement0.toSource();
      assertEquals("try default:", string0);
      assertEquals((-1), tryStatement0.getFinallyPosition());
      assertEquals(82, tryStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement((-1486));
      assertEquals((-1), tryStatement0.getFinallyPosition());
      assertEquals(82, tryStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      CatchClause catchClause0 = new CatchClause();
      tryStatement0.addCatchClause(catchClause0);
      SwitchCase switchCase0 = new SwitchCase();
      tryStatement0.setTryBlock(switchCase0);
      // Undeclared exception!
      try { 
        tryStatement0.toSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.CatchClause", e);
      }
  }
}
