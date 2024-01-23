public class WhoLikesIt {
    public static void main(String[] args) {
        String result1 = whoLikesIt();
        String result2 = whoLikesIt("Peter");
        String result3 = whoLikesIt("Jacob", "Alex");
        String result4 = whoLikesIt("Max", "John", "Mark");
        String result5 = whoLikesIt("Alex", "Jacob", "Mark", "Max");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }

    public static String whoLikesIt(String... names) {
        return switch (names.length) {
            case 0 -> "no one likes this";
            case 1 -> String.format("%s likes this", names[0]);
            case 2 -> String.format("%s and %s like this", names[0], names[1]);
            case 3 -> String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default -> String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        };
    }
}
