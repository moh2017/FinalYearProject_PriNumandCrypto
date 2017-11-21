import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Mahmoud
 *
 */
public class TestRSAKeys {

  RSAKeys testKey;
  BigInteger test;
  int bit_Len = 512;
  
  @Rule
  // with the help of this rule thrown exception can be asserted.
  public final ExpectedException exception = ExpectedException.none();
  
  /**
   * Setup before running the test.
   * 
   * @throws java.lang.Exception throws language exception if it cannot be executed.
   */
  @Before
  public void setUp() throws Exception {
testKey = new RSAKeys(bit_Len); 
  }
  
  /**
   * Test if the RSAKeys constructor is created.
   */
  @Test
  public void test() {
    RSAKeys temp = testKey;
    assertEquals("Test 1: there is RSAKeys con ", temp, testKey);
  }

}
