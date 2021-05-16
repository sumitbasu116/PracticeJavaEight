package com.sumit.mydefault;

public interface DafaultAndDupIntrfc extends MyDefaultIntrfc,MyDuplicateDefaultIntrfc{

	@Override
	default void show(String msg) {
		MyDuplicateDefaultIntrfc.super.show(msg);
	}
}
