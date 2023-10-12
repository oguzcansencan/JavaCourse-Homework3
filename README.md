Oguzcan Sencan (7216782) - Master Digital Transformation


# Java Course - Homework 3

    - Development Environment: Eclipse IDE (Java SE 16)

- **Manufacturer Class** is created which contains the following attributes:
    
        - Name (String)
        - year_of_foundation (int)
        - yearly_income (int)

- Then all the **Getters and Setters** are created for each of the attributes above.

- Then **Engine Class** is created which contains the following attributes:
    
        - Name (String)
        - year_of_manufacture (int)
        - horse_power (int)
        - price (int)

- Then all the **Getters and Setters** are created for each of the attributes above.

- Nextly, Three more classes are created which are the **subclasses of Engine Class**

        CombustionEngine
        HybridEngine
        ElectricEngine


- Then **Vehicle Class** is created which has the methods below:

        - model (String)
        - manufacturer (Manufacturer)
        - engine (Engine)
        - year_of_manufacture (int)
        - color (String)
        - price (int)
  
- Then all the **Getters and Setters** are created for each of the attributes above. Also another abstract method is created in this class which is called **ShowCharacteristics()**

- Nextly, Three more classes are created which are the **subclasses of vehicle Class**

        ICEV
        BEV
        HybridV

**The Abstract ShowCharacteristics() method** is overriden in those three subclasses

- Finally, **in the Test Class**, some manufacturers and engines are created. Then those are used when creating **an array which has Vehicle type of objects**

The results:

        Mitsubishi, Sedan, ElectricEngine, 1980, Purple, 16599
        Volkswagen, SUV, HybridEngine, 2018, Black, 44999
        Porsche, Hatchback, CombustionEngine, 2020, Gray, 85000
        Lada, Sedan, CombustionEngine, 2020, Green, 36999
