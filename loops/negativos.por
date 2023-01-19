programa
{
	funcao inicio()
	{
		// esperado: 4 negativos
		inteiro entrada[5] = { -5,  -2, 1, -6, -10}
		inteiro negativo = 0, i = 0
		enquanto (i < 5){
			se(entrada[i] < 0) { negativo = negativo + 1 }
			escreva(entrada[i], "\n")
			i = i + 1
		}
			escreva("Sao negativos : ", negativo)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 124; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
