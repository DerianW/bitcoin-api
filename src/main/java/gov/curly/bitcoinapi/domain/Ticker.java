package gov.curly.bitcoinapi.domain;

public class Ticker
{



    private String base;
    private String target;
    private Double price;
    private Double volume;
    private Double change;



    public Ticker(){}



    public String getBase() { return base; }
    public void setBase(String base) { this.base = base; }
    public String getTarget() { return target; }
    public void setTarget(String target) { this.target = target; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
    public Double getVolume() { return volume; }
    public void setVolume(Double volume) { this.volume = volume; }
    public Double getChange() { return change; }
    public void setChange(Double change) { this.change = change; }


    @Override
    public String toString()
    {
        return "Ticker{" +
                "base='" + base + '\'' +
                ", target='" + target + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", change=" + change +
                '}';
    }
}
