programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	// numeros perfeitos = soma dos anteriores
	// 4 primeiros
	{
		real taxa_inicial = 0.015
		real salario_atual = 2000.00
		para(inteiro i = 0; i <= (2022-2010) ; i++){
			real salario_inicial = 2000.00
			se(i > 0){
				salario_atual = salario_atual * (1 + mat.potencia(2, (i - 1)) * taxa_inicial)
				escreva("Ano: " ,2010 + i, ", salario: R$" , salario_atual , "\n")
			} senao { 
				salario_atual = salario_inicial * (1 + taxa_inicial)
				escreva("Ano: " ,2010 + i, ", salario: R$" ,salario_atual, "\n")
				}
			 
			}
				}
			
		}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 575; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */