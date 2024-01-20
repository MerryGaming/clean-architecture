package org.aibles.clean_architecture.usecase.book.dto;

public interface BookCreateData {

  String name();
  String author();
  int year();
  String category();

}
