/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 03:44:02 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeJavaArray;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeInt8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeJavaArray_ESTest extends NativeJavaArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      // Undeclared exception!
      try { 
        NativeJavaArray.wrap((Scriptable) nativeInt8Array0, (Object) "");
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
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeJavaArray nativeJavaArray0 = null;
      try {
        nativeJavaArray0 = new NativeJavaArray(importerTopLevel0, context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Array expected
         //
         verifyException("org.mozilla.javascript.NativeJavaArray", e);
      }
  }
}
