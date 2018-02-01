/**
 * 
 */
package observables;

import java.util.Observable;

/**
 * @author Manu
 *
 */
public class Dispatch extends Observable {
	
	private int pickups;
	private int deliveries;
	private int drivers;
	
	public Dispatch() {
		
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(int pickups, int deliveries, int drivers) {
		this.pickups = pickups;
		this.deliveries = deliveries;
		this.drivers = drivers;
		measurementsChanged();
	}
	
	public int getPickups() {
		return pickups;
	}
	
	public int getDeliveries() {
		return deliveries;
	}
	
	public int getDrivers() {
		return drivers;
	}
}
