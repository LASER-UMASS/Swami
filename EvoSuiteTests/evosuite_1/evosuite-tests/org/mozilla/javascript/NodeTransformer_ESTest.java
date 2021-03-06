/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 04:13:43 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.NodeTransformer;
import org.mozilla.javascript.ast.ArrayComprehension;
import org.mozilla.javascript.ast.ArrayComprehensionLoop;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ReturnStatement;
import org.mozilla.javascript.ast.ScriptNode;
import org.mozilla.javascript.ast.VariableInitializer;
import org.mozilla.javascript.ast.XmlLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NodeTransformer_ESTest extends NodeTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      AstRoot astRoot0 = new AstRoot();
      XmlLiteral xmlLiteral0 = new XmlLiteral(12);
      astRoot0.addChildToBack(xmlLiteral0);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(27, 0);
      astRoot0.addChildBefore(xmlLiteral0, xmlLiteral0);
      arrayComprehensionLoop0.addChildToBack(astRoot0);
      Node node0 = nodeTransformer0.visitLet(false, arrayComprehensionLoop0, (Node) null, astRoot0);
      // Undeclared exception!
      try { 
        nodeTransformer0.visitLet(false, arrayComprehensionLoop0, astRoot0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      AstRoot astRoot0 = new AstRoot();
      XmlLiteral xmlLiteral0 = new XmlLiteral(12);
      astRoot0.addChildToBack(xmlLiteral0);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(27, 84);
      astRoot0.addChildBefore(xmlLiteral0, xmlLiteral0);
      arrayComprehensionLoop0.addChildToBack(astRoot0);
      nodeTransformer0.visitLet(true, arrayComprehensionLoop0, (Node) null, astRoot0);
      assertFalse(astRoot0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      FunctionNode functionNode0 = new FunctionNode();
      nodeTransformer0.visitCall(functionNode0, functionNode0);
      assertFalse(functionNode0.isNormalMethod());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      Name name0 = new Name(146, "8JMKl?r+HTQO");
      FunctionNode functionNode0 = new FunctionNode(22);
      functionNode0.addChildrenToFront(name0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      nodeTransformer0.transform((ScriptNode) functionNode0, true, compilerEnvirons0);
      assertEquals(27, Node.LAST_PROP);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      VariableInitializer variableInitializer0 = new VariableInitializer(19);
      functionNode0.addChildrenToBack(variableInitializer0);
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      variableInitializer0.addChild(functionNode0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      // Undeclared exception!
      try { 
        nodeTransformer0.transform((ScriptNode) functionNode0, false, compilerEnvirons0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      Name name0 = new Name(146, "8JMKl?r+HTQO");
      FunctionNode functionNode0 = new FunctionNode(90, name0);
      functionNode0.addChildrenToFront(name0);
      name0.setType(30);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      nodeTransformer0.transform((ScriptNode) functionNode0, true, compilerEnvirons0);
      assertFalse(compilerEnvirons0.isRecordingLocalJsDocComments());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      AstRoot astRoot0 = new AstRoot();
      ContinueStatement continueStatement0 = new ContinueStatement();
      astRoot0.addChild(continueStatement0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      // Undeclared exception!
      try { 
        nodeTransformer0.transform((ScriptNode) astRoot0, false, compilerEnvirons0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      AstRoot astRoot0 = new AstRoot();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      ReturnStatement returnStatement0 = new ReturnStatement(25);
      astRoot0.addChildToBack(returnStatement0);
      nodeTransformer0.transform((ScriptNode) astRoot0, compilerEnvirons0);
      assertFalse(astRoot0.isInStrictMode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      AstRoot astRoot0 = new AstRoot(2025);
      ArrayComprehension arrayComprehension0 = new ArrayComprehension(8);
      astRoot0.addChildToBack(arrayComprehension0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      nodeTransformer0.transform((ScriptNode) astRoot0, false, compilerEnvirons0);
      assertNull(astRoot0.getSourceName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      functionNode0.addFunction(functionNode0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      // Undeclared exception!
      try { 
        nodeTransformer0.transform((ScriptNode) functionNode0, false, compilerEnvirons0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      AstRoot astRoot0 = new AstRoot();
      XmlLiteral xmlLiteral0 = new XmlLiteral();
      astRoot0.addChildToBack(xmlLiteral0);
      xmlLiteral0.addChildToBack(astRoot0);
      xmlLiteral0.addChildToBack(astRoot0);
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop(27, 84);
      astRoot0.addChildBefore(xmlLiteral0, xmlLiteral0);
      // Undeclared exception!
      try { 
        nodeTransformer0.visitLet(true, arrayComprehensionLoop0, astRoot0, astRoot0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode();
      VariableInitializer variableInitializer0 = new VariableInitializer(19);
      functionNode0.addChildrenToBack(variableInitializer0);
      NodeTransformer nodeTransformer0 = new NodeTransformer();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      nodeTransformer0.transform((ScriptNode) functionNode0, false, compilerEnvirons0);
      assertEquals(22, Node.DESTRUCTURING_NAMES);
  }
}
