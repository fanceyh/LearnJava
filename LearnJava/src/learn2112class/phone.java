package learn2112class;
//
public class phone {
    private String brand;
    private int size;
    public phone(){
        brand="brand";
        size=-1;
    }
    public phone(String brand,int size){
        this.brand=brand;
        this.size=size;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size=size;
    }
    public void show(){
        System.out.println("手机品牌："+brand);
        System.out.println("手机size:"+size);
    }
}
