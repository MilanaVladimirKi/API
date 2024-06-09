public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "4444 № 123456";
        post.phone = "8(999)1234567";

        post.birthday = new Birthday();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        post.subscription = true;
    }
}
