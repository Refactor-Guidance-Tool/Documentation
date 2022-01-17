class Super {
    void Do() {
        Log("Super");
    }    
}

class Sub extends Super {
    void Do() {
        Log("Sub");
    }    
}


class Tester {
    void Run() {
        Test(true);
        // Test(false);

        // Test(GetBooleanFromExternalSourceButItsSecretelyAlwaysFalse())
    }

    void Test(boolean f) {
        Super s = new Super();

        if (f) {
            s = new Sub();
        }

        s.Do();
    }
}