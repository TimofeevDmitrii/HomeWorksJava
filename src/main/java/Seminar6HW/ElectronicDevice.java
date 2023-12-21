package Seminar6HW;


public class ElectronicDevice {  // Класс "Электронное устройство" для раздела "Электроника" в абстрактном магазине
                                 // Можно обобщить на любой тип техники
    protected String model;
    protected String type;
    protected String manufacturer;
    protected int manufactNumber;

    public ElectronicDevice(){
        this.type = getClass().getName();
        this.manufacturer = "Set Manufacturer";
        this.model = "Set Model";
        this.manufactNumber = 9999999;
    }

    @Override
    public String toString() {
        return String.format("Тип: %s; Производитель: %s; Модель: %s; Заводской номер: %d",
                type, manufacturer, model, manufactNumber);
    }

    @Override
    public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;

            ElectronicDevice that = (ElectronicDevice) obj;
            return this.model.equals(that.model) && this.manufacturer.equals(that.manufacturer);
    }


    // В формировании хэш-кода будет учитываться модель, как универсальный идентификатор всех характеристик устройства,
    // а также производитель. Таким образом, если в магазине, например, несколько ноутбуков одинаковой модели,
    // то в Set будет попадать один из них, т.к. под равенством ноутбуков будет пониматься равенство их храктеристик,
    // т.е. равенство полей производитель и модель. Для абсолютного равенства ноутбуков в equals нужно условие заменить на
    // return this.model.equals(that.model) && this.manufacturer.equals(that.manufacturer) && this.manufactNumber==that.manufactNumber
    // т.е. учитывать и заводской номер. Но смысл задания на мой взгляд в том, чтобы ориентировать пользователя
    // в выборе моделей устройств и их наличии в магазине.
    // На основе хэш-кода можно формировать так называемый артикул(цифровой код)
    // для каждой модели электронного устройства

    @Override
    public int hashCode() {
        int result1 = model == null ? 0 : model.hashCode();
        int result2 = manufacturer == null ? 0 : manufacturer.hashCode();
        return 29*result1+result2;
    }

}
