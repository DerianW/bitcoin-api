package gov.curly.bitcoinapi.domain;

public class Bitcoin
{



    private Ticker ticker;
    private Long timestamp;
    private Boolean success;
    private String error;



    public Bitcoin(){}



    public Ticker getTicker() { return ticker; }
    public void setTicker(Ticker ticker) { this.ticker = ticker; }
    public Long getTimestamp() { return timestamp; }
    public void setTimestamp(Long timestamp) { this.timestamp = timestamp; }
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }
    public String getError() { return error; }
    public void setError(String error) { this.error = error; }


    @Override
    public String toString()
    {
        return "Bitcoin{" +
                "ticker='" + ticker + '\'' +
                ", timestamp=" + timestamp +
                ", success=" + success +
                ", error='" + error + '\'' +
                '}';
    }



}
