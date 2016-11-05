
import java.util.ArrayList;

public class FPTreeNode implements Comparable<FPTreeNode> {
	private String item;
	private int frequency;
	private int children_count;
	private FPTreeNode parent;
	private ArrayList<FPTreeNode> children;
	private FPTreeNode next;
	
	public FPTreeNode() //default constructor for the root
	{
		item = "root";
		frequency = 0;
		children_count = 0;
		parent = null;
		children = null;
		next = null;
	}
	
	public FPTreeNode(String item, int frequency)
	{
		this.item = item;
		this.frequency = frequency;
		children_count = 0;
		parent = null;
		children = null;
		next = null;
	}
	
	public FPTreeNode(String item, int frequency, FPTreeNode parent)
	{
		this.item = item;
		this.frequency = frequency;
		children_count = 0;
		this.parent = parent;
		children = null;
		next = null;
	}
	
	public String getItem() 
	{
		return item;
	}
	
	public int getFrequency() 
	{
		return frequency;
	}
	
	public int getChildrenCount() 
	{
		return children_count;
	}
	
	public FPTreeNode getParent() 
	{
		return this.parent;
	}
	
	public FPTreeNode getNextNode() 
	{
		return this.next;
	}
	
	public ArrayList<FPTreeNode> getChildren()
	{
		return this.children;
	}
	
	public void setItem(String string)
	{
		this.item = "" + string;
	}
	
	public void setFrequency(int val) 
	{
		this.frequency = val;
	}
	
	public void incrementFrequency() 
	{
		this.frequency++;
	}
	
	public void incrementFrequency(int delta) 
	{
		this.frequency+=delta;
	}
	
	public void setParent(FPTreeNode parent)
	{
		this.parent = parent;
	}
	
	public void setNextNode(FPTreeNode next_node)
	{
		this.next = next_node;
	}
	
	public FPTreeNode addChild(String child_item, int child_freq)
	{
		FPTreeNode childnode = new FPTreeNode(child_item, child_freq, this);
		if(children_count == 0)
			children = new ArrayList<FPTreeNode>();
		children.add(childnode);
		children_count++;
		return childnode;
	}
	
	public boolean isChild(String child_item)
	{
		for(int i=0; i<children_count; i++)
		{
			FPTreeNode fptn = children.get(i);
			if(fptn.getItem().equals(child_item))
				return true;
		}
		return false;
	}
	
	public FPTreeNode getChild(String child_item) //return the child whose item matches
	{
		FPTreeNode fptn = null;
		for(int i=0; i<children_count; i++)
		{
			fptn = children.get(i);			
			if(fptn.getItem().equals(child_item))
				break;
		}
		return fptn;
	}
	
	public FPTreeNode getChild(int i) //return the ith child 
	{
		if(i<children_count)
			return children.get(i);
		else
			return null;
	}
	
	public boolean removeChild(FPTreeNode fptn)	//remove child
	{
		boolean bool = children.remove(fptn);
		
		if(bool==true)
			children_count--;
		
		return bool;
	}
	
	@Override
	public String toString() //<item>:<frequency>:<children count>
	{
		return item + ":" + frequency + ":" + children_count + " ";
	}
	
	@Override
	public int compareTo(FPTreeNode n) 
	{		
		return (this.getItem()).compareTo(n.getItem()); //simple lexicographic order
	}
}
