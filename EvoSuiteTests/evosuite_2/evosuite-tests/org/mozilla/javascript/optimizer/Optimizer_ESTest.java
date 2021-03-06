/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 07:28:30 GMT 2018
 */

package org.mozilla.javascript.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.optimizer.OptFunctionNode;
import org.mozilla.javascript.optimizer.Optimizer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Optimizer_ESTest extends Optimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      FunctionNode functionNode0 = new FunctionNode();
      FunctionNode functionNode1 = new FunctionNode();
      functionNode0.addFunction(functionNode1);
      Name name0 = new Name(4, 25);
      functionNode1.setType(38);
      functionNode1.addChildToBack(name0);
      functionNode1.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode1);
      optimizer0.optimize(functionNode0);
      assertEquals(1, Node.SPECIALCALL_EVAL);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      FunctionNode functionNode0 = new FunctionNode();
      FunctionNode functionNode1 = new FunctionNode();
      functionNode0.addFunction(functionNode1);
      Name name0 = new Name();
      FunctionNode functionNode2 = (FunctionNode)functionNode1.setType(36);
      functionNode1.addChildToBack(name0);
      functionNode1.addChildToBack(functionNode0);
      functionNode1.flattenSymbolTable(false);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode2);
      optimizer0.optimize(functionNode0);
      assertEquals(2, Node.END_RETURNS);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      FunctionNode functionNode0 = new FunctionNode();
      FunctionNode functionNode1 = new FunctionNode();
      functionNode0.addFunction(functionNode1);
      Name name0 = new Name(4, 25);
      functionNode1.setType(141);
      functionNode1.addChildToBack(name0);
      functionNode1.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode1);
      // Undeclared exception!
      try { 
        optimizer0.optimize(functionNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Optimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      FunctionNode functionNode0 = new FunctionNode();
      FunctionNode functionNode1 = new FunctionNode(2);
      functionNode0.addFunction(functionNode1);
      Name name0 = new Name();
      name0.addChildrenToFront(functionNode0);
      Node node0 = Node.newTarget();
      functionNode1.addChildToBack(name0);
      node0.setType(37);
      functionNode1.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode1);
      functionNode0.addChildrenToFront(node0);
      // Undeclared exception!
      try { 
        optimizer0.optimize(functionNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Optimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      FunctionNode functionNode0 = new FunctionNode();
      FunctionNode functionNode1 = new FunctionNode();
      functionNode0.addFunction(functionNode1);
      Name name0 = new Name(4, 25);
      functionNode1.setType(10);
      functionNode1.addChildrenToBack(name0);
      functionNode1.addChildToBack(functionNode0);
      functionNode1.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode1);
      optimizer0.optimize(functionNode0);
      assertFalse(functionNode0.isMethod());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      FunctionNode functionNode0 = new FunctionNode();
      FunctionNode functionNode1 = new FunctionNode();
      functionNode0.addFunction(functionNode1);
      Name name0 = new Name(1);
      functionNode1.setType(21);
      functionNode1.addChildToBack(name0);
      functionNode1.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode1);
      // Undeclared exception!
      try { 
        optimizer0.optimize(functionNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Optimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      FunctionNode functionNode0 = new FunctionNode();
      FunctionNode functionNode1 = new FunctionNode();
      functionNode0.addFunction(functionNode1);
      functionNode1.setType(40);
      functionNode1.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode1);
      optimizer0.optimize(functionNode0);
      assertNull(functionNode0.getSourceName());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      FunctionNode functionNode0 = new FunctionNode();
      FunctionNode functionNode1 = new FunctionNode();
      functionNode0.addFunction(functionNode1);
      Name name0 = new Name(4, 17);
      functionNode1.setType(134);
      functionNode1.addChildToBack(name0);
      functionNode1.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode1);
      optimizer0.optimize(functionNode0);
      assertEquals(2, Node.ATTRIBUTE_FLAG);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      FunctionNode functionNode0 = new FunctionNode();
      FunctionNode functionNode1 = new FunctionNode();
      functionNode0.addFunction(functionNode1);
      Name name0 = new Name(4, 25);
      name0.addChildrenToFront(functionNode0);
      functionNode1.addChildrenToBack(name0);
      functionNode1.flattenSymbolTable(true);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode1);
      optimizer0.optimize(functionNode0);
      assertEquals(0, Node.BOTH);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Optimizer optimizer0 = new Optimizer();
      FunctionNode functionNode0 = new FunctionNode();
      FunctionNode functionNode1 = new FunctionNode();
      functionNode0.addFunction(functionNode1);
      Name name0 = new Name(4, 25);
      functionNode1.setType(14);
      functionNode1.addChildrenToBack(name0);
      functionNode1.addChildToBack(functionNode0);
      functionNode1.flattenSymbolTable(false);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode1);
      optimizer0.optimize(functionNode0);
      assertFalse(functionNode0.isExpressionClosure());
  }
}
