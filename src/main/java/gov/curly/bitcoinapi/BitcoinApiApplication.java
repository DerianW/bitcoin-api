package gov.curly.bitcoinapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BitcoinApiApplication
{



	public static void main(String[] args)
	{ SpringApplication.run(BitcoinApiApplication.class, args); }



}
