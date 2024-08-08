/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DataAccess;

import DataAccess.DTO.Books;
import DataAccess.DTO.Lendings;
import DataAccess.DTO.Users;
import Framework.CustomException;

import java.util.List;

public interface DAOlending {
    public void registrar(Lendings lending) throws CustomException;
    public void modificar(Lendings lending) throws CustomException;
    public Lendings getLending(Users user, Books book) throws CustomException;
    // public void eliminar(Lendings user) throws CustomException;
    public List<Lendings> listar() throws CustomException;
    
}
