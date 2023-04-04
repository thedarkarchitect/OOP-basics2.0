public class SimpleCalculator {
    private Double firstNumber;
    private Double secondNumber;


    public Double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }

    public Double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }

    public Double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }

    public Double getDivisionResult(){
        if (this.secondNumber == 0){
            return 0.0;
        }
        return this.firstNumber / this.secondNumber;
    }


    public Double getFirstNumber() {
        return firstNumber;
    }

    public Double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(Double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(Double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
