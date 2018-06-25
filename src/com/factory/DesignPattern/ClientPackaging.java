package com.factory.DesignPattern;

import java.util.Scanner;

import com.factory.DesignPattern.PackageFactory.BillingValue;

public class ClientPackaging {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String pakageType = s.nextLine();

		System.out.println(pakageType);

		PackageFactory factory = SimplePackageFactory.getUniqueInstance();

		BillingValue b = factory.createPackagingDetails("BOX");

		System.out.println(b.calculateBill());
	}

}
