package com.example.second_almazbekov_beksultan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }
    public void clearNumbers(View view){
        EditText editText1 = findViewById(R.id.editTextNumberDecimal);
        EditText editText2 = findViewById(R.id.editTextNumberDecimal2);
        TextView textView = findViewById(R.id.result);
        textView.setText("0");
        editText2.setText("");
        editText1.setText("");

    }
    public void addNumbers(View view) {
        // Получить значения из текстовых полей
        EditText editText1 = findViewById(R.id.editTextNumberDecimal);
        EditText editText2 = findViewById(R.id.editTextNumberDecimal2);
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();
        if (value2.equals("")){
            return;
        }
        if (value1.equals("")){
            return;
        }
        // Преобразовать значения в числа
        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        // Выполнить операцию сложения
        double result = number1 + number2;

        // Отобразить результат в текстовом поле или другом компоненте
        // Например, предположим, что у вас есть TextView для вывода результата:
        TextView resultTextView = findViewById(R.id.result);
        if (result == (int) result) {
            // Если результат является целым числом
            resultTextView.setText(String.format(Locale.getDefault(), "%d", (int) result));
        } else {
            // Если результат является числом с плавающей точкой (Double)
            resultTextView.setText(String.format(Locale.getDefault(), "%.2f", result));
        }
    }
    public void minusNumbers(View view) {
        // Получить значения из текстовых полей
        EditText editText1 = findViewById(R.id.editTextNumberDecimal);
        EditText editText2 = findViewById(R.id.editTextNumberDecimal2);
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();
        if (value2.equals("")){
            return;
        }
        if (value1.equals("")){
            return;
        }
        // Преобразовать значения в числа
        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        // Выполнить операцию сложения
        double result = number1 - number2;

        // Отобразить результат в текстовом поле или другом компоненте
        // Например, предположим, что у вас есть TextView для вывода результата:
        TextView resultTextView = findViewById(R.id.result);
        if (result == (int) result) {
            // Если результат является целым числом
            resultTextView.setText(String.format(Locale.getDefault(), "%d", (int) result));
        } else {
            // Если результат является числом с плавающей точкой (Double)
            resultTextView.setText(String.format(Locale.getDefault(), "%.2f", result));
        }
    }
    public void multiplyNumbers(View view) {
        // Получить значения из текстовых полей
        EditText editText1 = findViewById(R.id.editTextNumberDecimal);
        EditText editText2 = findViewById(R.id.editTextNumberDecimal2);
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();
        if (value2.equals("")){
            return;
        }
        if (value1.equals("")){
            return;
        }

        // Преобразовать значения в числа
        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        // Выполнить операцию сложения
        double result = number1 * number2;

        // Отобразить результат в текстовом поле или другом компоненте
        // Например, предположим, что у вас есть TextView для вывода результата:
        TextView resultTextView = findViewById(R.id.result);
        if (result == (int) result) {
            // Если результат является целым числом
            resultTextView.setText(String.format(Locale.getDefault(), "%d", (int) result));
        } else {
            // Если результат является числом с плавающей точкой (Double)
            resultTextView.setText(String.format(Locale.getDefault(), "%.2f", result));
        }
    }

    public void divideNumbers(View view) {
        // Получить значения из текстовых полей
        EditText editText1 = findViewById(R.id.editTextNumberDecimal);
        EditText editText2 = findViewById(R.id.editTextNumberDecimal2);
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();
        if (value2.equals("")){
            return;
        }
        if (value1.equals("")){
            return;
        }

        // Преобразовать значения в числа
        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        // Выполнить операцию сложения
        double result = number1 / number2;

        // Отобразить результат в текстовом поле или другом компоненте
        // Например, предположим, что у вас есть TextView для вывода результата:
        TextView resultTextView = findViewById(R.id.result);
        if (result == (int) result) {
            // Если результат является целым числом
            resultTextView.setText(String.format(Locale.getDefault(), "%d", (int) result));
        } else {
            // Если результат является числом с плавающей точкой (Double)
            resultTextView.setText(String.format(Locale.getDefault(), "%.2f", result));
        }
    }

    public void modNumbers(View view) {
        // Получить значения из текстовых полей
        EditText editText1 = findViewById(R.id.editTextNumberDecimal);
        EditText editText2 = findViewById(R.id.editTextNumberDecimal2);
        String value1 = editText1.getText().toString();
        String value2 = editText2.getText().toString();
        if (value2.equals("")){
            return;
        }
        if (value1.equals("")){
            return;
        }

        // Преобразовать значения в числа
        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        // Выполнить операцию сложения
        double result = number1 % number2;

        // Отобразить результат в текстовом поле или другом компоненте
        // Например, предположим, что у вас есть TextView для вывода результата:
        TextView resultTextView = findViewById(R.id.result);
        if (result == (int) result) {
            // Если результат является целым числом
            resultTextView.setText(String.format(Locale.getDefault(), "%d", (int) result));
        } else {
            // Если результат является числом с плавающей точкой (Double)
            resultTextView.setText(String.format(Locale.getDefault(), "%.2f", result));
        }
    }
    public void goBack(View view) {
        onBackPressed();
    }

}