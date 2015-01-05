import java.util.Random;
import java.io.*;
 class sum{
        
    public static void main(String args[]){
		
		try
		{
		    File file = new File("tensu.csv");
		    FileReader fr = new FileReader(file);
		    BufferedReader br = new BufferedReader(fr);
			
			String datas = br.readLine();
			
			
			String[] str1Ary = datas.split(",");
            int [] idatas=new int[str1Ary.length];	
			int  num = 0;
			for (int i=0; i<str1Ary.length; i++)
			{
             idatas[i]=Integer.valueOf(str1Ary[i]).intValue();
			
			num = num + idatas[i];
			}
			System.out.println(num);
		    
			
		    
			
		    br.close();
		}
		catch(Exception e)
		{
		    System.out.println(e.toString());
		
		}		
	}		
 
}