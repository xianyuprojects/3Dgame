package com.edu.dmgame.entities;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CATEGORY_ENTITY".
 */
public class CategoryEntity {

    private Long id;
    private String category;

    public CategoryEntity() {
    }

    public CategoryEntity(Long id) {
        this.id = id;
    }

    public CategoryEntity(Long id, String category) {
        this.id = id;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
