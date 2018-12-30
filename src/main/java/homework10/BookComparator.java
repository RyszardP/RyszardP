package homework10;

import java.util.Comparator;

public class BookComparator extends Books {
    public static void main(String[] args) {

    }
    // sort books by book name
    @Override
    public int compareTo(Books o) {
        return this.name.compareTo(o.getName());
    }
    //sort books by author name
    public static Comparator<Books> authorNameComparator = new Comparator<Books>() {
        @Override
        public int compare(Books o1, Books o2) {
            return o1.getName().compareTo(o2.getAuthorName());
        }
    };
    //sort books by author surname
    public static Comparator<Books> authorSurnameComparator = new Comparator<Books>() {
        @Override
        public int compare(Books o1, Books o2) {
            return o1.getName().compareTo(o2.getAuthorSurName());
        }
    };

    // sort books by author father name
    public static Comparator<Books> authorFatherNameComparator = new Comparator<Books>() {
        @Override
        public int compare(Books o1, Books o2) {
            return o1.getName().compareTo(o2.getAuthorFatherName());
        }
    };
}
