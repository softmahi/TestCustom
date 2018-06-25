package com.test.factoryDesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * 
 * 
 * 
 * 
 * Factory: Factory is an abstract class which is a single point of contact for
 * the client. All the concrete factory classes needs to implement the abstract
 * factory method.
 * 
 * StatementFactory: This is the Factory implementation class which consist of
 * the creator method. This class extends from the Factory abstract class.This
 * is the main creator class for all the products e.g. Statements.
 * 
 * StatementType: This is a product interface which provides abstraction to the
 * various types of products which needs to be created by the Factory class.
 * 
 * DetailedStatement: This is a concrete implementation of the StatementType
 * interface which will print the detailed statements.
 * 
 * MiniStatement: This is a concrete implementation of the StatementType
 * interface which will print the mini statements.
 * 
 * Client: This is the client class which will call the StatementFactory and
 * StatementType and request for object creation.
 * 
 * Assumption
 * 
 * The design solution caters to only single ATM machine.
 * 
 * 
 * @author User1
 *
 */
public class TestATMFactory {

	public static void main(String[] args) {

		System.out.println("Enter your selection:");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String selection = null;

		try {

			selection = br.readLine();

		} catch (IOException e) {

			e.printStackTrace();

		}

		Factory factory = StatementFactory.getUniqueInstance();
		StatementType st = factory.createStatement(selection);
		
		System.out.println(st.print());

	}

}
