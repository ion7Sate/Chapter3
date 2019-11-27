package com.company;

    public class Invoices {
        private String partNumber;
        private String partDescription;
        private int itemQuantity;
        private double price;

        public Invoices(String partNumber, String partDescription, int itemQuantity, double price){
            this.partNumber = partNumber;
            this.partDescription = partDescription;
            this.itemQuantity = itemQuantity;
            this.price = price;
        }
        public String getPartDescription(){
            return partDescription;
        }

        public String getPartNumber() {
            return partNumber;
        }

        public int getItemQuantity() {
            return itemQuantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPartNumber(String partNumber) {
            this.partNumber = partNumber;
        }

        public void setPartDescription(String partDescription) {
            this.partDescription = partDescription;
        }

        public void setItemQuantity(int itemQuantity) {
            this.itemQuantity = itemQuantity;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        public double getInvoiceAmount(){
            if(getItemQuantity()<0){
                setItemQuantity(0);
            }
            if(getPrice()<0){
                setPrice(0.0);
            }
            return itemQuantity*price;
        }

    }


