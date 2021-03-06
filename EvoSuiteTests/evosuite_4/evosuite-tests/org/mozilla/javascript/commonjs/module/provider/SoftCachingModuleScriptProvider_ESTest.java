/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 22:57:38 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase;
import org.mozilla.javascript.commonjs.module.provider.ModuleSourceProvider;
import org.mozilla.javascript.commonjs.module.provider.SoftCachingModuleScriptProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SoftCachingModuleScriptProvider_ESTest extends SoftCachingModuleScriptProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SoftCachingModuleScriptProvider softCachingModuleScriptProvider0 = new SoftCachingModuleScriptProvider((ModuleSourceProvider) null);
      ModuleScript moduleScript0 = new ModuleScript((Script) null, (URI) null, (URI) null);
      softCachingModuleScriptProvider0.putLoadedModule("language version", moduleScript0, (Object) null);
      CachingModuleScriptProviderBase.CachedModuleScript cachingModuleScriptProviderBase_CachedModuleScript0 = softCachingModuleScriptProvider0.getLoadedModule("language version");
      assertNull(cachingModuleScriptProviderBase_CachedModuleScript0);
  }
}
