package me.dev.clientbase;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface ClientInfo {

	String name(); /*, it wouldnt let me put a comma here so imagine it */ String author();
	
}
