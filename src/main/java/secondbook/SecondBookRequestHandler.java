package secondbook;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;
import micronaut_sample.Book;
import micronaut_sample.BookSaved;

import java.util.UUID;

@Introspected
public class SecondBookRequestHandler extends MicronautRequestHandler<Book, BookSaved> {

    @Override
    public BookSaved execute(Book input) {
        System.out.println("input2.getName()");
        System.out.println(input.getName());
        BookSaved bookSaved = new BookSaved();
        bookSaved.setName(input.getName());
        bookSaved.setIsbn(UUID.randomUUID().toString());
        return bookSaved;
    }
}
