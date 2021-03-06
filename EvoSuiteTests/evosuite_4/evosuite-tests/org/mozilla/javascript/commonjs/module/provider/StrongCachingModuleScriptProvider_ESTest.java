/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 22:57:51 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase;
import org.mozilla.javascript.commonjs.module.provider.DefaultUrlConnectionExpiryCalculator;
import org.mozilla.javascript.commonjs.module.provider.StrongCachingModuleScriptProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionExpiryCalculator;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionSecurityDomainProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StrongCachingModuleScriptProvider_ESTest extends StrongCachingModuleScriptProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashSet<URI> hashSet0 = new HashSet<URI>();
      ArrayList<URI> arrayList0 = new ArrayList<URI>(hashSet0);
      UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider0 = mock(UrlConnectionSecurityDomainProvider.class, new ViolatedAssumptionAnswer());
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(arrayList0, arrayList0, (UrlConnectionExpiryCalculator) null, urlConnectionSecurityDomainProvider0);
      StrongCachingModuleScriptProvider strongCachingModuleScriptProvider0 = new StrongCachingModuleScriptProvider(urlModuleSourceProvider0);
      URI uRI0 = MockURI.aFileURI;
      ModuleScript moduleScript0 = new ModuleScript((Script) null, uRI0, uRI0);
      strongCachingModuleScriptProvider0.putLoadedModule("?5\"hV+c\"5z", moduleScript0, uRI0);
      assertTrue(moduleScript0.isSandboxed());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultUrlConnectionExpiryCalculator defaultUrlConnectionExpiryCalculator0 = new DefaultUrlConnectionExpiryCalculator(1424L);
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider((Iterable<URI>) null, (Iterable<URI>) null, defaultUrlConnectionExpiryCalculator0, (UrlConnectionSecurityDomainProvider) null);
      StrongCachingModuleScriptProvider strongCachingModuleScriptProvider0 = new StrongCachingModuleScriptProvider(urlModuleSourceProvider0);
      CachingModuleScriptProviderBase.CachedModuleScript cachingModuleScriptProviderBase_CachedModuleScript0 = strongCachingModuleScriptProvider0.getLoadedModule("=");
      assertNull(cachingModuleScriptProviderBase_CachedModuleScript0);
  }
}
