package com.day30;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 *  Have the source code then how can we work 
 */
@Component("pay")
public class ShoppingPayment {

    Ipayment paymentMode ;

    public void payment() {
  
        if (paymentMode.paymentVerification()) {

            System.out.println
            ("Payment successful through " + paymentType());

        } else {

            System.out.println("Payment mode is not suitable");
        }
    }
    
    
     @Autowired
    public void setPaymentMode(Ipayment paymentMode) {
		this.paymentMode = paymentMode;
	}



	public String paymentType() {

        if (paymentMode instanceof PhonePay) {
            return "PhonePay";
        }
        else if (paymentMode instanceof Paytm) {
            return "Paytm";
        }
        else if (paymentMode instanceof Gpay) {
            return "Gpay";
        }
        else {
            return "Card";
        }
    }
}


package com.day30;

/*
 *  So suppose these all class don't have the source code
 */
public class PhonePay implements Ipayment {

	 private String QRcode;
	 private String name;
	 
	 
	 public boolean paymentVerification() {
		 
		 String paymentMode=QRcode
				  .substring(QRcode.indexOf("#")+1);
		   
		  return paymentMode.equals("PhonePay");
	 }


	public String getQRcode() {
		return QRcode;
	}


	public void setQRcode(String qRcode) {
		QRcode = qRcode;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	 
	 
}

package com.day30;

public class Paytm implements Ipayment{

	private String QRcode;
	private String name;
	 
	 
	 public boolean paymentVerification() {
		 String paymentMode=QRcode
				  .substring(QRcode.indexOf("#")+1);
		 
		  return paymentMode.equals("PaytmPay");
	 }


	public String getQRcode() {
		return QRcode;
	}


	public void setQRcode(String qRcode) {
		QRcode = qRcode;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	 
	 
}

package com.day30;

public class Gpay implements Ipayment{

	private String QRcode;
	 private String name;
	 
	 
	 public boolean paymentVerification() {
		 String paymentMode=QRcode
				  .substring(QRcode.indexOf("#")+1);
		 
		  return paymentMode.equals("GPay");
	 }


	public String getQRcode() {
		return QRcode;
	}


	public void setQRcode(String qRcode) {
		QRcode = qRcode;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	 
	 
}

package com.day30;

public class Card implements Ipayment{
  private String cardName;
  private String cardNumber;
  
	 
	 public boolean paymentVerification() {
		     return ((cardName.equals("ICICI")
		    		   || cardName.equals("SBI")) 
		    		&& cardNumber.length()==13);
	 }


	public String getCardName() {
		return cardName;
	}


	public void setCardName(String cardName) {
		this.cardName = cardName;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	 
	 
}


package com.day30;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySources({
@PropertySource("classpath:com/day30/application.properties"),
@PropertySource("classpath:com/day30/ICICICard.properties"),
@PropertySource("classpath:com/day30/SBICard.properties")
})
@ComponentScan(basePackages = "com.day30")
public class JavaConfiguration {
	
	@Autowired
	Environment environment;
	
	@Bean
	 public Paytm paytm() {
		  Paytm paytm=new Paytm();
		  paytm.setQRcode(environment.getProperty("paytmQR"));
		  paytm.setName(environment.getProperty("name"));
		  return paytm;
	 }
	 
	@Bean
	
	 public PhonePay phonePay() { 
		 PhonePay phonePay=new PhonePay();
		 phonePay.setQRcode(environment.getProperty("phonePayQR"));
		 phonePay.setName(environment.getProperty("name"));
		 return phonePay;
	 }
	 
	 @Bean
	 public Gpay gpay() {
		  Gpay gpay=new Gpay();
		  gpay.setQRcode(environment.getProperty("gpayQR"));
		  gpay.setName(environment.getProperty("name"));
		  return gpay;
		  
	 }
	 
	 @Bean
	 public Card card1() {
		  
		  Card card=new Card();
		   card.setCardName(environment.getProperty("firstCard"));
		   card.setCardNumber(environment.getProperty("firstcardNumber"));
		  return card;
	 }
	 
	 @Bean
	 @Primary
	 public Card card2() {
		  
		  Card card=new Card();
		   card.setCardName(environment.getProperty("secCard"));
		   card.setCardNumber(environment.getProperty("seccardNumber"));
		  return card;
	 }

}

application.properties

phonePayQR=QR#PhonePay
paytmQR=QR#phonePay
gpayQR=QR#gpayQR
name=PRASHANT

ICICICard.properties

firstCard=ICICI
firstcardNumber=1231231231231

SBICard.properties

secCard=SBI
seccardNumber=9999991231231


package com.day30;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FlipkartApp {
	public static void main(String[] args) {

		ApplicationContext context =
				new AnnotationConfigApplicationContext(JavaConfiguration.class);

		ShoppingPayment bean = context.getBean("pay", ShoppingPayment.class);
		bean.payment();

	}
}
