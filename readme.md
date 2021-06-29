# Implementando Collections e Streams com Java


## java.util.List

- java.util.ArrayList 
- java.util.Vector

Quando utilizado garante ordem de inserção e permite adição, atualização, leitura e remoção sem regras adicionais.

### Ordenação de uma lista utilizando Collections:
```java
List<String> nomes = new ArrayList<>();

// adicionar valores
nomes.add("Pedro");
nomes.add("Gabriel");
nomes.add("Rachel");
nomes.add("Angela");

// ordenar
Collections.sort(nomes);

// removendo
nomes.remove(2); // index ou objeto

System.out.println(nomes); // [Angela, Gabriel, Pedro, Rachel]
```

### Iteração de uma lista:
```java
List<String> nomes = new ArrayList<>();

// ... adiciona elementos, modifica, etc.
// iteração utilizando Iterator
Iterator<String> iterator = nomes.iterator();

while (iterator.hasNext()) {
    System.out.println(iterator.next());
}

// for
for(String nome: nomes){
    System.out.println(nome);
}
```

### Alterando via método set:
```java
// posição / objeto
nomes.set(2, "Wesley");
```

### Recuperando objeto via método get:
```java
// posição
String nome = nomes.get(2);
```

### Verificando posição de um elemento:
```java
int nome = nomes.indexOf("Gabriel"); // objeto
```

### Contém elemento:
```java
boolean contemEl = nomes.contains("Gabriel"); // objeto
```

### Checando se a lista está vazia:
```java
boolean vazia = nomes.isEmpty(); 
```

## java.util.Queue

A fila garante a ordem de inserção e não permite mudança dna ordem. FIFO.

### Criando um fila

```java
Queue<String> fila = new LinkedList<>();

fila.add("Gabriel");
fila.add("Angela");
fila.add("Rosana");
fila.add("Marcos");

System.out.println(fila); // [Gabriel, Angela, Rosana, Marcos]
```

### Poll - retorna o primeiro elemento e remove da fila
```java
Queue<String> fila = new LinkedList<>();

// ...

String primeiroElemento = fila.poll(); 

System.out.println(primeiroElemento); // Gabriel

System.out.println(fila); // [Angela, Rosana, Marcos]
```

### Peek - retorna o primeiro elemento mas não remove da fila
```java
Queue<String> fila = new LinkedList<>();

// ...

String primeiroElemento = fila.peek(); 

System.out.println(primeiroElemento); // Gabriel

System.out.println(fila); // [Gabriel, Angela, Rosana, Marcos]
```

## java.util.Set

Algumas implemtações são:
- java.util.HashSet
- java.util.TreeSet
- java.util.LinkedHashSet

A maioria dos métodos vem de Collections, ou seja, a maior parte dos métodos de collection já estão incluídas.

Algumas premissas padrão são:
- Por padrão não garante ordem.
- Não permite itens repetidos.
- Para leitura, apenas navegação.
- Permite adição e remoção normalmente.
- Não possui busca por item e atualização.
- Não permite mudança de ordenação.

Quando utilizar cada tipo:

|               | Quando Utilizar | Ordenação | Performance |
| ------------- | ------------- | ------------- | ------------- |
| HashSet  | Quando não é necessário manter uma ordenação.  | Não é ordenado, e não permite valores repetidos.  | Por não ter repetição de valores e não ser ordenado, é a implementação mais performática.  |
| LinkedHashSet | Quando é necessário manter a ordem de inserção dos elementos.  | Mantém a ordem de inserção dos elementos.  | É a implementação mais lenta por ser necessária manter a ordem.  |
| TreeSet | Quando é necessário alterar a ordem através do uso de comparators.  | Mantém ordem e pode ser reordenado.  | É performático para leitura. ara modificação tem a ncessidade de reordenar, sendo mais lento que o LinkedHashSet.  |

Instanciando um HashSet:
```java
Set<Double> notasAlunos = new HashSet<>();

notasAlunos.add(9.1);
notasAlunos.add(8.5);
notasAlunos.add(8.0);
notasAlunos.add(10.0);
notasAlunos.add(5.1);

System.out.println(notasAlunos); // [8.0, 9.1, 8.5, 5.1, 10.0]
```

Instanciando um LinkedHashSet:
```java
LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

sequenciaNumerica.add(13);
sequenciaNumerica.add(2);
sequenciaNumerica.add(7);
sequenciaNumerica.add(10);
sequenciaNumerica.add(1);

System.out.println(sequenciaNumerica); // [13, 2, 7, 10, 1]
```

Instanciando um TreeSet:
```java
TreeSet<String> treePaises = new TreeSet<>();

treePaises.add("Brasil");
treePaises.add("Colombia");
treePaises.add("Espanha");
treePaises.add("Estados Unidos");
treePaises.add("Portugal");

System.out.println(treePaises); // [Brasil, Colombia, Espanha, Estados Unidos, Portugal]

```

### TreeSet - first / last
```java
TreeSet<String> treePaises = new TreeSet<>();
// ...
String first = treePaises.first(); // Brasil
 
String last = treePaises.last(); // Portugal
```

### TreeSet - poolFirst / poolLast
```java
TreeSet<String> treePaises = new TreeSet<>();
// ...
String first = treePaises.pollFirst();

String last = treePaises.pollLast();

System.out.println(first); // Brasil
System.out.println(last); // Portugal
System.out.println(treePaises); // [Colombia, Espanha, Estados Unidos]
```