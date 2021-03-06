/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 00:55:32 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Decompiler;
import org.mozilla.javascript.UintMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Decompiler_ESTest extends Decompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UintMap uintMap0 = new UintMap(9);
      // Undeclared exception!
      try { 
        Decompiler.decompile("(Lorg/mozilla/javascript/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", 702, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      int int0 = decompiler0.markFunctionEnd(120);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      decompiler0.addRegexp("b8;WU_E", "(Lorg/mozilla/javascript/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;");
      decompiler0.addRegexp("(Lorg/mozilla/javascript/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "(Lorg/mozilla/javascript/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;");
      assertEquals(2, Decompiler.INDENT_GAP_PROP);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      String string0 = decompiler0.getEncodedSource();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("0\u0002//", 2, uintMap0);
      assertEquals("(//)", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("else ", 2092, uintMap0);
      assertEquals("\n /= --switch  /= typeof \n", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("\u00A7\u00A5\u0001(D\u407F\u2BB9\u30D8\uE5E00\n/ && / && ", 2, uintMap0);
      assertEquals(" => 498.7327126/ && / && ", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("\u0093\u0001(S\u00010\n/ && / && ", 2, uintMap0);
      assertEquals(".(1/ && / && ", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UintMap uintMap0 = new UintMap(1263);
      // Undeclared exception!
      try { 
        Decompiler.decompile("5 W7r`", 1263, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 55
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("\tat script", 1, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 112
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("lC1H<;2(\",*UtI7c", 138, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 49
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UintMap uintMap0 = new UintMap(161);
      // Undeclared exception!
      try { 
        Decompiler.decompile("gM%q5~NHr-jch", 161, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 77
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("bsU`", (-33), uintMap0);
      assertEquals(" += switch ] >>= ", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("-r^r", (-1050), uintMap0);
      assertEquals("trueelse  &= else ", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("aIuK", (-33), uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 75
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("catch try  === typeof default", (-1398), uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 61
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UintMap uintMap0 = new UintMap(166);
      String string0 = Decompiler.decompile("|kxu I[)\u0004>hu^", 27, uintMap0);
      assertEquals("with ++for defaulttypeof yield  = \">hu^\"", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UintMap uintMap0 = new UintMap(2864);
      // Undeclared exception!
      try { 
        Decompiler.decompile("~m.Y_H-^%UG|[", 2864, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 72
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("}R. u", 147, uintMap0);
      assertEquals("catch try  === typeof default", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("\n.{with while .function  >>>= ", 93, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 111
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UintMap uintMap0 = new UintMap(147);
      // Undeclared exception!
      try { 
        Decompiler.decompile("qnh#%~i9z9/dsc", (-1377), uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 35
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("mV|vmnra", 153, uintMap0);
      assertEquals("\n.{with while .function  >>>= ", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("TRY", 1173, uintMap0);
      assertEquals("\n[try )", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("/2UX!(TE)qp[xx=", 108, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 33
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("Wref", 578, uintMap0);
      assertEquals("} else  /=  %= ", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("ZR;9fk$", 125, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 59
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("uz+2%](_#UZ>{:1;", 1520, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 37
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile(" *: ", (-340), uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 58
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("x]npj_,4ef3zz", 1943, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 51
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("(J}jFg-UVy", 1173, uintMap0);
      assertEquals("\n35184827359953000true]{break", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("\u00A7\u0098\u0001(D\u407F\u2BB9\u30D8\uE5E00$/GhAYnb7Bq^pLB`{Hu/GhAYnb7Bq^pLB`{Hu", 2, uintMap0);
      assertEquals("get D\u407F\u2BB9\u30D8\uE5E00$/GhAYnb7Bq^pLB`{Hu/GhAYnb7Bq^pLB`default", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UintMap uintMap0 = new UintMap(3);
      uintMap0.put(1, 2);
      // Undeclared exception!
      try { 
        Decompiler.decompile("do ", 1757, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 111
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UintMap uintMap0 = new UintMap(1);
      // Undeclared exception!
      try { 
        Decompiler.decompile("SbrYOrxi`<NF96^CJ", (-188), uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 79
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      decompiler0.addString("org.mozilla.javascript.Decompiler");
      decompiler0.addName("org.mozilla.javascript.Decompiler");
      decompiler0.addRegexp("org.mozilla.javascript.Decompiler", "?(1HRr-jll");
      decompiler0.markFunctionStart((-2607));
      decompiler0.addNumber(459.559593);
      decompiler0.addEOL(0);
      int int0 = decompiler0.markFunctionStart((-802));
      assertEquals(127, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      // Undeclared exception!
      try { 
        decompiler0.addToken(684);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      decompiler0.addNumber(1.0E7);
      assertEquals(2, Decompiler.TO_SOURCE_FLAG);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      decompiler0.addNumber(2);
      assertEquals(1, Decompiler.ONLY_BODY_FLAG);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      // Undeclared exception!
      try { 
        decompiler0.addEOL((-3005));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }
}
