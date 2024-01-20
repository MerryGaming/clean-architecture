package org.aibles.clean_architecture.usecase.book.dto;

import org.aibles.clean_architecture.entity.gateway.BookGateway;

public interface BookUpdateData {

  String name();
  String author();
  int year();
  String category();
}
