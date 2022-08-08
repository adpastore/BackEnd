package com.ap.ap;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;



@SpringBootApplication
public class ApApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApApplication.class, args);
	}
	//@Bean
	//    public WebMvcConfigurer corsConfigurer() {
	//	return new WebMvcConfigurer() {
	//	    @Override
	//	    public void addCorsMappings(CorsRegistry registry) {
//
	//		registry.addMapping("/api/**").allowedOrigins("https://adpapfront.web.app").allowedMethods("GET", "POST", "PUT", "DELETE").allowedHeaders("*");
	//		registry.addMapping("/auth/**").allowedOrigins("https://adpapfront.web.app").allowedMethods("GET", "POST", "PUT", "DELETE").allowedHeaders("*");
	//	    }
	//	};
	//    }
        @Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("https://adpapfront.web.app/portfolio"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin",	"Access-Control-Allow-Origin: https://apadpfront.web.app/api/portfolio", "Access-Control-Allow-Credentials",
								  "Access-Control-Max-Age", "Access-Control-Expose-Headers"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}
}
