/**
 * 
 */
package terminalComponents;

import java.util.Scanner;

import observables.Dispatch;
import observers.DriverCabDisplay;
import utilities.Validator;

/**
 * @author Manu
 *
 */
public class AutoTransportTerminal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Dispatch dispatch = systemStartup();
		int pickups = getPickupsInfo(scan);
		int deliveries = getDeliveriesInfo(scan);
		int drivers = getDriversInfo(scan);
		dispatch.setMeasurements(pickups, deliveries, drivers);

	}

	public static Dispatch systemStartup() {
		Dispatch dispatch = new Dispatch();
		DriverCabDisplay cabMonitor = new DriverCabDisplay(dispatch);
		return dispatch;
	}

	public static int getPickupsInfo(Scanner scan) {
		int pickups = Validator.getInt(scan, "Welcome to the AutoTransport Database \n" + "Please input the current total pickups remaining: ", 0, Integer.MAX_VALUE);
		return pickups;
	}

	public static int getDeliveriesInfo(Scanner scan) {
		int deliveries = Validator.getInt(scan, "Please enter the current total deliveries remaining: ", 0, Integer.MAX_VALUE);
		return deliveries;
	}

	public static int getDriversInfo(Scanner scan) {
		int drivers = Validator.getInt(scan, "Please enter the current active drivers: ", 0, Integer.MAX_VALUE);
		return drivers;
	}

}
