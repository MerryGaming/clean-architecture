package org.aibles.clean_architecture.infrastructure.configuration.db.schema;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aibles.clean_architecture.entity.model.Book;

@Data
@Entity
@Table(name = "book")
public class BookSchema {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  @NotBlank(message = "You need to enter a name")
  private String name;
  @NotBlank(message = "You need to enter a author")
  private String author;
  private int year;
  @NotBlank(message = "You need to enter a category")
  private String category;

  public BookSchema(Book book) {
    this.name = book.getName();
    this.author = book.getAuthor();
    this.year = book.getYear();
    this.category = book.getCategory();
  }

  public BookSchema() {

  }

  public Book toBook() {
    Book book = new Book (
        this.getName(),
        this.getAuthor(),
        this.getYear(),
        this.getCategory()
    );

    book.setId(this.getId());

    return book;
  }
}
