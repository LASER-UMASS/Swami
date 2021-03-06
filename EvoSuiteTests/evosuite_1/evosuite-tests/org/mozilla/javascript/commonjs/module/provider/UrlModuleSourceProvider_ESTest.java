/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 01:25:04 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.URI;
import java.util.PriorityQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.commonjs.module.provider.ModuleSource;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionExpiryCalculator;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionSecurityDomainProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UrlModuleSourceProvider_ESTest extends UrlModuleSourceProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PriorityQueue<URI> priorityQueue0 = new PriorityQueue<URI>();
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(priorityQueue0, priorityQueue0);
      ModuleSource moduleSource0 = urlModuleSourceProvider0.loadFromPrivilegedLocations("CLa", "CLa");
      assertNull(moduleSource0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider((Iterable<URI>) null, (Iterable<URI>) null);
      NativeObject nativeObject0 = new NativeObject();
      Object object0 = new Object();
      ModuleSource moduleSource0 = urlModuleSourceProvider0.loadSource("z q7WUohEfY", (Scriptable) nativeObject0, object0);
      assertNull(moduleSource0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider((Iterable<URI>) null, (Iterable<URI>) null);
      NativeObject nativeObject0 = new NativeObject();
      URI uRI0 = MockURI.aFTPURI;
      // Undeclared exception!
      try { 
        urlModuleSourceProvider0.loadFromActualUri(uRI0, uRI0, nativeObject0.EMPTY);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PriorityQueue<URI> priorityQueue0 = new PriorityQueue<URI>();
      URI uRI0 = MockURI.aHttpURI;
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://foo.barinterpretLoop.js");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "n8O");
      priorityQueue0.add(uRI0);
      UrlConnectionSecurityDomainProvider urlConnectionSecurityDomainProvider0 = mock(UrlConnectionSecurityDomainProvider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(urlConnectionSecurityDomainProvider0).getSecurityDomain(any(java.net.URLConnection.class));
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider(priorityQueue0, priorityQueue0, (UrlConnectionExpiryCalculator) null, urlConnectionSecurityDomainProvider0);
      ModuleSource moduleSource0 = urlModuleSourceProvider0.loadFromPrivilegedLocations("interpretLoop", evoSuiteURL0);
      assertNotNull(moduleSource0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PriorityQueue<URI> priorityQueue0 = new PriorityQueue<URI>();
      URI uRI0 = MockURI.aHttpURI;
      priorityQueue0.add(uRI0);
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider((Iterable<URI>) null, priorityQueue0);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://foo.barinterpretLoop.js");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "+");
      Object object0 = new Object();
      ModuleSource moduleSource0 = urlModuleSourceProvider0.loadFromFallbackLocations("interpretLoop", object0);
      assertNotNull(moduleSource0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PriorityQueue<URI> priorityQueue0 = new PriorityQueue<URI>(1888);
      URI uRI0 = MockURI.aHttpURI;
      UrlModuleSourceProvider urlModuleSourceProvider0 = new UrlModuleSourceProvider((Iterable<URI>) null, priorityQueue0);
      Object object0 = new Object();
      try { 
        urlModuleSourceProvider0.loadFromUri(uRI0, uRI0, object0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: foo.bar.js
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }
}
