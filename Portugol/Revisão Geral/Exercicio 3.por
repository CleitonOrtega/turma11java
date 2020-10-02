programa
{
	inclua biblioteca Util

	funcao pulaLinha(){
		escreva("\n<-------------------->\n")
	}
	
	funcao inicio()
	{
		inteiro num = 0,num1 = 0,num2 = 0,num3=0,num4 = 0
		escreva("Digite algum numero entre 0 e 100!")
		//Util.aguarde(4500)
		limpa()
		enquanto (num >= 0 e num <= 100){
			limpa()
			pulaLinha()
			escreva("Digite um numero: ")
			leia(num)
			escreva("Você digitou ",num)
			se (num >= 0 e num <= 25){
				num1 = num1 + 1
			}senao se (num >= 26 e num <= 50){
				num2 = num2+1
			}senao se (num >= 51 e num <= 75){
				num3 = num3 + 1
			}senao se (num >= 76 e num <= 100){
				num4 = num4 + 1
			}senao{
				pulaLinha()
				escreva("Você saiu do programa pois digitou um valor invalido!")
				pulaLinha()
				escreva("O total de numero entre 0 e 25 é: ",num1)
				pulaLinha()
				escreva("O total de numero entre 26 e 50 é: ",num2)
				pulaLinha()
				escreva("O total de numero entre 51 e 75 é: ",num3)
				pulaLinha()
				escreva("O total de numero entre 76 e 100 é: ",num4)
			}
}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1012; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */