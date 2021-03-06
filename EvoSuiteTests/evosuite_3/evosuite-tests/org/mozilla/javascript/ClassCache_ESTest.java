/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 04:37:40 GMT 2018
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
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

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
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.enter((Context) null, contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      ClassCache classCache0 = ClassCache.get(importerTopLevel0);
      assertTrue(classCache0.isCachingEnabled());
      
      classCache0.setCachingEnabled(false);
      classCache0.setCachingEnabled(false);
      assertFalse(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.enter((Context) null, contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      ClassCache classCache0 = ClassCache.get(importerTopLevel0);
      int int0 = classCache0.newClassSerialNumber();
      assertEquals(1, int0);
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.enter((Context) null, contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      ClassCache classCache0 = ClassCache.get(importerTopLevel0);
      boolean boolean0 = classCache0.isInvokerOptimizationEnabled();
      assertTrue(classCache0.isCachingEnabled());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.enter((Context) null, contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      ClassCache classCache0 = ClassCache.get(importerTopLevel0);
      boolean boolean0 = classCache0.isCachingEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      Class<String> class0 = String.class;
      classCache0.getInterfaceAdapter(class0);
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.enter((Context) null, contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      ClassCache classCache0 = ClassCache.get(importerTopLevel0);
      Map<Class<?>, JavaMembers> map0 = classCache0.getClassCacheMap();
      assertTrue(classCache0.isCachingEnabled());
      assertNotNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      classCache0.getAssociatedScope();
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(nativeArrayBuffer0, 137, 4);
      // Undeclared exception!
      try { 
        ClassCache.get(nativeUint8Array0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("org.mozilla.javascript.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      Map<JavaAdapter.JavaAdapterSignature, Class<?>> map0 = classCache0.getInterfaceAdapterCacheMap();
      assertNotNull(map0);
      
      Class<Integer> class0 = Integer.class;
      classCache0.cacheInterfaceAdapter(class0, map0);
      Class<String> class1 = String.class;
      classCache0.getInterfaceAdapter(class1);
      assertTrue(classCache0.isCachingEnabled());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassCache classCache0 = new ClassCache();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      boolean boolean0 = classCache0.associate(nativeArrayBuffer0);
      assertTrue(boolean0);
  }
}
