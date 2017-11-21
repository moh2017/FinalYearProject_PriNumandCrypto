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
  public BigInteger getp(){
    p = new BigInteger(bit_length/2,10,rand);
    return p;
  }
  
  public BigInteger getq(){
    do{
      
    }while();
  }
}

