package org.aibles.clean_architecture.infrastructure.book.dto;

import org.aibles.clean_architecture.usecase.book.dto.BookCreateData;

public record BookCreate(String name, String author, int year, String category) implements
    BookCreateData {
  }

