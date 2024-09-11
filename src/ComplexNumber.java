// задача 15
class ComplexNumber {
    private float real;
    private float imaginary;

    // Конструктор
    public ComplexNumber(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber addComplex(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber subtractComplex(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public ComplexNumber multiplyComplex(ComplexNumber other) {
        float realPart = this.real * other.real - this.imaginary * other.imaginary;
        float imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber divideComplex(ComplexNumber other) {
        float denominator = other.real * other.real + other.imaginary * other.imaginary;
        float realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        float imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}