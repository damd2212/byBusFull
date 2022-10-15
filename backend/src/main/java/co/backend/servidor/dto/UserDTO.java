package co.backend.servidor.dto;

import javax.persistence.*;


@Entity
@Table(name="user")
public class UserDTO{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String first_name;
    private String last_name;
    private String username;
    private String email;
    private String password;

    public UserDTO() {
    }

    public UserDTO(Integer id, String first_name, String last_name, String username, String email, String password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", first_name='" + getFirst_name() + "'" +
            ", last_name='" + getLast_name() + "'" +
            ", username='" + getUsername() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }


}
