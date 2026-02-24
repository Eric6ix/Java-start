# Exercícios - Estrutura Condicional if-else

## Módulo I - Básico

---

### Exercício 1
Faça um programa que receba a idade de uma pessoa e imprima se ela é maior de idade ou menor de idade.

---

### Exercício 2
Escreva um programa que receba um número e verifique se ele é positivo, negativo ou zero.

---

### Exercício 3
Crie um programa que receba dois números e imprima qual é o maior deles.

---

### Exercício 4
Faça um programa que receba uma nota (0 a 10) e imprima o conceito correspondente:
- 9 a 10: A
- 7 a 8.9: B
- 5 a 6.9: C
- 0 a 4.9: D

---

### Exercício 5
Escreva um programa que receba um número e verifique se ele é par ou ímpar.

---

### Exercício 6
Crie um programa que receba o nome de um mês e imprima quantos dias esse mês tem (considere apenas meses comuns, não considerar ano bissexto para fevereiro).

---

### Exercício 7
Faça um programa que receba um ano e verifique se ele é bissexto ou não.
- Um ano é bissexto se for divisível por 4 E não for divisível por 100, OU se for divisível por 400.

---

### Exercício 8
Escreva um programa que receba três notas de um aluno, calcule a média e imprima se ele foi aprovado (média >= 7) ou reprovado (média < 7).

---

### Exercício 9
Crie um programa que receba a altura e o peso de uma pessoa, calcule o IMC (peso / altura²) e imprima a classificação:
- Abaixo do peso: IMC < 18.5
- Peso normal: 18.5 <= IMC < 25
- Sobrepeso: 25 <= IMC < 30
- Obesidade: IMC >= 30

---

### Exercício 10
Faça um programa que receba um caractere e verifique se é uma vogal (a, e, i, o, u) ou consoante.

---

### Exercício 11
Escreva um programa que receba dois números e um operador (+, -, *, /) e realize a operação. Verifique também se é possível dividir (divisor não pode ser zero).

---

### Exercício 12
Crie um programa que receba um número de 1 a 7 e imprima o dia da semana correspondente (1 = Domingo, 2 = Segunda, etc.).

---

### Exercício 13
Faça um programa que receba a idade de uma pessoa e imprima:
- Bebê: 0 a 3 anos
- Criança: 4 a 12 anos
- Adolescente: 13 a 19 anos
- Adulto: 20 a 59 anos
- Idoso: 60 anos ou mais

---

### Exercício 14
Escreva um programa que receba um número e verifique se ele é divisível por 3, por 5, por ambos ou por nenhum.

---

### Exercício 15
Crie um programa que receba três lados de um triângulo e verifique se é possível formar um triângulo (a soma de dois lados deve ser maior que o terceiro). Se for possível, classifique em:
- Equilátero: todos os lados iguais
- Isósceles: dois lados iguais
- Escaleno: todos os lados diferentes

---

### Exercício 16
Faça um programa que receba um número de 1 a 12 (mês) e imprima o nome do mês e quantos dias ele tem.

---

### Exercício 17
Escreva um programa que receba a temperatura em Celsius e imprima a classificação:
- Muito frio: < 10°C
- Frio: 10°C a 20°C
- Agradável: 20°C a 25°C
- Quente: 25°C a 30°C
- Muito quente: > 30°C

---

### Exercício 18
Crie um programa que receba o salário de uma pessoa e calcule o imposto de renda a pagar:
- Salário <= R$ 2.000: Isento
- Salário <= R$ 3.000: 10% do salário
- Salário <= R$ 5.000: 15% do salário
- Salário > R$ 5.000: 20% do salário

---

### Exercício 19
Faça um programa que receba a hora (0 a 23) e imprima uma saudação apropriada:
- 5 a 12: "Bom dia!"
- 13 a 17: "Boa tarde!"
- 18 a 22: "Boa noite!"
- 23 a 4: "Boa madrugada!"

---

### Exercício 20
Escreva um programa que receba um número inteiro e verifique se ele é um número primo.

---

## Gabarito (Respostas Sugeridas)

### Exercício 1
```java
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        scanner.close();
    }
}
```

### Exercício 2
```java
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
        scanner.close();
    }
}
```

### Exercício 3
```java
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println("Maior: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maior: " + num2);
        } else {
            System.out.println("Os números são iguais");
        }
        scanner.close();
    }
}
```

### Exercício 4
```java
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota (0 a 10): ");
        double nota = scanner.nextDouble();
        
        if (nota >= 9) {
            System.out.println("Conceito: A");
        } else if (nota >= 7) {
            System.out.println("Conceito: B");
        } else if (nota >= 5) {
            System.out.println("Conceito: C");
        } else {
            System.out.println("Conceito: D");
        }
        scanner.close();
    }
}
```

### Exercício 5
```java
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
        scanner.close();
    }
}
```

### Exercício 6
```java
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do mês: ");
        String mes = scanner.next().toLowerCase();
        
        if (mes.equals("janeiro") || mes.equals("março") || mes.equals("maio") || 
            mes.equals("julho") || mes.equals("agosto") || mes.equals("outubro") || 
            mes.equals("dezembro")) {
            System.out.println("31 dias");
        } else if (mes.equals("abril") || mes.equals("junho") || mes.equals("setembro") || 
                   mes.equals("novembro")) {
            System.out.println("30 dias");
        } else if (mes.equals("fevereiro")) {
            System.out.println("28 dias (29 em ano bissexto)");
        } else {
            System.out.println("Mês inválido");
        }
        scanner.close();
    }
}
```

### Exercício 7
```java
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();
        
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }
        scanner.close();
    }
}
```

