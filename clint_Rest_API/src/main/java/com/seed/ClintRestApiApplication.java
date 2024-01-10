package com.seed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.seed.binding.Book;

@SpringBootApplication
public class ClintRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClintRestApiApplication.class, args);
		
//		String apiURL="https://www.linkedin.com/jobs/collections/recommended/post-apply/default/?currentJobId=3617627868&distance=&f_AL=&f_BE=&f_C=&f_CF=&f_CM=&f_CR=&f_CT=&f_E=&f_EA=&f_EL=&f_ES=&f_ET=&f_F=&f_FCE=&f_GC=&f_I=&f_JC=&f_JIYN=&f_JT=&f_LF=&f_PP=&f_SB=&f_SB2=&f_SB3=&f_T=&f_TP=&f_TPR=&f_WRA=&f_WT=&latLong=&originToLandingJobPostings=&postApplyJobId=3617627868&refresh=false&sortBy=&start=0";
//		RestTemplate rt=new RestTemplate();
//		ResponseEntity<String> forEntity = rt.getForEntity(apiURL, String.class);
//		String body=forEntity.getBody();
//		System.out.println(body);
		
		
		//sending pot request by Rest tempate
		
		String apiURL="";
		Book book=new Book();
		book.setBookid(11);
		book.setBookname("Java");
		book.setBookprice(450.10);
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> postForEntity = rt.postForEntity(apiURL, book, String.class);
		String body=postForEntity.getBody();
		System.out.println(postForEntity.getBody());
	}

}
