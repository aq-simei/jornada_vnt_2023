programa
{
	
	funcao inicio()
	{
		inteiro entrada , divisor = 1, divisores = 0
		escreva("Qual o numero ? ")
		leia(entrada)

		se(entrada > 0){
			enquanto(divisor <= entrada){
					se(entrada % divisor == 0){ divisores ++ }
					divisor ++
				}
			}
		se(divisores == 2) {escreva("O numero ", entrada, " é primo")} senao {escreva("O numero : ", entrada, " não é primo. ")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */