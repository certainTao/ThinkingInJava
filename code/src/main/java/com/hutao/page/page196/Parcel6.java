package com.hutao.page.page196;

public class Parcel6 {
    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                TrackingSlip(String s) {
                    id = s;
                }

                String getSlip() {
                    return id;
                }
            }

            TrackingSlip trackingSlip = new TrackingSlip("slip");
            String s = trackingSlip.getSlip();
            System.out.println(s);
        }
        //Can't use TrackingSlip here, Out of scope.
        //!TrackingSlip trackingSlip = new TrackingSlip("x");
    }

    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();
        parcel6.internalTracking(true);
    }
}
