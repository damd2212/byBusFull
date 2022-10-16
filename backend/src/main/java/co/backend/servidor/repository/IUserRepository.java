package co.backend.servidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.backend.servidor.dto.UserDTO;

@Repository
public interface IUserRepository extends JpaRepository<UserDTO, Integer> {

    @Query(value="SELECT * FROM user WHERE id=?1 AND password=?2",nativeQuery = true)
    UserDTO login(Integer id,String password);
}
