/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 05:17:16 GMT 2018
 */

package org.mozilla.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.classfile.ByteCode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteCode_ESTest extends ByteCode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode();
      assertEquals(21, ByteCode.ILOAD);
  }
}
