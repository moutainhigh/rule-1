package com.ht.rule.common.comenum;

public enum ActionEnum {
	realize("1", "实现"), self("2", "自身");

	private String code;
	private String name;

	ActionEnum(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static ActionEnum findByName(String key) {
		ActionEnum[] list = ActionEnum.values();
		for (ActionEnum actionEnum : list) {
			if (key.equals(actionEnum.getName())) {
				return actionEnum;
			}
		}
		return null;
	}
}
