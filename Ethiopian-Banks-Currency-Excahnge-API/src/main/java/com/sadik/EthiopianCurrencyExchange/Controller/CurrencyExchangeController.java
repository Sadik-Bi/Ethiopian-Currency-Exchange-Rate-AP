package com.sadik.EthiopianCurrencyExchange.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadik.EthiopianCurrencyExchange.Service.CurrencyService;

@RestController
public class CurrencyExchangeController {
	@Autowired
private CurrencyService currencyService;
	@RequestMapping("/NationalBank")
	public List<Currencies> getAllNBECurrencyExchangeRate(){
		return currencyService.nationalBankExchange();
	}
}
