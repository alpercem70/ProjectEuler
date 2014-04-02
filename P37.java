
public class P37 {

	public static Boolean isPrime(int n){
	
		if(n<2)
			return false;
		if(n == 2)
			return true;

		for(int i =2; i<=(int)Math.sqrt(n)+1; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static int truncate(int n, String direction){
		String s = Integer.toString(n);
		int s_length = s.length();
		if(s_length == 1)
			return 0;
		
		if(direction == "l")
		{
			s = s.substring(1);
			return Integer.parseInt(s);
		}
		
		else if(direction == "r"){
			s = s.substring(0, s.length()-1);
			return Integer.parseInt(s);
		}
		
		return 0;
	}
	
	public static void main(String[] args){
		int count = 0;
		int sum = 0;
		Boolean notPrime = false;
		for(int i = 11; ; i+=2){
			notPrime = false;
			if(count == 11){
				System.out.println("Sum is "+ sum);
				System.exit(0);
			}
			if(isPrime(i))
			{	
				int tmp = i;
				while(tmp != 0 && !notPrime){
					tmp = truncate(tmp, "r");
					if(tmp == 0)
						break;
					if(!isPrime(tmp))
						notPrime = true;
				}
				
				tmp = i;
				while(tmp != 0 && !notPrime){
					tmp = truncate(tmp, "l");
					if(tmp == 0)
						break;
					if(!isPrime(tmp))
						notPrime = true;
				}
				
				if(!notPrime){
					System.out.println(i);
					count++;
					sum += i;
				}
			}
		}
	}
}
