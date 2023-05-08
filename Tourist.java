interface Tourist {

    int budget = 0;

    void visit();

    void visit(Japan japan);

    void visit(Dubai dubai);

    void visit(Korea korea);

    void visit(Philippines philippines);

    void visit(Palawan palawan);

    void visit(Baguio baguio);


    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}