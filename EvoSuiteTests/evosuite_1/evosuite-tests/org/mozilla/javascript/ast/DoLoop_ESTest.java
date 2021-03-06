/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:40:56 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.DoLoop;
import org.mozilla.javascript.ast.Scope;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DoLoop_ESTest extends DoLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      Scope scope0 = new Scope();
      doLoop0.body = (AstNode) scope0;
      doLoop0.setCondition(scope0);
      StringBuilder stringBuilder0 = new StringBuilder(0);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      doLoop0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tDO -1 1\n-1\t  BLOCK 0 1\n-1\t  BLOCK 0 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(119, doLoop0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      Scope scope0 = new Scope();
      doLoop0.body = (AstNode) scope0;
      doLoop0.setCondition(scope0);
      String string0 = doLoop0.toSource((-1460));
      assertEquals("do {\n} while ({\n}\n);\n", string0);
      assertEquals((-1), doLoop0.getWhilePosition());
      assertEquals(119, doLoop0.getType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop((-1));
      doLoop0.setWhilePosition((-1));
      assertEquals((-1), doLoop0.getWhilePosition());
      assertEquals("119", doLoop0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      int int0 = doLoop0.getWhilePosition();
      assertEquals((-1), int0);
      assertEquals("119", doLoop0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop((-277), (-277));
      assertEquals((-1), doLoop0.getWhilePosition());
      assertEquals("119", doLoop0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      doLoop0.getCondition();
      assertEquals((-1), doLoop0.getWhilePosition());
      assertEquals("119", doLoop0.toString());
  }
}
