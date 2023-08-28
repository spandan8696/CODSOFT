import java.util.Currency;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);


        System.out.println("<< CURRENCY CONVERTER >>");
        System.out.println("Select the Base Currency: ");
        System.out.println("PRESS 1 FOR RUPEES");
        System.out.println("PRESS 2 FOR US DOLLAR (USD)");
        System.out.println("PRESS 3 FOR EURO (EUR)");
        System.out.println("PRESS 4 FOR JAPANESE YEN (JPY)");
        System.out.println("PRESS 5 FOR THE POUND STERLING (GBP)");
        System.out.println("PRESS 6 FOR AUSTRALIAN DOLLAR (AUD)");
        System.out.println("PRESS 7 FOR CANADIAN DOLLAR (CAD)");
        System.out.println("PRESS 8 FOR SWISS FRANC (CHF)");
        System.out.println("PRESS 9 FOR HONG KONG DOLLAR (HKD)");
        System.out.println("PRESS 10 FOR CHINESE YUAN (CNY)");

        int x=sc.nextInt();
        //¥
        if (x == 1) {
            Currency rs = Currency.getInstance("INR");
            System.out.print("ENTER THE MONEY AMOUNT :" + rs.getSymbol() + " ");
            double a = sc.nextInt();
            System.out.println("Select the currency to convert: ");
            //System.out.println("PRESS 1 FOR RUPEES");
            System.out.println("PRESS 1 FOR US DOLLAR (USD)");
            System.out.println("PRESS 2 FOR EURO (EUR)");
            System.out.println("PRESS 3 FOR JAPANESE YEN (JPY)");
            System.out.println("PRESS 4 FOR THE POUND STERLING (GBP)");
            System.out.println("PRESS 5 FOR AUSTRALIAN DOLLAR (AUD)");
            System.out.println("PRESS 6 FOR CANADIAN DOLLAR (CAD)");
            System.out.println("PRESS 7 FOR SWISS FRANC (CHF)");
            System.out.println("PRESS 8 FOR HONG KONG DOLLAR (HKD)");
            System.out.println("PRESS 9 FOR CHINESE YUAN (CNY)");
            int c=sc.nextInt();
            if (c==1){
                Currency inr= Currency.getInstance("USD");
                double b=a*0.012;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==2){
                Currency inr= Currency.getInstance("EUR");
                double b=a*0.011;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==3){
                Currency inr= Currency.getInstance("JPY");
                double b=a*1.77;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==4){
                Currency inr= Currency.getInstance("GBP");
                double b=0.0096;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==5){
                Currency inr= Currency.getInstance("AUD");
                double b=a*0.019;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==6){
                Currency inr= Currency.getInstance("CAD");
                double b=a*0.016;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==7){
                Currency inr= Currency.getInstance("CHF");
                double b=a*0.011;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==8){
                Currency inr= Currency.getInstance("HKD");
                double b=a*0.095;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==9){
                //Currency inr= Currency.getInstance("INR");
                double b=a*0.088;
                System.out.print("THE CONVERTED AMOUNT :" +"¥"+ " "+b);

            }
        } else if (x==2) {
            Currency us = Currency.getInstance("USD");
            System.out.print("ENTER THE MONEY AMOUNT :" + us.getSymbol() + " ");
            double a = sc.nextInt();
            System.out.println("Select the currency to convert: ");
            System.out.println("PRESS 1 FOR RUPEES");
            //System.out.println("PRESS 2 FOR US DOLLAR (USD)");
            System.out.println("PRESS 2 FOR EURO (EUR)");
            System.out.println("PRESS 3 FOR JAPANESE YEN (JPY)");
            System.out.println("PRESS 4 FOR THE POUND STERLING (GBP)");
            System.out.println("PRESS 5 FOR AUSTRALIAN DOLLAR (AUD)");
            System.out.println("PRESS 6 FOR CANADIAN DOLLAR (CAD)");
            System.out.println("PRESS 7 FOR SWISS FRANC (CHF)");
            System.out.println("PRESS 8 FOR HONG KONG DOLLAR (HKD)");
            System.out.println("PRESS 9 FOR CHINESE YUAN (CNY)");
            int c=sc.nextInt();
            if (c==1){
                Currency inr= Currency.getInstance("INR");
                double b=a*82.55;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==2){
                Currency inr= Currency.getInstance("EUR");
                double b=a*0.93;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==3){
                Currency inr= Currency.getInstance("JPY");
                double b=a*146.44;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==4){
                Currency inr= Currency.getInstance("GBP");
                double b=0.79;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==5){
                Currency inr= Currency.getInstance("AUD");
                double b=a*1.56;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==6){
                Currency inr= Currency.getInstance("CAD");
                double b=a*1.36;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==7){
                Currency inr= Currency.getInstance("CHF");
                double b=a*0.88;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==8){
                Currency inr= Currency.getInstance("HKD");
                double b=a*7.84;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==9){
                //Currency inr= Currency.getInstance("INR");
                double b=a*7.29;
                System.out.print("THE CONVERTED AMOUNT :" +"¥"+ " "+b);

            }
        } else if (x==3) {
            Currency eu = Currency.getInstance("EUR");
            System.out.print("ENTER THE MONEY AMOUNT :" + eu.getSymbol() + " ");
            double a = sc.nextInt();
            System.out.println("Select the currency to convert: ");
            System.out.println("PRESS 1 FOR RUPEES");
            System.out.println("PRESS 2 FOR US DOLLAR (USD)");
            //System.out.println("PRESS 3 FOR EURO (EUR)");
            System.out.println("PRESS 3 FOR JAPANESE YEN (JPY)");
            System.out.println("PRESS 4 FOR THE POUND STERLING (GBP)");
            System.out.println("PRESS 5 FOR AUSTRALIAN DOLLAR (AUD)");
            System.out.println("PRESS 6 FOR CANADIAN DOLLAR (CAD)");
            System.out.println("PRESS 7 FOR SWISS FRANC (CHF)");
            System.out.println("PRESS 8 FOR HONG KONG DOLLAR (HKD)");
            System.out.println("PRESS 9 FOR CHINESE YUAN (CNY)");
            int c=sc.nextInt();
            if (c==1){
                Currency inr= Currency.getInstance("INR");
                double b=a*89.11;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==2){
                Currency inr= Currency.getInstance("USD");
                double b=a*1.08;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==3){
                Currency inr= Currency.getInstance("JPY");
                double b=a*158.09;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==4){
                Currency inr= Currency.getInstance("GBP");
                double b=0.86;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==5){
                Currency inr= Currency.getInstance("AUD");
                double b=a*1.69;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==6){
                Currency inr= Currency.getInstance("CAD");
                double b=a*1.47;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==7){
                Currency inr= Currency.getInstance("CHF");
                double b=a*0.95;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==8){
                Currency inr= Currency.getInstance("HKD");
                double b=a*8.47;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==9){
                //Currency inr= Currency.getInstance("INR");
                double b=a*7.87;
                System.out.print("THE CONVERTED AMOUNT :" +"¥"+ " "+b);

            }
        } else if (x==4) {
            Currency jp = Currency.getInstance("JPY");
            System.out.print("ENTER THE MONEY AMOUNT :" + jp.getSymbol() + " ");
            double a = sc.nextInt();
            System.out.println("Select the currency to convert: ");
            System.out.println("PRESS 1 FOR RUPEES");
            System.out.println("PRESS 2 FOR US DOLLAR (USD)");
            System.out.println("PRESS 3 FOR EURO (EUR)");
            //System.out.println("PRESS 4 FOR JAPANESE YEN (JPY)");
            System.out.println("PRESS 4 FOR THE POUND STERLING (GBP)");
            System.out.println("PRESS 5 FOR AUSTRALIAN DOLLAR (AUD)");
            System.out.println("PRESS 6 FOR CANADIAN DOLLAR (CAD)");
            System.out.println("PRESS 7 FOR SWISS FRANC (CHF)");
            System.out.println("PRESS 8 FOR HONG KONG DOLLAR (HKD)");
            System.out.println("PRESS 9 FOR CHINESE YUAN (CNY)");
            int c=sc.nextInt();
            if (c==1){
                Currency inr= Currency.getInstance("INR");
                double b=a*0.56;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==2){
                Currency inr= Currency.getInstance("USD");
                double b=a*0.0068;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==3){
                Currency inr= Currency.getInstance("EUR");
                double b=a*0.0063;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==4){
                Currency inr= Currency.getInstance("GBP");
                double b=0.0054;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==5){
                Currency inr= Currency.getInstance("AUD");
                double b=a*0.011;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==6){
                Currency inr= Currency.getInstance("CAD");
                double b=a*0.0093;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==7){
                Currency inr= Currency.getInstance("CHF");
                double b=a*0.006;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==8){
                Currency inr= Currency.getInstance("HKD");
                double b=a*0.054;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==9){
                //Currency inr= Currency.getInstance("INR");
                double b=a*0.05;
                System.out.print("THE CONVERTED AMOUNT :" +"¥"+ " "+b);

            }
        } else if (x==5) {
            Currency uk = Currency.getInstance("GBP");
            System.out.print("ENTER THE MONEY AMOUNT :" + uk.getSymbol() + " ");
            double a = sc.nextInt();
            System.out.println("Select the currency to convert: ");
            System.out.println("PRESS 1 FOR RUPEES");
            System.out.println("PRESS 2 FOR US DOLLAR (USD)");
            System.out.println("PRESS 3 FOR EURO (EUR)");
            System.out.println("PRESS 4 FOR JAPANESE YEN (JPY)");
            //System.out.println("PRESS 5 FOR THE POUND STERLING (GBP)");
            System.out.println("PRESS 5 FOR AUSTRALIAN DOLLAR (AUD)");
            System.out.println("PRESS 6 FOR CANADIAN DOLLAR (CAD)");
            System.out.println("PRESS 7 FOR SWISS FRANC (CHF)");
            System.out.println("PRESS 8 FOR HONG KONG DOLLAR (HKD)");
            System.out.println("PRESS 9 FOR CHINESE YUAN (CNY)");
            int c=sc.nextInt();
            if (c==1){
                Currency inr= Currency.getInstance("INR");
                double b=a*103.85;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==2){
                Currency inr= Currency.getInstance("USD");
                double b=a*1.26;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==3){
                Currency inr= Currency.getInstance("EUR");
                double b=a*1.17;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==4){
                Currency inr= Currency.getInstance("JPY");
                double b=184.23;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==5){
                Currency inr= Currency.getInstance("AUD");
                double b=a*1.96;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==6){
                Currency inr= Currency.getInstance("CAD");
                double b=a*1.71;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==7){
                Currency inr= Currency.getInstance("CHF");
                double b=a*1.11;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==8){
                Currency inr= Currency.getInstance("HKD");
                double b=a*9.87;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==9){
                //Currency inr= Currency.getInstance("INR");
                double b=a*9.17;
                System.out.print("THE CONVERTED AMOUNT :" +"¥"+ " "+b);

            }
        } else if (x==6) {
            Currency as = Currency.getInstance("AUD");
            System.out.print("ENTER THE MONEY AMOUNT :" + as.getSymbol() + " ");
            double a = sc.nextInt();
            System.out.println("Select the currency to convert: ");
            System.out.println("PRESS 1 FOR RUPEES");
            System.out.println("PRESS 2 FOR US DOLLAR (USD)");
            System.out.println("PRESS 3 FOR EURO (EUR)");
            System.out.println("PRESS 4 FOR JAPANESE YEN (JPY)");
            System.out.println("PRESS 5 FOR THE POUND STERLING (GBP)");
            //System.out.println("PRESS 6 FOR AUSTRALIAN DOLLAR (AUD)");
            System.out.println("PRESS 6 FOR CANADIAN DOLLAR (CAD)");
            System.out.println("PRESS 7 FOR SWISS FRANC (CHF)");
            System.out.println("PRESS 8 FOR HONG KONG DOLLAR (HKD)");
            System.out.println("PRESS 9 FOR CHINESE YUAN (CNY)");
            int c=sc.nextInt();
            if (c==1){
                Currency inr= Currency.getInstance("INR");
                double b=a*52.86;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==2){
                Currency inr= Currency.getInstance("USD");
                double b=a*0.64;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==3){
                Currency inr= Currency.getInstance("EUR");
                double b=a*0.60;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==4){
                Currency inr= Currency.getInstance("JPY");
                double b=a*94.07;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==5){
                Currency inr= Currency.getInstance("GBP");
                double b=a*0.51;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==6){
                Currency inr= Currency.getInstance("CAD");
                double b=a*0.87;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==7){
                Currency inr= Currency.getInstance("CHF");
                double b=a*0.57;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==8){
                Currency inr= Currency.getInstance("HKD");
                double b=a*5.02;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==9){
                //Currency inr= Currency.getInstance("INR");
                double b=a*4.67;
                System.out.print("THE CONVERTED AMOUNT :" +"¥"+ " "+b);

            }
        } else if (x==7) {
            Currency ca = Currency.getInstance("CAD");
            System.out.print("ENTER THE MONEY AMOUNT :" + ca.getSymbol() + " ");
            double a = sc.nextInt();
            System.out.println("Select the currency to convert: ");
            System.out.println("PRESS 1 FOR RUPEES");
            System.out.println("PRESS 2 FOR US DOLLAR (USD)");
            System.out.println("PRESS 3 FOR EURO (EUR)");
            System.out.println("PRESS 4 FOR JAPANESE YEN (JPY)");
            System.out.println("PRESS 5 FOR THE POUND STERLING (GBP)");
            System.out.println("PRESS 6 FOR AUSTRALIAN DOLLAR (AUD)");
            //System.out.println("PRESS 7 FOR CANADIAN DOLLAR (CAD)");
            System.out.println("PRESS 7 FOR SWISS FRANC (CHF)");
            System.out.println("PRESS 8 FOR HONG KONG DOLLAR (HKD)");
            System.out.println("PRESS 9 FOR CHINESE YUAN (CNY)");
            int c=sc.nextInt();
            if (c==1){
                Currency inr= Currency.getInstance("INR");
                double b=a*60.65;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==2){
                Currency inr= Currency.getInstance("USD");
                double b=a*0.73;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==3){
                Currency inr= Currency.getInstance("EUR");
                double b=a*0.68;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==4){
                Currency inr= Currency.getInstance("JPY");
                double b=a*107.59;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==5){
                Currency inr= Currency.getInstance("GBP");
                double b=a*0.58;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==6){
                Currency inr= Currency.getInstance("AUD");
                double b=a*1.15;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==7){
                Currency inr= Currency.getInstance("CHF");
                double b=a*0.65;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==8){
                Currency inr= Currency.getInstance("HKD");
                double b=a*5.76;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==9){
                //Currency inr= Currency.getInstance("INR");
                double b=a*5.36;
                System.out.print("THE CONVERTED AMOUNT :" +"¥"+ " "+b);

            }
        } else if (x==8) {
            Currency sw = Currency.getInstance("CHF");
            System.out.print("ENTER THE MONEY AMOUNT :" + sw.getSymbol() + " ");
            double a = sc.nextInt();
            System.out.println("Select the currency to convert: ");
            System.out.println("PRESS 1 FOR RUPEES");
            System.out.println("PRESS 2 FOR US DOLLAR (USD)");
            System.out.println("PRESS 3 FOR EURO (EUR)");
            System.out.println("PRESS 4 FOR JAPANESE YEN (JPY)");
            System.out.println("PRESS 5 FOR THE POUND STERLING (GBP)");
            System.out.println("PRESS 6 FOR AUSTRALIAN DOLLAR (AUD)");
            System.out.println("PRESS 7 FOR CANADIAN DOLLAR (CAD)");
            //System.out.println("PRESS 8 FOR SWISS FRANC (CHF)");
            System.out.println("PRESS 8 FOR HONG KONG DOLLAR (HKD)");
            System.out.println("PRESS 9 FOR CHINESE YUAN (CNY)");
            int c=sc.nextInt();
            if (c==1){
                Currency inr= Currency.getInstance("INR");
                double b=a*93.33;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==2){
                Currency inr= Currency.getInstance("USD");
                double b=a*1.13;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==3){
                Currency inr= Currency.getInstance("EUR");
                double b=a*1.05;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==4){
                Currency inr= Currency.getInstance("JPY");
                double b=a*165.56;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==5){
                Currency inr= Currency.getInstance("GBP");
                double b=a*0.90;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==6){
                Currency inr= Currency.getInstance("AUD");
                double b=a*1.77;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==7){
                Currency inr= Currency.getInstance("CAD");
                double b=a*1.54;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==8){
                Currency inr= Currency.getInstance("HKD");
                double b=a*8.87;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==9){
                //Currency inr= Currency.getInstance("INR");
                double b=a*8.24;
                System.out.print("THE CONVERTED AMOUNT :" +"¥"+ " "+b);

            }
        } else if (x==9) {
            Currency hk = Currency.getInstance("HKD");
            System.out.print("ENTER THE MONEY AMOUNT :" + hk.getSymbol() + " ");
            double a = sc.nextInt();
            System.out.println("Select the currency to convert: ");
            System.out.println("PRESS 1 FOR RUPEES");
            System.out.println("PRESS 2 FOR US DOLLAR (USD)");
            System.out.println("PRESS 3 FOR EURO (EUR)");
            System.out.println("PRESS 4 FOR JAPANESE YEN (JPY)");
            System.out.println("PRESS 5 FOR THE POUND STERLING (GBP)");
            System.out.println("PRESS 6 FOR AUSTRALIAN DOLLAR (AUD)");
            System.out.println("PRESS 7 FOR CANADIAN DOLLAR (CAD)");
            System.out.println("PRESS 8 FOR SWISS FRANC (CHF)");
            //System.out.println("PRESS 9 FOR HONG KONG DOLLAR (HKD)");
            System.out.println("PRESS 9 FOR CHINESE YUAN (CNY)");
            int c=sc.nextInt();
            if (c==1){
                Currency inr= Currency.getInstance("INR");
                double b=a*10.53;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==2){
                Currency inr= Currency.getInstance("USD");
                double b=a*0.13;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==3){
                Currency inr= Currency.getInstance("EUR");
                double b=a*0.12;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==4){
                Currency inr= Currency.getInstance("JPY");
                double b=a*18.66;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==5){
                Currency inr= Currency.getInstance("GBP");
                double b=a*0.10;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==6){
                Currency inr= Currency.getInstance("AUD");
                double b=a*0.20;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==7){
                Currency inr= Currency.getInstance("CAD");
                double b=a*0.17;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==8){
                Currency inr= Currency.getInstance("CHF");
                double b=a*0.11;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==9){
                //Currency inr= Currency.getInstance("INR");
                double b=a*0.93;
                System.out.print("THE CONVERTED AMOUNT :" +"¥"+ " "+b);

            }
        } else if (x==10) {
            //Currency ch = Currency.getInstance("");
            System.out.print("ENTER THE MONEY AMOUNT :" +"¥"+ " ");
            double a = sc.nextInt();
            System.out.println("Select the currency to convert: ");
            System.out.println("PRESS 1 FOR RUPEES");
            System.out.println("PRESS 2 FOR US DOLLAR (USD)");
            System.out.println("PRESS 3 FOR EURO (EUR)");
            System.out.println("PRESS 4 FOR JAPANESE YEN (JPY)");
            System.out.println("PRESS 5 FOR THE POUND STERLING (GBP)");
            System.out.println("PRESS 6 FOR AUSTRALIAN DOLLAR (AUD)");
            System.out.println("PRESS 7 FOR CANADIAN DOLLAR (CAD)");
            System.out.println("PRESS 8 FOR SWISS FRANC (CHF)");
            System.out.println("PRESS 9 FOR HONG KONG DOLLAR (HKD)");
            //System.out.println("PRESS 10 FOR CHINESE YUAN (CNY)");
            int c=sc.nextInt();
            if (c==1){
                Currency inr= Currency.getInstance("INR");
                double b=a*11.34;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==2){
                Currency inr= Currency.getInstance("USD");
                double b=a*0.14;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==3){
                Currency inr= Currency.getInstance("EUR");
                double b=a*0.13;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==4){
                Currency inr= Currency.getInstance("JPY");
                double b=a*20.08;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==5){
                Currency inr= Currency.getInstance("GBP");
                double b=a*0.11;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==6){
                Currency inr= Currency.getInstance("AUD");
                double b=a*0.21;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==7){
                Currency inr= Currency.getInstance("CAD");
                double b=a*0.19;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==8){
                Currency inr= Currency.getInstance("CHF");
                double b=a*0.13;
                System.out.print("THE CONVERTED AMOUNT :" + inr.getSymbol() + " "+b);

            }else if (c==9){
                Currency inr= Currency.getInstance("HKD");
                double b=a*1.09;
                System.out.print("THE CONVERTED AMOUNT :" +inr.getSymbol()+ " "+b);

            }
        }




    }
}
