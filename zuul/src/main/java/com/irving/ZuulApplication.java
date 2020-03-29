package com.irving;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.irving.filter.AccessFilter;
import com.irving.filter.ErrorFilter;
import com.irving.filter.RateLimitFilter;
import com.irving.filter.ResultFilter;
import com.irving.filter.UuidFilter;
import com.irving.filter.ValidateFilter;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
	}

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
	
	@Bean
	public RateLimitFilter rateLimiterFilter() {
		return new RateLimitFilter();
	}
	
	@Bean
	public ResultFilter resultFilter() {
		return new ResultFilter();
	}
	
	@Bean
	public UuidFilter uuidFilter() {
		return new UuidFilter();
	}
	
	@Bean
	public ValidateFilter validateFilter() {
		return new ValidateFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

}
