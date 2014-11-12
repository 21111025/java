 class fibo {
    public static void main(String[] args){
       
		
		//配列の定義
		int [] hai = new int[11];
		//0項目の初期化
		hai[0] = 0;
		//1項目の初期化
		hai[1] = 1;
		//2～10項の計算
		//2～10までのループをfor文で
		for (int i=2;i<=10;i++){
		     hai[i] = hai[i-1] + hai[i-2];
		}
		
		//1～10項までを表示
        for (int i=1;i<=10;i++){
		     System.out.println(hai[i]);
		}
		
		
       
		
		
		//int n = Integer.parseInt(args[0]);
        //int f = 1;
        //int g = 1;
        //int h = 0;
		//その1のヒント
		 //F[n] = F[n-1] + F[n-2]
		 //定義
		 //F[0]=0
		 //F[1]=1
		 //F[n]=F[n-1] + F[n-2]
		 //n>=2
		 //計算式の例
		 //×F[0] = 0
		 //×F[1] = 1
		 //　F[2] = F[1] + F[0]
		 //　F[3] = F[2] + F[1]
		 //　F[n] = F[n-1] + F[n-2]
        
        
    }

}
