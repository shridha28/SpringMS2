package io.javabrains.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.ratingsdataservice.models.Rating;
import io.javabrains.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
	
	@RequestMapping("/{movieID}")
	public Rating getRating(@PathVariable("movieID") String movieID) {
		
		
		return new Rating(movieID, 5);
	}
	
	
	@RequestMapping("users/{userID}")
public UserRating getRatings(@PathVariable("userID") String userID) {
		
		List<Rating> ratings=  Arrays.asList(new Rating("Titanic", 7), new Rating("4567", 9));
		
		UserRating userRating = new UserRating();
		userRating.setRatings(ratings);
		return userRating;
	}	
	
   
}
 