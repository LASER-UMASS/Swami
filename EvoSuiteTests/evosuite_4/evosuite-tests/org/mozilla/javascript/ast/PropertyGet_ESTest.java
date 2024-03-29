/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 17:36:30 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ArrayLiteral;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.CatchClause;
import org.mozilla.javascript.ast.InfixExpression;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.PropertyGet;
import org.mozilla.javascript.ast.ReturnStatement;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyGet_ESTest extends PropertyGet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CatchClause catchClause0 = new CatchClause();
      Name name0 = new Name();
      PropertyGet propertyGet0 = new PropertyGet(catchClause0, name0, 18);
      propertyGet0.setTarget(name0);
      StringBuilder stringBuilder0 = new StringBuilder("]bB],IQvJ@RF");
      AstNode.DebugPrintVisitor astNode_DebugPrintVisitor0 = new AstNode.DebugPrintVisitor(stringBuilder0);
      propertyGet0.visit(astNode_DebugPrintVisitor0);
      assertEquals("]bB],IQvJ@RF-1\tGETPROP -1 1\n-1\t  NAME 0 1 null\n-1\t  NAME 0 1 null\n", astNode_DebugPrintVisitor0.toString());
      assertEquals("33", propertyGet0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      Name name0 = new Name((-40), 1839, "_G84,~g`Z~/KAZhg}");
      PropertyGet propertyGet0 = new PropertyGet(arrayLiteral0, name0, (-2116));
      String string0 = propertyGet0.toSource(28);
      assertEquals(33, propertyGet0.getType());
      assertEquals("                                                        []._G84,~g`Z~/KAZhg}", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CatchClause catchClause0 = new CatchClause();
      Name name0 = new Name();
      PropertyGet propertyGet0 = new PropertyGet(catchClause0, name0, 18);
      propertyGet0.setProperty(name0);
      assertEquals("33", propertyGet0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Jump jump0 = new Jump();
      Name name0 = new Name(1, 22, ".");
      PropertyGet propertyGet0 = new PropertyGet(jump0, name0);
      assertEquals(33, propertyGet0.getOperator());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InfixExpression infixExpression0 = new InfixExpression();
      Name name0 = new Name((-1997), "LOCAL_LOAD");
      PropertyGet propertyGet0 = new PropertyGet(42, 0, infixExpression0, name0);
      assertEquals(33, propertyGet0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet(0);
      assertEquals("33", propertyGet0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet();
      assertEquals(33, propertyGet0.getOperator());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PropertyGet propertyGet0 = new PropertyGet(0, 0);
      ReturnStatement returnStatement0 = new ReturnStatement(19);
      propertyGet0.setTarget(returnStatement0);
      // Undeclared exception!
      try { 
        propertyGet0.debugPrint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.PropertyGet", e);
      }
  }
}
