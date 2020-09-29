programa
{
	
	funcao inicio()
	{
		inteiro anoNasci=0, idade = 0
		cadeia nomeUsuario
		caracter sexo
		escreva("Digite seu nome:")
		leia(nomeUsuario)
		escreva("Digite seu ano de nascimento:")
		leia(anoNasci)
		escreva("Digite M para Masculino ou F para Feminino")
		leia(sexo)
		idade = 2020 - anoNasci
		se( idade >= 60){
			se (sexo == 'M' ou sexo == 'm'){
				escreva("Oi ",nomeUsuario," Você é idoso")
				
			}
			senao {
				escreva("Oi ",nomeUsuario," Você é idosa")
				}
				se( idade >= 25 e idade <= 59){
			se (sexo == 'M' ou sexo == 'm'){
				escreva("Oi ",nomeUsuario," Você é Maduro")
				
			}
			senao {
				escreva("Oi ",nomeUsuario," Você é Madura")
				}
			}
					se( idade <= 24){
			se (sexo == 'M' ou sexo == 'm'){
				escreva("Oi ",nomeUsuario," Você é Jovem")
				
			}
			senao {
				escreva("Oi ",nomeUsuario," Você é Jovem")
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
 * @POSICAO-CURSOR = 53; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */