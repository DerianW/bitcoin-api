package gov.curly.bitcoinapi.scheduledTasks;

import gov.curly.bitcoinapi.domain.Bitcoin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BitcoinPriceRefresher
{
    private static final Logger log = LoggerFactory.getLogger(BitcoinPriceRefresher.class);

    @Scheduled(fixedRate = 10000)
    public void checkPrice()
    {
        RestTemplate restTemplate = new RestTemplate();

        Bitcoin bitcoin = restTemplate.getForObject("https://api.cryptonator.com/api/ticker/btc-usd", Bitcoin.class);
        log.info(bitcoin.toString());
    }
}
