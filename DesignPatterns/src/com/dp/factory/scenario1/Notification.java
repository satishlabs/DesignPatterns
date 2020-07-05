package com.dp.factory.scenario1;
//The factory design pattern says that define an interface ( A java interface or an abstract class) and 
//let the subclasses decide which object to instantiate

//Define a factory method inside an interface.
// Let the subclass implements the above factory method and decide which object to create.
public interface Notification {
	public void notifyUser();
}
