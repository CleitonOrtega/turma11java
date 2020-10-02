programa
{
	inclua biblioteca Util 

	funcao delay(){
		Util.aguarde(3500)
	}

	funcao pula(){
		escreva("\n")
	}
	
	funcao inicio()
	{
		const inteiro LIMITE = 4
		inteiro codigo = 1,x,saida = 0
		real vetor[5], valor = 0.0
		escreva("Para sair do programa digite 0!")
		delay()
		
		enquanto (codigo == 1 ou codigo == 2){
			para(x = 0;x <= LIMITE;x++){
				limpa()
				escreva("Digite o ",x + 1,"° Valor real: ")
				leia(valor)
				vetor[x]= valor
			}
			limpa()
			escreva("Digite um código inteiro entre 0 e 2: ")
			leia(codigo)
					
			se(codigo < 0 ou codigo > 2){
				enquanto (codigo < 0 ou codigo > 2){
					limpa()
					escreva("Código inválido tente novamente!")
					pula()
					escreva("Códigos Validos: 0 - Sair")
					pula()
					escreva("Códigos Validos: 1 - Mostrar vetor")
					pula()
					escreva("Códigos Validos: 2 - Mostrar vetor inverso")
					pula()
					leia(codigo)
				}
			}
			se (codigo == 1){
				para (x = 0; x <= LIMITE;x++){
				pula()
				escreva("O vetor é: ",vetor[x])
				}
			}senao se(codigo == 2){
				para (x = LIMITE; x >= 0;x--){
				pula()
				escreva("O vetor é: ",vetor[x])
				}
			}
			pula()
			se(codigo == 1 ou codigo == 2){
			escreva("Deseja continuar? 1 para Sim 2 para Não: ")
			leia(saida)
			se(saida == 2){
				codigo = 0
			
			}
		}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 730; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */