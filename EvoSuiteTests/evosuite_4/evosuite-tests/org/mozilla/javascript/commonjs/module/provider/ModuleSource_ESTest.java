/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 22:45:14 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;
import org.mozilla.javascript.commonjs.module.provider.ModuleSource;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModuleSource_ESTest extends ModuleSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      URI uRI0 = MockURI.aHttpURI;
      ModuleSource moduleSource0 = new ModuleSource(stringReader0, "", uRI0, uRI0, (Object) null);
      Object object0 = moduleSource0.getValidator();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      URI uRI0 = MockURI.aHttpURI;
      ModuleSource moduleSource0 = new ModuleSource(stringReader0, "", uRI0, uRI0, (Object) null);
      URI uRI1 = moduleSource0.getUri();
      assertEquals("foo.bar", uRI1.getHost());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      URI uRI0 = MockURI.aHttpURI;
      ModuleSource moduleSource0 = new ModuleSource(stringReader0, "", uRI0, uRI0, (Object) null);
      Object object0 = moduleSource0.getSecurityDomain();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      URI uRI0 = MockURI.aHttpURI;
      ModuleSource moduleSource0 = new ModuleSource(stringReader0, "", uRI0, uRI0, (Object) null);
      Reader reader0 = moduleSource0.getReader();
      assertSame(reader0, stringReader0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      URI uRI0 = MockURI.aHttpURI;
      ModuleSource moduleSource0 = new ModuleSource(stringReader0, "", uRI0, uRI0, (Object) null);
      URI uRI1 = moduleSource0.getBase();
      assertEquals("http", uRI1.getScheme());
  }
}
