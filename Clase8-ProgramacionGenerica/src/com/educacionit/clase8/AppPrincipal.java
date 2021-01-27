package com.educacionit.clase8;

public class AppPrincipal {

	public static void main(String[] args) {

	/*	DEMOSTRACION SIN PROGRAMACION GENERICA
	 * Bolsa bolsa = new Bolsa(5);
		 * 
		 * Chocolatina c = new Chocolatina("Milka"); Chocolatina c1 = new
		 * Chocolatina("Cofler"); Chocolatina c2 = new Chocolatina("Ferrero");
		 * 
		 * Golosina g1 = new Golosina("GomitasMasticables"); Golosina g2 = new
		 * Golosina("chicle");
		 * 
		 * // agregamos todos los objetos a la bolsa bolsa.add(c); bolsa.add(c1);
		 * bolsa.add(c2); bolsa.add(g1); bolsa.add(g2);
		 * 
		 * 
		 * // con un for Each for (Object o : bolsa) { // valido si el object es una
		 * instancia de chocolatina if (o instanceof Chocolatina) { Chocolatina
		 * chocolatina = (Chocolatina) o; System.out.println(chocolatina.getMarca()); }
		 * else { Golosina golosina = (Golosina) o;
		 * System.out.println(golosina.getNombre()); } }
		 */

		// DEMOSTRACION CON PROGRAMCION GENERICA!
		BolsaGenerica<Chocolatina> bolsa = new BolsaGenerica<Chocolatina>(5);
		BolsaGenerica<Golosina> bolsaDos = new BolsaGenerica<Golosina>(3);
		BolsaGenerica<Alfajor> bolsaTres = new BolsaGenerica<Alfajor>(10);
		
		Chocolatina c = new Chocolatina("Milka");
		Chocolatina c1 = new Chocolatina("Cofler");
		Chocolatina c2 = new Chocolatina("Ferrero");
		Chocolatina c3 = new Chocolatina("BonoBon");
		Chocolatina c4 = new Chocolatina("Oreo");
		Chocolatina c5 = new Chocolatina("Toblerone");
		// agregamos los chocolates a la bolsa de chocolatinas!
		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(c3);
		bolsa.add(c4);
		bolsa.add(c5);
//		bolsa.add(c5);

		for (Chocolatina chocolatinaAux : bolsa) {
			System.out.println(chocolatinaAux.getMarca());
		}

	}

}
