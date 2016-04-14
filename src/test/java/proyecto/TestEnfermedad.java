package proyecto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEnfermedad {
	
	private Infecciosa malaria;
	private Persona frank;
	
	@Before 
	public void ini(){
		malaria = new Infecciosa();
		frank = new Persona();
	}
	
	@Test
	public void unaEnfermedadInfecciosaEsAgresiva(){
		
		malaria.setCantidadCelulasAmenazadas(101);
		frank.setCantidadCelulasTotales(1000);

		
		boolean esAgresiva = malaria.esAgresiva(frank);
		
		Assert.assertTrue(esAgresiva);
	}
	
	@Test
	public void unaEnfermedadInfecciosaNoEsAgresiva(){
		
		malaria.setCantidadCelulasAmenazadas(100);
		frank.setCantidadCelulasTotales(1000);

		
		boolean esAgresiva = malaria.esAgresiva(frank);
		
		Assert.assertFalse(esAgresiva);
	}
}
