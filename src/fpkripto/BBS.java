/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpkripto;


 public class BBS {
   private long p, q, M, seed, actual;
   
   public BBS(long p, long q, long seed) {
       this.p = p;
       this.q = q;
       this.M = p*q;
       this.seed = seed;
       this.actual = seed;
   }
 
   public long getrandom() {
 
       long r = actual*actual%M;
       actual = r;
       return r;
   }
 
   private long gcd(long a, long b) {
 
       if(b == 0) return a;
       return gcd(b, a%b);
 
   }
 
   public long getirandom(int i) {
       long g = gcd(p, q);
       long l = (p-1)*(q-1)/g;
 
       long exp = 1;
       for(long j = 1; j <= i; ++j) exp = exp*2%l;
 
       long x0 = seed*seed;
       long r = x0;
       for(long j = 2; j<=exp; ++j ) {
           r = r*x0%M;
       }
       return r;
   }
   
   public static void main(String[] args) {
        long p = 13231090003l;
        long q = 1853105600379l;
        long seed = 123457;

        BBS b = new BBS(p,q,seed);

        for(int i = 0; i < 16; ++i) {
            System.out.println(b.getrandom());

        }
    }
 }

  
   
       
   
   


