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
	//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//
//                registry.addMapping("/api/**").allowedOrigins("https://adpapfront.web.app").allowedMethods("GET", "POST", "PUT", "DELETE").allowedHeaders("*");
//		registry.addMapping("/auth/**").allowedOrigins("https://adpapfront.web.app").allowedMethods("GET", "POST", "PUT", "DELETE").allowedHeaders("*");
//            }
//        };
//    }

//    @Bean
//    public CorsFilter corsFilter() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.setAllowCredentials(true);
//        corsConfiguration.setAllowedOrigins(Arrays.asList("https://adpapfront.web.app"));
//        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin",
//                "Content-Type","Accept", "Authorization", "Origin, Accept", "X-Requested-With",
//                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
//        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
//                "Access-Control-Allow-Origin: https://apadpfront.web.app Vary: Origin", "Access-Control-Allow-Credentials"));
//        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
//        return new CorsFilter(urlBasedCorsConfigurationSource);
//    }
//}
    @Bean
public CorsConfigurationSource corsConfigurationSource() {
    CorsConfiguration configuration = new CorsConfiguration();
    configuration.setAllowedOrigins(Collections.singletonList("https://adpapfront.web.app")); // <-- you may change "*"
    configuration.setAllowedMethods(Arrays.asList("HEAD", "GET", "POST", "PUT", "DELETE", "PATCH"));
    configuration.setAllowCredentials(true);
    configuration.setAllowedHeaders(Arrays.asList(
            "Accept", "Origin", "Content-Type", "Depth", "User-Agent", "If-Modified-Since,",
            "Cache-Control", "Authorization", "X-Req", "X-File-Size", "X-Requested-With", "X-File-Name"));
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", configuration);
    return source;
}

@Bean
public FilterRegistrationBean<CorsFilter> corsFilterRegistrationBean() {
    FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(corsConfigurationSource()));
    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
    return bean;
}

protected void configure(HttpSecurity http) throws Exception {
    http.headers().frameOptions().disable()
            .and()
            .authorizeRequests()
            .antMatchers("/oauth/tokeen").permitAll()
            .antMatchers(HttpMethod.GET, "/").permitAll()
            .antMatchers(HttpMethod.POST, "/").permitAll()
            .antMatchers(HttpMethod.PUT, "/").permitAll()
            .antMatchers(HttpMethod.DELETE, "/**").permitAll()
            .antMatchers(HttpMethod.OPTIONS, "*").permitAll()
            .anyRequest().authenticated()
            .and().cors().configurationSource(corsConfigurationSource());
}
}
