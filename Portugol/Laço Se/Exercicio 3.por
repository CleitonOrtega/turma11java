programa
{
	inclua biblioteca Matematica --> mat

	funcao pulaLinha(){
		escreva("\n***************\n")
	}
	
	funcao inicio()
	{
		inteiro n1,n2,n3,n4
		pulaLinha()
		escreva("Digite o Primeiro numero ")
		leia(n1)
		pulaLinha()
		escreva("Digite o Segundo numero ")
		leia(n2)
		pulaLinha()
		escreva("Digite o Terceiro numero ")
		leia(n3)
		pulaLinha()
		escreva("Digite o Quarto numero ")
		leia(n4)
		n1 = mat.potencia(n1,2)
		n2 = mat.potencia(n2,2)
		n3 = mat.potencia(n3,2)
		n4 = mat.potencia(n4,2)
		se(n3 >=1000){
			pulaLinha()
			escreva("O valor do terceiro quadrado foi: ",n3)
			pulaLinha()
		}senao{
			pulaLinha()
			escreva("O valor do Primeiro quadrado foi: ",n1)
			pulaLinha()
			escreva("O valor do Segundo quadrado foi: ",n2)
			pulaLinha()
			escreva("O valor do Terceiro quadrado foi: ",n3)
			pulaLinha()
			escreva("O valor do Quarto quadrado foi: ",n4)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 831; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */