programa
{
	
	funcao inicio()
	{
		inteiro numEscolha, x = 0, result = 0
		escreva("Digite um numero do seu teclado\n")
		escreva("E irei calcular todos os numeros\n")
		escreva("Até ele como no exemplo: 1+2+3+4+5+6+7=28.\nVocê escolheu: ")
		leia(numEscolha)
		faca{
			x = x + 1
			result = result + x
		}enquanto(x < numEscolha)
		escreva("O resultado final foi: ",result )
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */