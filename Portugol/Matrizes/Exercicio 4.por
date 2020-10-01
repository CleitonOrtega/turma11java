programa
{
	funcao pulaLinha(){
		escreva("\n<---------------------------->\n")
	}
	
	funcao inicio()
	{
		const inteiro LINHA = 2,COLUNA = 2
		inteiro matriz[3][3], vetor [3],x,y,z,somaValores = 0, somaTotal = 0
		para(x =0;x <= COLUNA;x++){
			limpa()
			para(y =0;y <= LINHA;y++){
				
				pulaLinha()
				escreva("Digite o um valor que sera atribuido na matriz")
				pulaLinha()
				escreva("De coluna ", x + 1 ," e Linha ", y + 1 ," :")
				leia(matriz[x][y])	
				somaTotal = somaTotal + matriz[x][y]	
		}
		para(z = 0; z <= 2; z++){
			escreva("\nOs numeros em diagonais são: ",matriz[z][z])
		}
		pulaLinha()
		escreva("A soma total de todas matrizes é: ",somaTotal)
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */