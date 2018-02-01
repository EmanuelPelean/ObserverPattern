/**
 * 
 */
package observers;

import java.util.Observable;
import java.util.Observer;

import displayInterfaces.DisplayElement;
import observables.Dispatch;

/**
 * @author Manu
 *
 */
public class DriverCabDisplay implements Observer, DisplayElement{
	Observable observable;
	private int pickups;
	private int deliveries;
	private int drivers;

	public DriverCabDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Dispatch) { 
			Dispatch dispatch = (Dispatch)o;
			this.pickups = dispatch.getPickups();
			this.deliveries = dispatch.getDeliveries();
			this.drivers = dispatch.getDrivers();
			display();
			
		}
	}

	@Override
	public void display() {
		System.out.println("Currently we have about " + pickups + " pickups left.\n" + 
			"Currently we have about " + deliveries + " deliveries left.\n" +
			"We have about " + drivers + " drivers in service at this time. Help!");
	}

}
