package ufc.quixada;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class ServletInitializer extends org.springframework.boot.context.web.SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GestaoFestaEbookApplication.class);
	}

}
