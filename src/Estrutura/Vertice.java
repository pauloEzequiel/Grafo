package Estrutura;

public class Vertice<K extends Comparable<? super K>, V> {

	K Label;
	V val;
	int index;
    boolean foiVisitado;
	public Vertice(K label, V val,int index) {
		Label = label;
		this.val = val;
		this.foiVisitado=false;
	}
}
