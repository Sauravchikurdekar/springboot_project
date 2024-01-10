//package com.seed;
//
//import java.util.List;
//import java.util.Set;
//
//import org.hibernate.validator.internal.util.logging.LoggerFactory;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//
//import ch.qos.logback.classic.Logger;
//import reactor.core.publisher.Mono;
////import org.slf4j.Logger;
////import org.slf4j.LoggerFactory;
//@Component
//public class Myprefilter implements GlobalFilter{
//	
//
//	private static final Logger logger = LoggerFactory.getLogger(Myprefilter.class);
//
//	@Override
//	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//
//		logger.info("filter() exicution started....");
//		//Acess request info
//		
//		ServerHttpRequest request = exchange.getRequest();
//		HttpHeaders headers = request.getHeaders();
//		
//		Set<String> keySet = headers.keySet();
//		keySet.forEach(key->{
//			List<String> values=headers.get(key);
//			
//			System.out.println(key+"::"+ values);
//		});
//		
//		
//		return chain.filter(exchange);
//	}
//	
//	
//
//}
