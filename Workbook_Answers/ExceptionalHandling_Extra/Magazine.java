
public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;

    public Magazine(String title, String publisher, int issueNumber, int publicationYear){
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }

    public Magazine(Magazine source){
        setTitle(source.title);
        setPublisher(source.publisher);
        setIssueNumber(source.issueNumber);
        setPublicationYear(source.publicationYear);
    }
    
    public String getTitle(){
        return title;
    }

    public String publisher(){
        return publisher;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public int publicationYear(){
        return publicationYear;
    }

    public void setTitle(String title){
        if(title.isBlank() || title == null){
            throw new IllegalArgumentException("Title cannot be null or blank.");
        }
        this.title = title;
    }

    public void setPublisher(String publisher){
        if(publisher.isBlank() || publisher == null){
            throw new IllegalArgumentException("Publisher cannot be null or blank.");
        }
        this.publisher = publisher;
    }

    public void setIssueNumber(int issueNumber){
        if( issueNumber <= 0){
            throw new IllegalArgumentException("Issue number must be greater than 0.");
        }
        this.issueNumber = issueNumber;
    }

    public void setPublicationYear(int publicationYear){
        if(publicationYear <= 0){
            throw new IllegalArgumentException("Publication year must be greater than 0.");
        }
        this.publicationYear = publicationYear;
    }


}
