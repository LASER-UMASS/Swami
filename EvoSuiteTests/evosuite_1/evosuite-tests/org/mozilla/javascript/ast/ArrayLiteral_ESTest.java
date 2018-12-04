/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:18:50 GMT 2018
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
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.EmptyStatement;
import org.mozilla.javascript.ast.XmlElemRef;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrayLiteral_ESTest extends ArrayLiteral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(858);
      EmptyStatement emptyStatement0 = new EmptyStatement();
      arrayLiteral0.addElement(emptyStatement0);
      StringBuilder stringBuilder0 = new StringBuilder("RP");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      arrayLiteral0.visit(astNode_DebugPrintVisitor0);
      assertEquals("RP858\tARRAYLIT 858 1\n-1\t  EMPTY -859 1\n", astNode_DebugPrintVisitor0.toString());
      assertEquals(66, arrayLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(163, 163);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      arrayLiteral0.visit(astNode_DebugPrintVisitor0);
      assertEquals("163\tARRAYLIT 163 163\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("66", arrayLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(858);
      EmptyStatement emptyStatement0 = new EmptyStatement();
      arrayLiteral0.addElement(emptyStatement0);
      String string0 = arrayLiteral0.toSource(0);
      assertEquals("[;\n]", string0);
      assertEquals("66", arrayLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(858);
      arrayLiteral0.setSkipCount((-1118));
      assertEquals((-1118), arrayLiteral0.getSkipCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(0);
      arrayLiteral0.setIsDestructuring(true);
      assertTrue(arrayLiteral0.isDestructuring());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(0);
      XmlElemRef xmlElemRef0 = new XmlElemRef(7);
      arrayLiteral0.addElement(xmlElemRef0);
      List<AstNode> list0 = arrayLiteral0.getElements();
      assertFalse(list0.isEmpty());
      
      arrayLiteral0.setElements(list0);
      assertEquals("66", arrayLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(163, 163);
      arrayLiteral0.setElements((List<AstNode>) null);
      assertEquals(66, arrayLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(858);
      arrayLiteral0.setDestructuringLength(0);
      assertEquals(0, arrayLiteral0.getDestructuringLength());
      assertEquals(66, arrayLiteral0.getType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      arrayLiteral0.isDestructuring();
      assertEquals("66", arrayLiteral0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(858);
      int int0 = arrayLiteral0.getSkipCount();
      assertEquals(66, arrayLiteral0.getType());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(858);
      int int0 = arrayLiteral0.getSize();
      assertEquals(66, arrayLiteral0.getType());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(0);
      // Undeclared exception!
      try { 
        arrayLiteral0.getElement((-2770));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no elements
         //
         verifyException("org.mozilla.javascript.ast.ArrayLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(0, 0);
      LinkedList<AstNode> linkedList0 = new LinkedList<AstNode>();
      linkedList0.add((AstNode) arrayLiteral0);
      arrayLiteral0.setElements(linkedList0);
      assertEquals(1, arrayLiteral0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral(0);
      XmlElemRef xmlElemRef0 = new XmlElemRef(7);
      arrayLiteral0.addElement(xmlElemRef0);
      // Undeclared exception!
      try { 
        arrayLiteral0.getElement((-2770));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      int int0 = arrayLiteral0.getDestructuringLength();
      assertEquals(0, int0);
      assertEquals(66, arrayLiteral0.getType());
  }
}