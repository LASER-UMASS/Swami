/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:45:54 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.DoLoop;
import org.mozilla.javascript.ast.ReturnStatement;
import org.mozilla.javascript.ast.SwitchStatement;
import org.mozilla.javascript.ast.XmlString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DoLoop_ESTest extends DoLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      DoLoop doLoop0 = new DoLoop();
      ReturnStatement returnStatement0 = new ReturnStatement(27);
      doLoop0.setBody(returnStatement0);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        doLoop0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.DoLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      XmlString xmlString0 = new XmlString(2);
      doLoop0.setBody(xmlString0);
      // Undeclared exception!
      try { 
        doLoop0.toSource((-1352));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.DoLoop", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      SwitchStatement switchStatement0 = new SwitchStatement(0);
      doLoop0.setCondition(switchStatement0);
      assertEquals("119", doLoop0.toString());
      assertEquals((-1), doLoop0.getWhilePosition());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      int int0 = doLoop0.getWhilePosition();
      assertEquals((-1), int0);
      assertEquals(119, doLoop0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop((-643), (-643));
      doLoop0.setWhilePosition((-643));
      assertEquals((-643), doLoop0.getWhilePosition());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop(79);
      assertEquals((-1), doLoop0.getWhilePosition());
      assertEquals("119", doLoop0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop();
      doLoop0.getCondition();
      assertEquals((-1), doLoop0.getWhilePosition());
      assertEquals(119, doLoop0.getType());
  }
}
