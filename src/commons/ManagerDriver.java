public class ManagerDriver {
    enum Browser {
        CHORME("chorme"),
        FIREFOX("firefox"),
        IE("ie");

        private String value;

        Browser (String value) {
            this.value = value;
        }

        public static Browser getBrowser(String value) {
            for (Browser b : Browser.values()) {
                if (b.value == value) {
                    return b;
                }
            }
            return null;
        }
    }
}
