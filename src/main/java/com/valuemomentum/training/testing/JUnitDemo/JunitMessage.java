package com.valuemomentum.training.testing.JUnitDemo;

public class JunitMessage {

	static String m;
	
    JunitMessage(String msg)
	{
		m=msg;
	}
 String printMessage()
{
	return m;
}

  String printHiMessage()
{
	return "Hi "+m;
}
	
}
