package Test;

public class bookVo extends book{
    private String bookvo;

    public String getBookvo() {
        return bookvo;
    }

    public void setBookvo(String bookvo) {
        this.bookvo = bookvo;
    }

    @Override
    public String toString() {
        return "bookVo{" +
                "bookvo='" + bookvo + '\'' +
                "} " + super.toString();
    }
}
