public class Hash {
    public static void main(String[] args) {

        Pen pen1= new Pen(10,"blue");
        Pen pen2= new Pen(10, "blue");

        System.out.println(pen1);
        System.out.println(pen2);
        System.out.println(pen1.equals(pen2));
        
    }
    
}

class Pen{
    int price;
    String color;
    public Pen(int price, String color){
        this.price=price;
        this.color=color;
    

    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pen other = (Pen) obj;
        if (price != other.price)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }
}
