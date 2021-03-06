/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:21:11 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ObjectLiteral;
import org.mozilla.javascript.ast.ObjectProperty;
import org.mozilla.javascript.ast.XmlLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ObjectLiteral_ESTest extends ObjectLiteral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ObjectProperty objectProperty0 = new ObjectProperty(14);
      XmlLiteral xmlLiteral0 = new XmlLiteral();
      objectProperty0.setLeftAndRight(xmlLiteral0, xmlLiteral0);
      objectLiteral0.addElement(objectProperty0);
      String string0 = objectLiteral0.debugPrint();
      assertEquals("-1\tOBJECTLIT -1 1\n-1\t  COLON 0 1\n-1\t    XML 0 1\n-1\t    XML 0 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ObjectProperty objectProperty0 = new ObjectProperty(0);
      objectLiteral0.addElement(objectProperty0);
      // Undeclared exception!
      try { 
        objectLiteral0.toSource(0);
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
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      String string0 = objectLiteral0.toSource(0);
      assertEquals("{}", string0);
      assertEquals("67", objectLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ObjectProperty objectProperty0 = new ObjectProperty(14);
      LinkedList<ObjectProperty> linkedList0 = new LinkedList<ObjectProperty>();
      linkedList0.add(objectProperty0);
      objectLiteral0.setElements(linkedList0);
      assertEquals(67, objectLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      objectLiteral0.setElements((List<ObjectProperty>) null);
      assertEquals(67, objectLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral((-2481), (-2481));
      objectLiteral0.isDestructuring();
      assertEquals(67, objectLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral(0);
      objectLiteral0.setIsDestructuring(false);
      assertFalse(objectLiteral0.isDestructuring());
      assertEquals(67, objectLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ObjectProperty objectProperty0 = new ObjectProperty(14);
      objectLiteral0.addElement(objectProperty0);
      LinkedList<ObjectProperty> linkedList0 = new LinkedList<ObjectProperty>();
      objectLiteral0.setElements(linkedList0);
      assertEquals("67", objectLiteral0.toString());
  }
}
