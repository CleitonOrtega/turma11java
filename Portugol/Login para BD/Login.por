programa
{

	funcao pulaLinha(){
		
		escreva("\n*************************************\n")
		}
	
	funcao inicio()
	{
		cadeia nomeUsuario, senhaUsuario, nomeCadastrado,senhaCastrada
		inteiro numeroOpcao =0

		pulaLinha()
		escreva("Sistema de Login para Bancos de Dados")
		pulaLinha()
		escreva("Digite o seu nome de usuario:")
		leia(nomeUsuario)
		limpa()
		
		 enquanto(numeroOpcao != 3)
		{
			se(nomeUsuario == nomeCadastrado)
				escreva("Digite sua senha:")
				leia(senhaUsuario)
			senao {
				pulaLinha()
				escreva("Usuario não cadastrado")
				pulaLinha()
				escreva("Gostaria de cadastrar algum novo usuario?(Opção n° 1)\n")
			escreva("Gostaria de acessar algum outro usuario?(Opção n° 2)\n")
			escreva("Gostaria de sair do programa?(Opção n° 3)")
			pulaLinha()
			escreva("Qual numero de opção você escolhe?\n")
			escreva("Aperte enter para concluir a escolha\nVocê escolheu a opção numero ")
			leia(numeroOpcao)
			}
		
					se (senhaUsuario != senhaCastrada)
						escreva("Senha errada tente novamente:")
					
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 207; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */