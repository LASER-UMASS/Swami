/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 19:36:22 GMT 2018
 */

package org.mozilla.javascript.regexp;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.regexp.REBackTrackData;
import org.mozilla.javascript.regexp.REGlobalData;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class REBackTrackData_ESTest extends REBackTrackData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      REGlobalData rEGlobalData0 = new REGlobalData();
      REBackTrackData rEBackTrackData0 = new REBackTrackData(rEGlobalData0, (-264), (-264), 0, 0, 0);
  }
}
