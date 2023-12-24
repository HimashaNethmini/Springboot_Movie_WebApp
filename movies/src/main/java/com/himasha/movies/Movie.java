package com.himasha.movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

//defining the data types & attributes
@Document(collection = "movies")
@Data  // setting getters, setters using lombok
@AllArgsConstructor //annotation to create constructor
@NoArgsConstructor// annotation saying no constructors in some places
public class Movie {

    @Id    //this annotation lets compiler identify this is the id (pk)
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    private String poster;
    private List<String> backdrops;
    @DocumentReference
    private List<Review> reviewIds; //embedded relationship with Review.java

}
