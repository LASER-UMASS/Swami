/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:56:30 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.Yield;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Yield_ESTest extends Yield_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Yield yield0 = new Yield();
      ErrorNode errorNode0 = new ErrorNode();
      yield0.setValue(errorNode0);
      StringBuilder stringBuilder0 = new StringBuilder(20);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      yield0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tYIELD -1 1\n-1\t  ERROR 0 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("73", yield0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Yield yield0 = new Yield();
      String string0 = yield0.toSource(8);
      assertEquals("73", yield0.toString());
      assertEquals("yield", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Yield yield0 = new Yield();
      ErrorNode errorNode0 = new ErrorNode();
      yield0.setValue(errorNode0);
      assertEquals(1, errorNode0.depth());
      
      String string0 = yield0.toSource(8);
      assertEquals("yield ", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Yield yield0 = new Yield(0, 0);
      assertEquals("73", yield0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Yield yield0 = new Yield(831);
      assertEquals("73", yield0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Yield yield0 = new Yield();
      yield0.getValue();
      assertEquals(73, yield0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Yield yield0 = new Yield((-1968), (-1968), (AstNode) null);
      assertEquals(73, yield0.getType());
  }
}
