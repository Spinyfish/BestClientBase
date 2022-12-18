package me.dev.clientbase.api.interfaces;

import java.util.HashMap;

public interface IManager<T extends Object> {

	HashMap<Class, T> getElements();
		
}
