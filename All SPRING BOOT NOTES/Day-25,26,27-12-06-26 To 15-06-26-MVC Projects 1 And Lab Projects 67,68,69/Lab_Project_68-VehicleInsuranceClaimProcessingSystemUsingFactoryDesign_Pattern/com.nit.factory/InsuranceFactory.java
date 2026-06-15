package com.nit.factory;

import com.nit.service.BikeInsuranceClaim;
import com.nit.service.CarInsuranceClaim;
import com.nit.service.InsuranceClaim;
import com.nit.service.TruckInsuranceClaim;

public class InsuranceFactory {

    public InsuranceClaim getClaim(String claimType) {

        if(claimType.equalsIgnoreCase("CAR")) {
            return new CarInsuranceClaim();
        }
        else if(claimType.equalsIgnoreCase("BIKE")) {
            return new BikeInsuranceClaim();
        }
        else if(claimType.equalsIgnoreCase("TRUCK")) {
            return new TruckInsuranceClaim();
        }

        return null;
    }
}
