class Vehicle{
    private String Mark;
    private String model;
    private int year;

    public Vehicle(String Mark,String model,int year){
        this.Mark = Mark;
        this.model = model;
        this.year = year;
    }

    public void startEngine(){
        System.out.println("Двигатель запустился");
    }
    public void stopEngine(){
        System.out.println("Запуск двигателся приостановлен");
    }
    public String getModel(){
        return model;
    }
}