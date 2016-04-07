
public class Linked_List {
	int size;
	Node1 head=null;
	//To append a file at the end of the linked list.
	public void append(String path, String name, boolean read, boolean write )
	{
		name = name+".txt";
		
		Node1<String> node=new Node1<String>(path,name,read,write);
		if(head==null)
		{
			head=node;
		}
		else 
		{
			Node1 current=head;
			while(current.getNext() !=null)
			{
				current=current.getNext();
			}
			current.setNext(node);
		}
		
		size ++;
	}
	//to print the names of the file that are stored in the linked list
	public void print_LinkedList()
	{
		if(size==0){
			System.out.println("No files exist");
			return;
		}
		
		
		Node1 current=head;
		while(current.getNext()!=null)
		{
			System.out.println(current.getName());
			current=current.getNext();
		}
		System.out.println(current.getName());
	}
	//To delete a file.
	
	public void delete(String name,String path)
	{
		
		Node1 node= search(name,path);
		//System.out.println(node.getName());
		//If a file is not found of the given name an error is flashed
		if(node==null)
		{
			System.out.println("No such file exists");
			return;
		}
		if(node==head){
			head = node.getNext();
			size--;
			return;
		}
		
		Node1 current=head;
		Node1 temp=null;
		while(current!=node)
		{
			//System.out.println("hi");
			temp=current;
			
			System.out.println(current.getName());
			current=current.getNext();
			
		}
		temp.setNext(current.getNext());
		size--;
	}
	
	
	
	
	//searching a node of the given file name.
	public Node1 search(String name_of_file,String path_of_file)
	{
		Node1 current=head;
		while(current!=null)
		{
			//Checking for a file name and its path to return the correct node.
			if(current.getName().equals(name_of_file) && current.getPath().equals(path_of_file))
			{
				return current;
			}
			current=current.getNext();
		}
		return null;
	}
	
	
	public int getsize(){
		return size;
	}

}
