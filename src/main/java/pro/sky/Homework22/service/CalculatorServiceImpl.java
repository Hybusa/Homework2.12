package pro.sky.Homework22.service;

import org.springframework.stereotype.Service;
import pro.sky.Homework22.exception.WrongArgumentException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String plus(int num1, int num2) {
        return String.format("%d + %d = %d", num1, num2, num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
      return String.format("%d - %d = %d", num1, num2, num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return String.format("%d * %d = %d", num1, num2, num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        if(num2 == 0)
            throw new WrongArgumentException("Can't divide by 0");
        return String.format("%d / %d = %d", num1, num2, num1/num2);
    }
}
