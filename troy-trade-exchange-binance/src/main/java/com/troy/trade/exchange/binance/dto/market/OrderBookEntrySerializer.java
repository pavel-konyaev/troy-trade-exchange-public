package com.troy.trade.exchange.binance.dto.market;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * Custom serializer for an OrderBookEntry.
 */
public class OrderBookEntrySerializer extends JsonSerializer<OrderBookEntry> {

  @Override
  public void serialize(OrderBookEntry orderBookEntry, JsonGenerator gen, SerializerProvider serializers) throws IOException {
    gen.writeStartArray();
    gen.writeString(orderBookEntry.getPrice());
    gen.writeString(orderBookEntry.getQty());
    gen.writeEndArray();
  }
}
