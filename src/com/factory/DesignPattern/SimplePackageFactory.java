package com.factory.DesignPattern;

import com.factory.DesignPattern.SimplePackageFactory.BoxBilling;

public class SimplePackageFactory extends PackageFactory {

	public class BoxBilling implements BillingValue {
		@Override
		public int calculateBill() {
			return 12;
		}
	}
	
	private static SimplePackageFactory simplePackageFactory;
	
	private  SimplePackageFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static SimplePackageFactory getUniqueInstance() {
		
		if(simplePackageFactory == null) {
			simplePackageFactory = new SimplePackageFactory();
		}
		return simplePackageFactory;
	}

	@Override
	protected BillingValue createPackagingDetails(String packageType) {

		if(packageType.equalsIgnoreCase("BOX")) {
			return new BoxBilling();
		}
		throw new IllegalArgumentException("Invalid input");
	}

}
