package com.example.demo.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import antlr.collections.List;
@Entity
public class UserList {
	ArrayList<User> userList= new ArrayList<User>();
	@Id
    @GeneratedValue
    private int id;

}
