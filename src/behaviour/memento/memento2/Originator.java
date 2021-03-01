package behaviour.memento.memento2;

class Originator {
    private String state;
    /* lots of memory consumptive private data that is not necessary to define the
     * state and should thus not be saved. Hence the small memento object. */

    public void setState(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }

    public void save() {
        Memento.save(this.state);
    }

    public void backUp(int backUpItems) {
        this.state = Memento.getItem(backUpItems);
    }

    public String getState() {
        return this.state;
    }
}
