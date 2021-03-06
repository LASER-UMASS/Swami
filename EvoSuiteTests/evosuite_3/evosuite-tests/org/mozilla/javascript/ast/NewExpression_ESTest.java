/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 16:26:49 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.NewExpression;
import org.mozilla.javascript.ast.ObjectLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewExpression_ESTest extends NewExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(0, 26);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      newExpression0.setTarget(objectLiteral0);
      newExpression0.setInitializer(objectLiteral0);
      String string0 = newExpression0.debugPrint();
      assertEquals("0\tNEW 0 26\n-1\t  OBJECTLIT -1 1\n-1\t  OBJECTLIT -1 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(0, 26);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      newExpression0.setTarget(objectLiteral0);
      newExpression0.addArgument(objectLiteral0);
      String string0 = newExpression0.debugPrint();
      assertEquals("0\tNEW 0 26\n-1\t  OBJECTLIT -1 1\n-1\t  OBJECTLIT -1 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(0, 26);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      newExpression0.setTarget(objectLiteral0);
      newExpression0.setInitializer(objectLiteral0);
      String string0 = newExpression0.toSource(0);
      assertEquals("new {}() {}", string0);
      assertEquals("30", newExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression(0, 26);
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      newExpression0.setTarget(objectLiteral0);
      newExpression0.addArgument(objectLiteral0);
      String string0 = newExpression0.toSource(0);
      assertEquals("new {}({})", string0);
      assertEquals(30, newExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression((-2751));
      newExpression0.getInitializer();
      assertEquals(30, newExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NewExpression newExpression0 = new NewExpression();
      assertEquals(30, newExpression0.getType());
  }
}
