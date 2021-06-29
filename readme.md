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
