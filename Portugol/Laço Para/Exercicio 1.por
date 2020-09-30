programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro x
		real mediaSal = 0,mediaFilhos = 0,Salario,percentSal = 0,maiorSal = 0,filhos=0
		
		escreva("Programa de coleta de dados\n")
		Util.aguarde(5000)
		para( x = 1; x <= 20 ; x++){
			
			escreva("Digite seu Salario: ")
			leia(Salario)
			mediaSal = mediaSal + Salario
			se(maiorSal < Salario){
				maiorSal = Salario
			}
			se(Salario <= 100){
				percentSal = percentSal + 1	
			}
			escreva("Digite seu numero de filhos: ")
			leia(filhos)
			mediaFilhos = mediaFilhos + filhos
			limpa()
			
		}
		mediaSal = mediaSal/x
		mediaFilhos = mediaFilhos/x
		percentSal = (percentSal/x)*100
		
		escreva("\nA média de salario da população é: ",mediaSal)
		escreva("\nA média de filhos da população é: ",mediaFilhos)
		escreva("\nO maior salario é: ",maiorSal)
		escreva("\nO percentual de pessoas com salario até 100 reais é: ",percentSal, "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 239; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */