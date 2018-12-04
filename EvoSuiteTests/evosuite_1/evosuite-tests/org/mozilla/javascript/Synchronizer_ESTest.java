/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 16:15:31 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.typedarrays.NativeInt32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Synchronizer_ESTest extends Synchronizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      Synchronizer synchronizer0 = new Synchronizer(nativeIterator_StopIteration0, nativeJavaTopPackage0);
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        synchronizer0.call(context0, nativeJavaTopPackage0, nativeJavaTopPackage0, context0.emptyArgs);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.NativeIterator$StopIteration cannot be cast to org.mozilla.javascript.Function
         //
         verifyException("org.mozilla.javascript.Synchronizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Synchronizer synchronizer0 = new Synchronizer(delegator0);
      Context context0 = Context.enter();
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array();
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      // Undeclared exception!
      try { 
        synchronizer0.call(context0, nativeInt32Array0, nativeJavaObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Synchronizer", e);
      }
  }
}