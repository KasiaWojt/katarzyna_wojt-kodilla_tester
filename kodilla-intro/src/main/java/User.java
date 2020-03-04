public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User[] users = new User[]{new User("Tomasz", 25), new User("Justyna", 20), new User("Tadeusz", 35), new User("Krzysztof", 29), new User("Magdalena", 47), new User("Monika", 25), new User("Jakub", 32)};
        int ageSum = 0;

        for(int i = 0; i < users.length; ++i) {
            ageSum += users[i].age;
        }

        double ageAverage = (double)(ageSum / users.length);
        System.out.println("Srednia wieku użytkowników: " + ageAverage);
        System.out.println();

        for(int i = 0; i < users.length; ++i) {
            if ((double)users[i].age < ageAverage) {
                System.out.println(users[i].name);
            }
        }

    }
}
