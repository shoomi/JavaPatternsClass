package behaviour.observer;

// Створює механізм підписки, що дає змогу одним об’єктам стежити й реагувати на події, які відбуваються в інших об’єктах.
public class Main {

    public static void main(String[] args) {
        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer); // тепер клас observer буде реагувати на будь-які зміни в класі observable, тобто його змінна news буде такою ж як і someValue в observable
        observable.setSomeValue("news");
        System.out.println(observer.getNews().equals("news"));
    }

}
