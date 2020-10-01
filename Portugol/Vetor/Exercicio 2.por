programa
{
	inclua biblioteca Util
	funcao pulaLinha(){
		escreva("\n<---------------------------->\n")
	}
	funcao inicio()
	{
		const inteiro LIMITE = 10
		inteiro valoresDado[10], x = 0,maiorPontuacao = 0,
		maiorValor=0,qtdMaiorValor = 0
		real mediaAritmetica = 0.0
		escreva("Sorteio de dados repetido 10X!")
		para (x = 0 ; x < LIMITE; x++) {
			valoresDado[x] = Util.sorteia(1, 6)
			mediaAritmetica = mediaAritmetica + valoresDado[x]
			se(maiorValor < valoresDado[x]){
			maiorValor = valoresDado[x]
			}
			pulaLinha()
			escreva(valoresDado[x])
			pulaLinha()
		}
		mediaAritmetica = (mediaAritmetica/LIMITE)
		para (x = 0 ; x < LIMITE; x++) {
			se(valoresDado[x] == maiorValor){
			qtdMaiorValor = qtdMaiorValor + 1	
		}
		}
		pulaLinha()
		escreva("A media aritmética dos 10 numeros do dado foi: ",mediaAritmetica)
		pulaLinha()
		escreva("O maior valor foi: ",maiorValor)
		pulaLinha()
		escreva("Ele apareceu, ",qtdMaiorValor," vezes!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 34; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */