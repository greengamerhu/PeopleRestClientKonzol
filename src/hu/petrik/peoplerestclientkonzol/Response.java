package hu.petrik.peoplerestclientkonzol;

public class Response {
    private int responseCode;
    private String Content;
    public Response(int responseCode, String content) {
        this.responseCode = responseCode;
        Content = content;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getContent() {
        return Content;
    }
}
