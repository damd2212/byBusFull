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

import co.backend.servidor.dto.UserDTO;
import co.backend.servidor.service.UserManagamentService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserManagamentService userService;

    @GetMapping(value = "/listUser")
    public ResponseEntity list(){
        return new ResponseEntity(userService.listUser(), HttpStatus.OK);
    }

    @GetMapping(value = "/listUser/{id}")
    public ResponseEntity listById(@PathVariable(value = "id") Integer id) {
        return new ResponseEntity(userService.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/addUser")
    public ResponseEntity add(@RequestBody UserDTO user){
        return new ResponseEntity(userService.addUser(user), HttpStatus.OK);
    }

    @PutMapping(value = "/updateUser/{id}")
    public ResponseEntity edit(@PathVariable(value = "id") Integer id, @RequestBody UserDTO user){
        return new ResponseEntity(userService.editUser(id, user), HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteUser/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Integer id){
        return new ResponseEntity(userService.deleteUser(id), HttpStatus.OK);
    }

    @GetMapping(value="/login/{id}/{password}")
    public ResponseEntity login(@PathVariable(value = "id")Integer id,@PathVariable(value = "password")String password ) {
        return new ResponseEntity(userService.login(id, password),HttpStatus.OK);
    }
     
}
