/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 17:00:14 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.function.ToIntFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator;
import org.mozilla.javascript.NativeString;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.UniqueTag;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray.StringLikeComparator nativeArray_StringLikeComparator0 = new NativeArray.StringLikeComparator();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      objectArray0[1] = (Object) uniqueTag0;
      NativeArray.ElementComparator nativeArray_ElementComparator0 = new NativeArray.ElementComparator();
      int int0 = nativeArray_ElementComparator0.compare((Object) null, objectArray0[1]);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray.ElementComparator nativeArray_ElementComparator0 = new NativeArray.ElementComparator();
      NativeArray.ElementComparator nativeArray_ElementComparator1 = new NativeArray.ElementComparator(nativeArray_ElementComparator0);
      assertFalse(nativeArray_ElementComparator1.equals((Object)nativeArray_ElementComparator0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1209L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, "K}7vWMxQ3AC3g;g");
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      Double double0 = new Double(1);
      ScriptableObject scriptableObject0 = nativeArray0.getOwnPropertyDescriptor(context0, double0);
      assertNull(scriptableObject0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(774L);
      ToIntFunction<Object> toIntFunction0 = (ToIntFunction<Object>) mock(ToIntFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(toIntFunction0).applyAsInt(any());
      Comparator<IdFunctionObject> comparator0 = Comparator.comparingInt((ToIntFunction<? super IdFunctionObject>) toIntFunction0);
      // Undeclared exception!
      try { 
        nativeArray0.sort(comparator0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4890909195324358655L);
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        nativeArray0.toArray(objectArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.subList(118, 4499);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-3808L));
      assertEquals((-3808L), nativeArray0.getLength());
      
      int int0 = nativeArray0.size();
      assertEquals((-3808), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray.ElementComparator nativeArray_ElementComparator0 = new NativeArray.ElementComparator();
      NativeArray nativeArray0 = new NativeArray(13);
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(1, nativeArray_ElementComparator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // RangeError: Inappropriate array length.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4503599627370475L);
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(15, "n");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 15
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4503599627370475L);
      nativeArray0.setInstanceIdValue(1, (Object) null);
      assertEquals(0L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-4491L));
      nativeArray0.put(399, (Scriptable) nativeArray0, (Object) nativeArray0);
      // Undeclared exception!
      try { 
        nativeArray0.setDenseOnly(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-5096825099203863601L));
      nativeArray0.setDenseOnly(true);
      assertEquals((-5096825099203863601L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-3079L));
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(2);
      NativeArrayIterator nativeArrayIterator0 = new NativeArrayIterator(nativeArray0, nativeUint8Array0);
      // Undeclared exception!
      try { 
        nativeArray0.set(118, nativeArrayIterator0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      // Undeclared exception!
      try { 
        nativeArray0.retainAll(nativeArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      TreeSet<NativeArray> treeSet0 = new TreeSet<NativeArray>();
      // Undeclared exception!
      try { 
        nativeArray0.removeAll(treeSet0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-7054365918152680535L));
      // Undeclared exception!
      try { 
        nativeArray0.remove((Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.remove(10);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3548L);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = Context.enter((Context) null, contextFactory0);
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeArray0, false);
      assertEquals("Array", scriptableObject0.getClassName());
      assertFalse(scriptableObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-119L));
      IdFunctionObjectES6 idFunctionObjectES6_0 = new IdFunctionObjectES6(nativeArray0, nativeArray0, 1457, "", 13, nativeArray0);
      idFunctionObjectES6_0.put(8, (Scriptable) nativeArray0, (Object) nativeArray0);
      assertEquals(9L, nativeArray0.jsGet_length());
      assertEquals(9L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4294967295L);
      // Undeclared exception!
      try { 
        nativeArray0.iterator();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      int int0 = nativeArray0.lastIndexOf(objectArray0[1]);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4890909195324358655L);
      // Undeclared exception!
      try { 
        nativeArray0.lastIndexOf(nativeArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1491L));
      long long0 = nativeArray0.jsGet_length();
      assertEquals((-1491L), long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1047L));
      // Undeclared exception!
      try { 
        Locale.filterTags((List<Locale.LanguageRange>) nativeArray0, (Collection<String>) nativeArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      // Undeclared exception!
      try { 
        nativeArray0.initPrototypeId(161);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 161
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3548L);
      ContextFactory contextFactory0 = new ContextFactory();
      nativeArray0.put(8, (Scriptable) nativeArray0, (Object) contextFactory0);
      int int0 = nativeArray0.indexOf(contextFactory0);
      assertEquals(8, int0);
      assertEquals(3548L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      TopLevel topLevel0 = new TopLevel();
      int int0 = nativeArray0.indexOf(topLevel0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4890909195324358655L);
      Object object0 = nativeArray0.defaultGet("IifL~_<v");
      // Undeclared exception!
      try { 
        nativeArray0.indexOf(object0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3548L);
      boolean boolean0 = nativeArray0.has(120, (Scriptable) null);
      assertEquals(3548L, nativeArray0.getLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1553L));
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.String;
      nativeArray0.getOwnPropertyDescriptor((Context) null, topLevel_Builtins0);
      assertEquals((-1553L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = NativeArray.getMaximumInitialCapacity();
      assertEquals(10000, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(26);
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(nativeArrayBuffer0, 13, 8);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      long long0 = NativeArray.getLengthProperty(context0, nativeUint16Array0);
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object object0 = nativeArray0.getInstanceIdValue(1);
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4890909195324358655L);
      // Undeclared exception!
      try { 
        nativeArray0.getInstanceIdValue(150);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 150
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getInstanceIdName(4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(2, integerArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-664674077828931748L));
      // Undeclared exception!
      try { 
        Context.toNumber(nativeArray0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Property 0 not found.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3548L);
      // Undeclared exception!
      try { 
        nativeArray0.get(4747L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(26);
      NativeArray nativeArray0 = new NativeArray(2L);
      Object object0 = nativeArray0.get((-138), (Scriptable) nativeArrayBuffer0);
      NativeArray.ElementComparator nativeArray_ElementComparator0 = new NativeArray.ElementComparator();
      int int0 = nativeArray_ElementComparator0.compare(object0, object0);
      assertEquals(2L, nativeArray0.jsGet_length());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(3548L);
      SymbolKey symbolKey0 = SymbolKey.MATCH;
      int int0 = nativeArray0.findPrototypeId(symbolKey0);
      assertEquals(3548L, nativeArray0.getLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4890909195324358655L);
      int int0 = nativeArray0.findPrototypeId("Index: ");
      assertEquals(0, int0);
      assertEquals(4890909195324358655L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-528786136287117932L));
      int int0 = nativeArray0.findPrototypeId("Inne: ");
      assertEquals(0, int0);
      assertEquals((-528786136287117932L), nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1977L));
      int int0 = nativeArray0.findPrototypeId("JSON");
      assertEquals(0, int0);
      assertEquals((-1977L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2460L);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 1, "D1AW|a6%T!`B", 4, nativeArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=1 MASTER=org.mozilla.javascript.NativeArray@3
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      Double double0 = new Double(399.0);
      nativeArray0.put(14, (Scriptable) nativeArray0, (Object) double0);
      assertEquals(15L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete(8);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      NativeArray.ElementComparator nativeArray_ElementComparator0 = new NativeArray.ElementComparator();
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      CharBuffer charBuffer0 = CharBuffer.allocate(100);
      NativeString nativeString0 = new NativeString(charBuffer0);
      nativeArray0.defineOwnProperty(context0, (Object) nativeArray_ElementComparator0, (ScriptableObject) nativeString0, false);
      assertEquals(2L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      assertEquals(2L, nativeArray0.getLength());
      
      NativeArray nativeArray1 = new NativeArray(0);
      boolean boolean0 = nativeArray1.containsAll(nativeArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2L);
      boolean boolean0 = nativeArray0.containsAll(nativeArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      // Undeclared exception!
      try { 
        nativeArray0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      LinkedHashSet<NativeWith> linkedHashSet0 = new LinkedHashSet<NativeWith>();
      // Undeclared exception!
      try { 
        nativeArray0.addAll((Collection) linkedHashSet0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2841L);
      // Undeclared exception!
      try { 
        nativeArray0.addAll((-2634), (Collection) nativeArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      Byte byte0 = new Byte((byte)15);
      // Undeclared exception!
      try { 
        nativeArray0.add((Object) byte0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Byte byte0 = new Byte((byte) (-102));
      // Undeclared exception!
      try { 
        nativeArray0.add(774, (Object) byte0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeArray", e);
      }
  }
}
