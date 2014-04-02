
public class P145 {

	public static void main(String[] args){
		
		long t1 = System.nanoTime();
		
		int count = 0;
		int limit = 1000000000;
		for(int i=0; i<limit; i+=2)
			if(isReversible(i))
				count+=2;
		System.out.println("There are " + count + " numbers");
		
		long t2 = System.nanoTime();
		System.out.println("Elapsed time: " + (t2-t1)/Math.pow(10,9));
	}
	
	public static Boolean isReversible(int n){
		
		//If ends with 0, return false
		if(n%10 == 0)
			return false;
		
		//Reverse the number
		String s = Integer.toString(n);
		s = new StringBuilder(s).reverse().toString();
		int sum = Integer.parseInt(s);
		
		//Sum
		sum = n + sum;

		//Check if it the product is odd
		while(sum > 0){
			if((sum % 10)% 2 == 0)
				return false;
			sum = sum / 10;

		}
		return true;
	}
}
