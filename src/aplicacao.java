import Estrutura.Coloracao;
import Estrutura.grafo;

public class aplicacao {

	public static void main(String[] args) {
		
		grafo <Integer,String> g =new grafo<Integer,String>();
		
		g.AddVertice(0,"Paulo");
		g.AddVertice(1,"Lucas");
		g.AddVertice(2,"Vera");
		g.AddVertice(3,"Vit�ria");
		g.AddVertice(4,"Marcos");
		
		
		
		g.AddAresta(0, 4, 1);
		g.AddAresta(4, 1, 1);
		g.AddAresta(4, 2, 1);
		g.AddAresta(4, 3, 1);
		g.AddAresta(1, 2, 1);
		g.AddAresta(2, 3, 1);
		
		
		//g.ExibirAdj(9);
		//System.out.println(g.ehConexo(1));
		
		//System.out.print(g.ehCompleto());
		
		Coloracao c=new Coloracao(g);
		c.ColorirVertice();
		//c.ExibirPorNumAdj();
		

	}

}
