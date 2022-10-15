package co.backend.servidor.service;

import java.util.List;
import co.backend.servidor.dto.UserDTO;

public interface UserManagamentService {

    public List<UserDTO> listUser();
    
    public UserDTO listUserById(Integer id);
    
    public Boolean addUser(UserDTO user);
    
    public Boolean editUser(int id,UserDTO user);
    
    public Boolean deleteUser(int id);
    
}
