package com.bat.batscript;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	Simulator simulator;

    public static void main(String[] args) {
    	SpringApplication.run(Application.class, args);
    }

	@Override
	public void run(String... arg0) throws Exception {
		simulator.runSimulator();
	}

}
