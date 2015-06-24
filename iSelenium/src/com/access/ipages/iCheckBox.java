package com.access.ipages;

public interface iCheckBox {

	boolean isDisabledById(String id);

	boolean isItCheckedById(String id);

	void doUnCheckById(String id);

	void doCheckById(String id);

	boolean isSelectedById(String id);

	boolean isEnabledByName(String id);

	boolean isDisabledByName(String id);

	boolean isItCheckedByName(String id);

	void doUnCheckByName(String id);

	void doCheckByName(String id);

	boolean isSelectedByName(String id);

	boolean isEnabledById(String id);

}
