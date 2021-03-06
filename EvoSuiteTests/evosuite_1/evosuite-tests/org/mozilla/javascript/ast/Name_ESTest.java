/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:00:23 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ArrayComprehensionLoop;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Name;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Name_ESTest extends Name_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Name name0 = new Name(75, "0");
      String string0 = name0.toSource();
      assertEquals("0", string0);
      assertEquals(39, name0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Name name0 = new Name(75, "0");
      int int0 = name0.length();
      assertEquals(1, int0);
      assertEquals("39", name0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Name name0 = new Name(944);
      name0.getScope();
      assertEquals(39, name0.getType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Name name0 = new Name(75, "0");
      boolean boolean0 = name0.isLocalName();
      assertEquals("39", name0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Name name0 = new Name(0, 0, "*/={V_f(OF");
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      name0.visit(astNode_DebugPrintVisitor0);
      assertEquals("0\tNAME 0 11 */={V_f(OF\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("39", name0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Name name0 = new Name((-630), 122);
      assertEquals("39", name0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Name name0 = new Name(144);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(740);
      name0.setScope(arrayComprehensionLoop0);
      assertEquals(39, name0.getType());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Name name0 = new Name();
      assertEquals(39, name0.getType());
  }
}
