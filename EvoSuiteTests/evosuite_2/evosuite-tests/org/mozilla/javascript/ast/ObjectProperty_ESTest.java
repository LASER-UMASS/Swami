/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:16:35 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ObjectProperty;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectProperty_ESTest extends ObjectProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty(146, 146);
      Name name0 = new Name(2);
      objectProperty0.right = (AstNode) name0;
      ContinueStatement continueStatement0 = new ContinueStatement(1, 18);
      objectProperty0.setLeft(continueStatement0);
      String string0 = objectProperty0.toSource(146);
      assertEquals("\n                                                                                                                                                                                                                                                                                                      continue;\n: <null>", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty(156);
      ContinueStatement continueStatement0 = new ContinueStatement(20, 4);
      objectProperty0.setLeft(continueStatement0);
      // Undeclared exception!
      try { 
        objectProperty0.toSource(156);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ObjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty((-1), (-1));
      objectProperty0.setIsSetterMethod();
      // Undeclared exception!
      try { 
        objectProperty0.toSource(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ObjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty(4);
      objectProperty0.setIsGetterMethod();
      // Undeclared exception!
      try { 
        objectProperty0.toSource(11);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ObjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty((-1), (-1));
      // Undeclared exception!
      try { 
        objectProperty0.setNodeType(8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid node type: 8
         //
         verifyException("org.mozilla.javascript.ast.ObjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty(4);
      objectProperty0.setIsNormalMethod();
      assertTrue(objectProperty0.isMethod());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty();
      boolean boolean0 = objectProperty0.isMethod();
      assertFalse(boolean0);
      assertEquals("104", objectProperty0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ObjectProperty objectProperty0 = new ObjectProperty((-1), (-1));
      objectProperty0.setNodeType(152);
      assertEquals(152, objectProperty0.getOperator());
  }
}
