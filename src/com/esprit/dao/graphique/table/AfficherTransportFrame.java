/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.dao.graphique.table;

import com.esprit.dao.entities.*;
import com.esprit.implementations.*;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sony
 */
public class AfficherTransportFrame extends AbstractTableModel {
     String[] entete ={"Pays", "type","Compagnie","Description","Evalution"};
    List<Transport> t = new ArrayList<>();
    TransportDAO DAO;


    public AfficherTransportFrame() {
         DAO = new TransportDAO();
        t = DAO.selectTransport();
    }
    

    @Override
    public int getRowCount() {
          return t.size();
    }

    public List<Transport> getT() {
        return t;
    }

    @Override
    public int getColumnCount() {
       return entete.length;
    }
  public String getColumnName(int i) {
        return entete[i];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
         
            case 0:
                return t.get(rowIndex).getPays();
                 case 1:
                return t.get(rowIndex).getType();
            case 2:
                return t.get(rowIndex).getCompagnie();
                 case 3:
                return t.get(rowIndex).getDescription();
                     case 4:
                return t.get(rowIndex).getEvaluation();
            default:
                return null;}
    }
   
}
