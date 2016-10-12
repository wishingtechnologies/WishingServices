package com.custom.immutable;

import java.util.Date;

/*	For Making Class Immutable  we must follow the bellow rules
 1. Declare class as final
 2. Declare instance variables as final & don't create setter methods(only getter methods)
 3. Create private constructor to initialize variables
 4. If our class has mutable property(like Date class,it has setter methods) then 
 	*	create getter method and return new instance in it;
 
 */
public final class CustomImmutableClass {
	
	private final int i;
	private final String s;
	private final Date d;

	private CustomImmutableClass(int i, String s,Date d) {
		super();
		this.i = i;
		this.s = s;
		this.d=d;
	}

	public int getI() {
		return i;
	}

	public String getS() {
		return s;
	}

	public Date getD() {
		return new Date(d.getTime());
	}
	
}
