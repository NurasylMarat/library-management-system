public class Main {
    static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert Martin", 2008, true);
        Book book2 = new Book("Java Basics", "James Gosling", 2015, false);

        LibraryMember member1 = new LibraryMember("Dias", 101);
        LibraryMember member2 = new LibraryMember("Medet", 102);

        Library library = new Library("Central City Library");

        library.displayInfo();

        member1.displayInfo();
        member2.displayInfo();

        book1.displayInfo();
        book2.displayInfo();

        if (book1.getYear() > book2.getYear()) {
            System.out.println(book1.getTitle() + " is newer than " + book2.getTitle());
        } else {
            System.out.println(book2.getTitle() + " is newer than " + book1.getTitle());
        }

        if (book2.isAvailable()) {
            System.out.println("The Clean Code book is available for purchase");
        } else {
            System.out.println("The Clean Code book is not available for purchase");
        }
    }
}