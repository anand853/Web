package com.access.ipages;

public interface iCheckBox {

	boolean isEnabled(String id);

	boolean isDisabled(String id);

	boolean isItChecked(String id);

	void doUnCheck(String id);

	void doCheck(String id);

	boolean isSelected(String id);

}
