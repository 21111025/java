 class fibo {
    public static void main(String[] args){
       
		
		//�z��̒�`
		int [] hai = new int[11];
		//0���ڂ̏�����
		hai[0] = 0;
		//1���ڂ̏�����
		hai[1] = 1;
		//2�`10���̌v�Z
		//2�`10�܂ł̃��[�v��for����
		for (int i=2;i<=10;i++){
		     hai[i] = hai[i-1] + hai[i-2];
		}
		
		//1�`10���܂ł�\��
        for (int i=1;i<=10;i++){
		     System.out.println(hai[i]);
		}
		
		
       
		
		
		//int n = Integer.parseInt(args[0]);
        //int f = 1;
        //int g = 1;
        //int h = 0;
		//����1�̃q���g
		 //F[n] = F[n-1] + F[n-2]
		 //��`
		 //F[0]=0
		 //F[1]=1
		 //F[n]=F[n-1] + F[n-2]
		 //n>=2
		 //�v�Z���̗�
		 //�~F[0] = 0
		 //�~F[1] = 1
		 //�@F[2] = F[1] + F[0]
		 //�@F[3] = F[2] + F[1]
		 //�@F[n] = F[n-1] + F[n-2]
        
        
    }

}
