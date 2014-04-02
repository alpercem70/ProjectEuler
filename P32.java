import java.util.ArrayList;
import java.util.Collections;

public class P32 {
	public static void main(String[] args){
		
		long t1 = System.nanoTime();
		
		int product = 0;
		int sum = 0;
		ArrayList<String> numbers = new ArrayList<String>();
		for(int i = 1; i<=9; i++){
			numbers.add(Integer.toString(i));
		}
		
		ArrayList<String> tmp = new ArrayList<String>();
		for(int i=10; i<=99; i++){
			for(int j=100; j<=999; j++){
				product = i * j;
				int digits = String.valueOf(product).length();
				if(digits == 4)
				{
					tmp = new ArrayList<String>();
					tmp.add((Integer.toString(i)).substring(0,1));
					tmp.add((Integer.toString(i)).substring(1,2));
					tmp.add((Integer.toString(j)).substring(0,1));
					tmp.add((Integer.toString(j)).substring(1,2));
					tmp.add((Integer.toString(j)).substring(2,3));
					tmp.add((Integer.toString(product)).substring(0,1));
					tmp.add((Integer.toString(product)).substring(1,2));
					tmp.add((Integer.toString(product)).substring(2,3));
					tmp.add((Integer.toString(product)).substring(3,4));
					
					Boolean ok = true;
					Collections.sort(tmp);
					for(int k=0; k<9; k++){
						String n1 = tmp.get(k);
						String n2 = numbers.get(k); 
						if(!n1.equals(n2))
							ok = false;
					}
					if(ok){
						System.out.println("numbers are: " + i + " " + j + " " + " " + product +"\n");
						sum += product;
					}
				}
			}
		}
		
		for(int i =1; i<=9; i++){
			for(int j=1000; j<=9999; j++){
				product = i*j;
				int digits = String.valueOf(product).length();
				if(digits == 4)
				{
					tmp = new ArrayList<String>();
					tmp.add((Integer.toString(i)).substring(0,1));
					tmp.add((Integer.toString(j)).substring(0,1));
					tmp.add((Integer.toString(j)).substring(1,2));
					tmp.add((Integer.toString(j)).substring(2,3));
					tmp.add((Integer.toString(j)).substring(3,4));
					tmp.add((Integer.toString(product)).substring(0,1));
					tmp.add((Integer.toString(product)).substring(1,2));
					tmp.add((Integer.toString(product)).substring(2,3));
					tmp.add((Integer.toString(product)).substring(3,4));
					
					Boolean ok = true;
					Collections.sort(tmp);
					for(int k=0; k<9; k++){
						String n1 = tmp.get(k);
						String n2 = numbers.get(k); 
						if(!n1.equals(n2))
							ok = false;
					}
					if(ok){
						System.out.println("numbers are: " + i + " " + j + " " + " " + product +"\n");
						sum += product;
					}
				}
			}
		}
		
		System.out.println(sum);
		
		long t2 = System.nanoTime();
		System.out.println("Elapsed time: " + (t2-t1)/Math.pow(10, 9));
		
		//Answer is: 45228. I manually substracted same numbers.
		
	}
}
