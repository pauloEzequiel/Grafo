package Estrutura;

import java.util.Collections;
import java.util.LinkedList;

import classeAuxiliares.verticeComparetor;

public class Coloracao <K extends Comparable<? super K>, V> {
	private grafo<?, ?> Grafo;
	private LinkedList<?> verticeOrdenadoPorGrau;
	private double matAdj[][];
	int Cor;

	public Coloracao(grafo<?, ?> g) {
		atualizar(g);

	}

	private void atualizar(grafo<?, ?> g) {
		matAdj = g.getMatAdj();
		verticeOrdenadoPorGrau = g.getVertice();
		Collections.sort(verticeOrdenadoPorGrau, new verticeComparetor(false));
	}

	public void ExibirPorNumAdj() {
		for (Object v : verticeOrdenadoPorGrau) {
			Vertice<?, ?> t = (Vertice<?, ?>) v;
			System.out.println(t.index + " " + t.colorido);
		}
	}

	public void ColorirVertice() {

		this.Cor = 1;
		for (Object v : verticeOrdenadoPorGrau) {
			Vertice<?, ?> vertice = (Vertice<?, ?>) v;
			Colore(vertice);

		}
		System.out.println(this.Cor);
	}

	private Vertice<?, ?> GetVertice(int index) {
		for (Object v : verticeOrdenadoPorGrau) {
			Vertice<?, ?> t = (Vertice<?, ?>) v;
			if (t.index == index)
				return t;
		}
		return null;
	}

	public void Colore(Vertice<?, ?> v) {
		
		if (v.colorido > 0) {

			for (int i = 1; i <= 17; i++) {
				boolean podeColorir = true;

				for (int j = 0; j < Grafo.getnVertice(); j++) {
					if (matAdj[v.index][j] > 0) {
						Vertice<?, ?> verAdj = GetVertice(j);
						if (verAdj.colorido > 0) {
							if (verAdj.colorido == i) {
								podeColorir = false;
								break;
							}

						}
					}
				}

				if (podeColorir) {
					v.colorido = i;
					
					break;
				} else {
					this.Cor += 1;
				}
			}

			for (int j = 0; j < Grafo.getnVertice(); j++) {
				if (matAdj[v.index][j] > 0) {
					Vertice<?, ?> verAdj = GetVertice(j);
					Colore(verAdj);
				}
			}

		}
	}

}
