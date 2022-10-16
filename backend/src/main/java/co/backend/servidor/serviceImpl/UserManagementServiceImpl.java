package co.backend.servidor.serviceImpl;

import co.backend.servidor.dto.UserDTO;
import co.backend.servidor.repository.IUserRepository;

import java.util.List;

import org.springframework.stereotype.Service;



import co.backend.servidor.service.UserManagamentService;

@Service
public class UserManagementServiceImpl implements UserManagamentService {

    private final IUserRepository userRepository;

    public UserManagementServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> listUser() {
        return userRepository.findAll();
    }

    @Override
    public UserDTO findById(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public Boolean addUser(UserDTO prueba) {
        userRepository.save(prueba);
        return true;
    }

    @Override
    public Boolean editUser(int id, UserDTO prueba) {
        UserDTO user = userRepository.findById(id).get();
        if(user != null){
            user.setId(id);
            user.setName(prueba.getName());
            user.setUsername(prueba.getPhone());
            user.setEmail(prueba.getEmail());
            user.setPassword(prueba.getPassword());
            userRepository.save(user);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteUser(int id) {
        userRepository.deleteById(id);
        return true;
    }

    @Override
    public UserDTO login(Integer id, String password) {
        UserDTO user = new UserDTO();
        try {
            System.out.println("Entro");
            user = userRepository.login(id, password);
            System.out.println("Nombre: " + user.getName());
            return user;    
        } catch (Exception e) {
            System.out.println("Catch");
            return null;
        }
        
    }




}
