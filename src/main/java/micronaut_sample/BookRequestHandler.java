package micronaut_sample;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;
import java.util.UUID;

@Introspected
public class BookRequestHandler extends MicronautRequestHandler<Book, BookSaved> {

    @Override
    public BookSaved execute(Book input) {
        System.out.println("input.getName()");
        System.out.println(input.getName());
        BookSaved bookSaved = new BookSaved();
        bookSaved.setName(input.getName());
        bookSaved.setIsbn(UUID.randomUUID().toString());
        return bookSaved;
    }

}
