package model.bl.user;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.bl.booking.BookingService;
import model.enums.Role;
import tourEasy.Booking;
import tourEasy.Guide;
import tourEasy.SpecialRequest;
import tourEasy.impl.GuideImpl;

public class GuideService {

	static List<Guide> guideList = new ArrayList<>();

	public static List<Guide> getGuideList() {
		return UserService.getUserList().stream().filter(u -> u.getRole().equals(Role.GUIDE))
				.map(u -> new GuideImpl(u, 500.0)).collect(Collectors.toList());
	}

	public static Guide getGuideByEmail(String email) {
		return getGuideList().stream().filter(g -> email.equalsIgnoreCase(g.getEmail())).findFirst().orElse(null);
	}

	public static Booking acknowledgeSpecialRequest(String bookingId) {
		Booking booking = BookingService.getBookingById(bookingId);
		SpecialRequest specialRequest = booking.getSpecialRequest();

		if (specialRequest.getDescription().isEmpty() || specialRequest.getDescription().length() <= 256) {
			specialRequest.setIsApproved(false);
			System.err.println("For a special request to be approved, "
					+ "it must have a description with more than 256 characters");
		}
		
		specialRequest.setIsApproved(true);
		booking.setSpecialRequest(specialRequest);
		return booking;
	}
}




