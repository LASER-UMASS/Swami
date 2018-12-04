/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 06:45:39 GMT 2018
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
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.optimizer.OptFunctionNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OptFunctionNode_ESTest extends OptFunctionNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      optFunctionNode0.setParameterNumberContext(false);
      assertFalse(optFunctionNode0.getParameterNumberContext());
      assertEquals((-1), optFunctionNode0.getDirectTargetIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      functionNode0.flattenSymbolTable(false);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      // Undeclared exception!
      try { 
        optFunctionNode0.setIsNumberVar(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.mozilla.javascript.optimizer.OptFunctionNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      // Undeclared exception!
      try { 
        optFunctionNode0.setDirectTargetIndex((-853));
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
      optFunctionNode0.setDirectTargetIndex(6);
      assertEquals(6, optFunctionNode0.getDirectTargetIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      boolean boolean0 = optFunctionNode0.isTargetOfDirectCall();
      assertFalse(boolean0);
      assertEquals((-1), optFunctionNode0.getDirectTargetIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode((-1952));
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      boolean boolean0 = optFunctionNode0.isParameter(1826);
      assertFalse(boolean0);
      assertEquals((-1), optFunctionNode0.getDirectTargetIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      boolean boolean0 = optFunctionNode0.isNumberVar((-819));
      assertEquals((-1), optFunctionNode0.getDirectTargetIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      optFunctionNode0.fnode.setType(56);
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
  public void test08()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      functionNode0.setType(55);
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
      FunctionNode functionNode0 = new FunctionNode((-1952));
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      optFunctionNode0.getParameterNumberContext();
      assertEquals((-1), optFunctionNode0.getDirectTargetIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Name name0 = new Name(0, 0);
      FunctionNode functionNode0 = new FunctionNode(2548, name0);
      OptFunctionNode optFunctionNode0 = new OptFunctionNode(functionNode0);
      int int0 = optFunctionNode0.getDirectTargetIndex();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      // Undeclared exception!
      try { 
        OptFunctionNode.get((ScriptNode) astRoot0, 1704);
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
      // Undeclared exception!
      try { 
        OptFunctionNode.get((ScriptNode) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.optimizer.OptFunctionNode", e);
      }
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