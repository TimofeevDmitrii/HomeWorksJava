package Seminar6HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class FinalTask {

    static LinkedList<Laptop> laptopsList = new LinkedList<>();  // Список всех ноутбуков в магазине
    static Map<Integer,String> filterMap = new HashMap<>();  // В этой мапе будут храниться номера параметров для поиска и их значения
    static HashSet<Laptop> laptopsSet = new HashSet<>();   // В это множество сделаем отбор всех уникальных моделей ноутбуков

    public static String prompt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }


    static void addFilter(){
        System.out.println("Здравствуйте! Введите цифру, соответствующую необходимому критерию для поиска ноутбука.\n"+
                "Далее введите значение этого параметра. Затем таким же путем добавьте следующий параметр для поиска при необходимости.\n" +
                "Если ввод параметров завершен, введите 7");
        StringBuilder sb = new StringBuilder();
        sb.append("1. Длина диагонали экрана(В дюймах, например, 17.2)"+"\n");
        sb.append("2. ОЗУ (В ГБ)"+"\n");
        sb.append("3. Объем дискового хранилища (В ГБ)"+"\n");
        sb.append("4. Тип диска (HDD, SSD)"+"\n");
        sb.append("5. Операционная система"+"\n");
        sb.append("6. Цвет"+"\n");
        sb.append("7. Завершить выбор параметров"+"\n");
        Integer inputNum = 0;
        while (inputNum!=7) {
            System.out.println(sb);
            inputNum = Integer.parseInt(prompt());
            if (inputNum>0 && inputNum<7) {
                System.out.print("Введите значение параметра: ");
                filterMap.put(inputNum, prompt());
            }
        }
    }

    public static LinkedList<Laptop> filterOfLaptops(){
        LinkedList<Laptop> filteredLaptops = new LinkedList<>(); // отфильтрованный список ноутбуков
        filteredLaptops.addAll(laptopsSet);
        for (Laptop lap: laptopsSet){
            double scrSize = lap.screenSize;
            int[] intFields = {lap.ram, lap.memoryDiskSize};
            String[] stringFields = {lap.memoryDiskType, lap.operationSystem, lap.colour};
            for (Integer key: filterMap.keySet()){
                if (key==1) {
                    if (scrSize != Double.parseDouble(filterMap.get(key))) {
                        filteredLaptops.remove(lap);
                        break;
                    }
                }
                else if (key>1 && key<=3) {
                    if (intFields[key-2] != Integer.parseInt(filterMap.get(key))) {
                        filteredLaptops.remove(lap);
                        break;
                    }
                }
                else  {
                    if (!stringFields[key-4].equals(filterMap.get(key))) {
                        filteredLaptops.remove(lap);
                        break;
                    }
                }
            }
        }
        return filteredLaptops;
    }


    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Asus","AX53S", 124456);
        laptop1.screenSize = 15.4;
        laptop1.ram = 4;
        laptop1.memoryDiskSize = 128;
        laptop1.memoryDiskType = "SSD";
        laptop1.operationSystem = "Astra Linux";
        laptop1.colour = "Grey";
        laptopsList.add(laptop1);

        Laptop laptop2 = new Laptop("Samsung","15RT4", 33274);
        laptop2.screenSize = 15.4;
        laptop2.ram = 8;
        laptop2.memoryDiskSize = 256;
        laptop2.memoryDiskType = "SSD";
        laptop2.operationSystem = "Windows 10";
        laptop2.colour = "Grey";
        laptopsList.add(laptop2);

        Laptop laptop3 = new Laptop("Samsung","17FT5", 432266);
        laptop3.screenSize = 17;
        laptop3.ram = 8;
        laptop3.memoryDiskSize = 512;
        laptop3.memoryDiskType = "HDD";
        laptop3.operationSystem = "Windows 11";
        laptop3.colour = "Black";
        laptopsList.add(laptop3);

        Laptop laptop4 = new Laptop("Asus","GXT884", 867732);
        laptop4.screenSize = 17.2;
        laptop4.ram = 8;
        laptop4.memoryDiskSize = 256;
        laptop4.memoryDiskType = "HDD";
        laptop4.operationSystem = "Windows 11";
        laptop4.colour = "Black";
        laptopsList.add(laptop4);

        Laptop laptop5 = new Laptop("Lenovo","AM33F", 9913484);
        laptop5.screenSize = 15;
        laptop5.ram = 16;
        laptop5.memoryDiskSize = 256;
        laptop5.memoryDiskType = "SSD";
        laptop5.operationSystem = "Astra Linux";
        laptop5.colour = "Red";
        laptopsList.add(laptop5);

        Laptop laptop6 = new Laptop("Lenovo","CL47A", 337007);
        laptop6.screenSize = 17;
        laptop6.ram = 32;
        laptop6.memoryDiskSize = 512;
        laptop6.memoryDiskType = "SSD";
        laptop6.operationSystem = "Windows 10";
        laptop6.colour = "Blue";
        laptopsList.add(laptop6);

        Laptop laptop7 = new Laptop("Asus","GXT884", 563348); // laptop7 такой же, как laptop4
        laptop7.screenSize = 17.2;
        laptop7.ram = 8;
        laptop7.memoryDiskSize = 256;
        laptop7.memoryDiskType = "HDD";
        laptop7.operationSystem = "Windows 11";
        laptop7.colour = "Black";
        laptopsList.add(laptop7);

        Laptop laptop8 = new Laptop("Lenovo","AM33F", 9006324); // laptop8 такой же, как laptop5
        laptop8.screenSize = 15;
        laptop8.ram = 16;
        laptop8.memoryDiskSize = 256;
        laptop8.memoryDiskType = "SSD";
        laptop8.operationSystem = "Astra Linux";
        laptop8.colour = "Red";
        laptopsList.add(laptop8);


        // отбираем все уникальные модели ноутбуков; если ноутбук такой модели уже есть в Set, то он не добавится
        laptopsSet.addAll(laptopsList);

        addFilter();

        System.out.println(filterMap);
        for (Laptop lap: filterOfLaptops())
            System.out.println(lap);


    }
}
