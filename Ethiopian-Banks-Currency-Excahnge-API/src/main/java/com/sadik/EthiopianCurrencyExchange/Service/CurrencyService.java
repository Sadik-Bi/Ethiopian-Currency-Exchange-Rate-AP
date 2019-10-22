package com.sadik.EthiopianCurrencyExchange.Service;

import java.math.BigDecimal;
import java.net.URL;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import com.sadik.EthiopianCurrencyExchange.Controller.Currencies;

@Service
public class CurrencyService {
	List<Currencies>currencies;
	public List<Currencies> nationalBankExchange() {
		try {
			currencies=new ArrayList<>();
			  //  String url = "http://localhost:8080/rss";
			    String url = "http://www.nbe.gov.et/xml/rss.php";

			    try (XmlReader reader = new XmlReader(new URL(url))) {
			        SyndFeed feed = new SyndFeedInput().build(reader);
			        String [] description;
			        System.out.println("***********************************");
			        for (SyndEntry entry : feed.getEntries()) {
			        	Currencies newCurrency=new Currencies();
			        	description=entry.getDescription().getValue().split(",");
			        	String[] buying=description[0].split(":");
			        	
			        	String [] selling=description[1].split(":");
			        	newCurrency.setId(entry.getTitle());
			        	newCurrency.setBuying(new BigDecimal(buying[1].trim()));
			        	newCurrency.setSelling(new BigDecimal(selling[1].trim()));
			        	
			        	currencies.add(newCurrency);
			        	
			        }
			     
			    }
			}  catch (Exception e) {
			    e.printStackTrace();
			}
		return currencies;
	}
	
	
}

