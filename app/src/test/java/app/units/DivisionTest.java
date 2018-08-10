package app.units;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import app.controller.MultiplicationApi;
import app.division.Division;
import app.entity.Result;



@RunWith(MockitoJUnitRunner.class)
public class DivisionTest {
	
	@Mock private MultiplicationApi mockMultiplicationApi;
	//@Mock private MultiplicationService mockMultiplicationService;
	
	@InjectMocks private Division division;
	
	@Before public void setUp() {
		
		//this.division = new Division(mockMultiplicationApi);
		
		when(mockMultiplicationApi.negative(-512)).thenReturn(new Result(-512, -1, "", 512));
		when(mockMultiplicationApi.negative(-15)).thenReturn(new Result(-15, -1, "", 15));
	}
	
	@Test
	public void testDividePositiveNumberSuccess() throws IllegalArgumentException {		
		
		assertThat(this.division.divide(512, 15)).isEqualTo(512/15);
		assertThat(this.division.divide(16, 4)).isEqualTo(16/4);
	}
	
	@Test
	public void testDivideSecondNegativNumberSuccess() throws IllegalArgumentException {
		assertThat(this.division.divide(512, -15)).isEqualTo(512/-15);
	}
	
	@Test
	public void testDivideFirstNegativeNumberSuccess() throws IllegalArgumentException {
		assertThat(this.division.divide(-512, 15)).isEqualTo(-512/15);
	}
	
	@Test
	public void testDivideNegativeNumbersSuccess() throws IllegalArgumentException {
		assertThat(this.division.divide(-512, -15)).isEqualTo(-512/-15);
	}
	
	@Test
	public void testDivideFirstInferiorToSecondNumberSuccess() throws IllegalArgumentException {
		assertThat(this.division.divide(15, 512)).isEqualTo(15/512);
	}
	
	@Test
	public void testDivideFirstInferiorAndNegativeToSecondNumberSuccess() throws IllegalArgumentException {
		assertThat(this.division.divide(-15, 512)).isEqualTo(-0.0);
	}

	
	@Test
	public void testDivideFirstNumberZeroSuccess() throws IllegalArgumentException {
		assertThat(this.division.divide(0, 15)).isEqualTo(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDividePositiveNumberThrowError() {
		this.division.divide(512, 0);        
	}
}
