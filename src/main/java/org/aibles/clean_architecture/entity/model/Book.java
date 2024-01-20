package org.aibles.clean_architecture.entity.model;


public class Book {

  private long id;
  private String name;
  private String author;
  private int year;
  private String category;

  public Book() {
  }

  public Book(String name, String author, int year, String category) {
    this.name = name;
    this.author = author;
    this.year = year;
    this.category = category;
  }

  public Book(long id, String name, String author, int year, String category) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.year = year;
    this.category = category;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}
