package structural.bridge;

// Розділяє один або кілька класів на дві окремі ієрархії — абстракцію та реалізацію, дозволяючи змінювати код в одній гілці класів, незалежно від іншої.
public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.joinWorkshop(new ProduceWorkShop());
        bike.joinWorkshop(new AssembleWorkShop());

        bike.manufacture();
        Vehicle car = new Car();
        car.joinWorkshop(new ProduceWorkShop());
        car.joinWorkshop(new AssembleWorkShop());
        car.manufacture();

    }
}
