programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3, media
		escreva("Nota da avaliaçao 1: ")
		leia(nota1)
		escreva("Nota da avaliaçao 2: ")
		leia(nota2)
		escreva("Nota da avaliaçao 3: ")
		leia(nota3)
		media = (nota1+ nota2 + nota3)/3

		se(media >= 5){
			se(media > 7){
				escreva("Sua média foi ", media, " e voce foi aprovado")
			} senao { escreva("Sua média foi ", media, " e voce fará recuperação") }
		} senao {escreva("Sua média foi ", media, " e voce foi reprovado")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 164; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */