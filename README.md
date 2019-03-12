Earned Value Analysis (EVA)
=======

Este app tem como objetivo fazer a análise do valor agregado de um projeto. Isso será possível com o input das variáveis VALOR PREVISTO (VP), VALOR AGREGADO (VA) e CUSTO REAL (CR).

Em seguida será retornado a VARIAÇÃO DE CUSTO (VC), VARIAÇÃO DE PROGRESSO (VPr), ÍNDICE DE DESEMPENHO DE CUSTO (IDC) e ÍNDICE DE DESEMPENHO DE PRAZO (IDP), além de, apresentar o status do projeto de acordo com os IDC e IDP.

Para melhor esclarecimento das variáveis citadas acima, segue a definição das mesmas:

### Input

* VP -> "quanto deveria ter sido realizado (de acordo com o cronograma)" ;
* VA -> "quanto deveria ter custado o que foi realizado";
* CR -> "custo real do trabalho realizado".

### Resultados

* VC  -> "diferença entre o valor agregado e o custo real": VC = VA - CR;
* VPr -> "representa o desvio entre quanto trabalho foi produzido até a data e quanto deveria ter sido produzido de acordo com o planejado": VPr = VA - VP;
* IDC -> "quociente entre valor agregado e o custo real": IDC = VA / CR;
* IDP -> "quociente entre valor agregado e o valor previsto":
      IDP = VA / VP.

Os índices IDC e IDP são muito importantes para identificar as condições do projeto em relação a custo e prazo. Tais índices funcionam da seguinte forma:

I) IDC

* se IDC > 1, então, projeto abaixo do orçamento (mais barato);
* se IDC = 1, então, projeto no orçamento;
* se IDC < 1, então, projeto acima do orçamento(mais caro);
	
II) IDP

* se IDP > 1, então, projeto adiantado;	
* se IDP = 1, então, projeto no prazo;
* se IDP < 1, então, projeto atrasado.

Nota: esta é uma versão beta do software, onde, será desenvolvido versões mais complexas e detalhadas do EVA.

#### REFERÊNCIA:

	* MATTOS, ALDO DÓREA. Planejamento e Controle de Obras. 1° ed. São Paulo: PINI.
	* FÓRMULAS VALOR AGREGADO. Disponível em: <https://www.pmtech.com.br/PMP/Formulas_valor_agregado.pdf>. Acesso em: 12/03/2019.
