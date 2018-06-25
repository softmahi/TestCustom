package com.test.factoryDesignpattern;

public class StatementFactory extends Factory {

	public class MiniStatement implements StatementType {
		@Override
		public String print() {
			return "This is Mini statement";
		}
	}

	public class DetailedStatement implements StatementType {
		@Override
		public String print() {
			return "This is Detailed statement";
		}
	}

	private StatementFactory() {
	}

	public static StatementFactory getUniqueInstance() {
		System.out.println("Creating a new StatementFactory instance");
		return StatementFactoryHelper.statementFactory;
	}

	public static class StatementFactoryHelper {
		private final static StatementFactory statementFactory = new StatementFactory();
	}

	@Override
	protected StatementType createStatement(String Selection) {
		if (Selection.equalsIgnoreCase("DetailedStatement")) {
			return new DetailedStatement();
		} else if (Selection.equalsIgnoreCase("MiniStmt")) {
			return new MiniStatement();
		}
		throw new IllegalArgumentException("Invalid Statement selection");
	}

}
