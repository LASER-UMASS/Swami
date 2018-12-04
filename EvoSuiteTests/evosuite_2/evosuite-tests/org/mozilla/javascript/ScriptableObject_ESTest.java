/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 05:56:07 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ArrowFunction;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.InterpreterData;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeCallSite;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaPackage;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.NativeStringIterator;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScriptableObject_ESTest extends ScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 8, (-4873));
      InterpreterData interpreterData0 = new InterpreterData(0, "o#", "9[$G#3F7C:-\"s1", false);
      NativeWith nativeWith0 = new NativeWith(nativeArrayBuffer0, nativeInt8Array0);
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(interpreterData0, 1490, (-1086045458));
      boolean boolean0 = scriptableObject_GetterSlot0.setValue(nativeWith0, nativeInt8Array0, nativeWith0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScriptableObject.KeyComparator scriptableObject_KeyComparator0 = new ScriptableObject.KeyComparator();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Double double0 = new Double((-1127.853));
      ScriptableObject.GetterSlot scriptableObject_GetterSlot0 = new ScriptableObject.GetterSlot(double0, 0, 0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(100);
      ScriptableObject scriptableObject0 = scriptableObject_GetterSlot0.getPropertyDescriptor(context0, nativeUint8Array0);
      assertEquals("Object", scriptableObject0.getClassName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      int int0 = nativeArrayBuffer0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.setGetterOrSetter((String) null, 2373, (Callable) null, true);
      assertFalse(nativeContinuation0.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Delegator delegator0 = new Delegator(nativeIterator_StopIteration0);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.setGetterOrSetter("msg.invalid.type", 8, delegator0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // msg.invalid.type
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(1094);
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(nativeArrayBuffer0, 862, (-1735));
      nativeInt16Array0.setAttributes(0, (Scriptable) nativeArrayBuffer0, 0);
      assertEquals((-1735), nativeInt16Array0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(0.0);
      Long long0 = new Long((-2232L));
      boolean boolean0 = nativeNumber0.sameValue(long0, long0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      ScriptableObject.redefineProperty(nativeArray0, "~;@Z'*.`", true);
      assertEquals("object", nativeArray0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(55268);
      SymbolKey symbolKey0 = new SymbolKey("error reporter");
      NativeString nativeString0 = new NativeString("error reporter");
      ScriptableObject.putProperty((Scriptable) nativeUint8Array0, (Symbol) symbolKey0, (Object) nativeString0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptableObject.putProperty((Scriptable) nativeContinuation0, 4, (Object) nativeContinuation0);
      assertEquals("object", nativeContinuation0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 8, (-4873));
      NativeWith nativeWith0 = new NativeWith(nativeArrayBuffer0, nativeInt8Array0);
      nativeInt8Array0.putConst("2jJ;291dFe#'xnDe", nativeArrayBuffer0, nativeWith0);
      assertEquals("object", nativeInt8Array0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      SymbolKey symbolKey0 = SymbolKey.SPLIT;
      nativeIterator_StopIteration0.put((Symbol) symbolKey0, (Scriptable) nativeArray0, (Object) symbolKey0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put("Uint8ClampedArray", (Scriptable) nativeArray0, (Object) nativeArray0);
      assertEquals("object", nativeArray0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(13);
      nativeIterator_StopIteration0.put((-2078), (Scriptable) nativeInt8Array0, (Object) nativeInt8Array0);
      assertFalse(nativeInt8Array0.isSealed());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ImporterTopLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      boolean boolean0 = nativeCall0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeWith nativeWith0 = new NativeWith(nativeContinuation0, nativeContinuation0);
      Synchronizer synchronizer0 = new Synchronizer(nativeContinuation0);
      boolean boolean0 = synchronizer0.hasInstance(nativeWith0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 8, (-4873));
      Class<Field> class0 = Field.class;
      Field field0 = ScriptableObject.getTypedProperty((Scriptable) nativeInt8Array0, "o#", class0);
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(false, "org.mozilla.javascript.tools.debugger.Dim$DimIProxy", (ClassLoader) null);
      Class<InterpretedFunction> class0 = InterpretedFunction.class;
      InterpretedFunction interpretedFunction0 = ScriptableObject.getTypedProperty((Scriptable) nativeJavaPackage0, 4, class0);
      assertNull(interpretedFunction0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = ScriptableObject.getPropertyIds((Scriptable) null);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 0, 0);
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeInt32Array0, 2);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      Object object0 = nativeArray0.get(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      nativeArray0.put(986, (Scriptable) nativeArray0, (Object) nativeArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(1, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeWith nativeWith0 = new NativeWith(nativeContinuation0, nativeContinuation0);
      Object[] objectArray0 = ScriptableObject.getPropertyIds(nativeWith0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(16);
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(nativeArrayBuffer0, 3, 1193);
      BaseFunction baseFunction0 = new BaseFunction(nativeArrayBuffer0, nativeFloat32Array0);
      // Undeclared exception!
      try { 
        baseFunction0.getGetterOrSetter("language version", (-1585), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // language version
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeString nativeString0 = new NativeString("symbol");
      Object object0 = nativeString0.getExternalArrayLength();
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      // Undeclared exception!
      try { 
        ScriptableObject.isFalse(nativeArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array();
      Class<NativeCallSite> class0 = NativeCallSite.class;
      // Undeclared exception!
      try { 
        nativeFloat32Array0.getDefaultValue(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid JavaScript value of type class org.mozilla.javascript.NativeCallSite
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(16);
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeArrayBuffer0, (Class<?>) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage((ClassLoader) null);
      // Undeclared exception!
      try { 
        nativeJavaTopPackage0.getAttributes(741, (Scriptable) nativeJavaTopPackage0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Property 741 not found.
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(nativeArrayBuffer0, 8, (-1864));
      NativeStringIterator nativeStringIterator0 = null;
      try {
        nativeStringIterator0 = new NativeStringIterator(nativeArray0, nativeInt16Array0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeCall0, true);
      // Undeclared exception!
      try { 
        nativeGenerator0.getAllIds();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-1762), "language version", "HraQ#w';Y+H[s", false);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      BiFunction<Integer, NativeJavaPackage, Integer> biFunction0 = (BiFunction<Integer, NativeJavaPackage, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      Object object0 = nativeIterator_StopIteration0.computeIfPresent(interpreterData0, biFunction0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Object object0 = nativeArray0.get((Object) "3zjO7g%l++Io/`/");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Byte byte0 = new Byte((byte) (-27));
      Object object0 = nativeIterator_StopIteration0.getOrDefault(byte0, context0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      SymbolKey symbolKey0 = SymbolKey.IS_REGEXP;
      // Undeclared exception!
      try { 
        nativeError0.getAttributes((Symbol) symbolKey0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Property Symbol(Symbol.isRegExp) not found.
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      SymbolKey symbolKey0 = SymbolKey.IS_REGEXP;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.put((Symbol) symbolKey0, (Scriptable) null, (Object) "minusOneObj");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Object object does not support Symbol keys
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(7);
      SymbolKey symbolKey0 = SymbolKey.REPLACE;
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeUint16Array0, (Symbol) symbolKey0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      NativeInt8Array nativeInt8Array1 = (NativeInt8Array)ScriptableObject.ensureScriptableObject(nativeInt8Array0);
      assertFalse(nativeInt8Array1.hasPrototypeMap());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-58));
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptableObject(byte0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Expected argument of type object, but instead had type number
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Expected argument of type object, but instead had type object
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Scriptable scriptable0 = ScriptableObject.ensureScriptable(nativeArray0);
      assertSame(nativeArray0, scriptable0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeJavaTopPackage0, "global");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 2174, 130);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeInt8Array0, 2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 8, (-4873));
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeInt8Array0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array();
      SymbolKey symbolKey0 = SymbolKey.UNSCOPABLES;
      nativeInt16Array0.delete((Symbol) symbolKey0);
      assertEquals(0, nativeInt16Array0.getByteLength());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SymbolKey symbolKey0 = SymbolKey.SPLIT;
      // Undeclared exception!
      try { 
        InterpretedFunction.createScript((InterpreterData) null, symbolKey0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array((NativeArrayBuffer) null, 0, 0);
      SymbolKey symbolKey0 = SymbolKey.MATCH;
      nativeUint8Array0.defineProperty((Symbol) symbolKey0, (Object) null, 0);
      assertEquals(0, nativeUint8Array0.getByteOffset());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeUint16Array0, nativeJavaClass0, (-16), "", 1, nativeUint16Array0);
      // Undeclared exception!
      try { 
        idFunctionObjectES6_0.addAsProperty(nativeJavaClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(nativeArrayBuffer0, 3, 1193);
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(nativeArrayBuffer0, (-869), 160);
      nativeFloat32Array0.setExternalArrayData(nativeUint8ClampedArray0);
      assertEquals(1193, nativeFloat32Array0.getArrayLength());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<Method> class0 = Method.class;
      nativeIterator_StopIteration0.defineProperty("minusOneObj", class0, 8);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeError0, nativeError0, 13, "valueOf", 121, nativeError0);
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
  public void test57()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "l9h1khs|I7eOA^S4\f";
      Class<NativeError> class0 = NativeError.class;
      // Undeclared exception!
      try { 
        nativeCall0.defineFunctionProperties(stringArray0, class0, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Method \"l9h1khs|I7eOA^S4\f\" not found in \"org.mozilla.javascript.NativeError\".
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-609L));
      assertFalse(nativeArray0.isSealed());
      
      ScriptableObject.defineConstProperty(nativeArray0, "noZTKTZPyRbUO?4nS");
      assertEquals((-609L), nativeArray0.getLength());
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      assertTrue(nativeContinuation0.isExtensible());
      
      nativeContinuation0.defineConst("", (Scriptable) null);
      assertFalse(nativeContinuation0.isSealed());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      NativeNumber nativeNumber0 = new NativeNumber(100000.0);
      // Undeclared exception!
      try { 
        nativeNumber0.setAttributes("@azDf_':t+>7x-5LXu", (Scriptable) nativeJavaTopPackage0, (-4850));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -4850
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(true, "", classLoader0);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(0);
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(nativeArrayBuffer0, 0, 2);
      nativeJavaPackage0.checkPropertyChange(nativeArrayBuffer0, nativeUint8ClampedArray0, nativeUint8ClampedArray0);
      assertFalse(nativeUint8ClampedArray0.isSealed());
      assertTrue(nativeUint8ClampedArray0.isExtensible());
      assertFalse(nativeJavaPackage0.isSealed());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(nativeArrayBuffer0, 8, (-4873));
      Context context0 = Context.getCurrentContext();
      nativeInt8Array0.defineOwnProperty(context0, (Object) null, nativeArrayBuffer0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        NativeArray.init((Scriptable) null, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(16);
      Class<NativeJavaClass> class0 = NativeJavaClass.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeArrayBuffer0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't define constructor or class org.mozilla.javascript.NativeJavaClass since more than one constructor has multiple parameters.
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        context0.initSafeStandardObjects((ScriptableObject) nativeError0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(0);
      Class<NativeJavaMethod> class0 = NativeJavaMethod.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeInt16Array0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot load class \"org.mozilla.javascript.NativeJavaMethod\" which has no zero-parameter constructor.
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      // Undeclared exception!
      try { 
        JavaAdapter.runScript((Script) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.JavaAdapter$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      Object[] objectArray0 = new Object[9];
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeArray0, "toint32", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: java.lang.String@0000000005 is not a function, it is object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeError0, nativeError0, 425);
      int int0 = nativeError0.applyDescriptorToAttributeBitset(0, scriptableObject0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeUint8Array0, false);
      ArrowFunction arrowFunction0 = null;
      try {
        arrowFunction0 = new ArrowFunction((Context) null, nativeUint8Array0, nativeJavaClass0, nativeGenerator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("org.mozilla.javascript.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      IdFunctionObjectES6 idFunctionObjectES6_0 = null;
      try {
        idFunctionObjectES6_0 = new IdFunctionObjectES6((IdFunctionCall) null, (Object) null, 0, (String) null, 16, (Scriptable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) baseFunction0, "");
      assertTrue(baseFunction0.isExtensible());
      assertFalse(baseFunction0.isSealed());
      assertTrue(boolean0);
  }
}