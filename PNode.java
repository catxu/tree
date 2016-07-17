package com.algorithm.tree;

import java.io.Serializable;

/**
 * @author catxu
 * @date 2016.07.17
 */
// public class PNode<String> implements Serializable {
// private static final long serialVersionUID = 1L;
//
// private String data;
// private int parent;
//
// public PNode() {
// super();
// }
//
// public PNode(String Data) {
// this.data = Data;
// }
//
// public PNode(String Data, int parent) {
// super();
// this.data = Data;
// this.parent = parent;
// }
//
// public String getData() {
// return data;
// }
//
// public void setData(String Data) {
// this.data = Data;
// }
//
// public int getParent() {
// return parent;
// }
//
// public void setParent(int parent) {
// this.parent = parent;
// }
//
// @Override
// public int hashCode() {
// final int prime = 31;
// int result = 1;
// result = prime * result + ((data == null) ? 0 : data.hashCode());
// result = prime * result + parent;
// return result;
// }
// @Override
// public boolean equals(Object obj) {
// if(this == obj)
// return true;
// if(obj == null)
// return false;
// if(getClass() != obj.getClass())
// return false;
// @SuppressWarnings("unchecked")
// PNode<String> other = (PNode<String>) obj;
// if (data == null) {
// if (other.data != null)
// return false;
// } else if (!data.equals(other.data))
// return false;
// if (parent != other.parent)
// return false;
// return true;
// }
// }
public class PNode implements Serializable {
	private static final long serialVersionUID = 1L;

	private String data;
	private int parent;

	public PNode() {
		super();
	}

	public PNode(String Data) {
		this.data = Data;
	}

	public PNode(String Data, int parent) {
		super();
		this.data = Data;
		this.parent = parent;
	}

	public String getData() {
		return data;
	}

	public void setData(String Data) {
		this.data = Data;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + parent;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PNode other = (PNode) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (parent != other.parent)
			return false;
		return true;
	}
}
