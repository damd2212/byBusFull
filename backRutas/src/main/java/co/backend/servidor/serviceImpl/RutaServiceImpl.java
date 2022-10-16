package co.backend.servidor.serviceImpl;

import co.backend.servidor.dto.rutaDTO;
import co.backend.servidor.repository.IRutaRepository;

import java.util.List;

import org.springframework.stereotype.Service;



import co.backend.servidor.service.IRutaService;

@Service
public class RutaServiceImpl implements IRutaService {

    private final IRutaRepository rutaRepository;

    public RutaServiceImpl(IRutaRepository userRepository) {
        this.rutaRepository = userRepository;
    }

    @Override
    public List<rutaDTO> listRuta() {
        return rutaRepository.findAll();
    }

    @Override
    public rutaDTO findById(Integer id) {
        return rutaRepository.findById(id).get();
    }

    @Override
    public Boolean addRuta(rutaDTO prueba) {
        rutaRepository.save(prueba);
        return true;
    }

    @Override
    public Boolean editRuta(int id, rutaDTO prueba) {
        rutaDTO user = rutaRepository.findById(id).get();
        if(user != null){
            user.setId(id);
            user.setNamecom(prueba.getNamecom());
            user.setNumruta(prueba.getNumruta());
            user.setIduser(prueba.getIduser());
            user.setDescription(prueba.getDescription());
            rutaRepository.save(user);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteRuta(int id) {
        rutaRepository.deleteById(id);
        return true;
    }

    @Override
    public List<rutaDTO> rutasByUser(Integer iduser) {
        try {
            List<rutaDTO> listarutas = rutaRepository.rutasByUser(iduser);
            return listarutas;
        } catch (Exception e) {
            return null;
        }
        
    }


}
