package homework10;
import java.util.Objects;

public class Books implements Comparable<Books> {
    String name;
    private String authorName;
    private String authorSurName;
    private String authorFatherName;
    private int index;

    public Books(String name, String authorName, String authorSurName, String authorFatherName, int index) {
        this.name = name;
        this.authorName = authorName;
        this.authorSurName = authorSurName;
        this.authorFatherName = authorFatherName;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurName() {
        return authorSurName;
    }

    public void setAuthorSurName(String authorSurName) {
        this.authorSurName = authorSurName;
    }

    public String getAuthorFatherName() {
        return authorFatherName;
    }

    public void setAuthorFatherName(String authorFatherName) {
        this.authorFatherName = authorFatherName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Books() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return index == books.index &&
                Objects.equals(name, books.name) &&
                Objects.equals(authorName, books.authorName) &&
                Objects.equals(authorSurName, books.authorSurName) &&
                Objects.equals(authorFatherName, books.authorFatherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, authorSurName, authorFatherName, index);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Books{");
        sb.append("name='").append(name).append('\'');
        sb.append(", authorName='").append(authorName).append('\'');
        sb.append(", authorSurName='").append(authorSurName).append('\'');
        sb.append(", authorFatherName='").append(authorFatherName).append('\'');
        sb.append(", index=").append(index);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Books o) {
        return 0;
    }
}