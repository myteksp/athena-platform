package com.athena.backend.platform.utils;

import com.gf.collections.GfCollection;
import com.gf.collections.GfCollections;
import com.gf.util.string.MC;

public final class SimleXMLcomposer {	
	public static final Node createNode(final String name) {
		return new Node(name);
	}
	public static final Node createNode(final String name, final String text) {
		return new Node(name, text);
	}
	
	public static final class Node{
		private Node parent;
		private final GfCollection<Node> children;
		private final String name;
		private final String text;
		
		public Node(final String name, final String text) {
			this.parent = null;
			this.name = name;
			this.text = text;
			this.children = GfCollections.asLinkedCollection();
		}
		public Node(final String name) {
			this(name, "");
		}
		
		public final Node add(final Node node) {
			node.parent = this;
			children.add(node);
			return this;
		}
		public final Node addAndReturn(final Node node) {
			node.parent = this;
			children.add(node);
			return node;
		}
		private final Node getRootRecursive(final Node current) {
			if (current.parent == null)
				return current;
			return getRootRecursive(current.parent);
		}
		public final Node getRoot() {
			return getRootRecursive(this);
		}
		@Override
		public final String toString() {
			return MC.fmt("<${0}>${1}${2}</${0}>", name, text, children.join(n->n.toString(), ""));
		}
		@Override
		public final int hashCode() {
			return this.toString().hashCode();
		}
		@Override
		public final boolean equals(final Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			final Node other = (Node) obj;
			return this.toString().equals(other.toString());
		}
	}
}
