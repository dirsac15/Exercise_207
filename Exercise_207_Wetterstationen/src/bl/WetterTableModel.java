/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import beans.Wetter;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sabrina
 */
public class WetterTableModel extends AbstractTableModel
{
    private String[] colNames = {"Place", "Sea level", "Temperature", "rel. Humidity"};
    private LinkedList<Wetter> list = new LinkedList<>();

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Wetter w = list.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return w.getPlace();
            case 1: return w.getSealevel();
            case 2: return w.getTemperature();
            case 3: return w.getHumidity();
            default: return "Error";
        }
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    
    public void add(Wetter w)
    {
        list.add(w);
        fireTableDataChanged();
    }
    
    public void remove(int[] indicies)
    {
        for(int i = indicies.length - 1; i >= 0; i--)
        {
            list.remove(indicies[i]);
        }
        fireTableDataChanged();
    }
    
    public void setTemperature()
    {
        
    }
    
    public void setHumidity()
    {
        
    }
    
    
    
}
