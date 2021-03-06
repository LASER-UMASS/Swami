/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 02:33:36 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.URI;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.provider.DefaultUrlConnectionExpiryCalculator;
import org.mozilla.javascript.commonjs.module.provider.SoftCachingModuleScriptProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionSecurityDomainProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SoftCachingModuleScriptProvider_ESTest extends SoftCachingModuleScriptProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeSet<URI> treeSet0 = new TreeSet<URI>();
      DefaultUrlConnectionExpiryCalculator defaultUrlConnectionExpiryCalculator0 = new DefaultUrlConnectionExpiryCalculator();
      UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider0 = mock(UrlConnectionSecurityDomainProvider.class, new ViolatedAssumptionAnswer());
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(treeSet0, treeSet0, defaultUrlConnectionExpiryCalculator0, urlConnectionSecurityDomainProvider0);
      SoftCachingModuleScriptProvider softCachingModuleScriptProvider0 = new SoftCachingModuleScriptProvider(urlModuleSourceProvider0);
      Context context0 = Context.enter();
      URI uRI0 = MockURI.aHttpURI;
      ModuleScript moduleScript0 = new ModuleScript((Script) null, uRI0, uRI0);
      softCachingModuleScriptProvider0.putLoadedModule("h~@?\"kHWz)", moduleScript0, urlModuleSourceProvider0);
      try { 
        softCachingModuleScriptProvider0.getModuleScript(context0, "h~@?\"kHWz)", uRI0, uRI0, (Scriptable) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: foo.bar.js
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }
}
