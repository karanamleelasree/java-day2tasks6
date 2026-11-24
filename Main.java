class UserRegistration{
    void register(String name,int userId){
        System.out.println("Registered ID: " + name + " with ID: " + userId.
);
    }
    void register(int userId,String name){
        System.out.println("Registered ID: " + userId + " for user: " + name.
);
    }
}class Main{
    public static void main(String args[]){
        UserRegistration u = new UserRegistration();
        u.register(name="Leelasree",userId=589);
        u.register(userId=210,name="Rajeshwaree");
    }
}