public class Me implements Tourist {

    static int budget = 70000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Japan japan) {

        //Gastos
        budget -= japan.airFare;

        // Define your visit
        System.out.println("Pumunta sa Japan kasi mainit sa pinas ");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Dubai dubai) {

        //Gastos
        budget -= dubai.airFare;

        // Define your visit
        System.out.println("Pumunta sa Dubai para tumambay ");
        checkBudget();
        System.out.println("-------------------------------------------");
    }
    
    public void visit(Korea korea) {

        //Gastos
        budget -= korea.airFare;
        
        // Define your visit
        System.out.println("Pumunta sa korea baka makita twice ");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Philippines philippines) {

        //Gastos
        budget -= philippines.airFare;

        // Define your visit
        System.out.println("Umuwi muna sa Pinas kahit ayaw na umuwi ");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Palawan palawan) {

        //Gastos
        budget -= palawan.airFare;

        // Define your visit
        System.out.println("Pumunta sa Palawan, pang ig lang ");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Baguio baguio) {

        //Gastos
        budget -= baguio.airFare;

        // Define your visit
        System.out.println("Pumunta Baguio para mapag-isa ");
        checkBudget();
        System.out.println("-------------------------------------------");
        System.out.println("Ayan, puro alis. wala na pera. the end.");
        System.out.println("-------------------------------------------");

    }

    public void checkBudget() {

        System.out.println("my budget is " + budget);
    }

}