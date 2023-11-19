## Em Java, a herança é um conceito que permite criar uma nova classe (subclasse) baseada em uma classe existente (superclasse). A subclasse herda os atributos e métodos da superclasse, o que promove a reutilização de código e facilita a criação de hierarquias de classes.

```java
    public class Animal {
        public void emitirSom() {
            System.out.println("Som genérico de animal");
        }
    }

    public class Cachorro extends Animal {
       public void latir() {
            System.out.println("Latindo...");
        }
}
```


```cpp
    class Animal {
    public:
        void fazerSom() {
            cout << "Som genérico de animal" << endl;
        }
    };

    class Cachorro : public Animal {
    public:
        void latir() {
            cout << "Latindo..." << endl;
        }
    };
```

```java
    class Forma {
        void desenhar() {
            System.out.println("Desenhando uma forma");
        }
    }

    class Circulo extends Forma {
        @Override
        void desenhar() {
            System.out.println("Desenhando um círculo");
        }
    }

```
```cpp
    class Forma {
        public:
            virtual void desenhar() {
                cout << "Desenhando uma forma" << endl;
            }
        };

    class Circulo : public Forma {
        public:
            void desenhar() override {
                cout << "Desenhando um círculo" << endl;
            }
        };
```


```java
    public class Pessoa {
        private String nome;
        private String cpf;
        public String getNome() {
            return nome;
        }
    }

    public class Funcionario extends Pessoa {
       public String getNome() {
            return nome;
       }
}
```


```cpp
    class Pessoa {
        private:
            string nome;
            string cpf;
        public:
            string getNome() {
               return nome;
            }
        };

    class Funcionario : public Pessoa {
       public:
            string getNome() {
               return nome;
            }
        };
```


```java
    public class Automovel {
        private String marca;
        private String modelo;
        public void acelerar() {
            System.out.println("Acelerando...");
        }
    }

    public class Carro extends Automovel {
       public void acelerar() {
            System.out.println("Acelerando...");
        }
}
```


```cpp
    class Automovel {
        private:
            string marca;
            string modelo;
        public:
            void acelerar() {
               cout << "Acelerando...";
            }
        };

    class Carro : public Automovel {
       public:
            void acelerar() {
               cout << "Acelerando...";
            }
        };
```





