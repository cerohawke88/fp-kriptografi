/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpkripto;
import java.util.Random;
import java.security.SecureRandom;
import java.math.BigInteger;

public class BlumBlumShub implements RandomGenerator {

    // pre-compute a few values
    private static final BigInteger two = BigInteger.valueOf(2L);

    private static final BigInteger three = BigInteger.valueOf(3L);

    private static final BigInteger four = BigInteger.valueOf(4L);

    /**
     * main parameter
     */
    private BigInteger n;

    private BigInteger state;

    /**
     * Generate appropriate prime number for use in Blum-Blum-Shub.
     *
     * This generates the appropriate primes (p = 3 mod 4) needed to compute the
     * "n-value" for Blum-Blum-Shub.
     *
     * @param bits Number of bits in prime
     * @param rand A source of randomness
     */
    private static BigInteger getPrime(int bits, Random rand) {
	BigInteger p;
	while (true) {
	    p = new BigInteger(bits, 100, rand);
	    if (p.mod(four).equals(three))
		break;
	}
	return p;
    }

    /**
     * This generates the "n value" -- the multiplication of two equally sized
     * random prime numbers -- for use in the Blum-Blum-Shub algorithm.
     *
     * @param bits
     *            The number of bits of security
     * @param rand
     *            A random instance to aid in generating primes
     * @return A BigInteger, the <i>n</i>.
     */
    public static BigInteger generateN(int bits, Random rand) {
	BigInteger p = getPrime(bits/2, rand);
	BigInteger q = getPrime(bits/2, rand);

	// make sure p != q (almost always true, but just in case, check)
	while (p.equals(q)) {
	    q = getPrime(bits, rand);
	}
	return p.multiply(q);
    }

    /**
     * Constructor, specifying bits for <i>n</i>
     *
     * @param bits number of bits
     */
    public BlumBlumShub(int bits) {
	this(bits, new Random());
    }

    /**
     * Constructor, generates prime and seed
     *
     * @param bits
     * @param rand
     */
    public BlumBlumShub(int bits, Random rand) {
	this(generateN(bits, rand));
    }

    /**
     * A constructor to specify the "n-value" to the Blum-Blum-Shub algorithm.
     * The inital seed is computed using Java's internal "true" random number
     * generator.
     *
     * @param n
     *            The n-value.
     */
    public BlumBlumShub(BigInteger n) {
	this(n, SecureRandom.getSeed(n.bitLength() / 8));
    }

    /**
     * A constructor to specify both the n-value and the seed to the
     * Blum-Blum-Shub algorithm.
     *
     * @param n
     *            The n-value using a BigInteger
     * @param seed
     *            The seed value using a byte[] array.
     */
    public BlumBlumShub(BigInteger n, byte[] seed) {
	this.n = n;
	setSeed(seed);
    }

    /**
     * Sets or resets the seed value and internal state
     *
     * @param seedBytes
     *            The new seed.
     */
    public void setSeed(byte[] seedBytes) {
	// ADD: use hardwired default for n
	BigInteger seed = new BigInteger(1, seedBytes);
	state = seed.mod(n);
    }

    /**
     * Returns up to numBit random bits
     *
     * @return int
     */
    public int next(int numBits) {
	// TODO: find out how many LSB one can extract per cycle.
	//   it is more than one.
	int result = 0;
	for (int i = numBits; i != 0; --i) {
	    state = state.modPow(two, n);
	    result = (result << 1) | (state.testBit(0) == true ? 1 : 0);
	}
	return result;
    }
    
    

    /**
     * A quickie test application for BlumBlumShub.
     */
    public static void main(String[] args) {
	// First use the internal, stock "true" random number
	// generator to get a "true random seed"
	SecureRandom r = new SecureRandom();
	System.out.println("Generating stock random seed");
	r.nextInt(); // need to do something for SR to be triggered.

	// Use this seed to generate a n-value for Blum-Blum-Shub
	// This value can be re-used if desired.
	System.out.println("Generating N");
	int bitsize = 512;
	BigInteger nval = BlumBlumShub.generateN(bitsize, r);

	// now get a seed
	byte[] seed = new byte[bitsize/8];
	r.nextBytes(seed);

	// now create an instance of BlumBlumShub
	BlumBlumShub bbs = new BlumBlumShub(nval, seed);

	// and do something
	System.out.println("Generating 16 bytes");
	for (int i = 0; i < 16; ++i) {
	    System.out.println(bbs.next(8));
	}

	// OR
	// do everything almost automatically
	BlumBlumShub bbs2 = new BlumBlumShub(bitsize /*,+ optional random instance */);

	// reuse a nval (it's ok to do this)
	BlumBlumShub bbs3 = new BlumBlumShub(nval);
    }
}
