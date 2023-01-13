programa
{
	funcao inicio()
	{
		real massa, altura, indice
		escreva("Qual sua altura? ")
		leia(altura)
		escreva("Qual sua massa? ")
		leia(massa)
		indice = massa/(altura*altura)
		escreva(indice)
		se(indice < 16){escreva("Magreza grave")} senao {
				se(indice < 17) { escreva("Magreza moderada")} senao {
					se(indice < 18.5) {escreva("Magreza leve")} senao {
						se(indice < 25){escreva("Saudável")}senao {
							se(indice < 30) {escreva("Sobrepeso")} senao {
								se(indice < 35){escreva("Obesidade grau 1")} senao{
									se(indice < 40){escreva("Obesidade severa")} senao {escreva("Obesidade mórbida")}
								}
							}
						}
					}
				}
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 673; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */