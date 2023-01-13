programa
{
	
	funcao inicio()
	{
		inteiro nascimento, atual, maioridade = 18
		escreva("Qual seu ano de nascimento? ")
		leia(nascimento)
		escreva("Em que ano estamos? ")
		leia(atual)
		escreva("Sua idade é : ", atual - nascimento)
		se(atual - nascimento >= maioridade){
			escreva("\nVoce atingiu a maioridade")	
		} senao {
			escreva("\nVoce ainda é menor de idad e")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 37; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */