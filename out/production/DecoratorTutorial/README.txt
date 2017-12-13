DP
- creational
- structural( decorator)
- behavioral

--------------------------------------------------------------
Decorator( structural)
    = wrapper
    = changes an object’s skin
    - alternative to subclassing for extending functionality
    - add behavior without affecting others
    - build ON TOP of the behavior of your components
    - single responsibility principle( encapsulated by the class)
    - compose behavior dynamically
    - INHERITANCE + COMPOSITION( has-a request) based
ex1:
Output Stream - base decorator                                    | ValidatorDecorator
new FileOutputStream - concrete decorator( can write files)       | CTLRequestValidator

=> pass to DataOutputStream( knows about writing out data( what to write))

- modify behavior( add functionality) -> new class( that extends the base class- specific behavior) for every feature added => multiple little objects
- base class with a specific behavior
- our decorator will be a class that we will use to change that behavior by extending the base class, as well as having that base class as a property on the component
=>  the decorator extends and wraps the base class
- we do not create concrete objects for every feature that we need to add( DOES NOT CHANGE THE BASE OBJECT) => don't mess up hierarchy
- we do not change the underlying object( original object can stay the same)

Java:
!!! http://www.yegor256.com/2016/01/26/defensive-programming.html -> use validating decorators
!!! https://dzone.com/articles/avoiding-many-if-blocks -> the list thing
https://anirudhbhatnagar.com/2014/08/19/pizza-problem-builder-vs-decorator/ -> decorator vs builder vs factory

Decorator - Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

OBS: We could add the decorator pattern to the "view details page" from the interface too:
    - base fields
    -  different fields depending on the type of the component
    !!! https://addyosmani.com/blog/decorator-pattern/ -> implementation in react
    http://asaf.github.io/blog/2015/06/23/extending-behavior-of-react-components-by-es6-decorators/

---------------------------------------------------------------

Builder( creational)
    - Separate the construction of a complex object from its representation so that the same construction process can create different representations.
    - complex constructors
    - large no of parameters
    - force immutability
    - avoid telescoping constructors( multiple constructors)
    - calls appropriate constructor
    ex: StringBuilder - append different types to a String
    - pitfall: adds complexity

----------------------------------------------------------------

Factory( creational) > PARAMETERS
    -  the client does not know about the type of object that is being created
    - common interface - reference to the instance that is created
    - abstract class - factoryMethod(): Object
    - concrete classes -> implementation
    - parametrized create method
    - does not expose instantiation logic
    - responsible for lifecycle
    ex: Calendar.getInstance() = factory instance => get gregorian implementation( GregorianCalendar)
        Calendar.getInstance(type)
        input parameters=> choose different implementation
    - pitfalls:
        - complexity
        - creation in subclass
        - refactoring( plan from the beginning)

----------------------------------------------------------------

SINGLETON( creational) > NO PARAMETERS
    - only one resource created
    - guarantees control of a resource
    - lazily loaded
    ex: Runtime - instantiate 2 instances, obtain only one( same address)
     + Logger, Spring Beans, Graphics Managers
    - singleton class responsible for lifecycle
    - static in nature, though not implemented as static -> to be thread safe
    - private constructor



----------------------------------------------------------------

Strategy pattern = changes an object’s guts( swap functionality)
- the difference is that the object passed to the constructor is not being “wrapped” like a decorator. We’re “swapping” functionality
- swap out implementation at run time
- dependency injection


Composite
- a decorator can be viewed as a composite with only one component
- intended for object aggregation
- composes multiple components


Presenters
- a class that adds presentation functionality to another class
- sometimes a decorator, sometimes a composite
- the functionality is completely presentation-related

