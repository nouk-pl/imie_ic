package app.units;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import app.multiplication.Multiplication;


@RunWith(MockitoJUnitRunner.class)
public class MultiplicationTest {
	
	@InjectMocks private Multiplication multiplication;
	
	/**
	 * MULTIPLY
	 */

	@Test
	public void testMultiplyPositiveNumbersSuccess() {
		assertThat(this.multiplication.multiply(2, 6)).isEqualTo(12);
	}

	@Test
	public void testMultiplySecondNegativeNumberSuccess() {
		assertThat(this.multiplication.multiply(2, -6)).isEqualTo(-12);
	}

	@Test
	public void testMultiplyNegativeNumbersSuccess() {
		assertThat(this.multiplication.multiply(-2, -6)).isEqualTo(12);
	}

	@Test
	public void testMultiplyFirstNumberNegativeSuccess() {
		assertThat(this.multiplication.multiply(-2, 6)).isEqualTo(-12);
	}
	
}
