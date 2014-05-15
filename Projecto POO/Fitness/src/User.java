import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeSet;

public class User extends Person
{
    private int height; // centímetros
    private float weight; // kilogramas
    private String favoriteActivity;
    private TreeSet<ActivityList> userActivities; // cada atividade tem uma lista de eventos
    private TreeSet<String> friendsList;

    
    
    public User(){
        super();
        this.height=0;
        this.weight=0;
        this.favoriteActivity="";
        this.userActivities=new TreeSet<ActivityList>();
        this.friendsList=new TreeSet<String>(); 
        
    }
    
    public User(String email,String pass,String name,char gender,GregorianCalendar date,
            int height,float weight,String favoriteActivity,
            TreeSet<ActivityList> userActivities,TreeSet<String> friendsList)
    {
        super(email,pass,name,gender,date);
        this.height=height;
        this.weight=weight;
        this.favoriteActivity=favoriteActivity;
        
        for(ActivityList act:userActivities)
        this.userActivities.add((ActivityList) act.clone());
   
        this.friendsList=(TreeSet<String>)friendsList.clone(); 
    }
       
    public User(User u){
        super(u.getEmail(), u.getPassword(), u.getName(), u.getGender(), u.getDate());
        this.height=u.getHeight();
        this.weight=u.getWeight();
        this.favoriteActivity=u.getFavoriteActivity();
        this.userActivities=(TreeSet<ActivityList>)u.getUserActivities();
        this.friendsList=(TreeSet<String>)u.getFriendsList();
        
    }
    
    public int getHeight(){
        return this.height;
    }
    public float getWeight(){
        return this.weight;
    }
    public String getFavoriteActivity(){
        return this.favoriteActivity;
    }
    public Set<ActivityList> getUserActivities(){
        TreeSet<ActivityList> res= new TreeSet<ActivityList>();
        for(ActivityList act : this.userActivities)
            res.add(act.clone());
    return res;
    }
    
    public Set<String> getFriendsList(){
        return (TreeSet<String>)this.friendsList.clone();
    }
    
    public void setHeight(int height){
        this.height=height;
    }
    public void setWeight(float weight){
        this.weight=weight;
    }
    public void setFavoriteActivity(String favorite){
        this.favoriteActivity=favorite;
    }
 
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Equals,toString e Clone
    
    public boolean equals(Object o){
        if(this==o)
            return true;
        if((o==null)|| (this.getClass() !=o.getClass()))
            return false;
        else{
            User u = (User) o;
            if( super.equals(u) && this.height==u.getHeight() && this.weight==u.getWeight()
                    && this.favoriteActivity.equals(u.getFavoriteActivity()) 
                    && this.friendsList.equals(u.getFriendsList())
                    && )
            
        }
        
    }
}


