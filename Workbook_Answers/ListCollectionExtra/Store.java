package Workbook_Answers.ListCollectionExtra;

import Workbook_Answers.ListCollectionExtra.Book;
import java.util.ArrayList;
import java.util.Objects;

public class Store {
    private ArrayList<Book> books;

    public Store(){
        this.books = new ArrayList<>();
    }

    public Book getBook(int index){
        return new Book(this.books.get(index));
    }

    public void setBook(int index,Book book){
        this.books.set(index, new Book(book));
    }

    public void addBook(Book book){
        this.books.add(new Book(book));
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }


    public void sellBook(String title){
        for(int i =0; i < this.books.size();i++){
            if(this.books.get(i).getTitle().equals(title)){
                this.books.remove(i);
            }
        }
    }

}
