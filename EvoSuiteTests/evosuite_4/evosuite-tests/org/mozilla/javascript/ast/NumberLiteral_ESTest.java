/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:18:53 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.NumberLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberLiteral_ESTest extends NumberLiteral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral((-2168));
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      numberLiteral0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-2168\tNUMBER -2168 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("40", numberLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral((-1067));
      String string0 = numberLiteral0.toSource((-1067));
      assertEquals("<null>", string0);
      assertEquals("40", numberLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral(0);
      numberLiteral0.getValue();
      assertEquals("40", numberLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral(0, "/QY", 0);
      assertEquals(40, numberLiteral0.getType());
      assertEquals(0.0, numberLiteral0.getDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral((-1930), (-1930));
      assertEquals("40", numberLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral(4737.09355503);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor((StringBuilder) null);
      // Undeclared exception!
      try { 
        numberLiteral0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.AstNode$DebugPrintVisitor", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Node node0 = Node.newNumber(27);
      assertEquals(27.0, node0.getDouble(), 0.01);
      assertEquals("40", node0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral((-1067));
      double double0 = numberLiteral0.getNumber();
      assertEquals(40, numberLiteral0.getType());
      assertEquals(0.0, double0, 0.01);
  }
}
