package com.betagames.dto;

import java.util.Date;
import java.util.List;

public class GamesDTO {

    private Integer id;
    private String name;
    private Date date;
    private Integer minGameTime;
    private Integer maxGameTime;
    private Integer minPlayerNumber;
    private Integer maxPlayerNumber;
    private Integer minAge;
    private String description;
    private Integer stockQuantity;
    private Double price;

    private EditorsDTO editorDTO;
    private List<AuthorsDTO> listAuthorsDTO;
    private List<CategoriesDTO> listCategoryDTO;
    private List<ReviewsDTO> listReviewsDTO;

    public GamesDTO(Integer id, String name, Date date, Integer minGameTime, Integer maxGameTime,
            Integer minPlayerNumber, Integer maxPlayerNumber, Integer minAge, String description, Integer stockQuantity,
            Double price, EditorsDTO editorDTO, List<AuthorsDTO> listAuthorsDTO, List<CategoriesDTO> listCategoryDTO,
            List<ReviewsDTO> listReviewsDTO) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.minGameTime = minGameTime;
        this.maxGameTime = maxGameTime;
        this.minPlayerNumber = minPlayerNumber;
        this.maxPlayerNumber = maxPlayerNumber;
        this.minAge = minAge;
        this.description = description;
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.editorDTO = editorDTO;
        this.listAuthorsDTO = listAuthorsDTO;
        this.listCategoryDTO = listCategoryDTO;
        this.listReviewsDTO = listReviewsDTO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getMinGameTime() {
        return minGameTime;
    }

    public void setMinGameTime(Integer minGameTime) {
        this.minGameTime = minGameTime;
    }

    public Integer getMaxGameTime() {
        return maxGameTime;
    }

    public void setMaxGameTime(Integer maxGameTime) {
        this.maxGameTime = maxGameTime;
    }

    public Integer getMinPlayerNumber() {
        return minPlayerNumber;
    }

    public void setMinPlayerNumber(Integer minPlayerNumber) {
        this.minPlayerNumber = minPlayerNumber;
    }

    public Integer getMaxPlayerNumber() {
        return maxPlayerNumber;
    }

    public void setMaxPlayerNumber(Integer maxPlayerNumber) {
        this.maxPlayerNumber = maxPlayerNumber;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public EditorsDTO getEditorDTO() {
        return editorDTO;
    }

    public void setEditorDTO(EditorsDTO editorDTO) {
        this.editorDTO = editorDTO;
    }

    public List<AuthorsDTO> getListAuthorsDTO() {
        return listAuthorsDTO;
    }

    public void setListAuthorsDTO(List<AuthorsDTO> listAuthorsDTO) {
        this.listAuthorsDTO = listAuthorsDTO;
    }

    public List<CategoriesDTO> getListCategoryDTO() {
        return listCategoryDTO;
    }

    public void setListCategoryDTO(List<CategoriesDTO> listCategoryDTO) {
        this.listCategoryDTO = listCategoryDTO;
    }

    public List<ReviewsDTO> getListReviewsDTO() {
        return listReviewsDTO;
    }

    public void setListReviewsDTO(List<ReviewsDTO> listReviewsDTO) {
        this.listReviewsDTO = listReviewsDTO;
    }

    @Override
    public String toString() {
        return "GamesDTO [id=" + id + ", name=" + name + ", date=" + date + ", minGameTime=" + minGameTime
                + ", maxGameTime=" + maxGameTime + ", minPlayerNumber=" + minPlayerNumber + ", maxPlayerNumber="
                + maxPlayerNumber + ", minAge=" + minAge + ", description=" + description + ", stockQuantity="
                + stockQuantity + ", price=" + price + ", editorDTO=" + editorDTO + ", listAuthorsDTO=" + listAuthorsDTO
                + ", listCategoryDTO=" + listCategoryDTO + ", listReviewsDTO=" + listReviewsDTO + "]";
    }

}// class
