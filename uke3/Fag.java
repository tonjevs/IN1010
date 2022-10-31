class Fag{
    private String fag;
    private HashMap<Student> mineStudenter = new HashMap<>();

    Fag(String fag){
        this.fag = fagKode;

    leggTilStudent(Student nyStud){
        if (finnesStudent(student)){
            System.out.println("Student tar allerede dette faget...")
        }
        mineStudenter.add(student)
    }

    finnesStudent(Student student){
        if(mineStudenter.containsValue(student)){
          return true;
        }return false;

    }
    fjernStudent(Student stud){
      if (mineStudenter.containsValue(stud)){
          mineStudenter.remove(stud);
      } System.out.println("Student var ikke i systemet...")

    }

    }
}