### Exercício 8
```java
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();
        
        double media = (n1 + n2 + n3) / 3;
        
        if (media >= 7) {
            System.out.println("Aprovado! Média: " + media);
        } else {
            System.out.println("Reprovado! Média: " + media);
        }
        scanner.close();
    }
}
```

### Exercício 9
```java
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o peso (kg): ");
        double peso = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        if (imc < 18.5) {
            System.out.println("Abaixo do peso. IMC: " + imc);
        } else if (imc < 25) {
            System.out.println("Peso normal. IMC: " + imc);
        } else if (imc < 30) {
            System.out.println("Sobrepeso. IMC: " + imc);
        } else {
            System.out.println("Obesidade. IMC: " + imc);
        }
        scanner.close();
    }
}
```

### Exercício 10
```java
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char letra = scanner.next().charAt(0);
        
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
            letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
        scanner.close();
    }
}
```

### Exercício 11
```java
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        
        if (op == '+') {
            System.out.println("Resultado: " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("Resultado: " + (num1 - num2));
        } else if (op == '*') {
            System.out.println("Resultado: " + (num1 * num2));
        } else if (op == '/') {
            if (num2 != 0) {
                System.out.println("Resultado: " + (num1 / num2));
            } else {
                System.out.println("Erro: divisão por zero!");
            }
        } else {
            System.out.println("Operação inválida");
        }
        scanner.close();
    }
}
```

### Exercício 12
```java
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        int dia = scanner.nextInt();
        
        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda-feira");
        } else if (dia == 3) {
            System.out.println("Terça-feira");
        } else if (dia == 4) {
            System.out.println("Quarta-feira");
        } else if (dia == 5) {
            System.out.println("Quinta-feira");
        } else if (dia == 6) {
            System.out.println("Sexta-feira");
        } else if (dia == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Número inválido");
        }
        scanner.close();
    }
}
```

### Exercício 13
```java
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        
        if (idade >= 0 && idade <= 3) {
            System.out.println("Bebê");
        } else if (idade <= 12) {
            System.out.println("Criança");
        } else if (idade <= 19) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else if (idade > 59) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade inválida");
        }
        scanner.close();
    }
}
```

### Exercício 14
```java
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Divisível por 3 e por 5");
        } else if (numero % 3 == 0) {
            System.out.println("Divisível apenas por 3");
        } else if (numero % 5 == 0) {
            System.out.println("Divisível apenas por 5");
        } else {
            System.out.println("Não é divisível por 3 nem por 5");
        }
        scanner.close();
    }
}
```

### Exercício 15
```java
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro lado: ");
        int l1 = scanner.nextInt();
        System.out.print("Digite o segundo lado: ");
        int l2 = scanner.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int l3 = scanner.nextInt();
        
        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            if (l1 == l2 && l2 == l3) {
                System.out.println("Triângulo Equilátero");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo válido");
        }
        scanner.close();
    }
}
```

### Exercício 16
```java
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = scanner.nextInt();
        
        if (mes == 1) {
            System.out.println("Janeiro - 31 dias");
        } else if (mes == 2) {
            System.out.println("Fevereiro - 28 dias");
        } else if (mes == 3) {
            System.out.println("Março - 31 dias");
        } else if (mes == 4) {
            System.out.println("Abril - 30 dias");
        } else if (mes == 5) {
            System.out.println("Maio - 31 dias");
        } else if (mes == 6) {
            System.out.println("Junho - 30 dias");
        } else if (mes == 7) {
            System.out.println("Julho - 31 dias");
        } else if (mes == 8) {
            System.out.println("Agosto - 31 dias");
        } else if (mes == 9) {
            System.out.println("Setembro - 30 dias");
        } else if (mes == 10) {
            System.out.println("Outubro - 31 dias");
        } else if (mes == 11) {
            System.out.println("Novembro - 30 dias");
        } else if (mes == 12) {
            System.out.println("Dezembro - 31 dias");
        } else {
            System.out.println("Mês inválido");
        }
        scanner.close();
    }
}
```

### Exercício 17
```java
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double temp = scanner.nextDouble();
        
        if (temp < 10) {
            System.out.println("Muito frio");
        } else if (temp < 20) {
            System.out.println("Frio");
        } else if (temp < 25) {
            System.out.println("Agradável");
        } else if (temp < 30) {
            System.out.println("Quente");
        } else {
            System.out.println("Muito quente");
        }
        scanner.close();
    }
}
```

### Exercício 18
```java
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário: R$ ");
        double salario = scanner.nextDouble();
        
        double imposto;
        
        if (salario <= 2000) {
            System.out.println("Isento de imposto");
        } else if (salario <= 3000) {
            imposto = salario * 0.10;
            System.out.println("Imposto: R$ " + imposto);
        } else if (salario <= 5000) {
            imposto = salario * 0.15;
            System.out.println("Imposto: R$ " + imposto);
        } else {
            imposto = salario * 0.20;
            System.out.println("Imposto: R$ " + imposto);
        }
        scanner.close();
    }
}
```

### Exercício 19
```java
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora (0 a 23): ");
        int hora = scanner.nextInt();
        
        if (hora >= 5 && hora <= 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 13 && hora <= 17) {
            System.out.println("Boa tarde!");
        } else if (hora >= 18 && hora <= 22) {
            System.out.println("Boa noite!");
        } else if (hora == 23 || hora >= 0 && hora <= 4) {
            System.out.println("Boa madrugada!");
        } else {
            System.out.println("Hora inválida");
        }
        scanner.close();
    }
}
```

### Exercício 20
```java
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        boolean primo = true;
        
        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        
        if (primo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
        scanner.close();
    }
}
```

