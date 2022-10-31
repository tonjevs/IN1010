class Figur{

    public static void main(String[] args){

        Figur[] figurliste = new Figur[4];
        figurliste[0] = new Trekant(2,3);
        figurliste[1] = new Firkant(4;
        figurliste[2] = new Rektangel(3,7);
        figurliste[3] = new Sirkel(3);

        double areal = 0;

        for (int i = 0; i < figurliste.length; i++){
            areal += figurliste[i].areal();
        }
        System.out.println(areal);
    }
}
