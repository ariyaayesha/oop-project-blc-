public  class LogIn implements Blc {

    private String username;
    private String password;

    public LogIn(String username, String password){
        this.username=username;
        this.password=password;
    }
//some mathmathical term
public void not_robot(){
        int a=5;
        int b=5;
      int c=a+b;
        if(c==10){
            System.out.println("Iam not a robot");
        }else{
            System.out.println("try again");
        }
}
    public void logo(){
        System.out.println("DIU.\n Blender\n Learning Center");
    }
    public void log_In(){
        System.out.println("Sign In");
    }
    public  void reset_password(){
System.out.println("Forget password?");
    }
    public void create_new_account(){

        System.out.println("create new account");
    }
    public void as_guest() {
        System.out.println("log in as guest");
    }

}
