import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


//todo
//- add comment
//-add code header
//-proper man page
//- proper terminal like feel 



public class DirectoryFunctions {
	static String  searchdir="";
	static ArrayList<String> InternalTableSpace = new ArrayList<String>();
	static Linked_List cache=new Linked_List();
	
	//on open add the directory 
	static Linked_List list=new Linked_List();
	
	
	
public static void main(String args[]){
	
	
	
	
	
	
	Scanner sc=new Scanner(System.in);
	String currentDir=" ";
	
	Node<String> root = new Node<String>("root");
	Tree<String> tree = new Tree<String>(root);
	Node <String> temp = new Node<String>("nidhi0");
	root.addChild(temp);
	Node<String> test = new Node<String>("test");
	test.setParent(temp);
	temp.addChild(test);

	
	//Assumption: Rename operation dosen't need to be get into cache.
	
	//create dir and a file and rename it and check before and later ITS
	createDir("root/nidhi0", tree, "tempnew1");	
	//createFile(tree, "root/nidhi0/tempnew1", "rushin", true, true);
	//createFile(tree, "root/nidhi0", "rushin11", true, true);
	createFile(tree, "root/nidhi0/", "rushin21", true, true);
	
	list.print_LinkedList();
	//openDir("root/nidhi0/");
	//System.out.println(tree.getPreOrderTraversal());
	deleteFile("rushin21.txt", tree);
	
	list.print_LinkedList();
	
	
	
	//System.out.println(tree.getPreOrderTraversal());
	//create dir and a file in it and check if node created, delete a file and a directory and check if removed from the node. 
	//createDir("root/nidhi0", tree, "tempnew1");	
	
	//createFile(tree, "root/nidhi0", "rushin11", true, true);
	//createFile(tree, "root/nidhi0/", "rushin21", true, true);
	//deleteFile("rushin.txt", tree);
	
	//System.out.println(list.getsize());
	
	//list.print_LinkedList();
	
	
	
	
	//createDir("root/nidhi0", tree, "tempnew2");	
	//createDir("root/nidhi0", tree, "tempnew3");
	//createDir("root/nidhi0", tree, "tempnew4");
	//System.out.println(tree.getPreOrderTraversal());
	//openDir("root/nidhi0/tempnew1");
	//openDir("root/nidhi0/tempnew2");
	//openDir("root/nidhi0/tempnew3");
	//openDir("root/nidhi0/tempnew4");
	//System.out.println(InternalTableSpace.size());
	//ITSprint();
	//closeDir("root/nidhi0/tempnew1");
	//closeDir("root/nidhi0/tempnew3");
	//ITSprint();
	
	
	//Creating a file and getting its path
	//createFile(tree, "root/nidhi0/test/", "rushin");
	//createFile(tree, "root/nidhi0/test/", "nidhi");
	//search(tree.getRoot(), "rushin.txt");
	//if(searchdir.isEmpty()){System.out.println("Could not find the file");}
	//else {System.out.println(searchdir); searchdir="";}
	
	
	//testing readdir function
	//ReadDir("root/nidhi0/",tree);
	
	
	//Creating a directory, rename and getting its path
	//createDir("root/nidhi0", tree, "tempnew");	
	//renameDir("root/nidhi0", tree, "tempnew", "tempnew2");
	//search(tree.getRoot(), "tempnew2");
	//if(searchdir.isEmpty()){System.out.println("Could not find the file");}
	//else {System.out.println(searchdir); searchdir="";}
	
	//deleting a directory only if empty
	//deleteDir("root/nidhi0/tempnew", tree);
	//renaming fail case since i deleted tempnew
	//renameDir("root/nidhi0", tree, "tempnew", "tempnew2");
	
	//file is the parent and i m making another child as a directory
	//createFile(tree, "root/nidhi0/test/", "rushin");
	//createDir("root/nidhi0/test/rushin", tree, "nidhi");
	
	//file is the parent and i m making another child as a file
		//createFile(tree, "root/nidhi0/test/", "rushin");
		//createFile(tree,"root/nidhi0/test/rushin.txt",  "nidhi");
	
	//dir is the parent and i m making another child as a file
			//createDir("root/nidhi0/test/",tree,  "rushin");
			//createFile(tree,"root/nidhi0/test/rushin",  "nidhi");
	
	
	//trying to delete a file which is a folder actually
	
	
	
	//trying to delete a folder which is a file actually
	
	
	
	
	//trying to delete a non empty folder
			//createDir("root/nidhi0/test/",tree,  "rushin");
			//createFile(tree,"root/nidhi0/test/rushin",  "nidhi");
	//deleteDir("root/nidhi0/test/", tree);
	
	
	//Creating a file and directory with same name in one 
	//createDir("root", tree, "nidhi1");
	//createFile(tree, "root", "nidhi1");
	//System.out.println(tree.getPreOrderTraversal());
	
	
	
	//Creating a file and file with same name
	//createFile(tree, "root", "nidhi1");
	//createFile(tree, "root", "nidhi1");
	//System.out.println(tree.getPreOrderTraversal());
	
	
	
	
	//creating a D and D with same name
	//createDir("root", tree, "nidhi0");
	
	//Removing an empty directory 
	//test.removeEmptyNode(test);

	//removing a file and checking again if it is found then this method failed
	//deleteFile("rushin.txt", tree);
	//search(tree.getRoot(), "rushin.txt");
	//if(searchdir.isEmpty()){System.out.println("Could not find the file");}
	
	//check if what asked to delete is a file or foler in switch case
	//check if what asked to delete was a folder and he called to delete file. 
	
}

public static String getPathofFile(String filename, Node<String> node){
	String temp ="";
	while(!node.getData().equals("root")){
		temp = node.getParent().getData() + "/"+temp;
		node = node.getParent();
	}
	if(!temp.isEmpty()) 
	return temp;
	else return "File search failed";
	//temp returns the file path of the inputted file name
}


public static void search(Node<String> node, String text)
{	
	//text is the file or folder i m searching for.
    if(node.getData().equals(text)){
    	//System.out.println("Found the path:");
    	searchdir = getPathofFile(text, node);
        }
    

    for(Node<String> child : node.getChildren()) {
        search(child, text);
    }
    
    
}



public static void deleteDir(String path, Tree tree){
	//ASSUMPTIONS:://enter path upto the directory we need to delete, suppose i want to delete A path = ../../A
	//as mentioned in text book, it allows deletion only if the directory is empty
	String[] parts = path.split("/");
	Node<String> present = tree.getRoot();
	if(!tree.findNode(present,parts[parts.length-1]).getChildren().isEmpty()){
		System.out.println("Cannot delete a non-empty directory");
		return;
	}
	
	//Node<String> present = tree.getRoot();
	for(int i=0;i<parts.length;i++){
	if(tree.findNode(present,parts[i])!=null){
		if(parts[i].equals(tree.findNode(present,parts[i]).getData())){
			present = tree.findNode(present, parts[i]);
			//System.out.println(present.getData());
		}
	}	
		else{
			System.out.println("Invalid path. Unable to find directory with name "+ parts[i]);
			return;}	
	}
	present.removeEmptyNode(present);
	System.out.println("Successfully deleted directory "+ parts[parts.length-1]);
	
	
}

public static void renameDir(String path, Tree tree, String oldname, String newname){
	
	//rename according to the path given
	String[] parts = path.split("/");
	Node<String> present = tree.getRoot();
	for(int i=0;i<parts.length;i++){
	if(tree.findNode(present,parts[i])!=null){
		if(parts[i].equals(tree.findNode(present,parts[i]).getData())){
			present = tree.findNode(present, parts[i]);
			//System.out.println(present.getData());
		}
	}	
		else{
			System.out.println("Invalid path. Unable to find directory with name "+ parts[i]);
			return;}	
	}
	
	List<Node<String>> directories = present.getChildren();
	for (int i = 0; i < directories.size(); i++) {
	    Node<String> cur_dir = directories.get(i);
	    if(cur_dir.getData().equals(oldname)){
	    	cur_dir.setData(newname);
	    	System.out.println("Directory renamed successfully "+ oldname+"-->"+newname);
	    	return;
	    }
	    else{
	    	System.out.println("No such directory as "+ oldname);
	    }
	}
	
}








public static void createDir(String path, Tree tree, String dirname){
	//A/B if path then makes a new dir inside B if B is a directory
	String[] parts = path.split("/");
	Node<String> present = tree.getRoot();
	for(int i=0;i<parts.length;i++){
	if(tree.findNode(present,parts[i])!=null && tree.findNode(present, parts[i]).getIsDir(tree.findNode(present, parts[i]))){
		if(parts[i].equals(tree.findNode(present,parts[i]).getData())){
			present = tree.findNode(present, parts[i]);
			//System.out.println(present.getData());
		}
	}	
		else{
			//either invalid path or trying to make a directory inside a file
			System.out.println("Invalid path. Unable to find directory with name "+ parts[i]);
			return;}	
	}
	
	Node <String> temp = new Node<String>(dirname);
	List<Node<String>> directories = present.getChildren();
	for (int i = 0; i < directories.size(); i++) {
	    Node<String> cur_dir = directories.get(i);
	    if(cur_dir.getData().equals(dirname)){
	    	System.out.println("Directory with this name already exsists.");
	    	return;
	    }
	}
	present.addChild(temp);
	temp.setParent(present);
	System.out.println("Successfully added new directory in++ "+present.getData()+ " ++directory");

	
}



public static void createFile(Tree tree, String path, String filename,boolean read, boolean write){
	//add cal to create file in rushins code
	//add a call to creating a node on the virtual space.

	if(list.getsize()>19){
		System.out.println("Disk out of space. Please delete few files to make more space.");
		return;
	}
	
	
	//path uptill the folder i want to make a new file inside
		String[] parts = path.split("/");
		Node<String> present = tree.getRoot();
		for(int i=0;i<parts.length;i++){
		if(tree.findNode(present,parts[i])!=null && tree.findNode(present, parts[i]).getIsDir(tree.findNode(present, parts[i]))){
			if(parts[i].equals(tree.findNode(present,parts[i]).getData())){
				present = tree.findNode(present, parts[i]);
				//System.out.println(present.getData());
			}
		}	
			else{
				//either invalid path or trying to make a directory inside a file
				System.out.println("Invalid path. Unable to find directory with name "+ parts[i]);
				return;}	
		}
		
		Node <String> temp = new Node<String>(filename+".txt");
		List<Node<String>> files = present.getChildren();
		for (int i = 0; i < files.size(); i++) {
		    Node<String> cur_dir = files.get(i);
		    if(cur_dir.getData().equals(filename+".txt") && cur_dir.getIsDir(cur_dir)==false){
		    	System.out.println("File with this name already exsists.");
		    	return;
		    }
		}
		present.addChild(temp);
		temp.setParent(present);
		temp.setIsFile(temp);
		list.append(path,filename,read,write);	
		System.out.println("Successfully added new file in++ "+present.getData()+ " ++directory");


	
}


public static void deleteFile(String filename, Tree tree){
	
	//add call to rushins code in delete file
	
	search(tree.getRoot(),filename);
	String path = searchdir;
	//path has a string uptil the folder in which this file lies
	if(searchdir.isEmpty()){System.out.println("Could not find the file");}
	else {searchdir="";}
	

	
	
	String[] parts = path.split("/");
	Node<String> present = tree.getRoot();
	for(int i=0;i<parts.length;i++){
	if(tree.findNode(present,parts[i])!=null){
		if(parts[i].equals(tree.findNode(present,parts[i]).getData())){
			present = tree.findNode(present, parts[i]);
			//System.out.println(present.getData());
		}
	}	
		else{
			System.out.println("Invalid path. Unable to find "+ parts[i]);
			return;}	
	}
	
	
	for(Node<String> child : present.getChildren()) {
        if( child.getData().equals(filename)){
        	//delete this node.	
        	child.removeChild(child);
        	break;
        }
    }
	list.delete(filename,path);
	System.out.println("Successfully deleted file "+ filename);
	
}





public static void openDir(String path){
	
	//path is upto the directory i want to open
		//if i want to open dir B //path = A/B
		
	
	
	if(InternalTableSpace.size()>2){
		//if many directories, remove them from ITS to add more
		System.out.println("Forcefully closed directory"+ InternalTableSpace.get(InternalTableSpace.size()-1));
		InternalTableSpace.remove(InternalTableSpace.size()-1);
		}
	//System.out.println(path);
	
	
	
	for (int i=0; i<InternalTableSpace.size(); i++){
		//System.out.println(InternalTableSpace.get(i)+"okay");
	    if(InternalTableSpace.get(i).equals(path)){
	    System.out.println("The requested directory is already open");
	    return;}
	    
	    }
	
	//InternalTableSpace.add(path);
	InternalTableSpace.add(0,path);
	System.out.println("Opened :: "+ path);
	//FIFO queue automatically created since the add functions shifts all to the right and adds this element on the 0th position.
	
	
}

public static void ITSprint(){
	
System.out.println("Current ITS table");
System.out.println("=================");
	for (int i=0; i<InternalTableSpace.size(); i++){
		//System.out.println(InternalTableSpace.get(i)+"okay");
	    System.out.println(InternalTableSpace.get(i));

	    
	    }
}

public static void closeDir(String path){
	///same as open
		for (int i=0; i<InternalTableSpace.size(); i++){
		    if(InternalTableSpace.get(i).equals(path)){
		    InternalTableSpace.remove(i);
		    System.out.println("Closed :: "+ path);
		    return;}
		}
		System.out.println("The requested directory is not in the Internal Space table");
		//FIFO queue automatically created since the add functions shifts all to the right and adds this element on the 0th position.
		
		
}

public static void ReadDir(String path, Tree tree){
	
	//check if open otherwise open and then read ?
	//or do i need to ask them to open ?
	
	
	//add the following things
	//1. what if nt open?
	//2. display the size of the file by looking up the ll table
	//3/ display the rights of each text file if any
	//4. if a directory (show that its a directory)
	
	
	String[] parts = path.split("/");
	Node<String> present = tree.getRoot();
	for(int i=0;i<parts.length;i++){
	if(tree.findNode(present,parts[i])!=null && tree.findNode(present, parts[i]).getIsDir(tree.findNode(present, parts[i]))){
		if(parts[i].equals(tree.findNode(present,parts[i]).getData())){
			present = tree.findNode(present, parts[i]);
			//System.out.println(present.getData());
		}
	}	
		else{
			//either invalid path or trying to make a directory inside a file
			System.out.println("Invalid path. Unable to find directory with name "+ parts[i]);
			return;}	
	}
	System.out.println("Reading from "+path +" directory");
	System.out.println("Content table");
	System.out.println("=============");
	List<Node<String>> files = present.getChildren();
	for (int i = 0; i < files.size(); i++) {
	    Node<String> cur_dir = files.get(i);
	    if(cur_dir.getIsDir(cur_dir)==true)
	    	System.out.println((i+1)+" "+ cur_dir.getData()+" (directory)");
	    else  System.out.println((i+1)+" "+ cur_dir.getData());
	}
	

	
	//for now create an ls type command and display all the children
	//
}


public static void RenameFile(String path, Tree tree, String oldname,String newname)
{
	
	
	
		String[] parts = path.split("/");
		Node<String> present = tree.getRoot();
		for(int i=0;i<parts.length;i++){
		if(tree.findNode(present,parts[i])!=null){
			if(parts[i].equals(tree.findNode(present,parts[i]).getData())){
				present = tree.findNode(present, parts[i]);
				//System.out.println(present.getData());
			}
		}	
			else{
				System.out.println("Invalid path. Unable to find "+ parts[i]);
				return;}	
		}
		
		
		for(Node<String> child : present.getChildren()) {
	        if( child.getData().equals(oldname)){
	        	//delete this node.	
	        	child.setData(newname);;
	        	break;
	        }
	    }
	
	
	
	Node1 temp=list.search(oldname, path);
	//If no such file is found in the given path. 
	if(temp==null)
	{
		System.out.println("No such file found in "+path);
	}
	else 
	{
		temp.setName(newname+".txt");
		System.out.println("Successfully changed the filename from "+oldname+" to "+newname);
	}
}



/**Cache functions need to implement from here**/






public static void readFileinCache(int startval){
	//read the contents string from cache from requested byte
	//handle a case where needs to read from start
}
public static void writeFileinCache(int offsetval, String position){
	
	//overwrites the content string
}

public static void appendFileinCache(){
	//concatenate with the contents string
}

public static void seek(int offsetval, String position){
	
	//check start current end
	
	
}

public static void setAttributes(){
	
}

public static void getAttributes(){
	
}

public static void copytoCache(String path, Tree tree){
	
	
	//The open call of a file
	
	
	
	//get the node form rushins list
	//append it to the cache behind since we are following FIFO
	//path is the file /root/nidhi/rushin.txt
	
	
	//check if more than 5 already in cache?
		//no then add this one in cache behind on the LL.
		//if yes, remove the index 0 and then add this new file
			//but while removing index 0, first update in  rushins linked list and then remove from cache array
		
}

public static void copyfromCache(String path, Tree tree){
	
	
	//the close call for file
	
	
	//find the node in rushins list
	//replace that node with this new updated node and its contents
	//path is the file /root/nidhi/rushin.txt
	
	//remove this node from the cache.
	
}



}
