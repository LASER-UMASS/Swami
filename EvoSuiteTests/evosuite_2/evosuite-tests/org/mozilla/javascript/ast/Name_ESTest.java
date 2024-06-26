/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:40:39 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NodeVisitor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Name_ESTest extends Name_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Name name0 = new Name(0, 0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      name0.visit(astNode_DebugPrintVisitor0);
      assertEquals("0\tNAME 0 0 null\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(39, name0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Name name0 = new Name(2297, 2297);
      name0.toSource(2297);
      assertEquals("39", name0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Name name0 = new Name();
      FunctionNode functionNode0 = new FunctionNode(0, name0);
      name0.setScope(functionNode0);
      assertEquals("39", name0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Name name0 = new Name(39, "IQduls-rDXohm)^v|t");
      // Undeclared exception!
      try { 
        name0.visit((NodeVisitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.Name", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Name name0 = new Name(2297, 2297);
      int int0 = name0.length();
      assertEquals("39", name0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Name name0 = new Name(0);
      assertEquals(39, name0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Name name0 = new Name();
      name0.getScope();
      assertEquals(39, name0.getType());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Name name0 = new Name(1, 1, "__defineGetter_");
      boolean boolean0 = name0.isLocalName();
      assertEquals("39", name0.toString());
      assertFalse(boolean0);
  }
}
