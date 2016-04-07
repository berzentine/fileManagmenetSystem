
public class Node1<T> {

	private String path;
	private String name;
	private boolean read;
	private boolean write;
	private String contents;
	private int size;
	private Node1<T> next;
	
	public Node1 (String path, String name, boolean read, boolean write)
	{
		this.path=path;
		this.name=name;
		this.read=read;
		this.write=write;
		contents="";
		size=0;
		this.next=null;
	}
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String newname)
	{
		this.name=newname;
	}
	public String getPath()
	{
		return this.path;
	}
	public Node1<T> getNext()
	{
		return this.next;
	}
	public void setNext(Node1 value)
	
	{
		this.next=value;
	}
	
	
}
