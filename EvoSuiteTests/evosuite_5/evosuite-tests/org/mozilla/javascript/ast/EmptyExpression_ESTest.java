/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 16:15:20 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.EmptyExpression;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmptyExpression_ESTest extends EmptyExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyExpression emptyExpression0 = new EmptyExpression(0, 0);
      String string0 = emptyExpression0.toSource(0);
      assertEquals("", string0);
      assertEquals(129, emptyExpression0.getType());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmptyExpression emptyExpression0 = new EmptyExpression();
      String string0 = emptyExpression0.debugPrint();
      assertEquals("-1\tEMPTY -1 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmptyExpression emptyExpression0 = new EmptyExpression((-927));
      assertEquals("129", emptyExpression0.toString());
  }
}
