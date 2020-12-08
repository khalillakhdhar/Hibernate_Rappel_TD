package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long id;
@Column(nullable = false)
String nom;
@Column(nullable = false)
@Min(18)
int age;
@Size(min = 8)
String adresse;
@Size(min=20)
@Column(nullable = false,length = 20)
String tel;

}
