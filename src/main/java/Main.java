public class Main {
    public static void main(String[] args) {
        information info = new information();

        String name = info.inputName();
        String city = info.inputCity();
        int age = info.inputAge();
        String hobby =info.inputHobby();

        OutputInfo output = new OutputInfo();
        output.outPutTableMethod(name,city,age,hobby);
        output.outPutTextMethod(name,city,age,hobby);
        output.outPutAnotherMethod(name,city,age,hobby);
    }
}
