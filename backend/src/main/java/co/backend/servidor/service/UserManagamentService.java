package co.backend.servidor.service;

import java.util.List;
import co.backend.servidor.dto.UserDTO;

public interface UserManagamentService {

    public List<UserDTO> listUser();
    
    public UserDTO findById(Integer id);
    
    public Boolean addUser(UserDTO user);
    
    public Boolean editUser(int id,UserDTO user);
    
    public Boolean deleteUser(int id);

    public UserDTO login(Integer id, String password);
    
}
