package org.aibles.clean_architecture.entity.exception;

import org.trainingjava.core_exception.NotFoundException;

public class BookNotFoundException extends NotFoundException {

  public BookNotFoundException() {
    setCode("org.aibles.clean_architecture.entity.exception.BookNotFoundException");
  }
}
