programa
{
	
	funcao inicio()
	{
		inteiro salario
		inteiro financiamento
		escreva("Qual o valor do seu salario? ") 
		leia(salario)
		escreva("Qual o valor do financiamento? ")
		leia(financiamento)
		se(financiamento <= 5 * salario){
			escreva("Financiamento concedido! \n")
		} senao { escreva("Financiamento negado! \n") }
		escreva("Obrigado por nos consultar!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 134; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */