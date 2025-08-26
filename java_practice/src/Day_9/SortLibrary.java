package Day_9;

import java.util.*;

class LibraryItem implements Comparable<LibraryItem> {
    int id;
    String title;
    String author;

    LibraryItem(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int compareTo(LibraryItem other) {
        return Integer.compare(this.id, other.id);
    }

    public String toString() {
        return id + " - " + title + " - " + author;
    }
}

public class SortLibrary {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new LibraryItem(3, "Java", "Nikhitha"));
        items.add(new LibraryItem(1, "Selenium", "Nitish"));
        items.add(new LibraryItem(2, "Maven", "Bobby"));
        Collections.sort(items);
        System.out.println("Sorted by ID:");
        for (LibraryItem item : items) {
            System.out.println(item);
        }
        Collections.sort(items, new Comparator<LibraryItem>() {
            public int compare(LibraryItem i1, LibraryItem i2) {
                int titleCompare = i1.title.compareTo(i2.title);
                if (titleCompare != 0) {
                    return titleCompare; 
                }
                return i1.author.compareTo(i2.author); 
            }
        });

        System.out.println("\nSorted by Title, then Author:");
        for (LibraryItem item : items) {
            System.out.println(item);
        }
    }
}


