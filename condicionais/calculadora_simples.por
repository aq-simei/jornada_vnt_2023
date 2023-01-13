programa
{
	
	funcao inicio()
	{
		inteiro num1, num2
		caracter operador
		escreva("Qual o primeiro valor? ")
		leia(num1)
		escreva("Qual o segundo valor? ")
		leia(num2)
		escreva("Qual a operação? ")
		leia(operador)
		escolha(operador) {
			caso '+' : escreva("O resultado da operaçao é ", num1+num2) pare
			caso '-' : escreva("O resultado da operaçao é ", num1-num2) pare
			caso 'x' : escreva("O resultado da operaçao é ", num1*num2) pare
			caso '*' : escreva("O resultado da operaçao é ", num1*num2) pare
			caso '/' : escreva("O resultado da operaçao é ", num1/num2) pare
			caso contrario: escreva("Operaçao inválida.") pare
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 226; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */