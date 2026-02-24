/**
 * Exemplos Práticos - Estrutura Condicional if-else
 * Módulo I - Básico
 * 
 * Este arquivo contém exemplos progressivos de uso do if-else em Java
 */

public class exemplo {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS DE IF-ELSE EM JAVA ===\n");
        
        // ============================================
        // EXEMPLO 1: Verificação de idade básica
        // ============================================
        System.out.println("--- Exemplo 1: Verificação de Idade ---");
        int idade = 18;
        
        if (idade >= 18) {
            System.out.println("Maior de idade - pode dirigir");
        } else {
            System.out.println("Menor de idade - não pode dirigir");
        }
        
        // ============================================
        // EXEMPLO 2: Verificação de número positivo ou negativo
        // ============================================
        System.out.println("\n--- Exemplo 2: Número Positivo ou Negativo ---");
        int numero = -5;
        
        if (numero > 0) {
            System.out.println("O número é POSITIVO");
        } else if (numero < 0) {
            System.out.println("O número é NEGATIVO");
        } else {
            System.out.println("O número é ZERO");
        }
        
        // ============================================
        // EXEMPLO 3: Verificação de aprovação escolar
        // ============================================
        System.out.println("\n--- Exemplo 3: Verificação de Aprovação ---");
        double nota = 7.5;
        
        if (nota >= 9.0) {
            System.out.println("Conceito: A - Excelente!");
        } else if (nota >= 7.0) {
            System.out.println("Conceito: B - Bom!");
        } else if (nota >= 5.0) {
            System.out.println("Conceito: C - Regular");
        } else {
            System.out.println("Conceito: D - Reprovado");
        }
        
        // ============================================
        // EXEMPLO 4: Verificação de login (simples)
        // ============================================
        System.out.println("\n--- Exemplo 4: Verificação de Login ---");
        String usuarioCadastrado = "admin";
        String usuarioDigitado = "admin";
        String senhaCadastrada = "1234";
        String senhaDigitada = "1234";
        
        if (usuarioDigitado.equals(usuarioCadastrado) && senhaDigitada.equals(senhaCadastrada)) {
            System.out.println("Login bem-sucedido! Bem-vindo, admin.");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
        
        // ============================================
        // EXEMPLO 5: Verificação de maior número
        // ============================================
        System.out.println("\n--- Exemplo 5: Maior Entre Dois Números ---");
        int a = 25;
        int b = 30;
        
        if (a > b) {
            System.out.println("O maior número é: " + a);
        } else {
            System.out.println("O maior número é: " + b);
        }
        
        // ============================================
        // EXEMPLO 6: Verificação de ano bissexto
        // ============================================
        System.out.println("\n--- Exemplo 6: Ano Bissexto ---");
        int ano = 2024;
        
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano BISSEXTO");
        } else {
            System.out.println(ano + " não é um ano BISSEXTO");
        }
        
        // ============================================
        // EXEMPLO 7: Classificação de triângulo
        // ============================================
        System.out.println("\n--- Exemplo 7: Classificação de Triângulo ---");
        int lado1 = 5;
        int lado2 = 5;
        int lado3 = 5;
        
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo EQUILÁTERO (todos os lados iguais)");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo ISÓSCELES (dois lados iguais)");
            } else {
                System.out.println("Triângulo ESCALENO (todos os lados diferentes)");
            }
        } else {
            System.out.println("Não é um triângulo válido");
        }
        
        // ============================================
        // EXEMPLO 8: Calculadora simples com if-else
        // ============================================
        System.out.println("\n--- Exemplo 8: Calculadora Simples ---");
        int num1 = 10;
        int num2 = 5;
        char operacao = '+';
        
        if (operacao == '+') {
            System.out.println("Resultado: " + (num1 + num2));
        } else if (operacao == '-') {
            System.out.println("Resultado: " + (num1 - num2));
        } else if (operacao == '*') {
            System.out.println("Resultado: " + (num1 * num2));
        } else if (operacao == '/') {
            if (num2 != 0) {
                System.out.println("Resultado: " + (num1 / num2));
            } else {
                System.out.println("Erro: Divisão por zero!");
            }
        } else {
            System.out.println("Operação inválida");
        }
        
        // ============================================
        // EXEMPLO 9: Verificação de faixa de idade
        // ============================================
        System.out.println("\n--- Exemplo 9: Faixa Etária ---");
        int idadePessoa = 45;
        
        if (idadePessoa < 0) {
            System.out.println("Idade inválida");
        } else if (idadePessoa <= 12) {
            System.out.println("Criança");
        } else if (idadePessoa <= 19) {
            System.out.println("Adolescente");
        } else if (idadePessoa <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
        
        // ============================================
        // EXEMPLO 10: Verificação de senha forte
        // ============================================
        System.out.println("\n--- Exemplo 10: Validação de Senha ---");
        String senha = "Senha123";
        
        if (senha.length() >= 8) {
            System.out.println("Senha tem pelo menos 8 caracteres");
        } else {
            System.out.println("Senha muito curta - precisa de pelo menos 8 caracteres");
        }
        
        // ============================================
        // EXEMPLO 11: Verificação de número par ou ímpar
        // ============================================
        System.out.println("\n--- Exemplo 11: Par ou Ímpar ---");
        int num = 7;
        
        if (num % 2 == 0) {
            System.out.println(num + " é PAR");
        } else {
            System.out.println(num + " é ÍMPAR");
        }
        
        // ============================================
        // EXEMPLO 12: Verificação de temperatura
        // ============================================
        System.out.println("\n--- Exemplo 12: Classificação de Temperatura ---");
        double temperatura = 25.0;
        
        if (temperatura < 0) {
            System.out.println("Temperatura: GELO");
        } else if (temperatura < 15) {
            System.out.println("Temperatura: FRIO");
        } else if (temperatura < 25) {
            System.out.println("Temperatura: AMENO");
        } else if (temperatura < 35) {
            System.out.println("Temperatura: QUENTE");
        } else {
            System.out.println("Temperatura: MUITO QUENTE");
        }
        
        // ============================================
        // EXEMPLO 13: Verificação de acesso (if sem else)
        // ============================================
        System.out.println("\n--- Exemplo 13: Verificação de Acesso ---");
        boolean temPermissao = true;
        
        if (temPermissao) {
            System.out.println("Acesso permitido!");
        }
        // Note: não há else - simplesmente não faz nada se a condição for falsa
        
        // ============================================
        // EXEMPLO 14: Operador ternário (forma resumida)
        // ============================================
        System.out.println("\n--- Exemplo 14: Operador Ternário ---");
        int idade2 = 20;
        String resultado = (idade2 >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);
        
        // ============================================
        // EXEMPLO 15: Verificação múltipla com OR
        // ============================================
        System.out.println("\n--- Exemplo 15: Verificação com OR ---");
        char turno = 'N';
        
        if (turno == 'M' || turno == 'm') {
            System.out.println("Bom dia!");
        } else if (turno == 'T' || turno == 't') {
            System.out.println("Boa tarde!");
        } else if (turno == 'N' || turno == 'n') {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Turno inválido");
        }
        
        // ============================================
        // EXEMPLO 16: Verificação de números divisíveis
        // ============================================
        System.out.println("\n--- Exemplo 16: Divisibilidade ---");
        int numDiv = 15;
        
        if (numDiv % 3 == 0 && numDiv % 5 == 0) {
            System.out.println(numDiv + " é divisível por 3 E por 5");
        } else if (numDiv % 3 == 0) {
            System.out.println(numDiv + " é divisível apenas por 3");
        } else if (numDiv % 5 == 0) {
            System.out.println(numDiv + " é divisível apenas por 5");
        } else {
            System.out.println(numDiv + " não é divisível por 3 nem por 5");
        }
        
        // ============================================
        // EXEMPLO 17: Verificação de IMC
        // ============================================
        System.out.println("\n--- Exemplo 17: Cálculo de IMC ---");
        double peso = 70.0;
        double altura = 1.75;
        double imc = peso / (altura * altura);
        
        System.out.printf("IMC: %.2f%n", imc);
        
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
        
        // ============================================
        // EXEMPLO 18: Verificação de vogal
        // ============================================
        System.out.println("\n--- Exemplo 18: Verificação de Vogal ---");
        char letra = 'E';
        
        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ||
            letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println(letra + " é uma VOGAL");
        } else {
            System.out.println(letra + " é uma CONSOANTE");
        }
        
        // ============================================
        // EXEMPLO 19: Verificação de dia útil
        // ============================================
        System.out.println("\n--- Exemplo 19: Dia Útil ---");
        int diaSemana = 6;
        
        if (diaSemana == 1) {
            System.out.println("Domingo - fim de semana");
        } else if (diaSemana == 2) {
            System.out.println("Segunda-feira - dia útil");
        } else if (diaSemana == 3) {
            System.out.println("Terça-feira - dia útil");
        } else if (diaSemana == 4) {
            System.out.println("Quarta-feira - dia útil");
        } else if (diaSemana == 5) {
            System.out.println("Quinta-feira - dia útil");
        } else if (diaSemana == 6) {
            System.out.println("Sexta-feira - dia útil");
        } else if (diaSemana == 7) {
            System.out.println("Sábado - fim de semana");
        } else {
            System.out.println("Dia inválido");
        }
        
        // ============================================
        // EXEMPLO 20: Verificação de número primo
        // ============================================
        System.out.println("\n--- Exemplo 20: Número Primo ---");
        int numeroPrimo = 17;
        boolean primo = true;
        
        if (numeroPrimo <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= numeroPrimo / 2; i++) {
                if (numeroPrimo % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        
        if (primo) {
            System.out.println(numeroPrimo + " é um número PRIMO");
        } else {
            System.out.println(numeroPrimo + " NÃO é um número primo");
        }
        
        System.out.println("\n=== FIM DOS EXEMPLOS ===");
    }
}

