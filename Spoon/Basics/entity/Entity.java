//Basic Class for entities asdf

package entity;

import java.util.Random;

/*abstract*/ public class Entity {
    private String 	name;			// name of entity
    private int[]	attributes;		// [0] constitution [1] strength [2] dexterity [3] intelligence [4] wisdom [5] charisma
    private int		health_max;		// maximal health points
    private int		health_current;	// current health points
    private int		magic_max;		// maximal magic points
    private int		magic_current;	// current magic points
    
    Entity(String s , int[] a , int hm , int hc , int mm , int mc)
    {
    	name = s;
    	attributes = new int[a.length];
    	
    	for(int i = 0 ; i < a.length ; i++) 
    	{
    	attributes[i] = a[i];
    	}
    	health_max = hm;
    	health_current = hc;
    	magic_max = mm;
    	magic_current = mc;
    	
    };
    
    Entity(String s , int[] a , int hm , int mm)
    {
    	name = s;
    	attributes = new int[a.length];
    	
    	for(int i = 0 ; i < a.length ; i++) 
    	{
    	attributes[i] = a[i];
    	}
    	health_max = hm;
    	health_current = hm;
    	magic_max = mm;
    	magic_current = mm;
    	
    }
    
    public String 	getName() 
    {
    	return name;
    }
    
    public int[] 	getAttributes()
    {
    	return attributes;
    }
    
    public int 		getConstitution() 
    {
    	return attributes[0];
    }
    
    public int 		getStrength() 
    {
    	return attributes[1];
    }
    
    public int 		getDexterity() 
    {
    	return attributes[2];
    }
    
    public int 		getIntelligence() 
    {
    	return attributes[3];
    }
    
    public int 		getWisdom() 
    {
    	return attributes[4];
    }
    
    public int 		getCharisma() 
    {
    	return attributes[5];
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
