/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 03:26:50 GMT 2018
 */

package org.mozilla.javascript.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.DoLoop;
import org.mozilla.javascript.ast.EmptyExpression;
import org.mozilla.javascript.ast.ForLoop;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.optimizer.Block;
import org.mozilla.javascript.optimizer.OptFunctionNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Block_ESTest extends Block_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      functionNode0.flattenSymbolTable(false);
      EmptyExpression emptyExpression0 = new EmptyExpression(9, 12);
      DoLoop doLoop0 = new DoLoop(17);
      Node[] nodeArray0 = new Node[7];
      nodeArray0[0] = (Node) doLoop0;
      nodeArray0[1] = (Node) doLoop0;
      nodeArray0[2] = (Node) doLoop0;
      emptyExpression0.setType(55);
      nodeArray0[3] = (Node) doLoop0;
      ForLoop forLoop0 = new ForLoop(1, 2);
      nodeArray0[4] = (Node) forLoop0;
      nodeArray0[5] = (Node) functionNode0;
      nodeArray0[6] = (Node) emptyExpression0;
      // Undeclared exception!
      try { 
        Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.ast.EmptyExpression cannot be cast to org.mozilla.javascript.ast.Name
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      functionNode0.flattenSymbolTable(true);
      EmptyExpression emptyExpression0 = new EmptyExpression();
      DoLoop doLoop0 = new DoLoop(18, 11);
      ForLoop forLoop0 = new ForLoop();
      Node[] nodeArray0 = new Node[9];
      nodeArray0[0] = (Node) doLoop0;
      nodeArray0[1] = (Node) emptyExpression0;
      nodeArray0[2] = (Node) functionNode0;
      nodeArray0[3] = (Node) emptyExpression0;
      NumberLiteral numberLiteral0 = new NumberLiteral();
      nodeArray0[4] = (Node) numberLiteral0;
      nodeArray0[5] = (Node) optFunctionNode0.fnode;
      nodeArray0[6] = (Node) functionNode0;
      nodeArray0[7] = (Node) forLoop0;
      nodeArray0[8] = nodeArray0[6];
      forLoop0.setType(138);
      // Undeclared exception!
      try { 
        Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.ast.ForLoop cannot be cast to org.mozilla.javascript.ast.Name
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      functionNode0.flattenSymbolTable(true);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral((-848));
      functionNode0.addChildToBack(arrayLiteral0);
      EmptyExpression emptyExpression0 = new EmptyExpression();
      DoLoop doLoop0 = new DoLoop(18, 11);
      ForLoop forLoop0 = new ForLoop();
      Node[] nodeArray0 = new Node[9];
      nodeArray0[0] = (Node) doLoop0;
      nodeArray0[1] = (Node) emptyExpression0;
      nodeArray0[2] = (Node) functionNode0;
      nodeArray0[3] = (Node) emptyExpression0;
      NumberLiteral numberLiteral0 = new NumberLiteral();
      nodeArray0[4] = (Node) numberLiteral0;
      nodeArray0[5] = (Node) optFunctionNode0.fnode;
      nodeArray0[6] = (Node) functionNode0;
      nodeArray0[7] = (Node) forLoop0;
      nodeArray0[8] = nodeArray0[6];
      Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
      assertEquals(9, nodeArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(0);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      functionNode0.flattenSymbolTable(true);
      EmptyExpression emptyExpression0 = new EmptyExpression(1, 12);
      DoLoop doLoop0 = new DoLoop(18, 11);
      Node[] nodeArray0 = new Node[8];
      nodeArray0[0] = (Node) doLoop0;
      nodeArray0[1] = (Node) doLoop0;
      nodeArray0[2] = (Node) optFunctionNode0.fnode;
      nodeArray0[3] = (Node) doLoop0;
      ForLoop forLoop0 = new ForLoop();
      nodeArray0[4] = (Node) forLoop0;
      nodeArray0[5] = (Node) functionNode0;
      nodeArray0[6] = (Node) emptyExpression0;
      forLoop0.setType(7);
      nodeArray0[7] = (Node) emptyExpression0;
      // Undeclared exception!
      try { 
        Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Block", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      functionNode0.flattenSymbolTable(false);
      EmptyExpression emptyExpression0 = new EmptyExpression(1);
      DoLoop doLoop0 = new DoLoop();
      emptyExpression0.setType(7);
      Node node0 = Node.newTarget();
      Node[] nodeArray0 = new Node[8];
      nodeArray0[0] = (Node) doLoop0;
      nodeArray0[1] = (Node) doLoop0;
      nodeArray0[2] = node0;
      nodeArray0[3] = (Node) doLoop0;
      ForLoop forLoop0 = new ForLoop(2);
      nodeArray0[4] = (Node) forLoop0;
      nodeArray0[5] = (Node) functionNode0;
      nodeArray0[6] = (Node) emptyExpression0;
      // Undeclared exception!
      try { 
        Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.Block", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(113);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      functionNode0.flattenSymbolTable(true);
      EmptyExpression emptyExpression0 = new EmptyExpression();
      DoLoop doLoop0 = new DoLoop(3);
      Node node0 = Node.newTarget();
      Node[] nodeArray0 = new Node[8];
      nodeArray0[0] = (Node) doLoop0;
      nodeArray0[1] = (Node) doLoop0;
      nodeArray0[2] = node0;
      nodeArray0[3] = (Node) doLoop0;
      ForLoop forLoop0 = new ForLoop();
      nodeArray0[4] = (Node) forLoop0;
      nodeArray0[5] = (Node) functionNode0;
      nodeArray0[6] = (Node) emptyExpression0;
      nodeArray0[7] = node0;
      Block.runFlowAnalyzes(optFunctionNode0, nodeArray0);
      assertEquals(8, nodeArray0.length);
  }
}
