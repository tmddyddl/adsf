package 컴페어;

public class Carcom implements Comparable<Carcom>{
    String modelName;
    int modelyear;
    String color;

    public Carcom(String modelName, int modelyear, String color) {
        this.modelName = modelName;
        this.modelyear = modelyear;
        this.color = color;
    }
    @Override
    public int compareTo(Carcom o) {
        if(this.modelyear == o.modelyear) {
            return this.modelName.compareTo(o.modelName);
        }
        else if (this.modelyear < o.modelyear)return -1; //정렬조건이아님
        else return 1;
    }
}
