package blogpost;

public class Main {
    public static void main(String[] args) {

        BlogPost b1 = new BlogPost();
        b1.authorName = "John Doe";
        b1.publicationDate = "2000.05.04.";
        b1.title = "Lorem Ipsum";
        b1.text = "Lorem ipsum dolor sit amet.";

        System.out.println(b1.title);

        BlogPost b2 = new BlogPost();
        b2.authorName = "Tim Urban";
        b2.publicationDate = "2010.10.10.";
        b2.title = "Wait but why";
        b2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost b3 = new BlogPost();
        b3.authorName = "William Turton";
        b3.publicationDate = "2017.03.28.";
        b3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        b3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

    }
}
