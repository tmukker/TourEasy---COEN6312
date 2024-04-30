package model.bl.tour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.enums.KnownLanguages;
import model.enums.ModeOfTransport;
import model.enums.Role;
import tourEasy.Review;
import tourEasy.Tour;
import tourEasy.impl.DestinationImpl;
import tourEasy.impl.GuideImpl;
import tourEasy.impl.HotelImpl;
import tourEasy.impl.PersonImpl;
import tourEasy.impl.ReviewImpl;

public class TourService {
	static List<Tour> tourList = new ArrayList<>(Arrays.asList(//
			new TourImpl("T001", new DestinationImpl("City Tour", "A tour of the city", null), 2,
					new HotelImpl("City Hotel", "123 Main St",
							new PersonImpl("John", "Doe", null, "123-456-7890", "john.doe@email.com", null), "City", 50,
							100.0F),
					ModeOfTransport.BUS,
					new GuideImpl("GuideFirstName", "GuideLastName", null, "987-654-3210", "guide@email.com",
							Arrays.asList(KnownLanguages.ENGLISH, KnownLanguages.SPANISH), "pass", Role.GUIDE, 50.0)),

			new TourImpl("T002", new DestinationImpl("Mountain Hoke", "A hike through the beautiful mountains", null), 3,
					new HotelImpl("Mountain Lodge", "456 Mountain Rd",
							new PersonImpl("Jane", "Smith", null, "987-654-3210", "jane.smith@email.com", null),
							"Mountains", 30, 120.0F),
					ModeOfTransport.BUS,
					new GuideImpl("AnotherGuide", "GuideLastName", null, "123-789-4560", "another.guide@email.com",
							Arrays.asList(KnownLanguages.FRENCH, KnownLanguages.GERMAN), "pass", Role.GUIDE, 60.0))));

	static List<Review> reviewList = new ArrayList<>(
			Arrays.asList(new ReviewImpl("R001", "T001", null, 4, "Great city tour!", null),
					new ReviewImpl("R002", "T002", null, 5, "Amazing mountain hike!", null)));

	public static List<Review> getReviewsByTourId(String tourId) {
		return reviewList.stream().filter(review -> review.getTourId().equals(tourId)).collect(Collectors.toList());
	}

	public static List<Tour> getAllTours() {
		return tourList;
	}

	public static void addTour(Tour tour) {
		tourList.add(tour);
	}

	public static Tour getTourById(String tourId) {
		return tourList.stream().filter(tour -> tour.getTourId().equals(tourId)).findFirst().orElse(null);
	}

	public static void putTourList(Tour tour) {
		tourList.add(tour);
	}
}
