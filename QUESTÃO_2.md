## Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++.

```java
  public class Main {

	public static void main(String[] args) {
		//Declaração básica de variável em java
        int number;

        //Tipos primitivos mais comuns:
        byte myByte = -20;
        short myShort = 32;
        int myInt = 42;
        long myLong = 123456789012345L;

        float myFloat = 3.14;
        double myDouble = 3.141592653589793;

        char myChar = 'R';

        boolean myBoolean = true;
	}

}
    
```


```cpp
    #include <iostream>
    using namespace std;

    int main () {
        int myint = 10; 
        short myShort = 1; 
        long myLong = 123456789012345;      
        long long myLonglong = 123456789012345123456789012345;

        float myFloat = 3.14;
        double myDouble = 3.141592653589793;

        char myChar = "R";

        bool myBool = true;

        return 0;
    }


```