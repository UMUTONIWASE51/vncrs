/**
 *
 */
package com.src.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Entity to handle users for authentication
 *
 * @author Planet Innovation
 */
@Entity
@Table (name="users", uniqueConstraints={@UniqueConstraint(columnNames = "username")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer userId;
    private String username;
    private String password;
    @ManyToOne
    @JoinColumn(name="person_id")
    private Person person;
    
    public User(){}

    /**
     * @param username
     * @param password
     */
    public User(String username, String password, Person person) {
        this.username = username;
        this.password = password;
        this.person = person;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
