# Singleton-Implementation

* Singleton Pattern says that just "define a class that has only one instance and provide a global point of access to it".
* In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.
* There are two forms of singleton design pattern
	* Early Instantiation: creation of instance at load time.
	* Lazy Instantiation: creation of instance when required.
* Advantage: Saves memory because object is not created at each request. Only single instance is reused again and again.
* Usage: Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.
* Scenarios:  
  * At start, we need to read configuration file and store it.Whenever asked by any class in the application we have to give same instance     of configuration class which we read at start. (We will use Lazy Instantiation for this Scenario. Have a look at Config.txt,               ApplicationConfiguration.java,ApplicationConfigurationDemo.java)
  * We want all classes inside application to share single Logger class. At that time, we will use singleton design pattern to create           logger class and return same logger class whenever any class in the application asks for it. (We will use Early Instantiation for this     Scenario. Have a look at ApplicationLogger.java and ApplicationLoggerDemo.java).
