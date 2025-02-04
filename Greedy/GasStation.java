import java.util.* ;

class GasStation{

    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int totalCost=0,totalGas=0;
        for(int i=0;i<gas.length;i++){
            totalGas+=gas[i];
            totalCost+=cost[i];
        }
        if(totalGas<totalCost) return -1 ;

        int currGas=0;
        int startIndx=0;
        for(int i=0;i<gas.length;i++){
            currGas+=gas[i]-cost[i];
            if(currGas<0){
                currGas=0;
                startIndx=i+1 ;
            }
        }
        return startIndx ;
    }
}

//2nd solution 
public int canCompleteCircuit2(int[] gas, int[] cost) {
    int start = 0;
    int totalGas = 0;
    int currentGas = 0;

    for (int i = 0; i < gas.length; i++) {
        int fuelGain = gas[i] - cost[i];
        totalGas += fuelGain;
        currentGas += fuelGain;

        if (currentGas < 0) {
            currentGas = 0;
            start = i + 1;
        }
    }

    return totalGas < 0 ? -1 : start;        
}

    public static void main(String[] args){
        int[] gas = {1,2,3,4,5} ;
        int[] cost = {3,4,5,1,2} ;
        System.out.println(canCompleteCircuit(gas, cost)) ;

    
    }
