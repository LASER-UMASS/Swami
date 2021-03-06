/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 19:33:15 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.FlexibleCompletor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FlexibleCompletor_ESTest extends FlexibleCompletor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<IdFunctionObjectES6> class0 = IdFunctionObjectES6.class;
      FlexibleCompletor flexibleCompletor0 = null;
      try {
        flexibleCompletor0 = new FlexibleCompletor(class0, (Scriptable) null);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(Throwable e) {
      }
  }
}
