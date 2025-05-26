package TiendaPeluches;

import java.util.ArrayList;

public class ArregloPeluches {

	private ArrayList<Producto>pelu;
	public ArregloPeluches() {
		pelu=new ArrayList<Producto>();
	Adicionar(new Producto(100,"Eevee",22,55.0));
	Adicionar(new Producto(110,"Espeon",20,45.0));
	Adicionar(new Producto(120,"Glaceon",22,80.0));
	Adicionar(new Producto(130,"Sylveon",20,25.0));
	Adicionar(new Producto(140,"Jolteon",20,10.0));
	Adicionar(new Producto(150,"Vaporeon",20,70.0));
	Adicionar(new Producto(160,"Leafeon",20,80.0));
	Adicionar(new Producto(170,"Flareon",20,89.90));
	Adicionar(new Producto(180,"umbreon",20,60.0));
	}
	
	public void Adicionar(Producto x) {
		pelu.add(x);
	}
	public int Tamaño() {
	    return pelu.size();
	}
	public Producto Obtener(int x)
	{
		return pelu.get(x);
	}
	
}
