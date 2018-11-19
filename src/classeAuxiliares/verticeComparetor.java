package classeAuxiliares;

import java.util.Comparator;

import Estrutura.Vertice;

public class verticeComparetor implements Comparator<Object> {
	
	boolean cres=true;
	
	public verticeComparetor(boolean cres) {
		this.cres = cres;
	}

	@Override
	public int compare(Object vert1, Object vert2) {
		
		Vertice<?, ?> v=(Vertice<?, ?>)vert1;
		Vertice<?, ?> v2=(Vertice<?, ?>)vert2;
		
		if(cres){
			return v.getNumAdj()<v2.getNumAdj()? -1: v.getNumAdj()>v2.getNumAdj()?+1:0 ;
		}
		
		 return v.getNumAdj()<v2.getNumAdj()? +1: v.getNumAdj()>v2.getNumAdj()?-1:0 ;
	}

}
