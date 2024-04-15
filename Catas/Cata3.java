public class Cata3 {
    public static void main(String[] args) {
        ArrayList<String> konamiCode = new ArrayList<String>();
        konamiCode.add("UP");
        konamiCode.add("UP");
        konamiCode.add("DOWN");
        konamiCode.add("DOWN");
        konamiCode.add("LEFT");
        konamiCode.add("RIGHT");
        konamiCode.add("LEFT");
        konamiCode.add("RIGHT");
        konamiCode.add("B");
        konamiCode.add("A");
        konamiCode.add("START");

        System.out.println("INSERT YOUR CODE: ");
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        for (int i = 0; i < code.length(); i++) {
            if (i >= konamiCode.size() || !konamiCode.get(i).equals(code.substring(i, i + 1))) {
                correct = false;
    }

    if (correct) {
        System.out.println("YOUR CODE IS CORRECT");
    } else {
        System.out.println("YOUR CODE IS NOT CORRECT");
    }
}