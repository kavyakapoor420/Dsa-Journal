import java.util.Scanner ;
import java.util.Math ;

class CheckPrimeNumber{
    public static void main(String[] args){
        System.out.println("enter value of n");
        Scanner sc=new Scanner(System.in) ;
        int n=sc.nextInt() ;

        boolean isPrime=true ;  //assume at start my number is prime
        
        if(n==2){ 
            System.out.print('n is prime');
        }else{
            for(int i=2;i<=n-1;i++){
                if(n%i==0){ // n is a multiple of i (i is not equal to 1 or n)
                    isPrime=false ;
                }
            }
            if(isPrime==true){
                System.out.print("n is prime number") ;
            }else{
                System.out.print(" n is not a prime") ;
            }
        }

        //optimise it run loop from 2 to sqrt of number 
        // for(int i=2;i<=Math.sqrt(n);i++){
        //     if(n%i==0) isPrime=false ;
        // }
  }
}