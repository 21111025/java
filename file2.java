import java.util.Random;
import java.io.*;


 class file2 {
        
    public static void main(String args[])
	{
	
		
		Random b = new Random();
		
		
		
		try
		{
		    File file = new File("tensu.csv");
		    FileWriter fw = new FileWriter(file);
		    BufferedWriter bw = new BufferedWriter(fw);
		    PrintWriter pw = new PrintWriter(bw);
			
			
			for (int i=1; i<=100; i++){
			     int a =b.nextInt(101);
				 pw.print(a+",");
		         }
		    
			
		    
			
		    pw.close();
		}catch(Exception e)
		{
		    System.out.println(e.toString());
		
		}		
	}		
 
}