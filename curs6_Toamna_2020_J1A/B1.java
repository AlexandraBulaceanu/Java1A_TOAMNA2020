public class B1 {
    //mosteniri cu clase inner
    class B2 {}
    static class B3{}
    class B4 extends B3{}
    class B5 extends B2{}
    static class B6 extends B3{}
    static class B7 extends B1{}//B1 este si clasa superioara si clasa outer
    //static class B8 extends B2{} -> mostenirea lui static cu non-static nu este posibila
    class B9 extends B1{}//B1 este si clasa superioara si clasa outer
}