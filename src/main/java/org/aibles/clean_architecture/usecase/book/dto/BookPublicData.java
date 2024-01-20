package org.aibles.clean_architecture.usecase.book.dto;

public interface BookPublicData {

  long id();
  String name();
  String author();
  int year();
  String category();
}
