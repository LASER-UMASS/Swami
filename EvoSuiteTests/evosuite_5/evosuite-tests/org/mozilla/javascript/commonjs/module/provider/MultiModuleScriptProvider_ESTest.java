/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 00:33:39 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.URI;
import java.util.ArrayDeque;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.provider.MultiModuleScriptProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiModuleScriptProvider_ESTest extends MultiModuleScriptProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayDeque<MultiModuleScriptProvider> arrayDeque0 = new ArrayDeque<MultiModuleScriptProvider>();
      MultiModuleScriptProvider multiModuleScriptProvider0 = new MultiModuleScriptProvider(arrayDeque0);
      Context context0 = Context.enter();
      URI uRI0 = MockURI.aFTPURI;
      ModuleScript moduleScript0 = multiModuleScriptProvider0.getModuleScript(context0, "language version", uRI0, uRI0, (Scriptable) null);
      assertNull(moduleScript0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayDeque<MultiModuleScriptProvider> arrayDeque0 = new ArrayDeque<MultiModuleScriptProvider>();
      MultiModuleScriptProvider multiModuleScriptProvider0 = new MultiModuleScriptProvider(arrayDeque0);
      arrayDeque0.add(multiModuleScriptProvider0);
      MultiModuleScriptProvider multiModuleScriptProvider1 = new MultiModuleScriptProvider(arrayDeque0);
      Context context0 = Context.enter();
      URI uRI0 = MockURI.aFTPURI;
      ModuleScript moduleScript0 = multiModuleScriptProvider1.getModuleScript(context0, "language version", uRI0, uRI0, (Scriptable) null);
      assertNull(moduleScript0);
  }
}