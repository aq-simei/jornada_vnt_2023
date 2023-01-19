programa


{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	real contagem = 1.0
	real massa, tempo_decorrido
	real taxaDeOcorrencia = 50.0
	escreva("Qual a massa(em Kg)? ")
	leia(massa)
	para(contagem ; massa > 0.5/1000 ; (contagem++) ){
			massa = massa / 2
		}
	
		escreva("Tempo decorrido: ", contagem*taxaDeOcorrencia, "segundos.\n")
		escreva("Tempo decorrido: ", contagem*taxaDeOcorrencia/60, "minutos.\n")
		escreva("Tempo decorrido: ", contagem*taxaDeOcorrencia/(60*60), "horas.\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */