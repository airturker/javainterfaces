package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()}; //istedi�ini bu array e ekle - diziye
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1, "engin","demiro�");
		
		customerManager.add(engin);

	}

}
