package com.expensetracker.model;

//import javax.persistence.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "expenses")
public class Expense {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "expense_title", nullable = false)
    private String expenseTitle;

    @NotNull
    @Column(name = "expense_amount", nullable = false)
    private Double expenseAmount;

    @NotBlank
    @Column(name = "category", nullable = false)
    private String category;

    @NotNull
    @Column(name = "expense_date", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate expenseDate;

    @Column(name = "description")
    private String description;

    //Constructor - empty constructor for ..
    public Expense(){}

    //Constructor
    public Expense(String expenseTitle, Double expenseAmount, String category, LocalDate expenseDate, String description){
        this.expenseTitle = expenseTitle;
        this.expenseAmount = expenseAmount;
        this.category = category;
        this.expenseDate = expenseDate;
        this.description = description;
    }

    //getter setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpenseTitle() {
        return expenseTitle;
    }

    public void setExpenseTitle(String expenseTitle) {
        this.expenseTitle = expenseTitle;
    }

    public Double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(Double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    



}
