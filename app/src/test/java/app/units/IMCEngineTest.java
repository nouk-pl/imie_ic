package app.units;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

import app.division.Division;
import app.entity.imc.IIMC;
import app.entity.imc.IMCEngine;
import app.entity.imc.IMCResult;
import app.multiplication.Multiplication;


@RunWith(MockitoJUnitRunner.class)
public class IMCEngineTest {
	
	@Mock
	private Division mockDivision;

	@Mock
	private Multiplication mockMultiplication;
	
	@InjectMocks 
	private IMCEngine imcI;
	
	@Before
	public void setUp() {
		
		double heightSqr = Math.pow(1.69, 2);
		System.out.println(heightSqr);
		
		when(mockMultiplication.multiply(1.69,  1.69)).thenReturn(3.38);
		when(mockDivision.divide(75, 3.38)).thenReturn(22.0);
	}

	@Test
	public void testIMCCalcSuccess() {

		IMCResult imcResult = imcI.calcImc(75, 1.69);

		assertThat(imcResult.getImc()).isEqualTo(22);
		assertThat(imcResult.getCategory()).isEqualTo(5);
		assertThat(imcResult.getHeight()).isEqualTo(1.69);
		assertThat(imcResult.getWeight()).isEqualTo(75);
		assertThat(imcResult.getLibelle()).isEqualTo("Corpulence normale");
	}
}
