/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpkripto;


/**
 *
 * @author Arie A.S
 */
public interface RandomGenerator {

    /**
     * Returns N random bits
     *
     * See also java.util.Random#next
     * @param numBits
     * @return and int with the LSB being random
     */
    public int next(int numBits);

}