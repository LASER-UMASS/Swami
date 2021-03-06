/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 00:18:02 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.commonjs.module.provider.ParsedContentType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParsedContentType_ESTest extends ParsedContentType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParsedContentType parsedContentType0 = new ParsedContentType("omE9_Y");
      String string0 = parsedContentType0.getEncoding();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParsedContentType parsedContentType0 = new ParsedContentType("]In \"E=KBt");
      String string0 = parsedContentType0.getContentType();
      assertEquals("]In \"E=KBt", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParsedContentType parsedContentType0 = new ParsedContentType("D[rUBb;\"@;charset=x\"");
      assertEquals("x", parsedContentType0.getEncoding());
      assertEquals("D[rUBb", parsedContentType0.getContentType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParsedContentType parsedContentType0 = null;
      try {
        parsedContentType0 = new ParsedContentType("D[rUBb;\"@;charset=\"");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
