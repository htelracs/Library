/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import com.mycompany.models.Users;
import java.util.List;

public interface DAOusua {
    public void registrar(Users usua)throws Exception;
    public void modificar(Users usua) throws Exception;
    public void sancionar(Users usua) throws Exception;
    public void eliminar(int userId) throws Exception;
    public List<Users> listar(String name) throws Exception;
    public Users getUserById(int userId) throws Exception;
}
