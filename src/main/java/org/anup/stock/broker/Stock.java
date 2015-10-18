package org.anup.stock.broker;

import java.io.Serializable;
import java.util.Date;

public class Stock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String symbol;
	private double price;
	private int quantity;
	private Date dateOfTransaction;
	private String transactionType;
	private String transactionBy;
	
	
	public Stock(String symbol, double price, int quantity,
			Date dateOfTransaction, String transactionType, String transactionBy) {
		super();
		this.symbol = symbol;
		this.price = price;
		this.quantity = quantity;
		this.dateOfTransaction = dateOfTransaction;
		this.transactionType = transactionType;
		this.transactionBy = transactionBy;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stock [symbol=" + symbol + ", price=" + price + ", quantity="
				+ quantity + ", dateOfTransaction=" + dateOfTransaction
				+ ", transactionType=" + transactionType + ", transactionBy="
				+ transactionBy + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((dateOfTransaction == null) ? 0 : dateOfTransaction
						.hashCode());
		long temp;
		temp = Double.doubleToLongBits(quantity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result
				+ ((transactionBy == null) ? 0 : transactionBy.hashCode());
		result = prime * result
				+ ((transactionType == null) ? 0 : transactionType.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (dateOfTransaction == null) {
			if (other.dateOfTransaction != null)
				return false;
		} else if (!dateOfTransaction.equals(other.dateOfTransaction))
			return false;
		if (Double.doubleToLongBits(quantity) != Double
				.doubleToLongBits(other.quantity))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (transactionBy == null) {
			if (other.transactionBy != null)
				return false;
		} else if (!transactionBy.equals(other.transactionBy))
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		return true;
	}


	/**
	 * @return the symbol
	 */
	public final String getSymbol() {
		return symbol;
	}


	/**
	 * @param symbol the symbol to set
	 */
	public final void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	/**
	 * @return the price
	 */
	public final double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public final void setPrice(double price) {
		this.price = price;
	}


	/**
	 * @return the quantity
	 */
	public final int getQuantity() {
		return quantity;
	}


	/**
	 * @param quantity the quantity to set
	 */
	public final void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	/**
	 * @return the dateOfTransaction
	 */
	public final Date getDateOfTransaction() {
		return dateOfTransaction;
	}


	/**
	 * @param dateOfTransaction the dateOfTransaction to set
	 */
	public final void setDateOfTransaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}


	/**
	 * @return the transactionType
	 */
	public final String getTransactionType() {
		return transactionType;
	}


	/**
	 * @param transactionType the transactionType to set
	 */
	public final void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	/**
	 * @return the transactionBy
	 */
	public final String getTransactionBy() {
		return transactionBy;
	}


	/**
	 * @param transactionBy the transactionBy to set
	 */
	public final void setTransactionBy(String transactionBy) {
		this.transactionBy = transactionBy;
	}
	
	

}
