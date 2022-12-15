public class Human {
    String name;
    int birthYear;
    String town;
    String jobTitle;
//
    public Human(String name, int birthYear, String town, String jobTitle) {
        if (name == null || name.isEmpty() || name.isBlank()){
             this.name = " - Данные не указаны - "; }
             else
        this.name = name;
        if(birthYear != 0 || birthYear > 1922){
        this.birthYear = birthYear;}
         else this.birthYear = 0;
         if(town == null || town.isEmpty() || town.isBlank()){
             this.town = " - Данные не указаны - ";
         } else
        this.town = town;
         if (jobTitle == null || jobTitle.isBlank() || jobTitle.isEmpty()){
             this.jobTitle = " - Данные не указаны - ";
         } else
        this.jobTitle = jobTitle;
    }

    public String name() {
        return name;
    }

    public int birthYear() {
        return birthYear;
    }

    public String town() {
        return town;
    }

    public String jobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я родился(лась) в " + birthYear + " г. в городе "
                 + town + ", я работаю на должности " + jobTitle + " Будем знакомы!";
    }
}

