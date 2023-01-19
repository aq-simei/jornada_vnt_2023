programa
{
	
	funcao inicio()
	{
		inteiro max_atual = 0
		cadeia maiores_desempenhos[4] = {"", "", "", ""}
		inteiro indice_resultados = 0, i = 0, j, r
		inteiro notas[4] = {10, 10, 9, 8}
		cadeia alunos[4] = {"Pedro", "Maria", "João", "Sofia"}
		
		enquanto(i < 4){
				se(notas[i] > max_atual){
					se (max_atual != 0) {
						para(j = 0 ; j < indice_resultados ; j ++ ){
								maiores_desempenhos[j] = ""
							}
							indice_resultados = 0
						}
					max_atual =  notas[i]
					maiores_desempenhos[indice_resultados] = alunos[i]
					indice_resultados += 1
					i += 1
				} senao {
					se(notas[i] == max_atual) { 
						maiores_desempenhos[indice_resultados] = alunos[i]
						indice_resultados += 1
						i += 1
					}senao{ i += 1} }
			}
			para(r = 0 ; r < i ; r ++){
				se(maiores_desempenhos[r] != ""){
					 escreva(maiores_desempenhos[r], "\n")
					}
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 297; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {max_atual, 6, 10, 9}-{maiores_desempenhos, 7, 9, 19}-{indice_resultados, 8, 10, 17}-{i, 8, 33, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */