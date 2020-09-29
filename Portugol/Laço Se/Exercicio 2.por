programa
{
	funcao pulaLinha(){
		escreva("\n**********\n")
	}
	
	funcao inicio()
	{
		inteiro C,N,E = 0
		pulaLinha()
		escreva("Digite o seu código de Identificação ")
		leia(C)
		pulaLinha()
		escreva("Numero de horas trabalhadas: ")
		leia(N)
		pulaLinha()
		se (N >= 51){
			E = (N - 50) * 20
		}
		escreva("O numero de horas trabalhadas foram: ",N)
		pulaLinha()
		escreva("O salario total é: R$",(E + 500))
		pulaLinha()
		escreva("O salaraio excedente é: R$", E)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 62; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */