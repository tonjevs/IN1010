class Main{

    public static void main(String[] args){

        Student s1 = new Student("Joakim",0,0);
        Student s2 = new Student("Kristin",0,0);
        Student s3 = new Student("Dag",0,0);

        s1.leggTilQuizScore(50);
        s1.leggTilQuizScore(30);
        s2.leggTilQuizScore(30);
        s2.leggTilQuizScore(90);
        s3.leggTilQuizScore(20);
        s3.leggTilQuizScore(80);

        System.out.println(s1.hentTotalScore());
        System.out.println(s1.hentGjennomsnittligScore());
        System.out.println(s2.hentTotalScore());
        System.out.println(s2.hentGjennomsnittligScore());
        System.out.println(s3.hentTotalScore());
        System.out.println(s3.hentGjennomsnittligScore());
    }
}
class Student{

    String navn;
    int totQuizScore = 0;
    int antQuizDeltatt = 0;

    public Student(String navn, int totQuizScore, int antQuizDeltatt){
        this.navn = navn;
        this.totQuizScore = totQuizScore;
        this.antQuizDeltatt = antQuizDeltatt;
    }

    String hentNavn(){
        return navn;
    }
    int leggTilQuizScore(int score){
        totQuizScore += score;
        return antQuizDeltatt++;
    }
    int hentTotalScore(){
        return totQuizScore;
    }
    int hentGjennomsnittligScore(){
        return antQuizDeltatt/antQuizDeltatt;
    }
}
