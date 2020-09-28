programa
{
	
	funcao inicio()
	{
		real ,valorFabrica, valorImpostos
		escreva("Qual o valor do carro (custo de fabrica)?\n")
		leia(valorFabrica)
		valorFabrica = valorFabrica*1.28
		valorImpostos = (valorFabrica*1.28) + (valorFabrica*1.45)

		escreva("O valor final do carro para o consumidor é: ",valorImpostos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 319; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */