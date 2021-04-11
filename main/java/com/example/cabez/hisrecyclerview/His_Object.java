package com.example.cabez.hisrecyclerview;

public class His_Object{

        private String rideId;
        private String time;

        public His_Object(String rideId, String time){
            this.rideId = rideId;
            this.time = time;
        }

        public String getRideId(){return rideId;}
        public void setRideId(String rideId) {
            this.rideId = rideId;
        }

        public String getTime(){return time;}
        public void setTime(String time) {
            this.time = time;
        }
}
