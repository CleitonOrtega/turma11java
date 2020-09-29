programa
{
	funcao inicio()
	{	
		
		inteiro qtdHoras=0,qtdMinutos=0,qtdSegundos, tempoDuracao

		escreva("Aplicativo de conversão de tempo para segundos:\n")
		escreva("Digite a quantidade de Segundos:")
		leia(tempoDuracao)
		qtdHoras = tempoDuracao/3600
		qtdMinutos = (tempoDuracao%3600)/60
		qtdSegundos = (tempoDuracao%3600)%60
		escreva("\nA quantidade total de Horas é: ",qtdHoras)
		escreva("\nA quantidade total de Minutos é: ",qtdMinutos)
		escreva("\nA quantidade total de Segundos é: ",qtdSegundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 331; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */