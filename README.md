# International Student Support System

The International Student Support System is a system developed to assist international student attending a university for pursuing a graduate or an undergraduate degree. By integrating several support services using the Visitor design pattern, the system keeps its structure flexible and extendable. International students can get assistance from the system with a variety of daily life issues, including learning a new language, academic counseling, cultural adjustment, and immigration procedures. The method separates the support functions from the classes, allowing for easy addition of additional support types without requiring modifications to the international student classes using the Visitor design pattern. 

## Classes

* Visitor interface is used for providing various types of support to international students. It has methods for providing immigration, cultural, academic, and communication support to international students. It also includes a default method to provide overall support.
* Staff class is concrete visitor class representing support staff who provide various types of support to international students. It implements methods to provide immigration, cultural, academic, and communication support to international students.
* Main class demonstrates the international student support system by setting up students and providing support.
* InternationalS is an element interface representing an international student in the support system having methods to get the details of the international student and accept a support visitor for providing support.
* GraduateStudent is concrete element representing graduate international students in the support system which implements InternationalS class.
* UG_Student is concrete element representing undergraduate international students in the support system and it also implements InternationalS class.
* 