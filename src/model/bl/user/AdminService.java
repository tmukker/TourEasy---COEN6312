package model.bl.user;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.bl.hotel.HotelService;
import model.bl.tour.TourService;
import model.enums.KnownLanguages;
import model.enums.ModeOfTransport;
import model.enums.Role;
import tourEasy.Admin;
import tourEasy.Destination;
import tourEasy.Guide;
import tourEasy.Hotel;
import tourEasy.Person;
import tourEasy.Tour;
import tourEasy.User;
import tourEasy.impl.AdminImpl;
import tourEasy.impl.DestinationImpl;
import tourEasy.impl.HotelImpl;
import tourEasy.impl.PersonImpl;
import tourEasy.impl.TourImpl;
import tourEasy.impl.UserImpl;

public class AdminService extends UserService {

	static List<Admin> adminList = new ArrayList<>();

	public static List<Admin> getAdminList() {
		return getUserList().stream().filter(u -> u.getRole().equals(Role.ADMINISTRATOR))
				.map(u -> new AdminImpl(u, "Overall", null, 300.0)).collect(Collectors.toList());
	}

	public static void showAllUsers() {
		userList.forEach(u -> {
			showProfile(u);
			System.out.println();
		});
	}

	public static void addUser(String firstName, String lastName, LocalDateTime dob, String contactNo, String email,
			String password, List<KnownLanguages> knownLanguages, Role role) {
		LocalDateTime now = LocalDateTime.now();
		long age = ChronoUnit.YEARS.between(dob, now);

		if (age < 18) {
			System.err.println("A user must be at least 18 years old");
			return;
		}

		String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%?&])[A-Za-z\\d@$!%?&]{8,}$";

		if (!password.matches(passwordRegex)) {
			System.err.println("The password must contain – one letter, one number,"
					+ " one capital letter and a special character");
			return;
		}

		User user = new UserImpl(firstName, lastName, dob, contactNo, email, knownLanguages, email, role);
		putUserList(user);
		System.out.println("The user has been added");
	}

	public static void removeUser(String email) {
		User userToRemove = getUserByEmail(email);
		removeUserList(userToRemove);
		System.out.println("The user has been removed");
	}

//	public static void addTour(String tourId, String destination, Integer numberOfNights, Hotel hotel,
//							   ModeOfTransport inCityModeOfTransport, Guide guide) {
//		Tour newTour = new Tour(tourId, destination, numberOfNights, hotel, inCityModeOfTransport, guide);
//		TourService.addTour(newTour);
//		System.out.println("The tour has been added");
//	}

	public static void showAllTours() {
		TourService.getAllTours().forEach(t -> {
			System.out.println("Tour Id: " + t.getTourId());
			System.out.println("Destination: " + t.getDestination().getName());
			System.out.println("Hotel: " + t.getHotel().getHotelName());
			System.out.println("Number of Nights: " + t.getNumberOfNights());
			System.out.println();
		});
	}

	public static void showAllHotels() {
		HotelService.getHotelList().forEach(h -> {
			System.out.println("Hotel Id: " + h.getHotelId());
			System.out.println("Hotel Name: " + h.getHotelName());
			System.out.println("Hotel City: " + h.getCityName());
			System.out.println("Price: " + h.getPrice());
			System.out.println("Manager Name: " + h.getManager().getFirstName() + " " + h.getManager().getLastName());
			System.out.println();
		});
	}

	public static void addHotel(String hotelName, String hotelAddress, String cityName, Integer noOfAvailRooms,
			Float price, String mfirstName, String mlastName, LocalDateTime mdob, String mcontactNo, String memail,
			List<KnownLanguages> mknownLanguages) {

		if (mknownLanguages.size() < 2 || memail.isEmpty() || mcontactNo.isEmpty()) {
			System.err.println("The hotel manager must have knowledge of at least two languages,"
					+ " and their email and contact number must be provided");
			return;
		}

		Person manager = new PersonImpl(mfirstName, mlastName, mdob, mcontactNo, memail, mknownLanguages);
		Hotel hotel = new HotelImpl(hotelName, hotelAddress, manager, cityName, noOfAvailRooms, price);
		HotelService.putHotelList(hotel);
		System.out.println("The hotel has been added");
	}

	public static void addTour(String tourId, String destinationName, String destinationDesc,
			List<String> destAttractions, Integer numberOfNights, Integer hotelId, ModeOfTransport modeofTransport,
			String guideEmail) {
		Hotel hotel = HotelService.getHotelById(hotelId);

		if (hotel != null) {
			if (hotel.getNumberOfAvailableRooms() <= 0 || numberOfNights <= 1) {
				System.err.println("If a tour includes a hotel, there should be available rooms"
						+ " and the duration of stay should be more than one night.");
				return;
			}
		}

		Destination destination = new DestinationImpl(destinationName, destinationDesc, destAttractions);
		Guide guide = GuideService.getGuideByEmail(guideEmail);

		if (guide == null || guide.getGuideCharges() <= 0) {
			System.err.println("A tour must have a guide with non-zero guide charges");
			return;
		}

		Tour tour = new TourImpl(tourId, destination, numberOfNights, hotel, modeofTransport, guide);
		TourService.putTourList(tour);
		System.out.println("The tour has been added");
	}

}
