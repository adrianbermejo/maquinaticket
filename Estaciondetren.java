
public class Estaciondetren
{
    private String ciudad;
    private TicketMachine maquina1;
    private TicketMachine maquina2;
    /**
     * constructor de la estacion de tren
     */
    public Estaciondetren(String nombreCiudad,int precioMaquina1,int precioMaquina2)
    {
        ciudad = nombreCiudad;
        maquina1 = new TicketMachine(precioMaquina1);
        maquina2 = new TicketMachine(precioMaquina2);
    }
    
    /**
     * simular la venta de un billeteen la maquina 2
     */
    public void ventaBilleteMaquina2()
    {
     maquina2.insertMoney(600);
     maquina2.printTicket();
    }
    /**
     * simular la venta de un billeteen la maquina 1
     */
    public void ventaBilleteMaquina1()
    {
     maquina1.insertMoney(500);
     maquina1.printTicket();
    }
    
    /**
     * devolver el total deldinero recaudado enla estacion hasta el momento
     */
    public int dineromaquina1()
    {
        return maquina1.getTotal();
    }
    
    /**
     * devolver el total deldinero recaudado enla estacion hasta el momento
     */
    public int dineromaquina1y2()
    {
        return maquina1.getTotal()+maquina2.getTotal();
    }
}