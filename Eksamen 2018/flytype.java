class Flytype {
    String type;
    String seteinfo;
    
    Flytype(String t, String s){
        this.type = t;
        this.seteinfo = s;  
    }
    Flygning opprettFlygning(String no){
        Flygning flygningen = new Flygning(no,seteinfo);
        return flygningen;
    }
}
