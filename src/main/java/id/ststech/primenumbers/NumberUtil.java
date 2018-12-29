package id.ststech.primenumbers;

public class NumberUtil {

	public static boolean isPrime(int number) {
		
		if( number == 0 || number == 1) return false;
		
		if( number != 2 && number % 2 == 0) return false;
		if( number != 3 && number % 3 == 0) return false;
		
		boolean isPrime = true;

		// Loop dimulai dari > 1 sampai < number
		for ( int i = 2; i < number; i++ ) {
		    if ( number % i == 0 ) {
		 		isPrime = false; // jika ketemu yang sisa bagi 0, artinya bukan prima
		        break; // langsung keluar dari for-loop, tidak perlu dilanjutkan kembali
		    }
		}

		return isPrime;
	}
	
	public static int fibonnaci ( int n ) {
		if ( n == 0 || n == 1) return n;
		
		int a = 0;
		int b = 1;
		int c = a + b;
		
		for (int i = 2; i<= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

}
