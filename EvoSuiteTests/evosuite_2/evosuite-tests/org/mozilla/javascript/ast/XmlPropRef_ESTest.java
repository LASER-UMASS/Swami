/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:53:03 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.XmlPropRef;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlPropRef_ESTest extends XmlPropRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlPropRef xmlPropRef0 = new XmlPropRef((-944), (-944));
      Name name0 = new Name();
      StringBuilder stringBuilder0 = new StringBuilder("6$H01ujhfL");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      xmlPropRef0.setPropName(name0);
      xmlPropRef0.visit(astNode_DebugPrintVisitor0);
      assertEquals("6$H01ujhfL-944\tREF_NAME -944 -944\n-1\t  NAME 943 1 null\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("80", xmlPropRef0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlPropRef xmlPropRef0 = new XmlPropRef((-944), (-944));
      Name name0 = new Name();
      xmlPropRef0.namespace = name0;
      StringBuilder stringBuilder0 = new StringBuilder("6$H01ujhfL");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        xmlPropRef0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.XmlPropRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlPropRef xmlPropRef0 = new XmlPropRef((-3894), (-3894));
      Name name0 = new Name(17);
      xmlPropRef0.namespace = name0;
      // Undeclared exception!
      try { 
        xmlPropRef0.toSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.XmlPropRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlPropRef xmlPropRef0 = new XmlPropRef((-3894), (-3894));
      xmlPropRef0.setAtPos(6);
      // Undeclared exception!
      try { 
        xmlPropRef0.toSource();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.XmlPropRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XmlPropRef xmlPropRef0 = new XmlPropRef((-944), (-944));
      xmlPropRef0.getPropName();
      assertEquals(80, xmlPropRef0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XmlPropRef xmlPropRef0 = new XmlPropRef((-3109));
      assertEquals(80, xmlPropRef0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XmlPropRef xmlPropRef0 = new XmlPropRef();
      Name name0 = new Name(4564, 0);
      xmlPropRef0.setPropName(name0);
      String string0 = xmlPropRef0.toSource(22);
      assertEquals("                                            <null>", string0);
      assertEquals(80, xmlPropRef0.getType());
  }
}
