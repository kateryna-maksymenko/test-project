public class IncomeCalculator {

        //Please provide implementation to return the best possible income assuming that only one buy and one sell transaction is possible
        public double calculateBestIncome(double[] dailyPrices) {
            // find max(dailyPrices)

            double max = dailyPrices[0];
            int maxInd = 0;
            for(int i=0; i<dailyPrices.length; i++) {
                if(dailyPrices[i]>max){
                    max=dailyPrices[i];
                    maxInd = i;
                }
            }

            double min = dailyPrices[0];
            for(int i=0; i<maxInd; i++) {
                if(min<dailyPrices[i]) {
                    min=dailyPrices[i];
                }
            }


            return max-min;
        }


        public static void main(String []args) {
            IncomeCalculator incomeCalculator = new IncomeCalculator();
            double[] dailyPrices = {120.0, 100.0, 120.0, 110.0};

            System.out.println("Best income: " + incomeCalculator.calculateBestIncome(dailyPrices));
        }
    }






