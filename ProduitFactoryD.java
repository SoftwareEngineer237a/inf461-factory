public class ProduitFactoryD extends ProduitFactory {
    protected Produit createProduit(){
        Produit produit = null;
        produit = new ProduitD();
        return produit;
    }

    // protected abstract Produit createProduit(){
    //     produit = new ProduitD();
    //     return produit;
    // };
}
