programa
{
	
	funcao inicio()
	{
		inteiro num, x=1, result = 0
		escreva("Digite um numero e irei multiplica-lo\nPor 3 até ser maior que 100!\n")
		leia(num)
		limpa()
		enquanto(result <= 100){
			result = result + (num * 3)
			escreva("\nO resultado é: ",result)
			result = result + (num * 3)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */