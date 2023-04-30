public enum HttpCodes {

    INFORMATIONAL(100, 199, action = (code, d) -> System.out.println("http code: " + code +
            ": " + d)),
    SUCCESS(200, 299, action = (code, d) -> System.out.println("http code: " + code +
            ": " + d)),
    REDIRECTION(300, 399, action = (code, d) -> System.out.println("http code: " + code +
            ": " + d)),
    CLIENT_ERROR(400, 499, action = (code, d) -> System.out.println("http code: " + code +
            ": " + d)),
    SERVER_ERROR(500, 599, action = (code, d) -> System.out.println("http code: " + code +
            ": " + d));

    private final int minEdge;
    private final int maxEdge;
    private static Action action;

    HttpCodes(int minEdge, int maxEdge, Action action) {
        this.minEdge = minEdge;
        this.maxEdge = maxEdge;
    }

    public static void findValueByCode(int code) {
        for (HttpCodes result : HttpCodes.values()) {
            if (code >= result.minEdge && code <= result.maxEdge) {
                action.action(code, result);
                return;
            }
        }
    }
}
