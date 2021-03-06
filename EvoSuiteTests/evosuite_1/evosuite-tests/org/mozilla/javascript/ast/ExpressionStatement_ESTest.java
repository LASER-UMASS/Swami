/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:00:25 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ExpressionStatement;
import org.mozilla.javascript.ast.Label;
import org.mozilla.javascript.ast.Name;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ExpressionStatement_ESTest extends ExpressionStatement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Label label0 = new Label();
      ExpressionStatement expressionStatement0 = new ExpressionStatement((-3048), (-926), label0);
      String string0 = expressionStatement0.toSource((-502));
      assertEquals("null:\n;\n", string0);
      assertEquals("134", expressionStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Name name0 = new Name();
      ExpressionStatement expressionStatement0 = new ExpressionStatement(name0, true);
      String string0 = expressionStatement0.debugPrint();
      assertEquals("-1\tEXPR_RESULT -1 1\n-1\t  NAME 0 1 null\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExpressionStatement expressionStatement0 = new ExpressionStatement((-661), (-661));
      expressionStatement0.getExpression();
      assertEquals("134", expressionStatement0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExpressionStatement expressionStatement0 = new ExpressionStatement((-2187), (-2187));
      // Undeclared exception!
      try { 
        expressionStatement0.hasSideEffects();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ExpressionStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ExpressionStatement expressionStatement0 = new ExpressionStatement();
      assertEquals("134", expressionStatement0.toString());
  }
}
