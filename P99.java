import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class P99 {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new FileReader("C:\\base_exp.txt"));
			
			String cl;
			int base = 0;
			int exp = 0;
			int lineNumber = 0;
			int count = 0;
			double max = 0;
			while( (cl= br.readLine()) != null){
				base = Integer.parseInt(cl.split(",")[0]);
				exp = Integer.parseInt(cl.split(",")[1]);
				
				//Instead of calculating exponentials, we can take logarithms.
				// log(a^b) = b*log(a)
				double result = exp * Math.log10(base);
				if(max == 0){
					max = result;
					lineNumber = 0;
				}
				else{
					if(result > max){
						max = result;
						lineNumber = count;
					}
				}
					
				count++;
			}		
			System.out.println("Line Number is: " + (lineNumber+1));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
