
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Imprima os fatoriais de 1 a 10.
		O fatorial de um n�mero n � n * (n-1) * (n-2) * ... * 1. Lembre-se de utilizar os par�nteses.
		O fatorial de 0 � 1
		O fatorial de 1 � (0!) * 1 = 1
		O fatorial de 2 � (1!) * 2 = 2
		O fatorial de 3 � (2!) * 3 = 6
		O fatorial de 4 � (3!) * 4 = 24*/
		int fat=1;
		
		
		
		for(int i=1;i<11;i++)
		{	
			
				fat*=i;
			
			System.out.println("O fatorial de "+i+" e "+fat);
		}
		
		
		/*for(long n = 1, fatorial = 1; n <= 10; n++){
            while(n <= 2){
                fatorial = n * (n-1);
                System.out.println("O Fatorial de " + n + " = " + fatorial); 
                n = n + 1;}
            fatorial = n * (n-1) * (n-2);
            System.out.println("O Fatorial de " + n + " = " + fatorial);
        }*/
	}

}
