//�������[�h�Fjava �v�Z�@�ő�


 class ryuka {
        
    public static void main(String[] args){
        double ryuka = 0;
		double[] hai = new double[101];
		
		hai[0] = 2;
		
		hai[1] = 1;
		
		for (int i=2;i<=100;i++){
			hai[i] = hai[i-1] + hai[i-2];
			
			ryuka = ryuka + hai[i];
			System.out.println(ryuka);
		}
	}		
 
 }