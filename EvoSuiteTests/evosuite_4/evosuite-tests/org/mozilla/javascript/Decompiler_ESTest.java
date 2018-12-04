/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 23:25:20 GMT 2018
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
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("S(#o>'7u0wmzdLloI[", 181, uintMap0);
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
      int int0 = decompiler0.markFunctionStart(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      int int0 = decompiler0.markFunctionEnd(3);
      assertEquals(0, int0);
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
      String string0 = Decompiler.decompile("c 2k.", (-4602), uintMap0);
      assertEquals(" -= typeof throw ++ === ", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile(".5", 731, uintMap0);
      assertEquals(" ===  instanceof ", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("\n = break ||  /= -- *= typeof ", (-91), uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 61
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("[yield ", (-91), uintMap0);
      assertEquals("\n = break ||  /= -- *= typeof ", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UintMap uintMap0 = new UintMap(126);
      String string0 = Decompiler.decompile("S}", Integer.MAX_VALUE, uintMap0);
      assertEquals("; catch ", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("~+{Y=&zX%", 2941, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 61
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("4]", 132, uintMap0);
      assertEquals("\n in  ^= \n", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("ax;UOY\"*=w", (-2641), uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 59
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("-U\rGtgSU/f8m#4", (-901), uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 71
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("XtwIz[|Lx r0^~~xW", 190, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 76
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("V*CI/FG{'0", 653, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 70
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("\u00A7(D\uC0A0\u9024\u5A1C\uAC08n\u0000", 32, uintMap0);
      assertEquals("\n-2120.071function \n", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UintMap uintMap0 = new UintMap(150);
      String string0 = Decompiler.decompile("_}Ww+", 150, uintMap0);
      assertEquals(" <<= catch }do this", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UintMap uintMap0 = new UintMap(1);
      // Undeclared exception!
      try { 
        Decompiler.decompile("^jYcWz*saCR;", 2, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 59
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("qs.,T", 2914, uintMap0);
      assertEquals("if switch  === false[", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile(")\rRnC=.qoQVVZ+an\u01AF", 1, uintMap0);
      assertEquals("\n\"RnC=.qoQVVZ+a\"function ", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UintMap uintMap0 = new UintMap(126);
      // Undeclared exception!
      try { 
        Decompiler.decompile("(S})", 3, uintMap0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UintMap uintMap0 = new UintMap(126);
      String string0 = Decompiler.decompile("'\u0002S}", 107, uintMap0);
      assertEquals("(S})", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      String string0 = Decompiler.decompile("msg.chage.value.wivh.writable.false", 2, uintMap0);
      assertEquals(".switch  ?  ===  -=  :  >>>=  ?  /=  === while  >>>= --default /=  === do  || while  :  === do else  || case  >>>=  += -- /=  ===  %=  >>>= --switch  /= ", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UintMap uintMap0 = new UintMap(372);
      uintMap0.put(1, 83);
      // Undeclared exception!
      try { 
        Decompiler.decompile("W_NMuC/WxV-q", 97, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 78
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UintMap uintMap0 = new UintMap();
      // Undeclared exception!
      try { 
        Decompiler.decompile("^`i_ZfnTy^b!f", 0, uintMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Token: 33
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      decompiler0.addRegexp(".switch  ?  ===  -=  :  >>>=  ?  /=  === while  >>>= --default /=  === do  || while  :  === do else  || case  >>>=  += -- /=  ===  %=  >>>= --switch  /= ", ".switch  ?  ===  -=  :  >>>=  ?  /=  === while  >>>= --default /=  === do  || while  :  === do else  || case  >>>=  += -- /=  ===  %=  >>>= --switch  /= ");
      decompiler0.addNumber(1);
      assertEquals(3, Decompiler.CASE_GAP_PROP);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      // Undeclared exception!
      try { 
        decompiler0.addToken(309);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      decompiler0.addString("'*i;6d.;(^&Lb~_i.T");
      assertEquals(1, Decompiler.INITIAL_INDENT_PROP);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      decompiler0.addNumber(1.0E10);
      assertEquals(1, Decompiler.INITIAL_INDENT_PROP);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      decompiler0.addNumber((-2120.071));
      assertEquals(2, Decompiler.INDENT_GAP_PROP);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      decompiler0.addName("");
      assertEquals(2, Decompiler.INDENT_GAP_PROP);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      // Undeclared exception!
      try { 
        decompiler0.addEOL(1358);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Decompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Decompiler decompiler0 = new Decompiler();
      decompiler0.addEOL(2);
      assertEquals(1, Decompiler.ONLY_BODY_FLAG);
  }
}