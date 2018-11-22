//Basic Class for entities

package entity;

import java.util.Random;

/* abstract ? */ public class Entity {
    
	private String 	name;			// name of entity
    private int[]	attributes;		// [0] constitution [1] strength [2] dexterity [3] intelligence [4] wisdom [5] charisma
    private int		health_max;		// maximal health points
    private int		health_current;	// current health points
    private int		magic_max;		// maximal magic points
    private int		magic_current;	// current magic points
    
//	Constructors

    //	Sets: Name, Attributes, max and current Health, max and current Magic
    
    Entity(String s , int[] a , int hm , int hc , int mm , int mc)
    {
    	name = s;
    	attributes = new int[6];
    	
    	for(int i = 0 ; i < 6 ; i++) 
    	{
    	attributes[i] = a[i];
    	}
    	health_max = hm;
    	health_current = hc;
    	magic_max = mm;
    	magic_current = mc;
    	
    };
    
    //	Sets: Name, Attributes, Max Health, Max Magic
    
    Entity(String s , int[] a , int hm , int mm)
    {
    	name = s;
    	attributes = new int[6];
    	
    	for(int i = 0 ; i < 6 ; i++) 
    	{
    	attributes[i] = a[i];
    	}
    	health_max = hm;
    	health_current = hm;
    	magic_max = mm;
    	magic_current = mm;
    	
    }
    
//	getMethods
    	
    //	Name
    public String 	getName() 
    {	
    	return name;
    }
    	
    //	Attribute (all)
    public int[] 	getAttributes()
    {
    	return attributes;
    }
    	
    //	Attribute Constitution
    public int 		getConstitution() 
    {
    	return attributes[0];
    }
	
	//	Attribute Strength
    public int 		getStrength() 
    {
    	return attributes[1];
    }
    
	//	Attribute Dexterity
    public int 		getDexterity() 
    {
    	return attributes[2];
    }

	//	Attribute Intelligence
    public int 		getIntelligence() 
    {
    	return attributes[3];
    }

	//	Attribute Wisdom
    public int 		getWisdom() 
    {
    	return attributes[4];
    }

	//	Attribute Charisma
    public int 		getCharisma() 
    {
    	return attributes[5];
    }
    
//	setMethods
    
    //	Name
    public void		setName(String s)
    {
    	name = s;
    }
    
    //	All Attributes
    public void		setAttributes(int[] a)
    {
    	for(int i = 0 ; i < 6 ; i++) 
    	{
    		attributes[i] = a[i];
    	}
    }
    
    //	Attribute Constitution
    public void		setConstitution(int i) 
    {
    	attributes[0] = i;
    }

    //	Attribute Strength
    public void		setStrength(int i) 
    {
    	attributes[1] = i;
    }

    //	Attribute Dexterity
    public void		setDexterity(int i) 
    {
    	attributes[2] = i;
    }

    //	Attribute Intelligence
    public void		setIntelligence(int i) 
    {
    	attributes[3] = i;
    }

    //	Attribute Wisdom
    public void		setWisdom(int i) 
    {
    	attributes[4] = i;
    }

    //	Attribute Charisma
    public void		setCharisma(int i) 
    {
    	attributes[5] = i;
    }
    
    //	TESTING AREA 1
    
    public static void main(String[] args)
    {
    	Random dice = new Random();
    	int[] list = new int[10];
    	for(int i = 0 ; i < 10 ; i++)
    	{
    		list[i] = dice.nextInt(20);
    	}
    	for(int i = 0 ; i < 10 ; i++)
    	{
    		System.out.println( (i+1) + ". : " + list[i]);
    	}
    	
    	Entity e = new Entity("testee", list, 1 , 1 , 1 ,1);
    	for(int i = 0 ; i < 10 ; i++)
    	{
    		System.out.println( e.name + " " + (i+1) + ". : " + e.attributes[i]);
    	}
    	for(int i = 0 ; i < 10 ; i++)
    	{
    		list[i] = dice.nextInt(20);
    	}
    	for(int i = 0 ; i < 10 ; i++)
    	{
    		System.out.println( (i+1) + ". : " + list[i]);
    	}
    	for(int i = 0 ; i < 10 ; i++)
    	{
    		System.out.println( e.name + " " + (i+1) + ". : " + e.attributes[i]);
    	}
        return;
    }
    
    
    // TODO
    /* 
    abstract void talk();
    abstract void showStats();
    abstract void attack();
     */
}
