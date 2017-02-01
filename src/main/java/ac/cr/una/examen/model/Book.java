/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.model;

import java.util.Calendar;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
@Entity
@Table(name = "book", catalog = "progra3_exa2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id_Book")})
public class Book {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_Book")
    private int idBook;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Author", nullable = false)
    private Author author;
    @Column(name = "type", unique = false, nullable = false)
    private BookType type;
    @Column(name = "Name", unique = false, nullable = false)
    private String Name;
    @Column(name = "email", unique = false, nullable = false)
    private Calendar dateRelease;
    @Column(name = "price", unique = false, nullable = false)
    private float price;

    public Book(int idBook, Author author, BookType type, String Name, Calendar dateRelease, float price) {
        this.idBook = idBook;
        this.author = author;
        this.type = type;
        this.Name = Name;
        this.dateRelease = dateRelease;
        this.price = price;
    }

    public Book() {
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Calendar getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Calendar dateRelease) {
        this.dateRelease = dateRelease;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.idBook;
        hash = 59 * hash + Objects.hashCode(this.author);
        hash = 59 * hash + Objects.hashCode(this.type);
        hash = 59 * hash + Objects.hashCode(this.Name);
        hash = 59 * hash + Objects.hashCode(this.dateRelease);
        hash = 59 * hash + Float.floatToIntBits(this.price);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.idBook != other.idBook) {
            return false;
        }
        if (Float.floatToIntBits(this.price) != Float.floatToIntBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.dateRelease, other.dateRelease)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Book{" + "idBook=" + idBook + ", author=" + author + ", type=" + type + ", Name=" + Name + ", dateRelease=" + dateRelease + ", price=" + price + '}';
    }

}
