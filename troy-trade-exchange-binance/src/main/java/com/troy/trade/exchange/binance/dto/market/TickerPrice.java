package com.troy.trade.exchange.binance.dto.market;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.troy.trade.exchange.binance.dto.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Wraps a symbol and its corresponding latest price.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TickerPrice {

  /**
   * Ticker symbol.
   */
  private String symbol;

  /**
   * Latest price.
   */
  private String price;

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("symbol", symbol)
        .append("price", price)
        .toString();
  }
}