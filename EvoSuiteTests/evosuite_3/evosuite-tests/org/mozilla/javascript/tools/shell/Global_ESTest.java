/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 19:49:00 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.StreamCorruptedException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.commonjs.module.Require;
import org.mozilla.javascript.tools.shell.Global;
import org.mozilla.javascript.tools.shell.QuitAction;
import org.mozilla.javascript.tools.shell.ShellConsole;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      Delegator delegator0 = new Delegator();
      Global global0 = new Global();
      String[] stringArray0 = global0.getPrompts(context0);
      double double0 = Global.version(context0, global0, stringArray0, delegator0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(global0, class0, false);
      Object object0 = Global.toint32(context0, global0, context0.emptyArgs, nativeJavaClass0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        Global.sync(context0, nativeContinuation0, context0.emptyArgs, nativeContinuation0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("org.mozilla.javascript.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = Context.enter();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) nativeJavaClass0;
      MockThread mockThread0 = (MockThread)Global.spawn(context0, nativeJavaClass0, objectArray0, nativeJavaClass0);
      //  // Unstable assertion: assertFalse(mockThread0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.enter();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Require require0 = global0.installRequire(context0, linkedList0, true);
      // Undeclared exception!
      try { 
        Global.spawn(context0, require0, context0.emptyArgs, require0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      global0.setSealedStdLib(false);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Global global0 = new Global();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 2);
      global0.setIn(bufferedInputStream0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(140);
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(nativeArrayBuffer0, 5, 13);
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        Global.serialize(context0, nativeUint8Array0, objectArray0, delegator0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object for excluded name Object not found.
         //
         verifyException("org.mozilla.javascript.serialize.ScriptableOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(140);
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(nativeArrayBuffer0, 5, 13);
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        Global.serialize(context0, nativeUint8Array0, context0.emptyArgs, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected an object to serialize and a filename to write the serialization to
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      Delegator delegator0 = new Delegator((Scriptable) null);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) delegator0;
      // Undeclared exception!
      try { 
        Global.seal(context0, nativeArrayBuffer0, objectArray0, delegator0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // seal function supports only sealing of ScriptableObject instances
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      Delegator delegator0 = new Delegator((Scriptable) null);
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        Global.seal(context0, nativeArrayBuffer0, objectArray0, delegator0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      Function function0 = TopLevel.getBuiltinCtor(context0, (Scriptable) importerTopLevel0, topLevel_Builtins0);
      Global.seal(context0, importerTopLevel0, context0.emptyArgs, function0);
      assertEquals(110, Context.VERSION_1_1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Global global0 = new Global();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      // Undeclared exception!
      try { 
        global0.runDoctest(context0, (Scriptable) null, "js> ", "_@:zWey*Re@@un3-|D8", (-688));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Global global0 = new Global();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Object[] objectArray0 = new Object[6];
      objectArray0[5] = (Object) global0;
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(nativeArrayBuffer0, 2, (-2075));
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeUint32Array0, objectArray0[2], 15, "(*aQ0~", 1, nativeUint32Array0);
      // Undeclared exception!
      try { 
        Global.runCommand(context0, global0, objectArray0, idFunctionObject0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("org.mozilla.javascript.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Global global0 = new Global();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Require require0 = global0.installRequire(context0, (List<String>) null, false);
      // Undeclared exception!
      try { 
        Global.runCommand(context0, require0, context0.emptyArgs, require0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      Global global0 = new Global(context0);
      BaseFunction baseFunction0 = new BaseFunction(global0, global0);
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        Global.readline(context0, global0, objectArray0, baseFunction0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      Global global0 = new Global(context0);
      BaseFunction baseFunction0 = new BaseFunction(global0, global0);
      // Undeclared exception!
      try { 
        Global.readline(context0, global0, context0.emptyArgs, baseFunction0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.enter();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Require require0 = global0.installRequire(context0, linkedList0, false);
      // Undeclared exception!
      try { 
        Global.readUrl(context0, require0, context0.emptyArgs, require0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // readUrl require at least file path to be specified
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Global global0 = new Global();
      Object[] objectArray0 = new Object[9];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("null");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "D\"\"F*TAKVkg&<*tI#'");
      Context context0 = Context.enter();
      Synchronizer synchronizer0 = new Synchronizer(global0, context0);
      try { 
        Global.readFile(context0, global0, objectArray0, synchronizer0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(global0, class0, false);
      Object[] objectArray0 = new Object[9];
      try { 
        Global.readUrl(context0, nativeJavaClass0, objectArray0, nativeJavaClass0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: null
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Context context0 = Context.enter();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      // Undeclared exception!
      try { 
        Global.readFile(context0, nativeInt8Array0, context0.emptyArgs, (Function) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // readFile require at least file path to be specified
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Global global0 = new Global();
      Object[] objectArray0 = new Object[9];
      Context context0 = Context.enter();
      Synchronizer synchronizer0 = new Synchronizer(global0, context0);
      try { 
        Global.readFile(context0, global0, objectArray0, synchronizer0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("org.mozilla.javascript.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      Global global0 = new Global(context0);
      BaseFunction baseFunction0 = new BaseFunction(global0, global0);
      Global.quit(context0, global0, context0.emptyArgs, baseFunction0);
      assertEquals(150, Context.VERSION_1_5);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      Require require0 = global0.installRequire(context0, (List<String>) null, false);
      // Undeclared exception!
      try { 
        Global.print(context0, global0, context0.emptyArgs, require0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("org.mozilla.javascript.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      Global global0 = new Global(context0);
      PrintStream printStream0 = global0.getErr();
      // Undeclared exception!
      try { 
        Global.pipe(true, (InputStream) null, printStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 4);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("sqrt", true);
      Global.pipe(false, byteArrayInputStream0, mockFileOutputStream0);
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Global global0 = new Global();
      SystemInUtil.addInputLine("Yuv<~0i-M`)!TO9");
      InputStream inputStream0 = global0.getIn();
      DataInputStream dataInputStream0 = new DataInputStream(inputStream0);
      MockFile mockFile0 = new MockFile("63PJd{F");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Global.pipe(true, dataInputStream0, mockPrintStream0);
      assertEquals(16L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 4);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("sqrt", true);
      Global.pipe(false, byteArrayInputStream0, mockFileOutputStream0);
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Global global0 = new Global(context0);
      Require require0 = global0.installRequire(context0, (List<String>) null, true);
      // Undeclared exception!
      try { 
        Global.loadClass(context0, require0, context0.emptyArgs, require0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a string argument.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Number;
      Function function0 = TopLevel.getBuiltinCtor(context0, (Scriptable) importerTopLevel0, topLevel_Builtins0);
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        Global.load(context0, function0, objectArray0, function0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Couldn't read source file \"null\": null.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.enter();
      Synchronizer synchronizer0 = new Synchronizer(global0, context0);
      Global.load(context0, synchronizer0, context0.emptyArgs, synchronizer0);
      assertEquals(7, Context.FEATURE_DYNAMIC_SCOPE);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      boolean boolean0 = global0.isInitialized();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Global global0 = new Global();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) "_@:zWey*Re@@un3-|D8";
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        global0.installRequire(context0, nativeArray0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.URISyntaxException: Illegal character in scheme name at index 0: _@:zWey*Re@@un3-|D8
         //
         verifyException("org.mozilla.javascript.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      QuitAction quitAction0 = mock(QuitAction.class, new ViolatedAssumptionAnswer());
      global0.initQuitAction(quitAction0);
      QuitAction quitAction1 = mock(QuitAction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        global0.initQuitAction(quitAction1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The method is once-call.
         //
         verifyException("org.mozilla.javascript.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Global global0 = new Global();
      // Undeclared exception!
      try { 
        global0.initQuitAction((QuitAction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // quitAction is null
         //
         verifyException("org.mozilla.javascript.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Global global0 = new Global();
      ContextFactory contextFactory0 = new ContextFactory();
      global0.init(contextFactory0);
      assertEquals("global", global0.getClassName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      Global global0 = new Global(context0);
      String[] stringArray0 = global0.getPrompts(context0);
      BaseFunction baseFunction0 = new BaseFunction(global0, global0);
      try { 
        Global.runCommand(context0, global0, stringArray0, baseFunction0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot start processes in a unit test
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Global global0 = new Global();
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = global0.getConsole(charset0);
      assertNotNull(shellConsole0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Global global0 = new Global();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Object[] objectArray0 = new Object[8];
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.defineClass(context0, (Scriptable) global0, objectArray0, (Function) baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Class \"null\" not found.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(0);
      Object[] objectArray0 = new Object[5];
      Delegator delegator0 = new Delegator(nativeFloat32Array0);
      Global.gc((Context) null, nativeFloat32Array0, objectArray0, delegator0);
      assertEquals(5, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(global0, class0, false);
      Object[] objectArray0 = new Object[9];
      Object object0 = Global.doctest(context0, nativeJavaClass0, objectArray0, nativeJavaClass0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(140);
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(nativeArrayBuffer0, 5, 13);
      Delegator delegator0 = new Delegator();
      Object object0 = Global.doctest(context0, nativeUint8Array0, context0.emptyArgs, delegator0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      Object[] objectArray0 = new Object[3];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("null");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeInt8Array0, (Object) null, 8, 0);
      try { 
        Global.deserialize((Context) null, nativeInt8Array0, objectArray0, idFunctionObject0);
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 00000000
         //
         verifyException("java.io.ObjectInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        Global.deserialize(context0, global0, context0.emptyArgs, (Function) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a filename to read the serialization from
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(global0, class0, false);
      Object object0 = Global.write(context0, nativeJavaClass0, context0.emptyArgs, nativeJavaClass0);
      assertNotNull(object0);
  }
}