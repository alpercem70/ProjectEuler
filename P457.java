import java.io.BufferedReader;
import java.io.FileReader;


public class P457 {
	public static void main(String[] args){
		int L_VAL = 2;
		try{
			long sum = 0;
			BufferedReader br = new BufferedReader(new FileReader("C:\\primes.txt"));
			String cl;
			
			while( (cl= br.readLine()) != null){
				long prime = Integer.parseInt((cl.split(",")[1]).substring(1));
				if(prime > L_VAL)
					break;
				else{
					long rp = 0;
					for(long i = 0; i<Long.MAX_VALUE; i++){
						rp = RP(i, prime);
					}
					sum += rp;
				}
			}
			
			System.out.println(sum);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static long fn(long n){
		return (n*n - 3*n - 1);
	}
	
	public static long RP(long n, long p){
		if(fn(n) % (p*p) == 0)
			return n;
		else
			return 0;
	}
}
