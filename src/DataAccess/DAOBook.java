/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DataAccess;

import java.util.List;

import DataAccess.DTO.Books;
import Framework.CustomException;

public interface DAOBook {
    public void registrar(Books book) throws CustomException;
    public void modificar(Books book) throws CustomException;
    public void eliminar(int bookId) throws CustomException;
    public List<Books> listar(String title) throws CustomException;
    public Books getBookById(int bookId) throws CustomException;
    
}
