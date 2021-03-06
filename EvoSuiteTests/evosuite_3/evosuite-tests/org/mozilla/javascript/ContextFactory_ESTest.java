/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 00:49:41 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.DefiningClassLoader;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContextFactory_ESTest extends ContextFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContextFactory.GlobalSetter contextFactory_GlobalSetter0 = ContextFactory.getGlobalSetter();
      contextFactory_GlobalSetter0.setContextFactoryGlobal((ContextFactory) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      contextFactory0.getE4xImplementationFactory();
      ContextFactory.hasExplicitGlobal();
      contextFactory0.seal();
      Context context0 = new Context(contextFactory0);
      Context context1 = contextFactory0.enterContext(context0);
      assertEquals(140, Context.VERSION_1_4);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      contextFactory0.disableContextListening();
      // Undeclared exception!
      try { 
        contextFactory0.removeListener((ContextFactory.Listener) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ContextFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      ContextFactory.Listener contextFactory_Listener0 = mock(ContextFactory.Listener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        contextFactory0.removeListener(contextFactory_Listener0);
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ContextFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ContextFactory.Listener contextFactory_Listener0 = mock(ContextFactory.Listener.class, new ViolatedAssumptionAnswer());
      contextFactory0.addListener(contextFactory_Listener0);
      contextFactory0.onContextReleased(context0);
      assertEquals(3, Context.FEATURE_RESERVED_KEYWORD_AS_IDENTIFIER);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      contextFactory0.onContextReleased(context0);
      assertEquals(3, Context.FEATURE_RESERVED_KEYWORD_AS_IDENTIFIER);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ContextFactory.Listener contextFactory_Listener0 = mock(ContextFactory.Listener.class, new ViolatedAssumptionAnswer());
      contextFactory0.addListener(contextFactory_Listener0);
      contextFactory0.onContextCreated(context0);
      assertEquals(5, Context.FEATURE_PARENT_PROTO_PROPERTIES);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContextFactory.GlobalSetter contextFactory_GlobalSetter0 = ContextFactory.getGlobalSetter();
      ContextFactory contextFactory0 = contextFactory_GlobalSetter0.getContextFactoryGlobal();
      Context context0 = contextFactory0.enter();
      contextFactory0.onContextCreated(context0);
      assertTrue(contextFactory0.hasExplicitGlobal());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      contextFactory0.observeInstructionCount((Context) null, (-2055));
      assertFalse(contextFactory0.isSealed());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      boolean boolean0 = contextFactory0.isSealed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      ContextFactory.getGlobalSetter();
      // Undeclared exception!
      try { 
        ContextFactory.initGlobal(contextFactory0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ContextFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ContextFactory.initGlobal((ContextFactory) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ContextFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      ContextFactory.initGlobal(contextFactory0);
      assertTrue(contextFactory0.hasExplicitGlobal());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContextFactory.GlobalSetter contextFactory_GlobalSetter0 = ContextFactory.getGlobalSetter();
      ContextFactory contextFactory0 = contextFactory_GlobalSetter0.getContextFactoryGlobal();
      DefiningClassLoader definingClassLoader0 = new DefiningClassLoader((ClassLoader) null);
      // Undeclared exception!
      try { 
        contextFactory0.initApplicationClassLoader(definingClassLoader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Loader can not resolve Rhino classes
         //
         verifyException("org.mozilla.javascript.ContextFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      // Undeclared exception!
      try { 
        contextFactory0.initApplicationClassLoader((ClassLoader) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // loader is null
         //
         verifyException("org.mozilla.javascript.ContextFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ContextFactory.GlobalSetter contextFactory_GlobalSetter0 = ContextFactory.getGlobalSetter();
      ContextFactory contextFactory0 = contextFactory_GlobalSetter0.getContextFactoryGlobal();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        contextFactory0.hasFeature(context0, 130);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 130
         //
         verifyException("org.mozilla.javascript.ContextFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      boolean boolean0 = contextFactory0.hasFeature(context0, 18);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 4, 140);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.enter();
      boolean boolean0 = contextFactory0.hasFeature(context0, 15);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<String> class0 = String.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeObject0, class0, false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      boolean boolean0 = contextFactory0.hasFeature(context0, 10);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      boolean boolean0 = contextFactory0.hasFeature(context0, 9);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      boolean boolean0 = contextFactory0.hasFeature(context0, 7);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      boolean boolean0 = contextFactory0.hasFeature(context0, 5);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      boolean boolean0 = contextFactory0.hasFeature(context0, 4);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        context0.compileFunction(importerTopLevel0, "language version", "language version", 1, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // missing ; before statement (language version#1)
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      boolean boolean0 = contextFactory0.hasFeature(context0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ContextFactory.getGlobalSetter();
      // Undeclared exception!
      try { 
        ContextFactory.getGlobalSetter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ContextFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DefiningClassLoader definingClassLoader0 = new DefiningClassLoader(classLoader0);
      GeneratedClassLoader generatedClassLoader0 = contextFactory0.createClassLoader(definingClassLoader0);
      assertNotSame(generatedClassLoader0, definingClassLoader0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ObjArray objArray0 = context0.previousInterpreterInvocations;
      ContextAction contextAction0 = mock(ContextAction.class, new ViolatedAssumptionAnswer());
      doReturn(objArray0).when(contextAction0).run(any(org.mozilla.javascript.Context.class));
      Object object0 = contextFactory0.call(contextAction0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      // Undeclared exception!
      try { 
        contextFactory0.addListener((ContextFactory.Listener) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }
}
