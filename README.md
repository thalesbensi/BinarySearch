# BinarySearch

Este projeto implementa o algoritmo de **Busca Binária** em Java. A Busca Binária é um método eficiente para encontrar um elemento em uma lista ordenada, reduzindo repetidamente pela metade o espaço de busca.

## 📌 Tecnologias Utilizadas

- **Java 17**

## 🚀 Como Executar

### Clonando o Repositório

```sh
git clone https://github.com/thalesbensi/BinarySearch.git
cd BinarySearch
```

### Compilando e Executando

```sh
mvn clean install
java -jar target/binarysearch.jar
```

## 🖥️ Exemplo de Uso

A implementação recebe uma lista ordenada e um número a ser encontrado:

```java
int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};
int target = 7;

int result = BinarySearch.search(sortedArray, target);
System.out.println("Elemento encontrado na posição: " + result);
```

### Saída esperada:
```
Elemento encontrado na posição: 3
```

## 📜 Funcionamento do Algoritmo

A Busca Binária segue os seguintes passos:

1. Verifica se o elemento do meio do array é o valor procurado.
2. Se for menor, descarta a metade inferior e busca na superior.
3. Se for maior, descarta a metade superior e busca na inferior.
4. Repete o processo até encontrar o elemento ou esgotar as possibilidades.

O algoritmo tem complexidade **O(log n)**, tornando-se muito eficiente para grandes conjuntos de dados.

**Desenvolvido por [Thales Bensi](https://github.com/thalesbensi)**
