/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:21:15 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.DoLoop;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.XmlElemRef;
import org.mozilla.javascript.ast.XmlMemberGet;
import org.mozilla.javascript.ast.XmlPropRef;
import org.mozilla.javascript.ast.Yield;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlMemberGet_ESTest extends XmlMemberGet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Name name0 = new Name(0, 0, "`ekMRMiV`)/cs");
      XmlPropRef xmlPropRef0 = new XmlPropRef();
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet(name0, xmlPropRef0);
      xmlMemberGet0.setOperator(13);
      // Undeclared exception!
      try { 
        xmlMemberGet0.toSource(22);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.XmlPropRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet();
      XmlElemRef xmlElemRef0 = new XmlElemRef(13);
      xmlMemberGet0.setTarget(xmlElemRef0);
      assertEquals(144, xmlMemberGet0.getOperator());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet();
      xmlMemberGet0.getTarget();
      assertEquals("144", xmlMemberGet0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Yield yield0 = new Yield();
      XmlElemRef xmlElemRef0 = new XmlElemRef();
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet(yield0, xmlElemRef0, 0);
      assertEquals("144", xmlMemberGet0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoLoop doLoop0 = new DoLoop(639);
      XmlPropRef xmlPropRef0 = new XmlPropRef();
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet((-555), (-2191), doLoop0, xmlPropRef0);
      assertEquals("144", xmlMemberGet0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet(3040, 3040);
      assertEquals("144", xmlMemberGet0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet(8);
      XmlElemRef xmlElemRef0 = new XmlElemRef();
      xmlMemberGet0.setProperty(xmlElemRef0);
      assertEquals(144, xmlMemberGet0.getType());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      XmlMemberGet xmlMemberGet0 = new XmlMemberGet();
      xmlMemberGet0.getMemberRef();
      assertEquals(144, xmlMemberGet0.getOperator());
  }
}
