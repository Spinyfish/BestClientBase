package me.dev.clientbase.hackapi.hacks.settings;

public class Setting {

	public String name;
	
	public TYPE Type;
	
	public Setting(TYPE type) {
		this.Type = type;
	}
	
	public boolean isThisNumberSetting() {
		return this.Type.equals(TYPE.NUMBER);
	}

	public boolean isThisModeSetting() {
		return this.Type.equals(TYPE.MODE);
	}

	public boolean isThisNumberBoolean() {
		return this.Type.equals(TYPE.BOOLEAN);
	}

	public boolean isThisNoneSetting() {
		return this.Type.equals(TYPE.NONE);
	}
	
	enum TYPE {
		
		NONE,
		MODE,
		NUMBER,
		BOOLEAN,
		
	}
	
}
