package com.ptasdevz.lilyapi.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
    @Id
    private  Integer id;
    private String name;
    private String description;
    private Boolean isInStock;
    private String imgUrl;
    private Integer categoryId;
    private Double lowerPriceRange;
    private Double upperPriceRange;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product(
            Integer id,
            String name,
            String description,
            Boolean isInStock, Integer categoryId, Double lowerPriceRange, Double upperPriceRange) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.categoryId = categoryId;
        this.isInStock =isInStock;
        this.lowerPriceRange = lowerPriceRange;
        this.upperPriceRange = upperPriceRange;
        this.imgUrl = "/static/images/products/flower_"+this.id +".jpg";

    }

    public Boolean getInStock() {
        return isInStock;
    }

    public void setInStock(Boolean inStock) {
        isInStock = inStock;
    }

    public Double getLowerPriceRange() {
        return lowerPriceRange;
    }

    public void setLowerPriceRange(Double lowerPriceRange) {
        this.lowerPriceRange = lowerPriceRange;
    }

    public Double getUpperPriceRange() {
        return upperPriceRange;
    }

    public void setUpperPriceRange(Double upperPriceRange) {
        this.upperPriceRange = upperPriceRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isInStock=" + isInStock +
                ", imgUrl='" + imgUrl + '\'' +
                ", categoryId=" + categoryId +
                ", lowerPriceRange=" + lowerPriceRange +
                ", upperPriceRange=" + upperPriceRange +
                '}';
    }
}
