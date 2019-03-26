package es.unileon.prg.tema10.ejemplo;

public class MainEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mensaje");
		
		Fecha miFecha = new Fecha();
		
		int valor = miFecha.getDay();
		miFecha.setYear(2019);
		 valor = miFecha.getYear();

		System.out.println(valor);

	}

}
