package com.devops.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"id"})
@MongoEntity(collection = "person",database = "Details")
public class Personal {
    private String name;
    private String age;
    private String city;
    private String address;
	   
 
}
