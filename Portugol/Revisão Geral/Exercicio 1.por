programa
{
	inclua biblioteca Matematica --> mat
	funcao divLinha(){
		para(inteiro a = 0; a < 50; a++){
			escreva("=")
		}
	}
	
	funcao pula(){
		escreva("\n")
	}
	
	funcao inicio()
	{	const inteiro LIMITE = 4
		cadeia etiqueta[] = {"tenis","blusa","boné","bermuda"}
		inteiro formaPag,x 
		real precoEtiq[] = {200.00,100.00,50.00,75.00},totalPag = 0

		para (x = 0; x<LIMITE;x++)
		{
			escreva("Codigo produto ",x+1," ",etiqueta[x],"  R$ ",precoEtiq[x])
			pula()
		}
		escreva("Qual produto você gostaria de comprar?\n")
		leia(x)
		x = x-1
		divLinha()
		pula()
		escreva("Digite a forma de pagamento sendo: ")
		pula()
		escreva("1-A vista em dinheiro(Recebe 20% de desconto)\n")
		escreva("2-A vista no cartão(Recebe 15% de desconto)\n")
		escreva("3-Em duas vezes(Não recebe desconto)\n")
		escreva("4-Em três vezes(Recebe Juros de 10%)\n")
		leia(formaPag)
		enquanto(formaPag != 1 e formaPag != 2 e formaPag != 3 e formaPag != 4){
			limpa()
			escreva("Desculpe forma de pagamento invalido tente novamente!")
			leia(formaPag)
		}
		se(formaPag == 1){
			totalPag = precoEtiq[x] - (precoEtiq[x]*0.20)
		}senao se(formaPag == 2){
			totalPag = precoEtiq[x] - (precoEtiq[x]*0.15)
		}senao se(formaPag == 4){
			totalPag = precoEtiq[x]*1.10
		}senao{
			totalPag = precoEtiq[x]
		}
		limpa()
		escreva("O total da compra foi: ",mat.arredondar(totalPag, 2),"\nA forma de pagamento foi: ",formaPag)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */