/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 17:01:28 GMT 2018
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
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.SwitchCase;
import org.mozilla.javascript.ast.TryStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TryStatement_ESTest extends TryStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement((-8));
      SwitchCase switchCase0 = new SwitchCase(1);
      tryStatement0.setTryBlock(switchCase0);
      tryStatement0.setFinallyBlock(switchCase0);
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "try  finally default:\n");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      tryStatement0.visit(astNode_DebugPrintVisitor0);
      assertEquals("try  finally default:\n-8\tTRY -8 1\n1\t  CASE 9 1\n1\t  CASE 9 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("try  finally default:\n-8\tTRY -8 1\n1\t  CASE 9 1\n1\t  CASE 9 1\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      LinkedList<CatchClause> linkedList0 = new LinkedList<CatchClause>();
      SwitchCase switchCase0 = new SwitchCase(2);
      CatchClause catchClause0 = new CatchClause();
      linkedList0.add(catchClause0);
      tryStatement0.setTryBlock(switchCase0);
      tryStatement0.setCatchClauses(linkedList0);
      // Undeclared exception!
      try { 
        tryStatement0.toSource(1);
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
      TryStatement tryStatement0 = new TryStatement();
      ErrorNode errorNode0 = new ErrorNode();
      tryStatement0.setTryBlock(errorNode0);
      String string0 = tryStatement0.toSource(0);
      assertEquals("try ", string0);
      assertEquals(82, tryStatement0.getType());
      assertEquals((-1), tryStatement0.getFinallyPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement((-8));
      tryStatement0.setFinallyPosition((-146));
      assertEquals((-146), tryStatement0.getFinallyPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      SwitchCase switchCase0 = new SwitchCase(21, 4);
      tryStatement0.setFinallyBlock(switchCase0);
      assertEquals(22, switchCase0.getPosition());
      
      ErrorNode errorNode0 = new ErrorNode();
      tryStatement0.setTryBlock(errorNode0);
      String string0 = tryStatement0.toSource(0);
      assertEquals("try  finally default:\n", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      LinkedList<CatchClause> linkedList0 = new LinkedList<CatchClause>();
      CatchClause catchClause0 = new CatchClause(6);
      linkedList0.add(catchClause0);
      tryStatement0.setCatchClauses(linkedList0);
      tryStatement0.setCatchClauses(linkedList0);
      assertEquals(82, tryStatement0.getType());
      assertEquals((-1), tryStatement0.getFinallyPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      tryStatement0.setCatchClauses((List<CatchClause>) null);
      assertEquals("82", tryStatement0.toString());
      assertEquals((-1), tryStatement0.getFinallyPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement((-8));
      tryStatement0.getTryBlock();
      assertEquals((-1), tryStatement0.getFinallyPosition());
      assertEquals(82, tryStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement();
      int int0 = tryStatement0.getFinallyPosition();
      assertEquals((-1), int0);
      assertEquals(82, tryStatement0.getType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement((-8));
      tryStatement0.getFinallyBlock();
      assertEquals((-1), tryStatement0.getFinallyPosition());
      assertEquals("82", tryStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement(36, 250);
      assertEquals(82, tryStatement0.getType());
      assertEquals((-1), tryStatement0.getFinallyPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TryStatement tryStatement0 = new TryStatement(0);
      LinkedList<CatchClause> linkedList0 = new LinkedList<CatchClause>();
      SwitchCase switchCase0 = new SwitchCase(1);
      CatchClause catchClause0 = new CatchClause((-1786), 2);
      linkedList0.add(catchClause0);
      tryStatement0.setTryBlock(switchCase0);
      tryStatement0.setCatchClauses(linkedList0);
      StringBuilder stringBuilder0 = new StringBuilder("<m y58SSVyaP-e(Op*");
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
}