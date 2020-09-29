programa
{
	
	funcao inicio()
	{	
		
		inteiro qtdAnos,qtdMeses,qtdDias,totalDias

		escreva("Aplicativo de conversão de Dias em Anos/Meses/total Dias:\n")
		escreva("Digite a quantidade de Dias:")
		leia(totalDias)
		qtdAnos = ((totalDias/30)/12)
		qtdMeses = (totalDias%12)

		qtdAnos = (totalDias/30)/12
		qtdMeses = (totalDias%365)/30
		qtdDias = (totalDias%365)%30
		
		escreva("\nA quantidade total de Anos é: ",qtdAnos)
		escreva("\nA quantidade total de Meses é: ",qtdMeses)
		escreva("\nA quantidade total de Dias é: ",qtdDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 531; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */