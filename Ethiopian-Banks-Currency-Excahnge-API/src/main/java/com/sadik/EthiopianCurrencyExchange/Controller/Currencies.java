package com.sadik.EthiopianCurrencyExchange.Controller;

import java.math.BigDecimal;
import java.util.Date;

public class Currencies {

	private String id;
	private BigDecimal buying;
	private BigDecimal selling;
	//private Date publishedDate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BigDecimal getBuying() {
		return buying;
	}
	public void setBuying(BigDecimal buying) {
		this.buying = buying;
	}
	public BigDecimal getSelling() {
		return selling;
	}
	public void setSelling(BigDecimal selling) {
		this.selling = selling;
	}
	
//	public Date getPublishedDate() {
//		return publishedDate;
//	}
//	public void setPublishedDate(Date publishedDate) {
//		this.publishedDate = publishedDate;
//	}
	public Currencies(String id, BigDecimal buying, BigDecimal selling) {
		super();
		this.id = id;
		this.buying = buying;
		this.selling = selling;
		//this.publishedDate=pubDate;
	}
	public Currencies() {
		
	}
	
}
