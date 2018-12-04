/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:32:07 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ArrayComprehensionLoop;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.ForInLoop;
import org.mozilla.javascript.ast.RegExpLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForInLoop_ESTest extends ForInLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop();
      ContinueStatement continueStatement0 = new ContinueStatement();
      forInLoop0.iteratedObject = (AstNode) continueStatement0;
      forInLoop0.setIterator(continueStatement0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        forInLoop0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ForInLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop();
      ContinueStatement continueStatement0 = new ContinueStatement();
      forInLoop0.iteratedObject = (AstNode) continueStatement0;
      forInLoop0.setIterator(continueStatement0);
      // Undeclared exception!
      try { 
        forInLoop0.toSource(3520);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ForInLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop();
      forInLoop0.isForOf = true;
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      forInLoop0.setIterator(regExpLiteral0);
      // Undeclared exception!
      try { 
        forInLoop0.toSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ForInLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop();
      ExpressionStatement expressionStatement0 = new ExpressionStatement(forInLoop0, false);
      forInLoop0.setIteratedObject(expressionStatement0);
      assertEquals((-1), forInLoop0.getEachPosition());
      assertEquals((-1), forInLoop0.getInPosition());
      assertEquals("120", forInLoop0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      arrayComprehensionLoop0.setIsForOf(false);
      assertEquals((-1), arrayComprehensionLoop0.getInPosition());
      assertEquals((-1), arrayComprehensionLoop0.getEachPosition());
      assertFalse(arrayComprehensionLoop0.isForOf());
      assertEquals(120, arrayComprehensionLoop0.getType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop();
      forInLoop0.setIsForEach(true);
      // Undeclared exception!
      try { 
        forInLoop0.toSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ForInLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop();
      assertEquals((-1), forInLoop0.getInPosition());
      
      forInLoop0.setInPosition(0);
      assertEquals(0, forInLoop0.getInPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop();
      forInLoop0.setEachPosition(9);
      assertEquals(9, forInLoop0.getEachPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      arrayComprehensionLoop0.getIterator();
      assertEquals((-1), arrayComprehensionLoop0.getEachPosition());
      assertEquals("120", arrayComprehensionLoop0.toString());
      assertEquals((-1), arrayComprehensionLoop0.getInPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop((-1982), (-1982));
      forInLoop0.getIteratedObject();
      assertEquals(120, forInLoop0.getType());
      assertEquals((-1), forInLoop0.getInPosition());
      assertEquals((-1), forInLoop0.getEachPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      int int0 = arrayComprehensionLoop0.getEachPosition();
      assertEquals((-1), arrayComprehensionLoop0.getInPosition());
      assertEquals("120", arrayComprehensionLoop0.toString());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop(0);
      forInLoop0.isForOf();
      assertEquals((-1), forInLoop0.getEachPosition());
      assertEquals("120", forInLoop0.toString());
      assertEquals((-1), forInLoop0.getInPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForInLoop forInLoop0 = new ForInLoop();
      int int0 = forInLoop0.getInPosition();
      assertEquals((-1), int0);
      assertEquals((-1), forInLoop0.getEachPosition());
      assertEquals(120, forInLoop0.getType());
  }
}