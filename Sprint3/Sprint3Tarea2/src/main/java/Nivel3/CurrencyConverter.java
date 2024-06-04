package Nivel3;

public class CurrencyConverter implements Converter{

    @Override
    public float converter(double value, String currency) {
        float result = 0;
        switch (currency){
            case "MXN":
                result = (float) (value * 0.052);
                break;
            case "USD":
                result = (float) (value * 0.051);
                break;
            case "EUR":
                result = (float) (value * 0.053);
                break;
            case "GBP":
                result = (float) (value * 0.054);
                break;
        }
        return result;
    }
}
