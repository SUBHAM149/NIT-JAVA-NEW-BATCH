package com.nit.factory;

import com.nit.service.GooglePayPayment;
import com.nit.service.PaytmPayment;
import com.nit.service.PaymentGateway;
import com.nit.service.PhonePePayment;

public class PaymentFactory {

	public PaymentGateway getPaymentGateway(String gatewayType) {

		if (gatewayType.equalsIgnoreCase("PHONEPE")) {
			return new PhonePePayment();
		} else if (gatewayType.equalsIgnoreCase("GPAY")) {
			return new GooglePayPayment();
		} else if (gatewayType.equalsIgnoreCase("PAYTM")) {
			return new PaytmPayment();
		}

		return null;
	}
}
