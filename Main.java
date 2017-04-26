
public class Main {

	public static void main(String[] args) {
		int pesoMaximo=10;
		Mochila mochila = new Mochila(pesoMaximo);
		mochila.cargarDatos();
		mochila.llenarMochila();
		System.out.println("------Resultado------");
		mochila.mostrarMochila();
	}

}
