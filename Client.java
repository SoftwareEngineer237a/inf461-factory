public class Client {
   public static void main(String[] args) {
        System.out.println("Methode 2 : Factory");
        ProduitFactory produitFactoryA = new ProduitFactoryA();
        ProduitFactory produitFactoryB = new ProduitFactoryB();
        ProduitFactory produitFactoryC = new ProduitFactoryC();
        ProduitFactory produitFactoryD = new ProduitFactoryD();
        Produit produit = null;

        produit = produitFactoryA.createProduit();
        produit.methodeproduit();

        produit = produitFactoryB.createProduit();
        produit.methodeproduit();

        produit = produitFactoryC.createProduit();
        produit.methodeproduit();

        produit = produitFactoryD.createProduit();
        produit.methodeproduit();
   }
}
