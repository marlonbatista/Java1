//(opcional)	Imprima	os	primeiros	n�meros	da	s�rie	de	Fibonacci	at�	passar	de	100.
//A	s�rie	de Fibonacci	�	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc...	
//Para	calcul�-la,	o	primeiro	elemento	vale	0,	o segundo	vale	1,	da�	por	diante,
//o	n-�simo	elemento	vale	o	(n-1)-�simo	elemento	somado	ao	(n-2)�simo	elemento	(ex:	8	=	5	+	3).

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 1;
		int fibo = 0;

		System.out.println("Serie de Fibonacci");
		System.out.print("0,1,");
		while (fibo < 100) {
			fibo = n1 + n2;
			System.out.print(fibo + ",");
			n1 = n2;
			n2 = fibo;
		}

	}

}
