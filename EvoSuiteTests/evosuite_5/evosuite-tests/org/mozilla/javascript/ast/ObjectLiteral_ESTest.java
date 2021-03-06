/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 16:23:32 GMT 2018
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
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ObjectLiteral;
import org.mozilla.javascript.ast.ObjectProperty;
import org.mozilla.javascript.ast.ScriptNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectLiteral_ESTest extends ObjectLiteral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ObjectProperty objectProperty0 = new ObjectProperty();
      ScriptNode scriptNode0 = new ScriptNode();
      objectProperty0.setLeftAndRight(scriptNode0, scriptNode0);
      objectLiteral0.addElement(objectProperty0);
      StringBuilder stringBuilder0 = new StringBuilder(2);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      objectLiteral0.visit(astNode_DebugPrintVisitor0);
      assertEquals("-1\tOBJECTLIT -1 1\n-1\t  COLON 0 1\n-1\t    SCRIPT 0 1\n-1\t    SCRIPT 0 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("-1\tOBJECTLIT -1 1\n-1\t  COLON 0 1\n-1\t    SCRIPT 0 1\n-1\t    SCRIPT 0 1\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ObjectProperty objectProperty0 = new ObjectProperty(27, 0);
      objectLiteral0.addElement(objectProperty0);
      // Undeclared exception!
      try { 
        objectLiteral0.toSource(3);
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
      String string0 = objectLiteral0.toSource(3);
      assertEquals("      {}", string0);
      assertEquals("67", objectLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      objectLiteral0.setIsDestructuring(true);
      assertTrue(objectLiteral0.isDestructuring());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      ObjectProperty objectProperty0 = new ObjectProperty(27, 0);
      objectLiteral0.addElement(objectProperty0);
      LinkedList<ObjectProperty> linkedList0 = new LinkedList<ObjectProperty>();
      objectLiteral0.setElements(linkedList0);
      assertEquals("67", objectLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      objectLiteral0.setElements((List<ObjectProperty>) null);
      assertEquals(67, objectLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral((-567), (-567));
      objectLiteral0.isDestructuring();
      assertEquals("67", objectLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3242);
      assertEquals(67, objectLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      LinkedList<ObjectProperty> linkedList0 = new LinkedList<ObjectProperty>();
      ObjectProperty objectProperty0 = new ObjectProperty(12);
      linkedList0.addFirst(objectProperty0);
      objectLiteral0.setElements(linkedList0);
      assertEquals("67", objectLiteral0.toString());
  }
}
