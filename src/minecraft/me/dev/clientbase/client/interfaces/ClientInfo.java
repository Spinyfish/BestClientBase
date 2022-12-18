package me.dev.clientbase.client.interfaces;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface ClientInfo {

	String name();
	String author();
	
}
