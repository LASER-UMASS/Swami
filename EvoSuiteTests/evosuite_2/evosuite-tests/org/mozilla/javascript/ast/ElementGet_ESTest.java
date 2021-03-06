/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 18:40:32 GMT 2018
 */

package org.mozilla.javascript.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ast.ElementGet;
import org.mozilla.javascript.ast.NumberLiteral;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ElementGet_ESTest extends ElementGet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral(1419, "uQnm", 0.0);
      ElementGet elementGet0 = new ElementGet(numberLiteral0, numberLiteral0);
      String string0 = elementGet0.debugPrint();
      assertEquals((-1), elementGet0.getLb());
      assertEquals("-1\tGETELEM -1 1\n1419\t  NUMBER 1420 4\n1419\t  NUMBER 1420 4\n", string0);
      assertEquals((-1), elementGet0.getRb());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      // Undeclared exception!
      try { 
        elementGet0.debugPrint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ast.ElementGet", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberLiteral numberLiteral0 = new NumberLiteral(1419, "uQnm", 0.0);
      ElementGet elementGet0 = new ElementGet(numberLiteral0, numberLiteral0);
      String string0 = elementGet0.toSource();
      assertEquals((-1), elementGet0.getRb());
      assertEquals((-1), elementGet0.getLb());
      assertEquals("uQnm[uQnm]", string0);
      assertEquals("36", elementGet0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet(42);
      elementGet0.setRb(42);
      assertEquals(42, elementGet0.getRb());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet(2898);
      elementGet0.setParens(2898, 2898);
      assertEquals(2898, elementGet0.getRb());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      assertEquals((-1), elementGet0.getLb());
      
      elementGet0.setLb(1);
      assertEquals(1, elementGet0.getLb());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      elementGet0.getTarget();
      assertEquals((-1), elementGet0.getRb());
      assertEquals((-1), elementGet0.getLb());
      assertEquals("36", elementGet0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      int int0 = elementGet0.getRb();
      assertEquals((-1), int0);
      assertEquals("36", elementGet0.toString());
      assertEquals((-1), elementGet0.getLb());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet(555);
      elementGet0.getElement();
      assertEquals((-1), elementGet0.getRb());
      assertEquals((-1), elementGet0.getLb());
      assertEquals("36", elementGet0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet(1248, 3583);
      assertEquals((-1), elementGet0.getRb());
      assertEquals("36", elementGet0.toString());
      assertEquals((-1), elementGet0.getLb());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ElementGet elementGet0 = new ElementGet();
      int int0 = elementGet0.getLb();
      assertEquals((-1), elementGet0.getRb());
      assertEquals((-1), int0);
      assertEquals("36", elementGet0.toString());
  }
}
