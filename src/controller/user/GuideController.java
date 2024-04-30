package controller.user;

import java.util.List;

import model.bl.user.GuideService;
import model.bl.user.UserService;
import model.enums.KnownLanguages;
import tourEasy.User;
import view.users.GuideView;
import view.users.UserView;

public class GuideController {

	public static void processUserInput(User loggedInUser) {
		Boolean isLoggedIn = true;
		while (isLoggedIn) {
			int choice = GuideView.showMenuAndChoose(loggedInUser);
			switch (choice) {
			case 0:
				LoginController.logout();
				isLoggedIn = false;
				break;
			case 1:
				UserService.showProfile(loggedInUser);
				break;
			case 2:
				UserView.promptToEditProfile(loggedInUser);
				String contactNo = UserView.getContactNoInput();
				List<KnownLanguages> knownLanguages = UserView.getKnownLanguagesInput();
				UserService.editProfile(loggedInUser, contactNo, knownLanguages);
				break;
			case 3:
				String bookingId = GuideView.getBookingIdInput();
				GuideService.acknowledgeSpecialRequest(bookingId);
				break;
			default:
				System.out.println("Invalid!");
			}

		}
	}

}
