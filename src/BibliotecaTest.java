import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class BibliotecaTest {
    
    
    @Test
    public void testAdicionarLivro() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("123", "Java 101", "Autor X");
        
        biblioteca.adicionarLivro(livro);
        
        assertEquals(1, biblioteca.listarLivrosDisponiveis().size());
        assertEquals(livro, biblioteca.buscarLivroPorIsbn("123"));
    }
    
    @Test
    public void testAdicionarLivroNulo() {
        Biblioteca biblioteca = new Biblioteca();
        
        assertThrows(IllegalArgumentException.class, () -> {
            biblioteca.adicionarLivro(null);
        });
    }

    
    // Os alunos devem continuar com os outros testes...

    //Por exemplo

    @Test
    public void testRemoverLivro() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("123", "Java 101", "Autor X");
        
        biblioteca.adicionarLivro(livro);
        biblioteca.removerLivro("123");
        
        assertNull(biblioteca.buscarLivroPorIsbn("123"));
    }

    @Test
    public void testAdicionarUsuario() {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario(456, "João", "joao");
        
        biblioteca.adicionarUsuario(usuario);
        
        assertEquals(1, biblioteca.listarUsuarios().size());
        assertEquals(usuario, biblioteca.buscarUsuarioPorId(456));
    }
}
