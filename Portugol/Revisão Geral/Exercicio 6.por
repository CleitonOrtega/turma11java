programa
{
	funcao pula(){
		escreva("\n")
	}
	
	funcao inicio()
	{
		const inteiro LIMITE = 3
		inteiro vetor[LIMITE],vetor2[LIMITE],matriz[LIMITE][LIMITE],x,y,valor = 0
		
		para(x = 0;x < LIMITE;x++){
				limpa()
				escreva("Digite o ",x + 1,"° Valor do Vetor: ")
				leia(valor)
				vetor[x]= valor
			}
			para(x = 0;x < LIMITE;x++){
				para(y = 0;y < LIMITE;y++){
				limpa()
				escreva("Digite o Valor da ",x + 1,"° coluna da ",y + 1,"° Linha da Matriz: ")
				leia(valor)
				matriz[x][y]= valor
			}
			}
			para(x = 0;x < 2;x++){
				para(y = 0;y < 2;y++){
				matriz[x][y] = vetor[x] * matriz[x][y]
					
				
			}
			}
			para(x = 0;x < 2;x++){
				para(y = 0;y < 2;y++){
				pula()
				escreva(matriz[x][y])
			}
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 680; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */