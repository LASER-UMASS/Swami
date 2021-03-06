/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 23:54:23 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.LazilyLoadedCtor;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LazilyLoadedCtor_ESTest extends LazilyLoadedCtor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeInt8Array0, "org.mozilla.javascript.xml.XMLLib$Factory", "org.mozilla.javascript.xml.XMLLib$Factory", true, true);
      lazilyLoadedCtor0.init();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeUint8Array0, "org.mozilla.javascript.LazilyLoadedCtor", "org.mozilla.javascript.LazilyLoadedCtor", false);
      lazilyLoadedCtor0.init();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(importerTopLevel0, "error reporter", "error reporter", true);
      lazilyLoadedCtor0.init();
  }
}
