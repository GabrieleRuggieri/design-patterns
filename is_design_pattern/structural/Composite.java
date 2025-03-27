package structural;

public class Composite {

    /**
     * COMPOSITE
     * Scopo: Comporre oggetti in strutture ad albero per rappresentare gerarchie parte-tutto. Composite consente ai client di trattare oggetti individuali e composizioni di oggetti in modo uniforme.
     * <p>
     * Quando usarlo:
     * <p>
     * Quando si vuole rappresentare gerarchie parte-tutto di oggetti
     * Quando si vuole che i client ignorino la differenza tra composizioni di oggetti e oggetti individuali
     * Quando si vuole trattare uniformemente tutti gli oggetti in una struttura ad albero
     */

    interface Component {
        void operation();

        void add(Component component);

        void remove(Component component);

        Component getChild(int index);
    }

    class Leaf implements Component {
        @Override
        public void operation() {
            System.out.println("Leaf operation");
        }

        @Override
        public void add(Component component) {
            // Non supportato in Leaf
        }

        @Override
        public void remove(Component component) {
            // Non supportato in Leaf
        }

        @Override
        public Component getChild(int index) {
            // Non supportato in Leaf
            return null;
        }
    }

    class Composite implements Component {
        private List<Component> children = new ArrayList<>();

        @Override
        public void operation() {
            System.out.println("Composite operation");
            for (Component child : children) {
                child.operation();
            }
        }

        @Override
        public void add(Component component) {
            children.add(component);
        }

        @Override
        public void remove(Component component) {
            children.remove(component);
        }

        @Override
        public Component getChild(int index) {
            return children.get(index);
        }
    }
}
