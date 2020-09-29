programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real nivelPoluicao
		escreva("Digite o nivel de poluição \nSendo algo entre 0.0 e 0.5: ")
		leia(nivelPoluicao)
		se (nivelPoluicao <= 0.2){
			escreva("\nTudo normal Empresas podem trabalhar!")
		}senao se (nivelPoluicao == 0.3){
			escreva("\nIndustrias do 1° grupo parem de trabalhar imediatamente!")
		}senao se (nivelPoluicao == 0.4){
			escreva("\nIndustrias do 1° e 2° grupo parem de trabalhar imediatamente!")
		}senao {
			escreva("\nTodas industrias devem parar de trabalhar imediatamente!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */