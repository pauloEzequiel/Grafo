import Estrutura.grafo;

public class aplicacao {

	public static void main(String[] args) {
		
		grafo <String,Integer> g =new grafo<String,Integer>();
		
		g.AddVertice("Paulo", 1);
		g.AddVertice("Lucas", 1);
		g.AddVertice("Vera", 1);
		
		
		g.AddAresta(0, 2, 1);
		g.AddAresta(0, 1, 1);
		
		g.AddAresta(1, 2, 1);
		g.AddAresta(1, 0, 5);
		
		g.AddAresta(2, 1, 1);
		g.AddAresta(2, 0, 5);
		
		//g.ExibirAdj(9);
		System.out.println(g.ehConexo(1));
		
		//System.out.print(g.ehCompleto());
		

	}

}
