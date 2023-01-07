package LAPTOP3;

class laptop {
    Integer id;
    String  vendor;
    Integer ram;
    Integer ssd;
    String os;
    String clr;

    laptop(){
        id = null;
        vendor = null;
        ram = null;
        ssd = null;
        os = null;
        clr = null;
    }
  
    laptop(Integer newid, Integer newram, Integer newssd, String newos, String newclr){
        id = newid;
        vendor = new new_vendor
        ram = newram;
        ssd = newssd;
        os = newos;
        clr = newclr;
    }
  
//    public laptop(int newid, int newram, int newssd, String newos, String newcolor){
//
//    }
    @Override
    public String toString(){
        String str;
        System.out.println("=================================================================================================================");
        str = "№" + id +", " + "Производитель - " + vendor + " , " + "оперативная память(RAM) - " + ram + ", " + "жесткий диск(SSD) - " + ssd + ", " + "операционная система(OS) - " + os + ", " + "цвет(clr) - " + clr;
        return str;
    }
}
