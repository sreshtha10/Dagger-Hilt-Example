# Dependency Injection
___

*"Giving an object its instance variables"* - James Store


Dependencies - Objects on which specific classes depends on like HttpClient, Databases, Strings, Integers etc.

For example, A computer's dependecies are cpu, ram, gpu, etc.

We can create these components in the Computer class or somewhere else.

when we create these dependencies in computer class:

```
class Computer{
    private val processor = Processor("Intel i5")
    private val ram = RAM(16)
    private val hardDrive = HardDrive(4026)
    private val gpu = GPU("NVIDIA GeForce")
}

```

Problem - **If we change anything here it will changed for all computers**


Dependency injection solves this problem

* Method 1 : Constructor Injection

    ```
    class Computer(
        private val processor:Processor,
        private val ram:RAM,
        private val hardDrive:HardDrive,
        private val gpu:GPU
    ){

    }
    ```

    **Now each computer can have different specs**

    For example,
    ```
    val computer1 = Computer(
        Processor("Intel i5"),
        RAM(16),
        HardDrive(1024),
        GPU("NVIDIA gtx 250")
    )
    val computer2 = Computer(
        Processor("Intel i7"),
        RAM(8),
        HardDrive(2048),
        GPU("NVIDIA mx 280")
    )
    ```

 * Other methods - Using dependency libraries which also decide the lifetime of dependencies.

 