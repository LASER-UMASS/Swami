/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 18:37:28 GMT 2018
 */

package org.mozilla.javascript.regexp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Arrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.regexp.RegExpImpl;
import org.mozilla.javascript.regexp.SubString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegExpImpl_ESTest extends RegExpImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        regExpImpl0.wrapRegExp(context0, (Scriptable) null, "language version");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.mozilla.javascript.regexp.RECompiled
         //
         verifyException("org.mozilla.javascript.regexp.RegExpImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      SubString[] subStringArray0 = new SubString[6];
      SubString subString0 = regExpImpl0.getParenSubString(0);
      subStringArray0[0] = subString0;
      regExpImpl0.parens = subStringArray0;
      SubString subString1 = regExpImpl0.getParenSubString(0);
      assertSame(subString1, subString0);
      assertNotNull(subString1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.RegExp;
      Scriptable scriptable0 = importerTopLevel0.getBuiltinPrototype(topLevel_Builtins0);
      int[] intArray0 = new int[9];
      boolean[] booleanArray0 = new boolean[6];
      String[][] stringArray0 = new String[7][1];
      int int0 = regExpImpl0.find_split(context0, importerTopLevel0, "", "", scriptable0, intArray0, intArray0, booleanArray0, stringArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals((-1), int0);
      assertTrue(Arrays.equals(new boolean[] {true, false, false, false, false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        regExpImpl0.compileRegExp(context0, "language version", "$");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      // Undeclared exception!
      try { 
        regExpImpl0.action(context0, importerTopLevel0, importerTopLevel0, context0.emptyArgs, 100);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Object[] objectArray0 = new Object[11];
      // Undeclared exception!
      try { 
        regExpImpl0.action(context0, importerTopLevel0, importerTopLevel0, objectArray0, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // SyntaxError: invalid flag after regular expression
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RegExpImpl regExpImpl0 = new RegExpImpl();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Object object0 = regExpImpl0.action(context0, importerTopLevel0, importerTopLevel0, context0.emptyArgs, 2);
      assertEquals("[object global]", object0);
  }
}
