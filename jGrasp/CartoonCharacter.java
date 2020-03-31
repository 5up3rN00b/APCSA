public class CartoonCharacter{
   private String name;
   private String hobby;
   
   public CartoonCharacter(){
  	name = "";
  	hobby = "";
   }
   public CartoonCharacter(String n, String h){
  	name = n;
  	hobby = h;
   }
 
   public String getName(){
  	return name;
   }
   public void setName(String n){
  	name=n;
   }
   public String getHobby(){
  	return hobby;
   }
   public void setHobby(String n){
  	hobby=n;
   }   
   public static void main(String[] args)
   {
  	CartoonCharacter cb = new CartoonCharacter("Charlie Brown", "kicking the football");
  	System.out.println(cb.getName() + " like " + cb.getHobby());
   
   }
}
