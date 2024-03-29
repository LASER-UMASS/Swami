/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 04:44:18 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.ArrayComprehensionLoop;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.BreakStatement;
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.ContinueStatement;
import org.mozilla.javascript.ast.ElementGet;
import org.mozilla.javascript.ast.EmptyExpression;
import org.mozilla.javascript.ast.EmptyStatement;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.FunctionCall;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.InfixExpression;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.ObjectLiteral;
import org.mozilla.javascript.ast.ParenthesizedExpression;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.SwitchStatement;
import org.mozilla.javascript.ast.ThrowStatement;
import org.mozilla.javascript.ast.VariableDeclaration;
import org.mozilla.javascript.ast.XmlExpression;
import org.mozilla.javascript.ast.Yield;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Node_ESTest extends Node_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberLiteral numberLiteral0 = (NumberLiteral)Node.newNumber(0.0);
      numberLiteral0.addChild(numberLiteral0);
      Node.NodeIterator node_NodeIterator0 = numberLiteral0.new NodeIterator();
      NumberLiteral numberLiteral1 = (NumberLiteral)node_NodeIterator0.next();
      numberLiteral1.removeChild(numberLiteral0);
      assertFalse(numberLiteral1.hasChildren());
      
      node_NodeIterator0.remove();
      assertEquals(0.0, numberLiteral0.getDouble(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
      Node.NodeIterator node_NodeIterator0 = node0.new NodeIterator();
      // Undeclared exception!
      try { 
        node_NodeIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // next() has not been called
         //
         verifyException("org.mozilla.javascript.Node$NodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberLiteral numberLiteral0 = (NumberLiteral)Node.newNumber(0.0);
      numberLiteral0.addChild(numberLiteral0);
      Node.NodeIterator node_NodeIterator0 = numberLiteral0.new NodeIterator();
      assertTrue(numberLiteral0.hasChildren());
      
      node_NodeIterator0.next();
      node_NodeIterator0.remove();
      node_NodeIterator0.remove();
      assertFalse(numberLiteral0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = Node.newNumber(0.0);
      Node.NodeIterator node_NodeIterator0 = node0.new NodeIterator();
      // Undeclared exception!
      try { 
        node_NodeIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Node$NodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InfixExpression infixExpression0 = new InfixExpression(0);
      ThrowStatement throwStatement0 = new ThrowStatement(0, infixExpression0);
      Node.NodeIterator node_NodeIterator0 = throwStatement0.new NodeIterator();
      boolean boolean0 = node_NodeIterator0.hasNext();
      assertEquals((-1), throwStatement0.getLineno());
      assertFalse(boolean0);
      assertEquals("-1", infixExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Name name0 = new Name(12, 16, "");
      ContinueStatement continueStatement0 = new ContinueStatement(1878, name0);
      AstRoot astRoot0 = new AstRoot(3436);
      continueStatement0.toStringTree(astRoot0);
      assertEquals((-1), astRoot0.getBaseLineno());
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Name name0 = new Name(0, (-2465));
      String string0 = name0.toString();
      assertEquals("39", string0);
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionStatement expressionStatement0 = new ExpressionStatement(12, 3046);
      // Undeclared exception!
      try { 
        expressionStatement0.setString((String) null);
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
      Scope scope0 = new Scope();
      // Undeclared exception!
      try { 
        scope0.setScope(scope0);
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
      NumberLiteral numberLiteral0 = new NumberLiteral((double) 15);
      assertEquals((-1), numberLiteral0.getLineno());
      assertEquals(15.0, numberLiteral0.getNumber(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral(126, 126);
      Node node0 = new Node(126, numberLiteral0, numberLiteral0, numberLiteral0);
      assertEquals("126", node0.toString());
      
      node0.resetTargets();
      assertEquals((-1), numberLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = Node.newTarget();
      // Undeclared exception!
      try { 
        node0.resetTargets();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      objectLiteral0.addChildAfter(parenthesizedExpression0, parenthesizedExpression0);
      objectLiteral0.replaceChildAfter(parenthesizedExpression0, parenthesizedExpression0);
      assertEquals((-1), objectLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      Node node0 = new Node(90, elementGet0, elementGet0, elementGet0);
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(0, 0, token_CommentType0, "tI ]kkN/?L]d");
      node0.replaceChild(elementGet0, comment0);
      assertEquals((-1), comment0.getLineno());
      assertEquals((-1), node0.getLineno());
      assertEquals("90", node0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      arrayLiteral0.putIntProp(26, 1);
      arrayLiteral0.removeProp(26);
      assertEquals(12, Node.OBJECT_IDS_PROP);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      arrayLiteral0.putIntProp(24, 0);
      arrayLiteral0.removeProp(131);
      assertFalse(arrayLiteral0.isDestructuring());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      elementGet0.removeChildren();
      assertEquals((-1), elementGet0.getLineno());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EmptyStatement emptyStatement0 = new EmptyStatement();
      Node node0 = new Node(140, emptyStatement0, emptyStatement0);
      // Undeclared exception!
      try { 
        node0.removeChild((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NumberLiteral numberLiteral0 = (NumberLiteral)Node.newNumber((-2054));
      numberLiteral0.setJsDocNode((Comment) null);
      assertEquals((-2054.0), numberLiteral0.getNumber(), 0.01);
      assertEquals((-1), numberLiteral0.getLineno());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = Node.newString("::");
      assertEquals(41, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Node node0 = Node.newString(3903, "");
      node0.setString("newChild had siblings in addChildBefore");
      assertEquals((-1), node0.getLineno());
      assertEquals(3903, node0.getType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      arrayLiteral0.putIntProp(26, 1);
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(2, 18, token_CommentType0, "3ru&,f]l.w92!P");
      arrayLiteral0.setJsDocNode(comment0);
      arrayLiteral0.removeProp(26);
      assertEquals(2, Node.LOCAL_PROP);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Yield yield0 = new Yield(1072, 56);
      yield0.labelId(1072);
      assertEquals((-1), yield0.getLineno());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FunctionCall functionCall0 = new FunctionCall(460);
      functionCall0.setType(73);
      assertEquals(73, functionCall0.getType());
      
      int int0 = functionCall0.labelId();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      elementGet0.iterator();
      assertEquals((-1), elementGet0.getLineno());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = new Node(105);
      // Undeclared exception!
      try { 
        node0.hasSideEffects();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      Node node0 = new Node(105, elementGet0, elementGet0, elementGet0);
      boolean boolean0 = node0.hasSideEffects();
      assertFalse(boolean0);
      assertEquals(105, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertEquals((-1), elementGet0.getLineno());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      Node node0 = new Node(90, elementGet0, elementGet0, elementGet0);
      assertTrue(node0.hasChildren());
      
      node0.removeChild(elementGet0);
      boolean boolean0 = node0.hasSideEffects();
      assertFalse(node0.hasChildren());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      Node node0 = new Node(90, elementGet0, elementGet0, elementGet0);
      boolean boolean0 = node0.hasSideEffects();
      assertEquals((-1), elementGet0.getLineno());
      assertTrue(node0.hasChildren());
      assertFalse(boolean0);
      assertEquals(90, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = Node.newTarget();
      boolean boolean0 = node0.hasSideEffects();
      assertEquals("132", node0.toString());
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ExpressionStatement expressionStatement0 = new ExpressionStatement();
      XmlExpression xmlExpression0 = new XmlExpression(31, expressionStatement0);
      boolean boolean0 = xmlExpression0.hasChildren();
      assertEquals((-1), xmlExpression0.getLineno());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SwitchStatement switchStatement0 = new SwitchStatement(43, 1983);
      // Undeclared exception!
      try { 
        switchStatement0.getString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ArrayComprehensionLoop arrayComprehensionLoop0 = new ArrayComprehensionLoop();
      // Undeclared exception!
      try { 
        arrayComprehensionLoop0.getScope();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.ast.ArrayComprehensionLoop cannot be cast to org.mozilla.javascript.ast.Name
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Name name0 = new Name(0, "");
      name0.getNext();
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = Node.newTarget();
      int int0 = node0.getLineno();
      assertEquals((-1), int0);
      assertEquals("132", node0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Name name0 = new Name(12, 16, "");
      name0.getLastChild();
      assertEquals((-1), name0.getLineno());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(2, 18, token_CommentType0, "3ru&,f]l.w92!P");
      arrayLiteral0.setJsDocNode(comment0);
      String string0 = arrayLiteral0.getJsDoc();
      assertEquals("3ru&,f]l.w92!P", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ExpressionStatement expressionStatement0 = new ExpressionStatement(12, 3046);
      expressionStatement0.getJsDoc();
      assertEquals((-1), expressionStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      arrayLiteral0.putIntProp(26, 1);
      int int0 = arrayLiteral0.getIntProp(26, 3502);
      assertEquals((-1), arrayLiteral0.getLineno());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Scope scope0 = new Scope(118, 1);
      scope0.getFirstChild();
      assertEquals((-1), scope0.getLineno());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Node node0 = new Node(1);
      node0.putIntProp(1, 21);
      int int0 = node0.getExistingIntProp(1);
      assertEquals(1, node0.getType());
      assertEquals((-1), node0.getLineno());
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ExpressionStatement expressionStatement0 = new ExpressionStatement();
      // Undeclared exception!
      try { 
        expressionStatement0.getDouble();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.ast.ExpressionStatement cannot be cast to org.mozilla.javascript.ast.NumberLiteral
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Scope scope0 = new Scope();
      boolean boolean0 = scope0.hasConsistentReturnUsage();
      assertTrue(boolean0);
      assertEquals((-1), scope0.getLineno());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Node node0 = Node.newTarget();
      boolean boolean0 = node0.hasConsistentReturnUsage();
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean0);
      assertEquals("132", node0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Node node0 = Node.newTarget();
      Name name0 = new Name(1, 22, "Q_<,Dv}");
      node0.next = (Node) name0;
      node0.next.type = 4;
      boolean boolean0 = node0.hasConsistentReturnUsage();
      assertEquals((-1), node0.getLineno());
      assertTrue(boolean0);
      assertEquals("132", node0.toString());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      VariableDeclaration variableDeclaration0 = new VariableDeclaration();
      Jump jump0 = new Jump(4, variableDeclaration0);
      boolean boolean0 = jump0.hasConsistentReturnUsage();
      assertTrue(jump0.hasChildren());
      assertEquals((-1), jump0.getLineno());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      InfixExpression infixExpression0 = new InfixExpression(0);
      ThrowStatement throwStatement0 = new ThrowStatement(0, infixExpression0);
      boolean boolean0 = throwStatement0.hasConsistentReturnUsage();
      assertEquals((-1), throwStatement0.getLineno());
      assertTrue(boolean0);
      assertEquals((-1), infixExpression0.getOperator());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Yield yield0 = new Yield();
      boolean boolean0 = yield0.hasConsistentReturnUsage();
      assertTrue(boolean0);
      assertEquals((-1), yield0.getLineno());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ExpressionStatement expressionStatement0 = new ExpressionStatement(12, 12);
      InfixExpression infixExpression0 = new InfixExpression(8);
      expressionStatement0.addChildrenToFront(infixExpression0);
      boolean boolean0 = expressionStatement0.hasConsistentReturnUsage();
      assertTrue(expressionStatement0.hasChildren());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ExpressionStatement expressionStatement0 = new ExpressionStatement(12, 12);
      boolean boolean0 = expressionStatement0.hasConsistentReturnUsage();
      assertTrue(boolean0);
      assertEquals((-1), expressionStatement0.getLineno());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BreakStatement breakStatement0 = new BreakStatement(4);
      // Undeclared exception!
      try { 
        breakStatement0.hasConsistentReturnUsage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      objectLiteral0.addChildrenToBack(parenthesizedExpression0);
      // Undeclared exception!
      objectLiteral0.addChildrenToBack(parenthesizedExpression0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      Node node0 = new Node(90, elementGet0, elementGet0, elementGet0);
      node0.addChildBefore(elementGet0, elementGet0);
      assertTrue(node0.hasChildren());
      assertEquals((-1), elementGet0.getLineno());
      assertEquals(90, node0.getType());
      assertEquals((-1), node0.getLineno());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      Node node0 = new Node(90, elementGet0, elementGet0, elementGet0);
      elementGet0.addChildAfter(node0, node0);
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(0, 0, token_CommentType0, "tI ]kkN/?L]d");
      comment0.addChildToFront(elementGet0);
      comment0.replaceChild(node0, elementGet0);
      // Undeclared exception!
      try { 
        comment0.addChildBefore(elementGet0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // newChild had siblings in addChildBefore
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      // Undeclared exception!
      try { 
        elementGet0.addChildBefore(elementGet0, elementGet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(0);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      objectLiteral0.addChildrenToBack(parenthesizedExpression0);
      objectLiteral0.addChildAfter(parenthesizedExpression0, parenthesizedExpression0);
      objectLiteral0.replaceChildAfter(parenthesizedExpression0, parenthesizedExpression0);
      assertTrue(objectLiteral0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      elementGet0.addChildAfter(elementGet0, elementGet0);
      // Undeclared exception!
      try { 
        elementGet0.addChildAfter(elementGet0, elementGet0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // newChild had siblings in addChildAfter
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FunctionNode functionNode0 = new FunctionNode(13);
      Node node0 = new Node((-567), functionNode0, functionNode0, functionNode0, 0);
      assertTrue(node0.hasChildren());
      assertEquals(0, node0.getLineno());
      assertEquals((-1), functionNode0.getBaseLineno());
      assertEquals((-567), node0.getType());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      Node node0 = new Node(105, elementGet0, elementGet0, elementGet0);
      node0.addChildToBack(elementGet0);
      assertTrue(node0.hasChildren());
      assertEquals((-1), elementGet0.getLineno());
      assertEquals(105, node0.getType());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      EmptyExpression emptyExpression0 = new EmptyExpression();
      ThrowStatement throwStatement0 = new ThrowStatement(18, (-369));
      Node node0 = new Node((-369), emptyExpression0, throwStatement0, 21);
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(24, 7, token_CommentType0, "1d|rIvRP)aJ");
      // Undeclared exception!
      try { 
        node0.addChildBefore(comment0, comment0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // node is not a child
         //
         verifyException("org.mozilla.javascript.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Yield yield0 = new Yield(0, 0);
      InfixExpression infixExpression0 = new InfixExpression(0, yield0, yield0, 7);
      Node node0 = new Node(0, infixExpression0, 12);
      assertEquals("0", infixExpression0.toString());
      assertEquals((-1), infixExpression0.getLineno());
      assertTrue(node0.hasChildren());
      assertEquals(12, node0.getLineno());
      assertEquals(0, node0.getType());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Name name0 = new Name(14, (-1965), "zR.ET(y 4K");
      ContinueStatement continueStatement0 = new ContinueStatement((-1965), name0);
      Node node0 = new Node((-1965), continueStatement0);
      boolean boolean0 = node0.hasSideEffects();
      assertEquals((-1), continueStatement0.getLineno());
      assertTrue(node0.hasChildren());
      assertFalse(boolean0);
      assertEquals((-1), node0.getLineno());
      assertEquals((-1965), node0.getType());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Node node0 = new Node((-505), 98);
      assertEquals(98, node0.getLineno());
      assertEquals("-505", node0.toString());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      arrayLiteral0.addChildrenToFront(arrayLiteral0);
      assertTrue(arrayLiteral0.hasChildren());
      
      arrayLiteral0.addChildBefore(arrayLiteral0, (Node) null);
      assertEquals((-1), arrayLiteral0.getLineno());
  }
}
