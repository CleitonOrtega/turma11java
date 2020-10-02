programa
{
	funcao pulaLinha(){
		escreva("\n<---------------------------->\n")
	}
	funcao inicio()
	{
		const inteiro COLUNA = 4, LINHA = 6
		inteiro matrizN1[COLUNA][LINHA],
		matrizN2[COLUNA][LINHA],matrizM1[COLUNA][LINHA],matrizM2[COLUNA][LINHA],
		x=0,y=0,z = 1,a = 1
		enquanto (z <= 2){
		para(x = 0;x < 1;x++){
			limpa()
			para(y =0;y < LINHA;y++){
				
				pulaLinha()
				escreva("Digite o um valor que sera atribuido na matriz N",z)
				pulaLinha()
				escreva("De coluna ", x + 1 ," e Linha ", y + 1 ," :")
				se(z == 1){
				leia(matrizN1[x][y])
				}senao{
					leia(matrizN2[x][y])		
					para(a = 1; a <= LINHA; a++){
						matrizM1[x][y] = matrizN1[x][y] + matrizN2[x][y]
						matrizM2[x][y] = matrizN1[x][y] - matrizN2[x][y]
		}
				}
				
		}
		}
		z = z + 1
	}
		para(x = 0;x < 1;x++){
			limpa()
			para(y =0;y < LINHA;y++){
				pulaLinha()
				escreva("O valor da matriz M1 é: ",matrizM1[x][y])
				pulaLinha()
				escreva("O valor da matriz M2 é: ",matrizM2[x][y])
				pulaLinha()
				pulaLinha()
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1032; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */