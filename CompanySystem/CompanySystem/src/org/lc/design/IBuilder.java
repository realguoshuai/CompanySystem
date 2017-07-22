package org.lc.design;

public interface IBuilder<T> {

	IBuilder<T> start();
	IBuilder<T> buildLeader();
	IBuilder<T> buildJavaStaffs();
	T finish();
}
