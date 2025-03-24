package Bai9;

public class Fraction {
    int numerator; // tử số
    int denominator; // mẫu số

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // rút gọn phân số
    // thầy ơi chỉ em cái thuật toán Euclid đi :)))
    public Fraction simplify(Fraction fraction) {
        int gdc = 1;
        int min = Math.min(fraction.numerator, fraction.denominator);
        for (int i = min; i > 1; i--) {
            if (fraction.numerator % i == 0 && fraction.denominator % i == 0) {
                gdc = i;
                break;
            }
        }
        return new Fraction(fraction.numerator / gdc, fraction.denominator / gdc);
    }

    // add(Fraction other): Phương thức cộng phân số hiện tại với phân số khác.
    public Fraction add(Fraction other) {
        int totalNumerator = numerator * other.denominator + denominator * other.numerator;
        int totalDenominator = other.denominator * denominator;
        return simplify(new Fraction(totalNumerator, totalDenominator));
    }

    // subtract(Fraction other): Phương thức trừ phân số hiện tại với phân số khác.
    public Fraction subtract                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     (Fraction other) {
        int totalNumerator = numerator * other.denominator - denominator * other.numerator;
        int totalDenominator = other.denominator * denominator;
        return simplify(new Fraction(totalNumerator, totalDenominator));
    }

    // multiply(Fraction other): Phương thức nhân phân số hiện tại với phân số khác.
    public Fraction multiply(Fraction other) {
        int totalNumerator = numerator * other.numerator;
        int totalDenominator = denominator * other.denominator;
        return simplify(new Fraction(totalNumerator, totalDenominator));
    }

    // divide(Fraction other): Phương thức chia phân số hiện tại cho phân số khác.
    public Fraction divide(Fraction other) {
        int totalNumerator =  numerator * other.denominator;
        int totalDenominator = denominator * other.numerator;
        return simplify(new Fraction(totalNumerator, totalDenominator));
    }

    //toString(): Chuyển đổi phân số thành chuỗi có dạng "tử số/mẫu số" (ví dụ: 3/4).
    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(8, 5);
        Fraction fraction2 = new Fraction(2, 5);
        System.out.println(fraction1);
        System.out.println(fraction1.add(fraction2));
        System.out.println(fraction1.subtract(fraction2));
        System.out.println(fraction1.multiply(fraction2));
        System.out.println(fraction1.divide(fraction2));
    }

}
