programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro multiplos = 3,x = 1, totalImpares=0
		escreva("Programa de calculo de multiplos de 3 e impares!")
		para(x = 0;x <= 500; x = x + 1){
			se(x % 3 == 0 e x % 2==1){
				totalImpares = totalImpares + x
			}
		}
		escreva("\nO numero somatorio dos multiplos de 3 impares é: ",totalImpares)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */