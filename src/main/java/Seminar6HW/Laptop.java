package Seminar6HW;

public class Laptop extends ElectronicDevice {

    double screenSize;
    int ram;
    int memoryDiskSize;
    String memoryDiskType;
    String operationSystem;
    String colour;

    public Laptop(String manufacturer, String model, int manufactNumber){
        this.manufacturer = manufacturer;
        this.model = model;
        this.ram = 0;
        this.memoryDiskSize = 0;
        this.memoryDiskType = "";
        this.screenSize = 0;
        this.operationSystem = "";
        this.colour = "";
        this.manufactNumber = manufactNumber;
    }

    public StringBuilder printСharacteristics(){
        StringBuilder sb = new StringBuilder();
        sb.append("Размер диагонали экрана: "+screenSize+"\n");
        sb.append("ОЗУ: "+ram+"\n");
        sb.append("Объем дискового пространства: "+memoryDiskSize+"\n");
        sb.append("Тип диска: "+memoryDiskType+"\n");
        sb.append("Операционная система: "+operationSystem+"\n");
        sb.append("Цвет: "+colour+"\n");
        return sb;
    }


}
