package Abstractions;

// Абстрактная модель класса фабрики
public abstract class ItemGenerator {

    // Метод, который взаимодействует с абстрактной продукцией
    // return: то, что содержится в разных сундуках

    public String openReward() {
        IGameItem gameItem = createItem();
        return gameItem.open();
    }

    // Метод, который создает экземпляр продукта
    // return: экземпляр продукта
    public abstract IGameItem createItem();
}