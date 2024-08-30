package ch08.lecture.p01interface;

public class C01Interface {

}

// @formatter : off
interface Aquatic1 {
}

interface Beast1 {
}

class Animal1 {
}

class Fish1 extends Animal1 {
}

class Shark1 extends Fish1 implements Aquatic1, Beast1 {
}

class Nimo1 extends Fish1 implements Aquatic1 {
}

class Mammal1 extends Animal1 {
}

class Tiger1 extends Mammal1 implements Beast1 {
}

class Maltese1 extends Mammal1 {
}

class Whale1 extends Mammal1 implements Aquatic1 {
}
