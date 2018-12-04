/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 04:24:28 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.EmbeddedSlotMap;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.ThreadSafeSlotMapContainer;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ThreadSafeSlotMapContainer_ESTest extends ThreadSafeSlotMapContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer((-1162));
      threadSafeSlotMapContainer0.readLock();
      threadSafeSlotMapContainer0.unlockRead(257L);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer((-1162));
      int int0 = threadSafeSlotMapContainer0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(3236);
      threadSafeSlotMapContainer0.remove(threadSafeSlotMapContainer0, (-2726));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(1);
      Object object0 = new Object();
      ScriptableObject.Slot scriptableObject_Slot0 = threadSafeSlotMapContainer0.query(object0, 0);
      assertNull(scriptableObject_Slot0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer((-1162));
      threadSafeSlotMapContainer0.readLock();
      Iterator<ScriptableObject.Slot> iterator0 = threadSafeSlotMapContainer0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(81);
      boolean boolean0 = threadSafeSlotMapContainer0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(81);
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(0);
      NativeFloat32Array nativeFloat32Array0 = new NativeFloat32Array(nativeArrayBuffer0, 0, (-63));
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeFloat32Array0, false);
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY_CONST;
      ScriptableObject.Slot scriptableObject_Slot0 = threadSafeSlotMapContainer0.get(nativeGenerator0, 1, scriptableObject_SlotAccess0);
      assertNotNull(scriptableObject_Slot0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer((-1162));
      threadSafeSlotMapContainer0.readLock();
      int int0 = threadSafeSlotMapContainer0.dirtySize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ThreadSafeSlotMapContainer threadSafeSlotMapContainer0 = new ThreadSafeSlotMapContainer(174);
      EmbeddedSlotMap embeddedSlotMap0 = new EmbeddedSlotMap();
      ScriptableObject.SlotAccess scriptableObject_SlotAccess0 = ScriptableObject.SlotAccess.MODIFY;
      ScriptableObject.Slot scriptableObject_Slot0 = embeddedSlotMap0.get(threadSafeSlotMapContainer0, 174, scriptableObject_SlotAccess0);
      threadSafeSlotMapContainer0.addSlot(scriptableObject_Slot0);
  }
}