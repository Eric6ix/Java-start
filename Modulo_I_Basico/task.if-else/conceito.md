# Conceito: Estrutura Condicional if-else

## O que é if-else?

A estrutura condicional **if-else** (se-senão) é uma das fundamentais em programação. Ela permite que o programa tome decisões baseadas em condições específicas.

## Sintaxe Básica

```java
if (condição) {
    // código executado se a condição for VERDADEIRA
} else {
    // código executado se a condição for FALSA
}
```

## Partes do if-else

### 1. if (se)
- Avalia uma expressão booleana (condição)
- Se a condição for `true`, executa o bloco de código dentro

### 2. else (senão)
- Opcional
- Executa apenas quando a condição do if for `false`

### 3. else if (senão se)
- Permite verificar múltiplas condições
- É executado apenas se todas as condições anteriores forem falsas

## Sintaxe Completa

```java
if (condição1) {
    // bloco 1
} else if (condição2) {
    // bloco 2
} else if (condição3) {
    // bloco 3
} else {
    // bloco final (nenhuma condição anterior foi verdadeira)
}
```

## Operadores de Comparação

| Operador | Significado | Exemplo |
|----------|-------------|---------|
| `==` | Igual a | `a == b` |
| `!=` | Diferente de | `a != b` |
| `>` | Maior que | `a > b` |
| `<` | Menor que | `a < b` |
| `>=` | Maior ou igual | `a >= b` |
| `<=` | Menor ou igual | `a <= b` |

## Operadores Lógicos

| Operador | Significado | Exemplo |
|----------|-------------|---------|
| `&&` | E (AND) | `a > 5 && b < 10` |
| `\|\|` | OU (OR) | `a > 5 \|\| b > 10` |
| `!` | NÃO (NOT) | `! (a > 5)` |

## Quando usar if-else?

- Validar entrada de dados do usuário
- Tomar decisões baseadas em valores
- Controlar fluxo do programa
- Verificar condições antes de executar ações
- Classificar valores em categorias
- Verificar se algo existe ou não

## Exemplo Teórico

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

**Resultado:** "Maior de idade" (porque 18 >= 18 é verdadeiro)

## Pontos Importantes

1. **Parênteses são obrigatórios** na condição do if
2. **Chaves {}** são opcionais se houver apenas uma linha de código
3. **Else** é opcional - pode usar apenas if
4. **Condições** sempre resultam em boolean (true ou false)
5. **Cuidado com ==** para comparar objetos, use .equals()

## Boas Práticas

- Use indentação adequada para facilitar leitura
- Prefira usar chaves {} mesmo com uma linha
- Não Deixe condições muito complexas, separe em variáveis
- Comente código quando a lógica não for óbvia

