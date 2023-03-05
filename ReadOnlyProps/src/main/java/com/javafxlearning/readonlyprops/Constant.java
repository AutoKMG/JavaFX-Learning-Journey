package com.javafxlearning.readonlyprops;

import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;

public class Constant {
    private final ReadOnlyIntegerWrapper numWrapper;
    public Constant(int num){
        this.numWrapper = new ReadOnlyIntegerWrapper(num);
    }
    public ReadOnlyIntegerProperty getReadOnlyNumber(){
        return this.numWrapper.getReadOnlyProperty();
    }
    public void changeConstant(){
        this.numWrapper.set(200);
    }
}
