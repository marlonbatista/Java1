/*Escreva	um	programa	que,	dada	uma	vari�vel		x		com	algum	valor	inteiro,	temos	um novo		x		de	acordo	com	a	seguinte	regra:
se		x		�	par,		x	=	x	/	2	se		x		�	impar,		x	=	3	*	x	+	1	imprime		x	
O	programa	deve	parar	quando		x		tiver	o	valor	final	de	1.	Por	exemplo,	para		x	=	13	,	a	sa�da ser�:
40	->	20	->	10	->	5	->	16	->	8	->	4	->	2	->	1
IMPRIMINDO	SEM	PULAR	LINHA
Um	detalhe	importante	�	que	uma	quebra	de	linha	�	impressa	toda	vez	que	chamamos	println	.	Para	n�o	pular	uma	linha,	usamos	o	c�digo	a	seguir:
												System.out.print(variavel);*/

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =50;
		while(x!=1) {
			if(x%2==0) {
				x/=2;
			}
			else {
				x=3*x+1;
			}
			System.out.print(x+"->");
		}
	}

}
