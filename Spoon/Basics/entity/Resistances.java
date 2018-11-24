package entity;

import entity.*;

public class Resistances {
//	Variables
    private double		blunt = 0;					//	Blunt 		(physical)
    private double		piercing = 0;				// 	Piercing 	(physical)
    private double		slashing = 0;				//	Slashing 	(physical)
    private double		fire = 0;					//	Fire		(elemental)
    private double		frost = 0;					//	Frost		(elemental)
    private double		shock = 0;					//	Shock		(elemental)
    private double		poison = 0;					//	Poison		(elemental)
    private double		light = 0;					//	Light		(elemental)
    private double		dark = 0;					//	Dark		(elemental)

//	Constructors
    //	Empty	(all 0)
    Resistances	(){}
    
    //	Set all with array
    Resistances	( double[] resistances_n )
    {
    	setResistances	( resistances_n );
    }
    
    //	Set all with single Variables
    Resistances	( double blunt_n , double piercing_n , double slashing_n , double fire_n , double frost_n , double shock_n , double poison_n , double light_n , double dark_n )
    {
    	setResistances	( blunt_n , piercing_n , slashing_n , fire_n , frost_n , shock_n , poison_n , light_n , dark_n );
    }
//getMethods
    
    //	Index Number of Type by Name
    public int			getTypeId	( String resistance_type_name )
    {

    	int	resistance_type_id = 0;
    	if(resistance_type_name.equals("Blunt") || resistance_type_name.equals("blunt"))
    	{
    		resistance_type_id = 0;
    	}
    	if(resistance_type_name.equals("Piercing") || resistance_type_name.equals("piercing"))
    	{
    		resistance_type_id = 1;
    	}
    	if(resistance_type_name.equals("Slashing") || resistance_type_name.equals("slashing"))
    	{
    		resistance_type_id = 2;
    	}
    	if(resistance_type_name.equals("Fire") || resistance_type_name.equals("fire"))
    	{
    		resistance_type_id = 3;
    	}
    	if(resistance_type_name.equals("Frost") || resistance_type_name.equals("frost"))
    	{
    		resistance_type_id = 4;
    	}
    	if(resistance_type_name.equals("Shock") || resistance_type_name.equals("shock"))
    	{
    		resistance_type_id = 5;
    	}
    	if(resistance_type_name.equals("Poison") || resistance_type_name.equals("poison"))
    	{
    		resistance_type_id = 6;
    	}
    	if(resistance_type_name.equals("Light") || resistance_type_name.equals("light"))
    	{
    		resistance_type_id = 7;
    	}
    	if(resistance_type_name.equals("Dark") || resistance_type_name.equals("dark"))
    	{
    		resistance_type_id = 8;
    	}
    	return resistance_type_id;
    	
    }
    
    //	Type Name by Index Number
    public String		getTypeName	( int resistance_type_id )
    {
    	String	resistance_type_name = "";
    	switch(resistance_type_id)
    	{
    	case	0:	resistance_type_name = "blunt";		break;
    	case	1:	resistance_type_name = "piercing";	break;
    	case	2:	resistance_type_name = "slashing"; 	break;
    	case	3:	resistance_type_name = "fire";	 	break;
    	case	4:	resistance_type_name = "frost"; 	break;
    	case	5:	resistance_type_name = "shock"; 	break;
    	case	6:	resistance_type_name = "poison"; 	break;
    	case	7:	resistance_type_name = "light"; 	break;
    	case	8:	resistance_type_name = "dark";	 	break;
    	default:	resistance_type_name = "unknown";	break;
    	}
    	return	resistance_type_name;
    }

    //	All
    public double[] 	getResistances()
    {
    	double[] 	resistances = new double[9];
    	
    	resistances[0] = getBlunt();
    	resistances[1] = getPiercing();
    	resistances[2] = getSlashing();
    	resistances[3] = getFire();
    	resistances[4] = getFrost();
    	resistances[5] = getShock();
    	resistances[6] = getPoison();
    	resistances[7] = getLight();
    	resistances[8] = getDark();
    	
    	return	resistances;
    }
    	
    //	Variable by type index
    public double		getResistance(int resistance_type_id)
    {
    	double 	resistance = getResistances()[resistance_type_id];
    	return 	resistance;
    }
    
    //	Variable by type name
    public double		getResistance(String resistance_type_name)
    {
    	double	resistance = getResistance(getTypeId(resistance_type_name));
    	return 	resistance;
    }
    
    //	Blunt
    public double 		getBlunt() 
    {
    	return 	blunt;
    }
	
    //	Piercing
    public double 		getPiercing() 
    {
    	return 	piercing;
    }
	
    //	Slashing
    public double 		getSlashing() 
    {
    	return 	slashing;
    }
	
    //	Fire
    public double 		getFire() 
    {
    	return 	fire;
    }
	
    //	Frost
    public double 		getFrost() 
    {
    	return 	frost;
    }
	
    //	Shock
    public double 		getShock() 
    {
    	return 	shock;
    }
	
    //	Poison
    public double 		getPoison() 
    {
    	return 	poison;
    }
	
    //	Light
    public double 		getLight() 
    {
    	return 	light;
    }
	
    //	Dark
    public double 		getDark() 
    {
    	return 	dark;
    }

//	setMethods
    
    //	All
    public void		setResistances	( double[] resistances_n )
    {
    	setBlunt	(resistances_n[0]);
    	setPiercing	(resistances_n[1]);
    	setSlashing	(resistances_n[2]);
    	setFire		(resistances_n[3]);
    	setFrost	(resistances_n[4]);
    	setShock	(resistances_n[5]);
    	setPoison	(resistances_n[6]);
    	setLight	(resistances_n[7]);
    	setDark		(resistances_n[8]);
    	
    	return;
    }
    public void		setResistances	( double blunt_n , double piercing_n , double slashing_n , double fire_n , double frost_n , double shock_n , double poison_n , double light_n , double dark_n )
    {
    	setBlunt	(blunt_n);
    	setPiercing	(piercing_n);
    	setSlashing	(slashing_n);
    	setFire		(fire_n);
    	setFrost	(frost_n);
    	setShock	(shock_n);
    	setPoison	(poison_n);
    	setLight	(light_n);
    	setDark		(dark_n);
    	
    	return;
    }
    
    //	Blunt
    public void		setBlunt(double blunt_n) 
    {
    	blunt = blunt_n;
    	return;
    }

    //	Piercing
    public void		setPiercing(double piercing_n) 
    {
    	piercing = piercing_n;
    }

    //	Slashing
    public void		setSlashing(double slashing_n) 
    {
    	slashing = slashing_n;
    }

    //	Fire
    public void		setFire(double fire_n) 
    {
    	fire = fire_n;
    }

    //	Frost
    public void		setFrost(double frost_n) 
    {
    	frost = frost_n;
    }

    //	Shock
    public void		setShock(double shock_n) 
    {
    	shock = shock_n;
    }

    //	Poison
    public void		setPoison(double poison_n) 
    {
    	poison = poison_n;
    }

    //	Light
    public void		setLight(double light_n) 
    {
    	light = light_n;
    }

    //	Dark
    public void		setDark(double dark_n) 
    {
    	dark = dark_n;
    }

	

}
