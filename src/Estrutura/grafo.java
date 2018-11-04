package Estrutura;

import java.util.LinkedList;
import java.util.List;

public class grafo<K extends Comparable<? super K>, V> {

	private int MatAdj[][];
	private LinkedList<Vertice<K, V>> vertice;
	private int nVertice;
	int Qtd_Max_Vertice=20;
	public grafo() {
		nVertice = 0;
		vertice = new LinkedList<Vertice<K, V>>();
		MatAdj = new int[Qtd_Max_Vertice][Qtd_Max_Vertice];

		for (int i = 0; i < Qtd_Max_Vertice; i++) {
			for (int j = 0; j < Qtd_Max_Vertice; j++)
				MatAdj[i][j] = 0;
		}
	}

	public void AddVertice(K label, V valor) {
		if (nVertice<=Qtd_Max_Vertice) {
			int cont = 0;
			for (Vertice<K, V> v : vertice) {
				if (label.compareTo(v.Label) == 0) {
					cont++;
					break;
				}
			}

			if (cont == 0){
				 vertice.addLast(new Vertice<K, V>(label, valor,nVertice++));
			System.out.println("Realizado com sucesso");	
			}else System.out.println("Falha, Chave duplicada");	

		}

	}

}
