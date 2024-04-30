package view.users;

import java.util.Scanner;

import tourEasy.User;

public class GuideView {

	public static Integer showMenuAndChoose(User loggedInUser) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("1. Show Profile");
      System.out.println("2. Edit Profile");
      System.out.println("3. Approve Special Request");
      System.out.println("0. Logout");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();
      
      return choice;
	}


	public static String getBookingIdInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Booking Id: ");
		String bookingId = scanner.nextLine();
		return bookingId;
	}
}
