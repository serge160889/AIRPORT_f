package academy.belhard.entity;

public class Airplane {
    private int id;
    private String brandPlanes;
    private String modelPlanes;
    private int capasity;
    private String boardNumber;

    public Airplane(int id, String brandPlanes, String modelPlanes, int capasity, String boardNumber) {
        this.id = id;
        this.brandPlanes = brandPlanes;
        this.modelPlanes = modelPlanes;
        this.capasity = capasity;
        this.boardNumber = boardNumber;
    }

    public int getId() { return id; }

    public String getBrandPlanes() { return brandPlanes; }

    public String getModelPlanes() { return modelPlanes; }

    public int getCapasity() { return capasity; }

    public String getBoardNumber() { return boardNumber; }

    @Override
    public String toString() {
        return "Airplane{" +
                "id=" + id +
                ", brandPlanes='" + brandPlanes + '\'' +
                ", modelPlanes='" + modelPlanes + '\'' +
                ", capasity=" + capasity +
                ", boardNumber='" + boardNumber + '\'' +
                '}';
    }
}
