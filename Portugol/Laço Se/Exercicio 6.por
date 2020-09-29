programa
{
	
	funcao inicio()
	{
		inteiro idade
		escreva("Digite sua idade ")
		leia(idade)
		se (idade < 5){
			escreva("Sua idade é inferior a 5 você não possui uma categoria")
		}senao se(idade <= 7){
			escreva("Sua categoria é Infantil A você possui ",idade," anos")
		}senao se(idade <= 11){
			escreva("Sua categoria é Infantil B você possui ",idade," anos")
		}senao se(idade <= 13){
			escreva("Sua categoria é Juvenil A você possui ",idade," anos")
		}senao se(idade <= 17){
			escreva("Sua categoria é Juvenil B você possui ",idade," anos")
		}senao
			escreva("Sua categoria é Adulto você possui ",idade," anos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 338; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */