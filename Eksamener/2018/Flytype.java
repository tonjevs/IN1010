class Flytype {
    String type; 
    String seteInfo; 

    Flytype(String type, String seteInfo){
        this.type = type; 
        this.seteInfo = seteInfo;
    }

    Flygning opprettFlygning(){
        return new Flygning(seteInfo);
    }
}
