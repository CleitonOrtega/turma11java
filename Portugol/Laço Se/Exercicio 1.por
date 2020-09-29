programa
{
	
	funcao inicio()
	{
		inteiro p = 0,E = 0,m=0
		escreva("Digite a quantidade de kilos de tomate: ")
		leia(p)
		E = p - 50
		m = E * 4
		se(p > 50){
			escreva("Você passou ",E,"KG do limite do estado (50KG)\n")
			escreva("Devera pagar uma multa de 4 reais por KG passado\n")
			escreva("Você passou ",E,"KG devera pagar R$",m)	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */