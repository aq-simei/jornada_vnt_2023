programa
{
	
	funcao inicio()
	{
		inteiro opt
		inteiro valor_doado
		escreva("[1] para doar R$10\n")
		escreva("[2] para doar R$25\n")
		escreva("[3] para doar R$50\n")
		escreva("[4] para doar outros valores\n")
		escreva("[5] para cancelar\n")
		leia(opt)
		escolha(opt){
				caso 1 : escreva("Você doou R$10, obrigado!") pare
				caso 2 : escreva("Você doou R$25, obrigado!") pare
				caso 3 : escreva("Você doou R$50, obrigado!") pare
				caso 4 : {  
					escreva("Qual valor será doado? ")
					leia(valor_doado)
					escreva("Obrigado, você doou R$", valor_doado)
					pare
					}
				caso 5: escreva("Doação cancelada") pare
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 640; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */