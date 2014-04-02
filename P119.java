import java.util.ArrayList;
import java.util.Collections;

public class P119 {
	public static void main(String[] args){
		
		//Rather than calculating power of sums and check whether they are equal of power of sum of digit.
		//We can work with the other way and check if equivalence of any power of a number is equal to power of the sum of digits. 
		int count = 1;
		ArrayList<Long> resultList = new ArrayList<Long>();
		
		for(long i = 4; i<100; i++){
			for(long j=1; j<10; j++){
				long result = (long)Math.pow(i, j);
				if(String.valueOf(result).length() > 1)
					if(i == sumOfDigits(result)){
						resultList.add(result);
					}
			}
		}
		
		Collections.sort(resultList);
		for(Long l: resultList){
			System.out.println("Number " + count + " is: " + l);
			count++;
		}
	}
	
	public static int sumOfDigits(long n){
		int sum = 0;
		while(n != 0){
			sum += n % 10;
			n = n/10;
		}
		return sum;
	}
}
