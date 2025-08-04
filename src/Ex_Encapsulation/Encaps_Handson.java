package Ex_Encapsulation;

public class Encaps_Handson {
    public static void main(String[] args) {
       Login login =new Login("Admin", "Pass675");
        //login.getPassword();
        System.out.println(login.getPassword());
        login.setPassword("Raja8766", true);
        System.out.println("New password is: "+login.getPassword());
        //login.getUsername();
        System.out.println(login.getUsername());
       login.setUsername("Jaysu0810");
        System.out.println("New Username is: "+login.getUsername());

    }}

    class Login{
        private String username;
        private String password;

        public Login(String username,  String password) {
            this.username = username;
            this.password = password;
        }
            public String getPassword () {
                return password;
            }

            public void setPassword (String password, boolean isAdmin){
            if(isAdmin){
                this.password = password;}
            else{
                System.out.println("You are Not allowed to set pwd");
            }
            }


            public String getUsername () {
                return username;
            }

            public void setUsername (String username){
                this.username = username;
            }

        }