package app.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MvcConfig {

	/** @return Instance of Model Mapper. */
	@Bean
	public ModelMapper makeModelMapper() {
		return new ModelMapper();
	}

}
