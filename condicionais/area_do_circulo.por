programa
{	
	inclua biblioteca Matematica --> mat 
	
	funcao inicio()
	{
		inteiro r
		escreva("Digite um valor para o raio")
		leia(r)
		se(r>0){ escreva(mat.PI*(mat.potencia(r, 2)), " metros quadrados") } senao {
				escreva("O raio deve ser positivo")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 69; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */