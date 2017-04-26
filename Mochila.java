import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Mochila {
	ArrayList <ObjMochila> objetos = new ArrayList <ObjMochila>();
	ArrayList <ObjMochila> mochila = new ArrayList <ObjMochila>();
	final double  pesoMaximo;
	 
	    public Mochila(int pm) {
	        pesoMaximo = pm;
	    }
 
	    public void cargarDatos() {
	    	objetos.add(new ObjMochila(2,600,1));
	    	objetos.add(new ObjMochila(2,50,3));
	    	objetos.add(new ObjMochila(1,12,2));
	    	objetos.add(new ObjMochila(1,700,2));
	    	
	    }
	 
	     public void mostrarMochila() {
	        double pesoMochila=0;
	        double valorMochila=0;
	        System.out.println();
	        for(ObjMochila o: mochila) {
	            System.out.println(o.toString());
	            pesoMochila+=o.pi;
	            valorMochila+=o.vi;
	        }
	        System.out.println("------");
	        System.out.printf("Peso  = %,12.2f %n", pesoMochila);
	        System.out.printf("Valor = %,12.2f %n", valorMochila);
	    }
	     
		@Override
		public String toString() {
			return "Mochila [objetos=" + objetos + ", mochila=" + mochila + "]";
		}

		Comparator<ObjMochila> cmp = new Comparator<ObjMochila>() {
	         public int compare(ObjMochila x, ObjMochila y) {
	            return (int) ((x.getVi()/x.getPi())-(y.getVi()/ y.getPi()));
	            }
	    };

        public void llenarMochila(){
        	double pesoMochila=0;
        	int posicion=0;
        	Collections.sort(objetos,cmp);
        	Collections.reverse(objetos);
        	while(pesoMochila<pesoMaximo && posicion < objetos.size()){
        		ObjMochila posible=objetos.get(posicion);
        		int cantDisp=0;
        		while((pesoMochila+posible.getPi()<=pesoMaximo)&& (posible.getCd()>cantDisp)){
        			mochila.add(posible);
        			pesoMochila+=posible.pi;
        			cantDisp++;
        		}
        		posicion++;
        	}
        }
}
