package com.microservices.demo.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exchange_value" )
public class ExchangeValue {
	@Id
	@Column(name= "id")
	private int id;
	@Column(name= "currency_from")
	private String from;
	@Column(name= "currency_to")
	private String to;
	@Column(name="conversion_multiple")
	private BigDecimal conversionMultiple;
	private int port;

	public ExchangeValue() {
	}

	public ExchangeValue(int id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
