## Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente. Discorra sobre esse aspecto.

Ao declarar uma variável em Java, não temos um ponteiro. As variáveis do tipo primitivo em java armazenam diretamente o valor na memória.

exemplo:

```java
    int numero = 1; 

```

Porém, um objeto em Java, na verdade, estamos criando um ponteiro para o objeto. Este ponteiro pode então ser definido para um objeto diferente ou para null.

exemplo:

```java
//Quando fazemos isso, estamos declarando um ponteiro apontando para o endereço de memória da classe pessoa, alocando memória.

Pessoa pessoa = new Pessoa();
```


```java
//Quando fazemos assim, na verdade o ponteiro está com valor "null" ou 0, pois não há espaço de memória para ser referenciado.

Pessoa pessoa;
```
Em C++, para criar um ponteiro vc precisa deixar explícito com a sintaxe de asterísco(*), diferente da linguagem java onde o ponteiro é explícito.

exemplo:

```cpp
//Aqui, estamos criando um ponteiro e apontando para o endereço de memória de variável em um lugar da memória. Ou seja, o que mudar na variável "numero", irá refletir no ponteiro, e vice-versa.

int *ponteiro;
int numero = 8;
// & usando para referenciar o endereço de memória.
ponteiro = &numero;
```

Caso o conceito de ponteiro não esteja sendo usado, estaremos criando sempre um clone daquela variável ou objeto.