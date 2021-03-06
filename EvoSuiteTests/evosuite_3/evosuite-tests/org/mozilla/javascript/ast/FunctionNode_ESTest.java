/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 15:53:10 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.ElementGet;
import org.mozilla.javascript.ast.EmptyStatement;
import org.mozilla.javascript.ast.ErrorNode;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ObjectLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FunctionNode_ESTest extends FunctionNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(5954);
      ErrorNode errorNode0 = new ErrorNode();
      functionNode0.setBody(errorNode0);
      functionNode0.setMemberExprNode(errorNode0);
      StringBuilder stringBuilder0 = new StringBuilder(2);
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      functionNode0.visit(astNode_DebugPrintVisitor0);
      assertEquals(5954, functionNode0.getEncodedSourceStart());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      EmptyStatement emptyStatement0 = new EmptyStatement((-298), 2577);
      functionNode0.addParam(emptyStatement0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        functionNode0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.FunctionNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.setIsExpressionClosure(true);
      ObjectLiteral objectLiteral0 = new ObjectLiteral(14);
      functionNode0.setBody(objectLiteral0);
      functionNode0.toSource(0);
      assertTrue(functionNode0.isExpressionClosure());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.setFunctionType(4);
      // Undeclared exception!
      try { 
        functionNode0.toSource(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.FunctionNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(3, 22);
      functionNode0.addParam(objectLiteral0);
      // Undeclared exception!
      try { 
        functionNode0.toSource(1818);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.FunctionNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Name name0 = new Name(12, 12);
      FunctionNode functionNode0 = new FunctionNode(12, name0);
      // Undeclared exception!
      try { 
        functionNode0.toSource(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.FunctionNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      assertEquals((-1), functionNode0.getRp());
      
      functionNode0.setRp(0);
      assertEquals(0, functionNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.setRequiresActivation();
      assertTrue(functionNode0.requiresActivation());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(2573);
      functionNode0.setParens(1, 0);
      assertEquals(1, functionNode0.getLp());
      assertEquals(0, functionNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      ElementGet elementGet0 = new ElementGet(20, 1);
      functionNode0.addChildToBack(elementGet0);
      List<AstNode> list0 = functionNode0.getStatements();
      functionNode0.setParams(list0);
      functionNode0.setParams(list0);
      assertEquals((-1), functionNode0.getLp());
      assertEquals((-1), functionNode0.getRp());
      assertEquals(110, functionNode0.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.setParams((List<AstNode>) null);
      assertEquals((-1), functionNode0.getLp());
      assertEquals((-1), functionNode0.getRp());
      assertEquals("110", functionNode0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(3);
      functionNode0.setLp(2);
      assertEquals(2, functionNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.setIsGenerator();
      assertTrue(functionNode0.isGenerator());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.setFunctionIsSetterMethod();
      assertEquals((-1), functionNode0.getRp());
      assertEquals((-1), functionNode0.getLp());
      assertEquals("110", functionNode0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.setFunctionIsNormalMethod();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(14);
      functionNode0.setBody(objectLiteral0);
      functionNode0.toSource(0);
      assertTrue(functionNode0.isMethod());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.setFunctionIsGetterMethod();
      assertEquals((-1), functionNode0.getLp());
      assertEquals(110, functionNode0.getType());
      assertEquals((-1), functionNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.requiresActivation();
      assertEquals((-1), functionNode0.getLp());
      assertEquals((-1), functionNode0.getRp());
      assertEquals("110", functionNode0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      boolean boolean0 = functionNode0.isSetterMethod();
      assertEquals((-1), functionNode0.getLp());
      assertFalse(boolean0);
      assertEquals((-1), functionNode0.getRp());
      assertEquals("110", functionNode0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      ErrorNode errorNode0 = new ErrorNode(2);
      boolean boolean0 = functionNode0.isParam(errorNode0);
      assertEquals((-1), functionNode0.getLp());
      assertFalse(boolean0);
      assertEquals((-1), functionNode0.getRp());
      assertEquals(110, functionNode0.getType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(5954);
      boolean boolean0 = functionNode0.isNormalMethod();
      assertEquals((-1), functionNode0.getLp());
      assertEquals(110, functionNode0.getType());
      assertEquals((-1), functionNode0.getRp());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      boolean boolean0 = functionNode0.isGetterMethod();
      assertEquals(110, functionNode0.getType());
      assertEquals((-1), functionNode0.getRp());
      assertFalse(boolean0);
      assertEquals((-1), functionNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.isGenerator();
      assertEquals((-1), functionNode0.getRp());
      assertEquals("110", functionNode0.toString());
      assertEquals((-1), functionNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.isExpressionClosure();
      assertEquals((-1), functionNode0.getLp());
      assertEquals((-1), functionNode0.getRp());
      assertEquals("110", functionNode0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Name name0 = new Name(2, "M'_LHWfdQM8B");
      FunctionNode functionNode0 = new FunctionNode(2, name0);
      int int0 = functionNode0.getRp();
      assertEquals(0, name0.getPosition());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.getResumptionPoints();
      assertEquals(110, functionNode0.getType());
      assertEquals((-1), functionNode0.getRp());
      assertEquals((-1), functionNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Name name0 = new Name(12, 12);
      FunctionNode functionNode0 = new FunctionNode(12, name0);
      functionNode0.getName();
      assertEquals(1, name0.depth());
      assertEquals((-1), functionNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode((-1));
      functionNode0.getMemberExprNode();
      assertEquals("110", functionNode0.toString());
      assertEquals((-1), functionNode0.getRp());
      assertEquals((-1), functionNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      int int0 = functionNode0.getLp();
      assertEquals((-1), int0);
      assertEquals("110", functionNode0.toString());
      assertEquals((-1), functionNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(3);
      functionNode0.getLiveLocals();
      assertEquals((-1), functionNode0.getLp());
      assertEquals((-1), functionNode0.getRp());
      assertEquals(110, functionNode0.getType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      int int0 = functionNode0.getFunctionType();
      assertEquals("110", functionNode0.toString());
      assertEquals(0, int0);
      assertEquals((-1), functionNode0.getLp());
      assertEquals((-1), functionNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.getFunctionName();
      assertEquals(110, functionNode0.getType());
      assertEquals((-1), functionNode0.getLp());
      assertEquals((-1), functionNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      ElementGet elementGet0 = new ElementGet();
      functionNode0.addResumptionPoint(elementGet0);
      assertEquals((-1), functionNode0.getLp());
      assertEquals(110, functionNode0.getType());
      assertEquals((-1), functionNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      int[] intArray0 = new int[1];
      functionNode0.addLiveLocals(functionNode0, intArray0);
      assertEquals((-1), functionNode0.getRp());
      assertEquals(110, functionNode0.getType());
      assertEquals((-1), functionNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Name name0 = new Name();
      FunctionNode functionNode0 = new FunctionNode(1870, name0);
      StringBuilder stringBuilder0 = new StringBuilder();
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      // Undeclared exception!
      try { 
        functionNode0.visit(astNode_DebugPrintVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.FunctionNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      int int0 = functionNode0.addFunction(functionNode0);
      assertTrue(functionNode0.requiresActivation());
      assertEquals(0, int0);
  }
}
