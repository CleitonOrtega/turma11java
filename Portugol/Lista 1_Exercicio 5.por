programa
{
	
	funcao inicio()
	{
		real numero1, numero2, numero3, notaFinal
		escreva("Escreva a primeira nota: ")
		leia(numero1)
		escreva("Escreva a segunda nota: ")
		leia(numero2)
		escreva("Escreva a terceira nota: ")
		leia(numero3)
		numero1 = numero1 * 2
		numero2 = numero2 * 3
		numero3 = numero3 * 5
		notaFinal = (numero1 + numero2 + numero3)/3
		escreva("A nota final é: ",notaFinal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */