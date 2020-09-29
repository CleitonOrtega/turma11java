programa
{
	
	funcao inicio()
	{
		real altura, area = 0,base 
		escreva("Para calcular a area do triangulo\nDigite a base: ")
		leia(base)
		escreva("Agora digite a altura: ")
		leia(altura)
		area = (base*altura)/2
		se(base <= 0 ou altura <= 0){
			escreva("Base ou Altura menores ou iguais a 0")
			escreva("\nNão sera possivel calcular a area")
		}senao {
			escreva("A area do triangulo é: ",area)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 123; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */