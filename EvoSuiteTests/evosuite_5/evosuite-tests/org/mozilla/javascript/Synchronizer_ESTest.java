/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 15:20:24 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Synchronizer_ESTest extends Synchronizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.enter();
      NativeWith nativeWith0 = new NativeWith((Scriptable) null, (Scriptable) null);
      Synchronizer synchronizer0 = new Synchronizer(nativeWith0, (Object) null);
      // Undeclared exception!
      try { 
        synchronizer0.call(context0, nativeWith0, nativeWith0, context0.emptyArgs);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mozilla.javascript.NativeWith cannot be cast to org.mozilla.javascript.Function
         //
         verifyException("org.mozilla.javascript.Synchronizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      Synchronizer synchronizer0 = new Synchronizer(nativeFloat32Array0);
  }
}
