## 1 - O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java.

Resposta: A classe é um modelo, um planejamento, tal como a maquete de uma casa. O objeto seria a classe materializada, ou seja, um objeto com os devidos atributos qualificados.

Exemplos:

```Java
   public class Person {
        private String name;
        private String cpf;
        Pessoa(String name, String cpf){
            this.name = name;
            this.cpf = cpf;
        }

        public String getName(){
            return this.name;
        }

        public String getCPF(){
            return this.cpf
        }

        
        public void setName(String name){
            this.name = name;
        }

        public void setCPF(String cpf){
            this.cpf = cpf;
        }
   }

   public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Fulano", "012365485");
	}

}

```


```cpp
#include <iostream>
using namespace std;

    class Person {
        private:
        string name;
        string cpf;

        public:
        string getName() {
            return name;
        }

        string getCPF() {
            return cpf;
        }

        void setName(string _name){
            name = _name;
        }

        void setCPF(string _cpf){
            cpf = _cpf;
        }
    }

    int main () {
        Person person("Fulano", "1236544");

        return 0;
    }

```

```java
public class Circulo {
    double raio;

    double calcularArea() {
        return 3.1415 * raio * raio;
    }

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.raio = 2.5;
        System.out.println("Área do círculo: " + circulo1.calcularArea());
    }
}
```


```cpp
#include <iostream>
using namespace std;

class Circulo {
public:
    double raio;

    double calcularArea() {
        return 3.1415 * raio * raio;
    }
};

int main() {
    Circulo circulo1;
    circulo1.raio = 2.5;
    cout << "Área do círculo: " << circulo1.calcularArea() << endl;

    return 0;
}

```


```java
public class Livro {
    String titulo;
    String autor;

    void exibirInfo() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Apanhador no Campo de Centeio";
        livro1.autor = "J.D. Salinger";
        livro1.exibirInfo();
    }
}

```


```cpp
#include <iostream>
using namespace std;

class Livro {
public:
    string titulo;
    string autor;

    void exibirInfo() {
        cout << "Livro: " << titulo << " | Autor: " << autor << endl;
    }
};

int main() {
    Livro livro1;
    livro1.titulo = "Apanhador no Campo de Centeio";
    livro1.autor = "J.D. Salinger";
    livro1.exibirInfo();

    return 0;
}

``` 

```java
public class ContaBancaria {
    String titular;
    double saldo;

    void exibirSaldo() {
        System.out.println("Saldo de " + titular + ": $" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "João";
        conta1.saldo = 1000.0;
        conta1.exibirSaldo();
    }
}
```


```cpp
#include <iostream>
using namespace std;

class ContaBancaria {
public:
    string titular;
    double saldo;

    void exibirSaldo() {
        cout << "Saldo de " << titular << ": $" << saldo << endl;
    }
};

int main() {
    ContaBancaria conta1;
    conta1.titular = "João";
    conta1.saldo = 1000.0;
    conta1.exibirSaldo();

    return 0;
}
```


```java
public class Retangulo {
    double largura;
    double altura;

    double calcularArea() {
        return largura * altura;
    }

    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.largura = 5.0;
        retangulo1.altura = 3.0;
        System.out.println("Área do retângulo: " + retangulo1.calcularArea());
    }
}
```


```cpp
#include <iostream>
using namespace std;

class Retangulo {
public:
    double largura;
    double altura;

    double calcularArea() {
        return largura * altura;
    }
};

int main() {
    Retangulo retangulo1;
    retangulo1.largura = 5.0;
    retangulo1.altura = 3.0;
    cout << "Área do retângulo: " << retangulo1.calcularArea() << endl;

    return 0;
}
```
