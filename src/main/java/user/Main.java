package user;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("Ostap")
                .secondName("Dutka")
                .age(18)
                .gender("male")
                .occupation("software dev")
                .occupation("designer")
                .weight(85)
                .build();

        System.out.println(user);
    }
}
