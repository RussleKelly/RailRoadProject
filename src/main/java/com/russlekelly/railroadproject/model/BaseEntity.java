package com.russlekelly.railroadproject.model;


/**
 * Base class with property 'id'.
 * Used as a base class for all objects that need this property.
 *
 * @author Rulsan Kuleshov
 */

public class BaseEntity {

    private Long id;

    public BaseEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNew() {
        return (this.id == null);
    }
}