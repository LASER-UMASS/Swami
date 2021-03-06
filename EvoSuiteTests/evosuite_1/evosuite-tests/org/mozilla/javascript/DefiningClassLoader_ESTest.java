/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 07:46:11 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.DefiningClassLoader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DefiningClassLoader_ESTest extends DefiningClassLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DefiningClassLoader definingClassLoader0 = new DefiningClassLoader(classLoader0);
      Class<?> class0 = definingClassLoader0.loadClass("org.mozilla.javascript.DefiningClassLoader", true);
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefiningClassLoader definingClassLoader0 = new DefiningClassLoader((ClassLoader) null);
      try { 
        definingClassLoader0.loadClass("", true);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefiningClassLoader definingClassLoader0 = new DefiningClassLoader();
      try { 
        definingClassLoader0.loadClass("$lN-7QFzU", false);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefiningClassLoader definingClassLoader0 = new DefiningClassLoader();
      Class<Integer> class0 = Integer.class;
      definingClassLoader0.linkClass(class0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DefiningClassLoader definingClassLoader0 = new DefiningClassLoader(classLoader0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        definingClassLoader0.defineClass("", byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }
}
