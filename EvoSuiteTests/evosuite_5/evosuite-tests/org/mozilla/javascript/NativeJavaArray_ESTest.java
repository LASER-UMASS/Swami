/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 01:37:44 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeJavaArray;
import org.mozilla.javascript.Scriptable;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeJavaArray_ESTest extends NativeJavaArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      // Undeclared exception!
      try { 
        NativeJavaArray.wrap((Scriptable) importerTopLevel0, (Object) importerTopLevel0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("org.mozilla.javascript.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }
}
