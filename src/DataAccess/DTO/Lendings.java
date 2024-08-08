package DataAccess.DTO;

public class Lendings {
    private int id;
    private int userId;
    private int bookId;
    private String dateOut;
    private String dateReturn;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getDateOut() {
        return dateOut;
    }
    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }
    public String getDateReturn() {
        return dateReturn;
    }
    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }

   
}
