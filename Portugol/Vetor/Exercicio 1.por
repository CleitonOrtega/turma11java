programa
{
	funcao pulaLinha(){
		escreva("\n<---------------------------->\n")
	}
	
	funcao inicio()
	{
		const inteiro LIMITE = 4
		inteiro pontuacao[5], x = 0,maiorPontuacao = 0
		para(x = 0; x <= LIMITE; x++){
			escreva("Digite sua pontuação: ")
			leia(pontuacao[x])
			limpa()
			se(maiorPontuacao < pontuacao[x]){
				maiorPontuacao = pontuacao[x]
			}
		}
		para(x = 0; x <= LIMITE; x++){
			pulaLinha()
			escreva("A pontuação do vetor: ", pontuacao[x]," é: ",pontuacao[x])			
		}
		pulaLinha()
		escreva("A maior pontuação é: ",maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 342; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */