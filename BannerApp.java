public class BannerApp {

    public static String[] getO() {
        return new String[]{
            "  OOO  ",
            " O   O ",
            "O     O",
            "O     O",
            "O     O",
            " O   O ",
            "  OOO  "
        };
    }

    public static String[] getP() {
        return new String[]{
            " PPP  ",
            "P   P ",
            "P   P ",
            " PPP  ",
            "P     ",
            "P     ",
            "P     "
        };
    }

    public static String[] getS() {
        return new String[]{
            "  SSS ",
            "S     ",
            "S     ",
            "  SSS ",
            "     S",
            "     S",
            " SSS  "
        };
    }

    public static void main(String[] args) {
        String[] o1 = getO();
        String[] o2 = getO();
        String[] p = getP();
        String[] s = getS();

        String[][] banner = {o1, o2, p, s};

        for (int i = 0; i < 7; i++) {
            for (String[] letter : banner) {
                System.out.print(letter[i]);
            }
            System.out.println();
        }
    }
}