package task_seven.serialization;

import task_four.second.domain.Author;
import task_four.second.domain.Book;
import task_four.second.domain.Publisher;
import task_seven.exception.SerializeException;

import java.io.File;

public interface ObjectSerializer {
    void writeAuthor(Author author, File file) throws SerializeException;

    Author readAuthor(File file) throws SerializeException;

    void writeBook(Book book, File file) throws SerializeException;

    Book readBook(File file) throws SerializeException;

    void writePublisher(Publisher publisher, File file) throws SerializeException;

    Publisher readPublisher(File file) throws SerializeException;
}
