/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 08:18:05 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ClassCache;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeBoolean;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassCache_ESTest extends ClassCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      classCache0.setInvokerOptimizationEnabled(true);
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      assertTrue(classCache0.isCachingEnabled());
      
      classCache0.setCachingEnabled(false);
      assertFalse(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      classCache0.setCachingEnabled(true);
      assertFalse(classCache0.isInvokerOptimizationEnabled());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      int int0 = classCache0.newClassSerialNumber();
      assertTrue(classCache0.isCachingEnabled());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      boolean boolean0 = classCache0.isInvokerOptimizationEnabled();
      assertFalse(boolean0);
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      boolean boolean0 = classCache0.isCachingEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      Map<JavaAdapter.JavaAdapterSignature, Class<?>> map0 = classCache0.getInterfaceAdapterCacheMap();
      assertTrue(classCache0.isCachingEnabled());
      assertNotNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      Class<Object> class0 = Object.class;
      classCache0.getInterfaceAdapter(class0);
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      Map<Class<?>, JavaMembers> map0 = classCache0.getClassCacheMap();
      assertNotNull(map0);
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      classCache0.getAssociatedScope();
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        ClassCache.get(nativeArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("org.mozilla.javascript.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      Class<Object> class0 = Object.class;
      classCache0.cacheInterfaceAdapter(class0, classCache0);
      Object object0 = classCache0.getInterfaceAdapter(class0);
      assertNotNull(object0);
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      boolean boolean0 = classCache0.associate(nativeArrayBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeBoolean0, nativeBoolean0);
      // Undeclared exception!
      try { 
        classCache0.associate(nativeArrayIterator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ClassCache", e);
      }
  }
}
