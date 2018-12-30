package homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

 class OuterClass {

     List<InnerClass> film = new ArrayList<InnerClass>();



     static class InnerClass {
         String name;
         String producer;
         double duration;
         String genre;

         public InnerClass(String name, String producer, double duration, String genre) {
             this.name = name;
             this.producer = producer;
             this.duration = duration;
             this.genre = genre;
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public String getProducer() {
             return producer;
         }

         public void setProducer(String producer) {
             this.producer = producer;
         }

         public double getDuration() {
             return duration;
         }

         public void setDuration(double duration) {
             this.duration = duration;
         }

         public String getGenre() {
             return genre;
         }

         public void setGenre(String genre) {
             this.genre = genre;
         }

         @Override
         public String toString() {
             return "InnerClass{" +
                     "name='" + name + '\'' +
                     ", producer='" + producer + '\'' +
                     ", duration=" + duration +
                     ", genre='" + genre + '\'' +
                     '}';
         }

         @Override
         public boolean equals(Object o) {
             if (this == o) return true;
             if (o == null || getClass() != o.getClass()) return false;
             InnerClass that = (InnerClass) o;
             return Double.compare(that.duration, duration) == 0 &&
                     Objects.equals(name, that.name) &&
                     Objects.equals(producer, that.producer) &&
                     Objects.equals(genre, that.genre);
         }

         @Override
         public int hashCode() {
             return Objects.hash(name, producer, duration, genre);
         }


     }
}



public class Cinema {
    public static void main(String args[]) {
        System.out.println();


    }
}