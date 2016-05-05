import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {

	public static void main(String[] args){
		//El ABCdario tiene sólo 4 letras
		List<String> abcdario = new ArrayList<String>();
		abcdario.add("a");
		abcdario.add("b");
		abcdario.add("c");
		abcdario.add("d");
		
		recursivo(abcdario, new ArrayList<String>());
		
	}
	
	
	public static void imprimirLista(List<String> lista){
		for (String letra:lista) {
			System.out.print(letra);
		}
		System.out.println();
	}
	
	public static List<String> clonarLista(List<String> lista){
		return new ArrayList<String>(lista);
	}
	
	public static void recursivo(List<String> abcdario, List<String> lista_parcial){
		
		//es solucion
		if(abcdario.isEmpty()){
			imprimirLista(lista_parcial);
		}
		else{
			for(String letra:abcdario){
				List<String> lista_clonada = clonarLista(lista_parcial);
				lista_clonada.add(letra);
				List<String> abcdario_clonada = clonarLista(abcdario);
				abcdario_clonada.remove(letra);
				recursivo(abcdario_clonada, lista_clonada);
			}
		}
		
		
	}
}
