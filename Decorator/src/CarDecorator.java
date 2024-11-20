public abstract class CarDecorator extends CarComponent {
    private CarComponent carComponent;

    public CarDecorator(CarComponent carComponent) {
        this.carComponent = carComponent;
    }

    public String getDescription() {
        return this.description + carComponent.getDescription();
    }
}
