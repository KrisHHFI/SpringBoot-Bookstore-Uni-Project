package com.example.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Book {
	//Book framework accommodating attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	// Book attributes
	private String title;
	private String author;
	private int year;
	private String isbn;
	private Double price;
	// Category attribute, connects Book*-1Category
	@ManyToOne
	@JoinColumn(name = "categoryid")
	//---
	@JsonManagedReference
	//---
	private Category category;
	
	public Book() {
	}
	
	public Book(String title, String author, int year, String isbn, Double price, Category category) {
		super();
		this.title=title;
		this.author=author; 
		this.year=year;
		this.isbn=isbn;
		this.price=price;
		this.category=category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}