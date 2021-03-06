/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:55:20 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.StringLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringLiteral_ESTest extends StringLiteral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringLiteral stringLiteral0 = new StringLiteral();
      // Undeclared exception!
      try { 
        stringLiteral0.toSource((-63));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringLiteral stringLiteral0 = new StringLiteral();
      stringLiteral0.setValue("X[w{`9UV");
      assertEquals(41, stringLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringLiteral stringLiteral0 = new StringLiteral();
      stringLiteral0.setQuoteCharacter('z');
      assertEquals('z', stringLiteral0.getQuoteCharacter());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringLiteral stringLiteral0 = new StringLiteral();
      String string0 = stringLiteral0.getValue(false);
      assertEquals("41", stringLiteral0.toString());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringLiteral stringLiteral0 = new StringLiteral();
      String string0 = stringLiteral0.getValue(true);
      assertNotNull(string0);
      assertEquals("41", stringLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringLiteral stringLiteral0 = new StringLiteral(0);
      stringLiteral0.getValue();
      assertEquals(41, stringLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringLiteral stringLiteral0 = new StringLiteral(0, 0);
      assertEquals("41", stringLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringLiteral stringLiteral0 = new StringLiteral((-1375));
      StringBuilder stringBuilder0 = new StringBuilder(2);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      stringLiteral0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1375\tSTRING -1375 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("41", stringLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StringLiteral stringLiteral0 = new StringLiteral();
      stringLiteral0.getQuoteCharacter();
      assertEquals("41", stringLiteral0.toString());
  }
}
