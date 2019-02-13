//(opcional)	Imprima	os	primeiros	números	da	série	de	Fibonacci	até	passar	de	100.
//A	série	de Fibonacci	é	a	seguinte:	0,	1,	1,	2,	3,	5,	8,	13,	21,	etc...	
//Para	calculá-la,	o	primeiro	elemento	vale	0,	o segundo	vale	1,	daí	por	diante,
//o	n-ésimo	elemento	vale	o	(n-1)-ésimo	elemento	somado	ao	(n-2)ésimo	elemento	(ex:	8	=	5	+	3).

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
