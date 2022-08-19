package com.example.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodolistRequest {

    private String title;
    private Long order;
    private Boolean completed;
}