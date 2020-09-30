programa
{
	funcao pulaLinha(){
		escreva("\n* * * * * * * * * * *  \n")
	}
	funcao entradaPrograma(){
		pulaLinha()
		escreva("* Sistema para Login*")
		pulaLinha()
	}
	
	funcao inicio()
	{
		inteiro numeroTentativa = 3
		cadeia nomeUsuario , senhaUsuario , senhaCorreta = "cleiton"
		entradaPrograma()
		escreva("Digite seu nome de usuario: ")
		leia(nomeUsuario)

		faca
		{
			limpa()
			escreva("Você tem ",numeroTentativa," tentativas!\n")
			escreva("Digite a senha do Usuario: ",nomeUsuario)
			escreva("\nDigite a sua senha: ")
			leia(senhaUsuario)
			se(senhaUsuario == senhaCorreta){
				numeroTentativa = 0
			}senao{
				numeroTentativa = numeroTentativa - 1
			}
			
		} enquanto(numeroTentativa != 0)
		se(senhaUsuario == senhaCorreta){
			escreva("Seja Bem-Vindo ",nomeUsuario,"!")
		}senao{
			escreva("Limite de tentativas alcançado tente novamente depois!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */