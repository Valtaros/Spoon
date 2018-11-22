//Basic Class for entities test 1234

package entity;

import java.util.Random;

/*abstract*/ public class Entity {
    private String 	name;			
    private int[]	attributes;		
    private int		health_max;		
    private int		health_current;	
    private int		magic_max;		
    private int		magic_current;	
    
    Entity(String s , int[] a , int hm , int hc , int mm , int mc){
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
