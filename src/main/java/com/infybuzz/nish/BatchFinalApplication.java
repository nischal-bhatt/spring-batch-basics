package com.infybuzz.nish;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan({"com.infybuzz.nish.config","com.infybuzz.nish.service"})
// actually no need to put in component scan
public class BatchFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchFinalApplication.class, args);
	}
//spring batch applications cannot run without a database
}
