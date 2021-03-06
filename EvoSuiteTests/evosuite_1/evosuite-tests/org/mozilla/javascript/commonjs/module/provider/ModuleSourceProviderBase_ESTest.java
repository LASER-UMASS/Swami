/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 01:30:29 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.commonjs.module.provider.ModuleSource;
import org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ModuleSourceProviderBase_ESTest extends ModuleSourceProviderBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<URI> arrayList0 = new ArrayList<URI>();
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(arrayList0, arrayList0);
      URI uRI0 = MockURI.aFTPURI;
      // Undeclared exception!
      try { 
        urlModuleSourceProvider0.loadSource(uRI0, uRI0, (Object) uRI0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider((Iterable<URI>) null, (Iterable<URI>) null);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(13);
      ModuleSource moduleSource0 = urlModuleSourceProvider0.loadSource("n*/!w:O", (Scriptable) nativeArrayBuffer0, (Object) "n*/!w:O");
      assertNull(moduleSource0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Stack<URI> stack0 = new Stack<URI>();
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array(2);
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(stack0, stack0);
      // Undeclared exception!
      try { 
        urlModuleSourceProvider0.loadSource(";N\"", (Scriptable) nativeFloat64Array0, (Object) stack0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character in path at index 2: ;N\"
         //
         verifyException("java.net.URI", e);
      }
  }
}
