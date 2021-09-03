package interfaces;

import main.books.Book;
import main.Patron;

public interface IBasicOperations {

    void borrowBook(Patron p, Book b);

    void returnBook(Patron p, Book b);

    void fine(Patron p, double amount);

}

																																//	©	Rashedul_ISLAM