/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import com.mycompany.models.Books;
import java.util.List;

public interface DAOBook {
    public void registrar(Books book) throws Exception;
    public void modificar(Books book) throws Exception;
    public void eliminar(int bookId) throws Exception;
    public List<Books> listar(String title) throws Exception;
    public Books getBookById(int bookId) throws Exception;
    
}
