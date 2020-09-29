programa
{
	
	funcao inicio()
	{
		inteiro numero
		escreva("Digite um numero que direi se ele é\n Impar, Par ou Negativo ")
		leia(numero)
		se (numero < 0){
			escreva("Você digitou ",numero,", é um numero negativo")
		}senao se (numero == 0) {
			escreva("Você digitou 0, é um numero neutro")
		}senao se (numero%2 == 0){
			escreva("Você digitou ",numero,", é um numero Par! e positivo")
		}senao{
		escreva("Você digitou ",numero,", é um numero Impar! e positivo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */