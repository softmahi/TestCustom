package com.test.factoryDesignpattern;

public abstract class Factory {

	protected abstract StatementType createStatement(String Selection);

}
