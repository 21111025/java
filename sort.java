import java.util.Random;  
import java.io.*;  

class sort{  
	public static void main(String args[])  {  
		
		try{  
			File file = new File("tensu.csv");  
			FileReader fr = new FileReader(file);  
			BufferedReader br = new BufferedReader(fr);  
			String datas = br.readLine();  
			String[] str1Ary = datas.split(",");  
			int [] idatas=new int[str1Ary.length];  
			for (int i=0; i<str1Ary.length; i++) {
				
				idatas[i]=Integer.valueOf(str1Ary[i]).intValue(); 
				System.out.println(str1Ary[i]);  
				
             } 
			
			br.close();  
			
			for(int i=0; i < idatas.length-1 ; i++){
			
				for(int j = i+1; j < idatas.length ; j++){
					
					if(idatas[i]>idatas[j]){
						int num = idatas[i];
						idatas[i] = idatas[j];
						idatas[j] = num;
					}
					
				}
			
				
			}
			for(int i = 0; i < idatas.length; i++){
			
			System.out.println("ƒ\[ƒgŒã"+idatas[i]);
			}
	
		} catch(Exception e)  {  
			System.out.println(e.toString());  
		}  
	}  
}  
