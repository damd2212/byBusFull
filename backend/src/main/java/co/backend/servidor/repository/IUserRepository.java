package co.backend.servidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.backend.servidor.dto.UserDTO;

@Repository
public interface IUserRepository extends JpaRepository<UserDTO, Integer> {
}
