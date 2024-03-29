/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 05:23:18 GMT 2018
 */

package org.mozilla.javascript.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.InfixExpression;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.ThrowStatement;
import org.mozilla.javascript.optimizer.OptFunctionNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OptFunctionNode_ESTest extends OptFunctionNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(0);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      optFunctionNode0.setParameterNumberContext(true);
      assertTrue(optFunctionNode0.getParameterNumberContext());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      functionNode0.flattenSymbolTable(false);
      // Undeclared exception!
      try { 
        optFunctionNode0.setIsNumberVar(10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.mozilla.javascript.optimizer.OptFunctionNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      optFunctionNode0.setDirectTargetIndex(1);
      // Undeclared exception!
      try { 
        optFunctionNode0.setDirectTargetIndex(11);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      boolean boolean0 = optFunctionNode0.isTargetOfDirectCall();
      assertFalse(boolean0);
      assertEquals((-1), optFunctionNode0.getDirectTargetIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      boolean boolean0 = optFunctionNode0.isParameter(0);
      assertFalse(boolean0);
      assertEquals((-1), optFunctionNode0.getDirectTargetIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      boolean boolean0 = optFunctionNode0.isNumberVar(19);
      assertFalse(boolean0);
      assertEquals((-1), optFunctionNode0.getDirectTargetIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.putIntProp(7, 1);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      int int0 = optFunctionNode0.getVarIndex(functionNode0);
      assertEquals((-1), optFunctionNode0.getDirectTargetIndex());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Name name0 = new Name();
      Name name1 = (Name)name0.setType(56);
      FunctionNode functionNode0 = new FunctionNode(23, name1);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      // Undeclared exception!
      try { 
        optFunctionNode0.getVarIndex(name1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      ThrowStatement throwStatement0 = new ThrowStatement(0);
      InfixExpression infixExpression0 = new InfixExpression(55, functionNode0, throwStatement0, 3);
      // Undeclared exception!
      try { 
        optFunctionNode0.getVarIndex(infixExpression0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      // Undeclared exception!
      try { 
        optFunctionNode0.getVarIndex(functionNode0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode((-296));
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      optFunctionNode0.getParameterNumberContext();
      assertEquals((-1), optFunctionNode0.getDirectTargetIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode((-2998));
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      int int0 = optFunctionNode0.getDirectTargetIndex();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      // Undeclared exception!
      try { 
        OptFunctionNode.get((ScriptNode) functionNode0, 1508);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ScriptNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(2100);
      OptFunctionNode optFunctionNode0 = OptFunctionNode.get((ScriptNode) astRoot0);
      assertNull(optFunctionNode0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      // Undeclared exception!
      try { 
        optFunctionNode0.getVarCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }
}
