import java.math.BigInteger;
import java.util.Random;

/**
 * @author Mahmoud
 *
 */
public class RSAKeys {

  private BigInteger p,q,n,phi_n,e,d;
  private int bit_length;
  Random rand = new Random();
  
  /**
   * 
   * @param bitLength
   */
  public RSAKeys(int bitLength){
    this.bit_length = bitLength;
  }
  
  /**
   * 
   * @retur
   */
  public BigInteger get_p(){
    p = new BigInteger(bit_length/2,10,rand);
    return p;
  }
  
  /**
   * 
   * @return
   */
  public BigInteger get_q(){
    do{
      q = new BigInteger(bit_length/2,10,rand);
    }while(q.compareTo(p) == 0);
    return q;
  }
  
  /**
   * n = p * q
   * @return
   */
  public BigInteger get_n(){
    n = p.multiply(q);
    return n;
  }
  
  /**
   * Phi_n = p-1 * q-1.
   * 
   * @return
   */
  public BigInteger getPhi_n(){
    phi_n = p.subtract(BigInteger.ONE)
        .multiply(q.subtract(BigInteger.ONE));
    return phi_n;
  }
  
  /**
   * Randomly choose e as long as e > 0 
   * Or e < phi_n 
   * @return
   */
  public BigInteger get_e(){
    do{
      e = new BigInteger(phi_n.bitLength(),rand);
    }while(e.compareTo(BigInteger.ONE) <= 0
        || e.compareTo(phi_n) >= 0
        || !e.gcd(phi_n).equals(BigInteger.ONE));
    
    return e;
  }
  
}

