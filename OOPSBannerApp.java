public class OOPSBannerApp {
    private static final java.util.Map<Character, String[]> patternMap = new java.util.HashMap<>();

    static {
        patternMap.put('O', new String[]{
            "  OOO  ",
            " O   O ",
            " O   O ",
            " O   O ",
            "  OOO  "
        });
        patternMap.put('P', new String[]{
            " PPPP  ",
            " P   P ",
            " PPPP  ",
            " P     ",
            " P     "
        });
        patternMap.put('S', new String[]{
            "  SSSS ",
            " S     ",
            "  SSS  ",
            "     S ",
            " SSSS  "
        });
    }

    public void generateBanner(String text) {
        int height = 5; 
        StringBuilder bannerBuilder = new StringBuilder();

        for (int i = 0; i < height; i++) {
            for (char c : text.toCharArray()) {
                String[] pattern = patternMap.get(Character.toUpperCase(c));
                if (pattern == null) {
                    pattern = new String[]{" ", " ", " ", " ", " "};
                }
                bannerBuilder.append(pattern[i]).append("  "); 
            }
            bannerBuilder.append("\n");
        }

        System.out.println(bannerBuilder.toString());
    }

    public static void main(String[] args) {
        OOPSBannerApp app = new OOPSBannerApp();
        System.out.println("--- UC8: Map-Based Banner ---");
        app.generateBanner("OOPS");
    }
}