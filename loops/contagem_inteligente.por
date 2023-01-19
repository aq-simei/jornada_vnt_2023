programa
{
	
	funcao inicio()
	{
		inteiro num1, num2
		escreva("Primeiro valor: ")
		leia(num1)
		escreva("Segundo valor: ")
		leia(num2)
		se(num1 > num2){
				para(inteiro i = 1; i < num1 - num2 ; i++){
						escreva(num1 - i, "\n")
					}
			} senao {
				para(inteiro i = 1; i < num2 - num1 ; i++){
						escreva(num1 + i, "\n")
					}
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */