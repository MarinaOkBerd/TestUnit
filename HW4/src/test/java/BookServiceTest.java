
import org.example.BookRepository;
import org.example.BookService;
import org.example.Book;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito;

public class BookServiceTest {
    BookRepository mockRepository;
    BookService bookService;

    @BeforeEach
    public void setUp() {
        mockRepository = mock(BookRepository.class);

        bookService = new BookService(mockRepository);
    }

    @Test
    public void testFindById() {
        when(mockRepository.findById(anyString())).thenReturn(new Book("1"));
        assertTrue(bookService.findBookById("2") instanceof Book);
        verify(mockRepository, times(1)).findById(anyString());
    }

    @Test
    public void testFindAll() {
        when(mockRepository.findAll()).thenReturn(new ArrayList<>(10));
        assertEquals(bookService.findAllBooks(), new ArrayList<>(10));
        verify(mockRepository, times(1)).findAll();
    }
    
}
