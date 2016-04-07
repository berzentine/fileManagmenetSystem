
import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	private T data;
	private List<Node<T>> children;
	private Node<T> parent;
	private boolean isDir; //1 means is a dir

	public Node(T data) {
		
		this.data = data;
		this.children = new ArrayList<Node<T>>();
		this.isDir = true;
	}
	public void setIsDir(Node<T> node){
		node.isDir = true;
	}
	public void setIsFile(Node<T> node){
		node.isDir = false;
	}
	public boolean getIsDir(Node<T> node){
		return node.isDir;
	}

	public Node(Node<T> node) {
		this.data = (T) node.getData();
		children = new ArrayList<Node<T>>();
	}

	public void addChild(Node<T> child) {
		child.setParent(this);
		children.add(child);
	}

	public void addChildAt(int index, Node<T> child) {
		child.setParent(this);
		this.children.add(index, child);
	}

	public void setChildren(List<Node<T>> children) {
		for (Node<T> child : children)
			child.setParent(this);

		this.children = children;
	}
	
	public void removeEmptyNode(Node<T> dir){
		//to be used for delete directory function which deletes a directory only if
		//its empty. 
		if(this.getChildren().isEmpty()){
			parent = dir.getParent();
			parent.removeThisIfItsAChild(dir);
		}
		
		
	}

	public void removeChildren() {
		this.children.clear();
	}
	
	

	public Node<T> removeChildAt(int index) {
		return children.remove(index);
	}
	
	
	public void removeThisIfItsAChild(Node<T> childToBeDeleted)
	{
		List <Node<T>> list = getChildren();
		list.remove(childToBeDeleted);
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getParent() {
		return this.parent;
	}

	public void setParent(Node<T> nodeIST) {
		this.parent = nodeIST;
	}

	public List<Node<T>> getChildren() {
		return this.children;
	}

	public Node<T> getChildAt(int index) {
		return children.get(index);
	}

	@Override
	public boolean equals(Object obj) {
		if (null == obj)
			return false;

		if (obj instanceof Node) {
			if (((Node<?>) obj).getData().equals(this.data))
				return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}
	public void removeChild(Node<T> child) {
		parent = child.getParent();
		parent.removeThisIfItsAChild(child);
	}

}