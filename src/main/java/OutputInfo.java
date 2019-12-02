public class OutputInfo {
    public void outPutTableMethod(String name, String city, int age, String hobby){
        System.out.println("\nTable method:\n------------------------");
        System.out.println("Name: \t" + name +"\nCity: \t"+ city +"\nAge: \t"+ age+"\nHobby: \t"+ hobby+ "\n------------------------");


        }

        public void outPutTextMethod(String name, String city, int age, String hobby){
            System.out.println("\nText method:\n------------------------");
            System.out.println("A man(woman) named " + name +  " lives in the city "+ city +".\nThis man(woman) is "+ age +" years old and his(her) hobby is "+ hobby + "." );
            System.out.println("------------------------");

        }

        public void outPutAnotherMethod(String name, String city, int age, String hobby){
            System.out.println("\nAnother method:\n------------------------");
            System.out.println(name + "\t - name\n"+ city + "\t - city\n"+ age + "\t\t - age\n"+ hobby + " - hobby");
            System.out.println("------------------------");

        }

}
