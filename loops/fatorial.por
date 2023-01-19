programa
{
	
	funcao inicio()
	{
		inteiro numero, fatorial, resultado = 1
		escreva("Fatorial de qual número? ")
		leia(numero)
		para (fatorial = numero ; fatorial >= 1 ; fatorial --){
				resultado = resultado * fatorial
			}
		escreva("Fatorial de :", numero, " = ", resultado)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */