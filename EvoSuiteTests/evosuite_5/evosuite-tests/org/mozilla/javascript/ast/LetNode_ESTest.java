/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 17:13:51 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.LetNode;
import org.mozilla.javascript.ast.ThrowStatement;
import org.mozilla.javascript.ast.VariableDeclaration;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LetNode_ESTest extends LetNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(0, 2);
      letNode0.setBody(variableDeclaration0);
      assertEquals(1, variableDeclaration0.getPosition());
      
      letNode0.setVariables(variableDeclaration0);
      String string0 = letNode0.debugPrint();
      assertEquals("-1\tLETEXPR -1 1\n0\t  VAR 1 2\n0\t  VAR 1 2\n", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(0, 2);
      letNode0.setBody(variableDeclaration0);
      assertEquals(1, variableDeclaration0.depth());
      
      letNode0.setVariables(variableDeclaration0);
      String string0 = letNode0.toSource(22);
      assertEquals("                                            let ()                                             var ", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LetNode letNode0 = new LetNode(0);
      assertEquals((-1), letNode0.getRp());
      
      letNode0.setRp(0);
      assertEquals(0, letNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      letNode0.setParens(1751, 3030);
      assertEquals(1751, letNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LetNode letNode0 = new LetNode(0);
      assertEquals((-1), letNode0.getLp());
      
      letNode0.setLp(0);
      assertEquals(0, letNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LetNode letNode0 = new LetNode((-3058), 12);
      ThrowStatement throwStatement0 = new ThrowStatement(0, 21, letNode0);
      letNode0.setBody(throwStatement0);
      assertEquals(3058, throwStatement0.getPosition());
      assertEquals((-1), letNode0.getRp());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      letNode0.getVariables();
      assertEquals((-1), letNode0.getLp());
      assertEquals((-1), letNode0.getRp());
      assertEquals("159", letNode0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LetNode letNode0 = new LetNode((-3058), 12);
      int int0 = letNode0.getRp();
      assertEquals((-1), int0);
      assertEquals("159", letNode0.toString());
      assertEquals((-1), letNode0.getLp());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LetNode letNode0 = new LetNode();
      letNode0.getBody();
      assertEquals((-1), letNode0.getLp());
      assertEquals((-1), letNode0.getRp());
      assertEquals(159, letNode0.getType());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LetNode letNode0 = new LetNode((-1));
      int int0 = letNode0.getLp();
      assertEquals((-1), letNode0.getRp());
      assertEquals("159", letNode0.toString());
      assertEquals((-1), int0);
  }
}
