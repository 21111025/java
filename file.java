import java.util.Ramdom;


 class file {
        
    public static void main(String args[])
	{
		Ramdom b = new Ramdom();
		int a =b.nextInt(101);
		System.out.print(a);
		
		try
		{
		    File file = new File("tensu.txt");
		    FileWriter fw = new FileWriter(file);
		    BufferedWriter bw = new BufferedWriter(fw);
		    PrintWriter pw = new PrintWriter(bw);
		    pw.println(a);
		    pw.close();
		}catch(Exception e)
		{
		    System.out.println(e.toString());
		
		}		
	}		
 
}