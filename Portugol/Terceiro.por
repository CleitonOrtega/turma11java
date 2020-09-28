programa
{
	
	funcao inicio()
	{	
		const inteiro anoAtual = 2020
		cadeia nomeUsuario
		inteiro idadeUsuario, anoNascimento
		real salarioUsuario
		escreva("Digite o seu nome de Usuario:")
		leia(nomeUsuario)
		escreva("\nDigite o ano de nascimento:")
		leia(anoNascimento)
		escreva("\nDigite seu salario: ")
		leia(salarioUsuario)
		idadeUsuario = anoAtual - anoNascimento
		escreva("\nO Usuario ",nomeUsuario,"\nTem ",idadeUsuario," anos!\nE recebe ",salarioUsuario)
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