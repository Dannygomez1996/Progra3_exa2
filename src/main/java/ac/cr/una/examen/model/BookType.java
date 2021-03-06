/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.examen.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Danny Andrey Gómez Chaves 116440310
 */
@Entity
@Table(name = "booktype", catalog = "progra3_exa2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id_Type")})
public class BookType implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_Type", unique = true, nullable = false)
    private int idType;
    @Column(name = "type", unique = false, nullable = false)
    private String type;

    /**
     *
     * @param idType
     * @param type
     */
    public BookType(int idType, String type) {
        this.idType = idType;
        this.type = type;
    }

    /**
     *
     */
    public BookType() {
    }

    /**
     *
     * @return
     */
    public int getIdType() {
        return idType;
    }

    /**
     *
     * @param idType
     */
    public void setIdType(int idType) {
        this.idType = idType;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.idType;
        hash = 53 * hash + Objects.hashCode(this.type);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BookType other = (BookType) obj;
        if (this.idType != other.idType) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "BookType{" + "idType=" + idType + ", type=" + type + '}';
    }

}
