package co.backend.servidor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.backend.servidor.dto.rutaDTO;
import co.backend.servidor.service.IRutaService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(value = "/ruta")
public class RutaController {

    @Autowired
    private IRutaService userService;

    @GetMapping(value = "/listRuta")
    public ResponseEntity list(){
        return new ResponseEntity(userService.listRuta(), HttpStatus.OK);
    }

    @GetMapping(value = "/listRuta/{id}")
    public ResponseEntity findById(@PathVariable(value = "id") Integer id) {
        return new ResponseEntity(userService.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/addRuta")
    public ResponseEntity add(@RequestBody rutaDTO user){
        return new ResponseEntity(userService.addRuta(user), HttpStatus.OK);
    }

    @PutMapping(value = "/updateRuta/{id}")
    public ResponseEntity edit(@PathVariable(value = "id") Integer id, @RequestBody rutaDTO user){
        return new ResponseEntity(userService.editRuta(id, user), HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteRuta/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Integer id){
        return new ResponseEntity(userService.deleteRuta(id), HttpStatus.OK);
    }

    @GetMapping(value = "/rutas/{iduser}")
    public ResponseEntity rutasByUser(@PathVariable(value = "iduser") Integer iduser){
        return new ResponseEntity(userService.rutasByUser(iduser),HttpStatus.OK);
    }

}
