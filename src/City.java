public class City {
    private String Name;
    private String Region;
    private String District;
    private String Population;
    private String Foundation;

    public City(String... values) {
        if (values.length >= 1) {
            this.Name = values[0];
        }
        if (values.length >= 2) {
            this.Region = values[1];
        }
        if (values.length >= 3) {
            this.District = values[2];
        }
        if (values.length >= 4) {
            this.Population = values[3];
        } else {
            this.Population = null;
        }
        if (values.length >= 5) {
            this.Foundation = values[4];
        } else {
            this.Foundation = null;
        }
                //Пришлось реализовать конструктор с переменным количеством входных данных, потому что у некоторых городов не указан год основания, было решено задать null  по умлочанию.
    }

    @Override
    public String toString() {
        return ("City{" +
                "name='" + this.getName() + '\'' +
                ", region='" + this.getRegion() + '\'' +
                ", district='" + this.getDistrict() + '\'' +
                ", population=" + this.getPopulation() +
                ", foundation='" + this.getFoundation() + '\'' +
                '}');
    } 
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getPopulation() {
        return Population;
    }

    public void setPopulation(String population) {
        Population = population;
    }

    public String getFoundation() {
        return Foundation;
    }

    public void setFoundation(String foundation) {
        Foundation = foundation;
    }
}
