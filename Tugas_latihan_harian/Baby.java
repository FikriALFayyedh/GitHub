// settern dan gettern 
class Baby{
    String nama;
    String JK;
    double BB;
    
    void menangis(){
    System.out.println("huhuuhuuh");
    }

    void setNama(String nm){
        this.nama = nm;
    }
    void setJK(String JK){
        this.JK = JK;
    }
    void setBB(double BB){
        this.BB = BB;
    }

    String getNama(){
        return this.nama;
    }
    String getJK(){
        return this.JK;
    }
    double getBB(){
        return this.BB;
    }

    public static void main(String[] args){
        Baby baby_1=new Baby();
        baby_1.setNama("Kuro");
        System.out.println(baby_1.getNama());

        Baby baby_2=new Baby();
        baby_2.setJK("Laki-laki");
        System.out.println(baby_2.getJK());

        Baby baby_3=new Baby();
        baby_3.setBB(4.9);
        System.out.println(baby_3.getBB());
    }
}