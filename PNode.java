package com.alg.coco;

import java.io.Serializable;

/**
 * @author catxu
 * @date 2016.07.17
 */
public class PNode<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	private T data;
	private int parent;
	
	public PNode() {
		super();
	}
	
	public PNode(T Data) {
		this.data = Data;
	}

	public PNode(T Data, int parent) {
		super();
		this.data = Data;
		this.parent = parent;
	}

	public T getData() {
		return data;
	}

	public void setData(T Data) {
		this.data = Data;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((data == null) ? 0 : data.hashCode());
//		result = prime * result + parent;
//		return result;
//	}
}
