/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 05:01:00 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.DefiningClassLoader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefiningClassLoader_ESTest extends DefiningClassLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefiningClassLoader definingClassLoader0 = new DefiningClassLoader((ClassLoader) null);
      try { 
        definingClassLoader0.loadClass("hmx[{", true);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefiningClassLoader definingClassLoader0 = new DefiningClassLoader();
      Class<?> class0 = definingClassLoader0.loadClass("org.mozilla.javascript.DefiningClassLoader", true);
      assertEquals("class org.mozilla.javascript.DefiningClassLoader", class0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefiningClassLoader definingClassLoader0 = new DefiningClassLoader();
      Class<Object> class0 = Object.class;
      definingClassLoader0.linkClass(class0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefiningClassLoader definingClassLoader0 = new DefiningClassLoader();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        definingClassLoader0.defineClass("[ZD|=FuksGhMr[W&,'", byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }
}
