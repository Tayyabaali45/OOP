public class Laptop {
    private String laptop_model;
    private int RAM_size;
    private int year_of_manufacturing;
    private int screen_size;
    private int generation;
    private int core;
    private boolean keyboard_lights;
    private int battery_life;

   
    public Laptop() {
        this.laptop_model = "";
        this.RAM_size = 0;
        this.year_of_manufacturing = 0;
        this.screen_size = 0;
        this.generation = 0;
        this.core = 0; 
        this.keyboard_lights = false;
        this.battery_life = 0;
    }

    public Laptop(String lm, int c) {
        this.laptop_model = lm;
        this.core = c;
    }

    public String getlaptop_model() {
        return laptop_model;
    }

    public void setlaptop_model(String laptop_model) {
        if (laptop_model != null && !laptop_model.isEmpty()) {
            this.laptop_model = laptop_model;
        }
    }

    public void display() {
        System.out.println(predictLaptopPrice());
        System.out.println(IsLaptopGoodForCoding());
    }

    public String predictLaptopPrice() {
        String price;
        if (core <= 6 && RAM_size <= 50 && generation <= 5 && year_of_manufacturing >= 2014) {
            price = "less than 50,000";
        } else {
            price = "greater than 60,000";
        }
        return price;
    }

    public boolean IsLaptopGoodForCoding() {
        boolean GoodforCoding;
        if (screen_size >= 14 && RAM_size >= 50 && battery_life >= 2) {
            GoodforCoding = true;
        } else {
            GoodforCoding = false;
        }
        return GoodforCoding;
    }
}


