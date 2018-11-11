package Estrutura;

import java.util.LinkedList;

public class grafo<K extends Comparable<? super K>, V> {

	private double MatAdj[][];
	private LinkedList<Vertice<K, V>> vertice;
	private int nVertice;
	int Qtd_Max_Vertice = 20;

	public grafo() {
		nVertice = 0;
		vertice = new LinkedList<Vertice<K, V>>();
		MatAdj = new double[Qtd_Max_Vertice][Qtd_Max_Vertice];

		for (int i = 0; i < Qtd_Max_Vertice; i++) {
			for (int j = 0; j < Qtd_Max_Vertice; j++)
				MatAdj[i][j] = 0;
		}
	}

	public void AddVertice(K label, V valor) {
		if (nVertice <= Qtd_Max_Vertice) {
			int cont = 0;
			for (Vertice<K, V> v : vertice) {
				if (label.compareTo(v.Label) == 0) {
					cont++;
					break;
				}
			}

			if (cont == 0) {
				vertice.addLast(new Vertice<K, V>(label, valor, nVertice++));
				System.out.println("Realizado com sucesso");
			} else
				System.out.println("Falha, Chave duplicada");

		}

	}
	
	

	public void AddAresta(int Vinicio, int Vfim, double peso) {
		if (Vinicio > -1 && Vfim < nVertice) {
			MatAdj[Vinicio][Vfim] = peso;
			MatAdj[Vfim][Vinicio] = peso;
		} else
			System.out.println("Falha, Valores Informados Inválidos");
	}

	public void ExibirVertice(int v){
		System.out.print(vertice.get(v).Label+" ");
	}
	
	public void ExibirAdj(int V){
		System.out.print("Adjacentes de "+" ");
		ExibirVertice(V);
		System.out.println();
		for (int i = 0; i < nVertice; i++) {
			if(MatAdj[V][i]>0) ExibirVertice(i);
		}
		
	}
}