package co.backend.servidor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.backend.servidor.dto.rutaDTO;

@Repository
public interface IRutaRepository extends JpaRepository<rutaDTO, Integer> {

    @Query(value="SELECT * FROM ruta WHERE iduser=?1",nativeQuery = true)
    List<rutaDTO> rutasByUser(Integer iduser);
}
