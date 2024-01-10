package com.seed.binding.rest;

import java.awt.PageAttributes.MediaType;
import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seed.binding.CustomerEvent;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class CustomerRestcontroller {
	
	@GetMapping(value ="/event",produces="application/json")
	public ResponseEntity<Mono<CustomerEvent>> getEvent(){
		
		CustomerEvent event=new CustomerEvent("Saurav", new Date());
		Mono<CustomerEvent> customerMono = Mono.just(event);
		
		
		event.setName("Saurav");
		event.setCreatedate(new Date());
		return new ResponseEntity<Mono<CustomerEvent>>(customerMono,HttpStatus.OK) ;
	}

	
//	@GetMapping(value="/events",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	@GetMapping("/events")
	public ResponseEntity<Flux<CustomerEvent>> getEvents(){
		
		//ceating binding obj
		CustomerEvent event=new CustomerEvent("Saurav", new Date());
		
		event.setName("Saurav");
		event.setCreatedate(new Date());
		
		
		//creating strem for binding obj
		Stream<CustomerEvent> custeorstream = Stream.generate(()->event);
		
		//create flux obj using stream
		
    Flux<CustomerEvent> cflux= Flux.fromStream(custeorstream);
    
    //setting response interval
    Flux<Long> intervalFlux=Flux.interval(Duration.ofSeconds(5));
    
    //combine intervel flux and customer event flux
    
    Flux<Tuple2<Long, CustomerEvent>> zip = Flux.zip(intervalFlux, cflux);
    
    //Getting Tuple value as T2
    Flux<CustomerEvent> fluxmap= zip.map(Tuple2::getT2);
    
    
    //sending reponse
    
		return new ResponseEntity<>(fluxmap,HttpStatus.OK);
		
	}
}
