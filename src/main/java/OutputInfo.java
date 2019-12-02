public class OutputInfo {
    public void outPutTableMethod(String name, String city, int age, String hobby){
        System.out.println("Table method:\n------------------------");
        System.out.println("Name: \t" + name +"\nCity: \t"+ city +"\nAge: \t"+ age+"\nHobby: \t"+ hobby+ "\n------------------------");


        }

        public void outPutTextMethod(String name, String city, int age, String hobby){
            System.out.println("\nText method:\n------------------------");
            System.out.println("A man(woman) named " + name +  " lives in the city "+ city +".\nThis man(woman) is "+ age +" years old and his(her) hobby is "+ hobby + "." );
            System.out.println("------------------------");

        }

}
