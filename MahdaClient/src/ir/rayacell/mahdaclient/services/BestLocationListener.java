package ir.rayacell.mahdaclient.services;

import ir.rayacell.mahdaclient.services.BestLocationProvider.LocationType;
import android.location.Location;
import android.os.Bundle;

public abstract class BestLocationListener {
	public abstract void onLocationUpdate(Location location, LocationType type,
			boolean isFresh);

	public abstract void onLocationUpdateTimeoutExceeded(LocationType type);

	public abstract void onStatusChanged(String provider, int status,
			Bundle extras);

	public abstract void onProviderEnabled(String provider);

	public abstract void onProviderDisabled(String provider);
}