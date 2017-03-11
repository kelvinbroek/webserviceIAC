package kelvinbroekman.messages;

import kelvinbroekman.request.RequestInput;

/**
 * Created by Kelvin on 10-3-2017.
 */
public class Berekening {

    public static double Bereken(RequestInput req) {

        float gemiddelde = (req.getNumber1().floatValue() + req.getNumber2().floatValue()
                + req.getNumber3().floatValue() + req.getNumber4().floatValue() + req.getNumber5().floatValue()) / 5;

        float DistanceNumber1 = req.getNumber1().floatValue() - gemiddelde;
        float DistanceNumber2 = req.getNumber2().floatValue() - gemiddelde;
        float DistanceNumber3 = req.getNumber3().floatValue() - gemiddelde;
        float DistanceNumber4 = req.getNumber4().floatValue() - gemiddelde;
        float DistanceNumber5 = req.getNumber5().floatValue() - gemiddelde;

        float Number1Kwadraat = DistanceNumber1 * DistanceNumber1;
        float Number2Kwadraat = DistanceNumber2 * DistanceNumber2;
        float Number3Kwadraat = DistanceNumber3 * DistanceNumber3;
        float Number4Kwadraat = DistanceNumber4 * DistanceNumber4;
        float Number5Kwadraat = DistanceNumber5 * DistanceNumber5;

        float gemiddeldKwadraat = (Number1Kwadraat + Number2Kwadraat + Number3Kwadraat + Number4Kwadraat + Number5Kwadraat) / 5;
        return Math.sqrt(gemiddeldKwadraat);

    }
}
