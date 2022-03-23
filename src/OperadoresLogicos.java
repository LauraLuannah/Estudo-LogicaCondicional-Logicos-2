public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean b1 = true; boolean b2 = false;
        boolean b3 = true; boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));// v f false tabela verdade and(e) conjução
        System.out.println("b1 && b3 " + (b1 && b3));// v v true

        System.out.println("b2 || b3 " + (b2 || b3));// f v true tabela verdade or(ou) disjunção
        System.out.println("b2 || b4 " + (b2 || b4));// f f false

        System.out.println("b1 ^ b3 " + (b1 ^ b3));// v v false  tabela verdade xor disjunção exclusiva
        System.out.println("b4 ^ b1 " + (b4 ^ b1));// f v true

        System.out.println(!b1);// false tabela verdade inversão negação
        System.out.println(!b2);// true

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;    // 15 <30 v & true = true
        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1))); //v ou f true

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;
                                    //f   e v false
        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;// f
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;//v

        System.out.println((salarioBaixo) && (muitosDependentes));//f

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);//f
        System.out.println("recebeAuxilio " + recebeAuxilio);

    }
}
