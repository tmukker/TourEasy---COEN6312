package model.bl.payment;

import static model.bl.booking.BookingService.calculateBookingAmount;

import model.enums.PaymentMode;
import tourEasy.PaymentInfo;
import tourEasy.Wallet;

public class PaymentService {

    public static boolean processPayment(PaymentInfo paymentInfo) {
        if (paymentInfo != null) {
            System.out.println("Processing payment:");
            System.out.println(paymentInfo);
            if (paymentInfo != null) {
                PaymentMode paymentMode = paymentInfo.getPreferredModeOfPayment();
                if (paymentMode == PaymentMode.CARD) {
                    String cardDetails = paymentInfo.getCardDetails();
                    System.out.println("Payment successful using card. Card details: " + cardDetails);
                    return true;
                } else if (paymentMode == PaymentMode.WALLET) {
                    Wallet walletDetails = paymentInfo.getWalletDetails();
                    double bookingAmount = calculateBookingAmount();
                    if (walletDetails != null && walletDetails.getWalletBalance() >= bookingAmount) {
                        walletDetails.withdraw(bookingAmount);
                        System.out.println("Payment successful using wallet. Remaining wallet balance: " + walletDetails.getWalletBalance());
                    } else {
                        System.out.println("Payment failed. Insufficient funds in the wallet.");
                    }
                }
            }
        } else {
            System.out.println("Invalid payment information. Payment failed.");
            return false;
        }
        return false;
    }
}
