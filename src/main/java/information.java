import java.util.Scanner;

public class information {
    Scanner scanner = new Scanner(System.in);

    public  String inputName(){
        System.out.print("Enter your name:");
        String name = scanner.next();
        return name;
    }

        public String inputCity(){
            System.out.print("Enter your city:");
            String city = scanner.next();
            return city;
        }

            public int inputAge (){
                System.out.print("Enter your age:");
                int age = scanner.nextInt();
                return age;
            }

            public String inputHobby(){
                System.out.print("Enter your hobby:");
                String hobby = scanner.next();
                return hobby;
            }




}
