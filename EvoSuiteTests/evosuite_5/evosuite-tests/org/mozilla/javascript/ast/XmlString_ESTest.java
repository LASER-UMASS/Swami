/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 16:51:48 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.XmlString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlString_ESTest extends XmlString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlString xmlString0 = new XmlString((-2936), "");
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      xmlString0.visit(astNode_DebugPrintVisitor0);
      assertEquals(27, Node.ARROW_FUNCTION_PROP);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlString xmlString0 = new XmlString((-2936), "");
      String string0 = xmlString0.toSource(3);
      assertEquals("      ", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlString xmlString0 = new XmlString((-2936), "");
      String string0 = xmlString0.getXml();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlString xmlString0 = new XmlString(0);
      assertEquals(2, Node.SPECIALCALL_WITH);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XmlString xmlString0 = new XmlString();
      assertEquals(1, Node.SPECIALCALL_EVAL);
  }
}
