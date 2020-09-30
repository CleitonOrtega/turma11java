programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro x = 0,totalValores = 0,totalSomatorio = 0,mediaSoma = 0
		escreva("O programa só saira do loop caso você coloque um numero negativo!")
		Util.aguarde(6000)
		limpa()
		enquanto(x >= 0){
			limpa()
			escreva("Digite um numero: ")
			leia(x)
			se (x >= 0){
			totalSomatorio = totalSomatorio + x
			totalValores = totalValores + 1
			}
		}
		
		escreva("Você digitou um numero negativo.")
		escreva("\nVocê saiu do programa!")
		Util.aguarde(4500)
		limpa()
		mediaSoma = totalSomatorio/totalValores
		escreva("\nTotal do somatorio dos numeros = ",totalSomatorio)
		escreva("\nA media dos numeros foi = ",mediaSoma)
		escreva("\nTotal de valores lidos = ",totalValores)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 402; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */