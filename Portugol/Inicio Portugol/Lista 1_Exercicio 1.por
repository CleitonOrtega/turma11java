programa
{
	
	funcao inicio()
	{	
		
		inteiro qtdAnos,qtdMeses,qtdDias,totalDias

		escreva("Aplicativo de conversão de anos/meses/dias em dias\n:")
		escreva("Digite a quantidade de Anos:")
		leia(qtdAnos)
		escreva("\nDigite a quantidade de Meses:")
		leia(qtdMeses)
		escreva("\nDigite a quantidade de Dias:")
		leia(qtdDias)
		totalDias = ((qtdAnos*12)*30) + (qtdMeses*30) + qtdDias
		escreva("\nA quantidade de Anos é: ",qtdAnos)
		escreva("\nA quantidade de Meses é: ",qtdMeses)
		escreva("\nA quantidade de Dias é: ",qtdDias)
		escreva("\nConvertendo tudo para dias da um total de: ",totalDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */