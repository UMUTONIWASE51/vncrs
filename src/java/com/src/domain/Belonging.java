/**
 *
 */
package com.src.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity to handle properties and other belongings
 *
 * @author Planet Innovation
 */
@Entity
public class Belonging {

    @Id
    private Integer belongingId;
    private String name;
    private String type;
    private String brand;

    /**
     * @param name
     * @param type
     * @param brand
     */
    public Belonging(String name, String type, String brand) {
        this.name = name;
        this.type = type;
        this.brand = brand;
    }

    /**
     * @return the belongingId
     */
    public Integer getBelongingId() {
        return belongingId;
    }

    /**
     * @param belongingId the belongingId to set
     */
    public void setBelongingId(Integer belongingId) {
        this.belongingId = belongingId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
