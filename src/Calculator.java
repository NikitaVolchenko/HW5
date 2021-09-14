public class Calculator {

    int calc(int x, int y, ICalculate iCalculate) {
        return iCalculate.calc(x, y);
    }
}
