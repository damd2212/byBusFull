package co.backend.servidor.service;

import java.util.List;
import co.backend.servidor.dto.rutaDTO;

public interface IRutaService {

    public List<rutaDTO> listRuta();
    
    public rutaDTO findById(Integer id);
    
    public Boolean addRuta(rutaDTO user);
    
    public Boolean editRuta(int id,rutaDTO user);
    
    public Boolean deleteRuta(int id);

    public List<rutaDTO> rutasByUser(Integer iduser);
    
}
