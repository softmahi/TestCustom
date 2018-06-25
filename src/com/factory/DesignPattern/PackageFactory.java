package com.factory.DesignPattern;

public abstract class PackageFactory {

	public interface BillingValue {

		int calculateBill();
	}

	protected abstract BillingValue createPackagingDetails(String packageType);

}
