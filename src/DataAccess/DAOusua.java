/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DataAccess;

import java.util.List;

import DataAccess.DTO.Users;
import Framework.CustomException;

public interface DAOusua {
    public void registrar(Users usua)throws CustomException;
    public void modificar(Users usua) throws CustomException;
    public void sancionar(Users usua) throws CustomException;
    public void eliminar(int userId) throws CustomException;
    public List<Users> listar(String name) throws CustomException;
    public Users getUserById(int userId) throws CustomException;
}
