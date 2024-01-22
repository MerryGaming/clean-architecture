package org.aibles.clean_architecture.infrastructure.book.dto;

import org.aibles.clean_architecture.usecase.book.dto.BookCreateData;
import org.aibles.clean_architecture.usecase.book.dto.BookUpdateData;

public record BookUpdate(String name, String author, int year, String category) implements
        BookUpdateData {
}
