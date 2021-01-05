
package com.techtalentsouth.techtalentblog.blogpost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Entity annotation makes this a database object as well as a java
//class
@Entity
public class BlogPost
{
    //Set the Id as the Primary key
    @Id
    //Specify how the primary key is generated by the underlying database
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;
    private String author;
    private String blogEntry;

    public BlogPost()
    {
        //Empty constructor required when we create an Entity.
    }

    public BlogPost(String title, String author, String blogEntry)
    {
        this.title = title;
        this.author = author;
        this.blogEntry = blogEntry;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlogEntry() {
        return blogEntry;
    }

    public void setBlogEntry(String blogEntry) {
        this.blogEntry = blogEntry;
    }

    @Override
    public String toString() {
        return "BlogPost [id=" + id + ", author=" + author + ", blogEntry=" + blogEntry + ", title=" + title + "]";
    }

    public Long getId() {
        return id;
    }
}