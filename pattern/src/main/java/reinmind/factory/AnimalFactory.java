package reinmind.factory;

public class AnimalFactory {

    public static Animal getInstance(AnimalEnum o){
        if(AnimalEnum.CAT.equals(o)){
            return new Cat("Tom");
        }
        if(AnimalEnum.DOG.equals(o)){
            return new Dog("白");
        }
        return null;
    }
}
