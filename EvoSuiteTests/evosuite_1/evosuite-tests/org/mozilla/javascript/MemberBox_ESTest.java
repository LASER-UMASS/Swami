/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 15:03:11 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Constructor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.InterpreterData;
import org.mozilla.javascript.MemberBox;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MemberBox_ESTest extends MemberBox_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(0, (String) null, "PE,L||7vtzodp+", false);
      // Undeclared exception!
      try { 
        InterpretedFunction.createScript(interpreterData0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MemberBox memberBox0 = null;
      try {
        memberBox0 = new MemberBox((Constructor<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.MemberBox", e);
      }
  }
}
