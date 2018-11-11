import Estrutura.grafo;

public class aplicacao {

	public static void main(String[] args) {
		
		grafo <String,Integer> g =new grafo<String,Integer>();
		
		g.AddVertice("Paulo", 1);
		g.AddVertice("Lucas", 1);
		g.AddVertice("Vera", 1);
		
		
		g.AddAresta(0, 2, 1);
		g.AddAresta(0, 1, 1);
		g.AddAresta(0, 0, 1);
		
		g.ExibirAdj(0);
		

	}

}
