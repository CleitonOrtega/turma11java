programa
{
	
	funcao inicio()
	{
		inteiro maiorNota = 0, nota[4],ordemNotas[4],temp
		cadeia Aluno[4], tempNome
		para(inteiro x = 0; x <= 3; x++){
			escreva("Digite seu nome: ")
			leia(Aluno[x])
			escreva("Digite sua nota: ")
			leia(nota[x])
			//limpa()
			se(nota[x] > maiorNota){
				maiorNota = nota[x]	
			}
		}
		para (inteiro y = 0; y <= 3; y++) {
			para(inteiro x = 0;x < 3 ; x++){
				se(nota[x] < nota[x+1]){
					temp = nota[x]
					nota[x] = nota[x+1]
					nota[x+1] = temp
					
					tempNome = Aluno[x]
					Aluno[x] = Aluno[x+1]
					Aluno[x+1] = tempNome
				}
			}	
		}
		
		
		para(inteiro x = 0; x <= 3; x++){
			
			escreva("\nO nome é: ",Aluno[x])
			escreva(", e sua nota foi: ",nota[x])
			se(nota[x] == maiorNota){
				escreva("*")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 776; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */