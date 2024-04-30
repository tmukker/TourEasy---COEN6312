import controller.user.LoginController;
import tourEasy.User;


public class TourEasy {
	public static void main(String[] args) {

		while (true) {
			User loggedInUser = LoginController.login();

		}

    }
}