public class LancheFactory
{
    public static  iFactoryLanche CriaLanche(String lanchonete)
    {
        if (lanchonete == null){
            return null;
        }
        if(lanchonete.equalsIgnoreCase("CG")){
            return new LanchoneteCG();
        }
        if(lanchonete.equalsIgnoreCase("JP")){
            return new LanchoneteJP();
        }
        if(lanchonete.equalsIgnoreCase("RT")){
            return new LanchoneteRT();
        }
        return null;
    }


}
