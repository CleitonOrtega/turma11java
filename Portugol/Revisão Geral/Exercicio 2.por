programa
{
	inclua biblioteca Util

	funcao pulaLinha(){
		escreva("\n<-------------------->\n")
	}
	
	funcao inicio()
	{
		real peso = 0.0, altura = 0.0, resultado = 0.0
		escreva("Calculadora de IMC")
		Util.aguarde(3000)
		limpa()
		escreva("Digite o seu peso: ")
		leia(peso)
		pulaLinha()
		escreva("Digite sua altura: ")
		leia(altura)
		resultado = peso/(altura * altura)
		se(resultado < 18.5){
			escreva("Abaixo do peso")
		}senao se(resultado < 25){
			escreva("Você esta com peso normal")
		}senao se(resultado < 30){
			escreva("Você esta acima do peso")
		}senao{
			escreva("Você é obeso")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 602; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */