/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazonpracticetest;

/**
 *
 * @author Prathamesh
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitTest {
     @Test
   public void testAdd() {
      String str= "Junit is working fine";
      assertEquals("Junit is working fine",str);
   }
}
