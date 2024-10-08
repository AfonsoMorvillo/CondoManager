package controller;

import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.table.AbstractTableModel;

import utils.StringUtils;

public class ResultSetTableModel extends AbstractTableModel {

	DataBaseConnection dbConnection;

	int numberOfRows = 0;

	public ResultSetTableModel(String query) throws SQLException {

		dbConnection = DataBaseConnection.getInstance();

		setQuery(query);
	}

	public void setQuery(String query) {

		try {
			dbConnection.executeSelect(query);
			dbConnection.getResultset().last();
			numberOfRows = dbConnection.getResultset().getRow();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		fireTableStructureChanged();

	}

	// public void setQuery( String query, String busca ) {
	//
	// String whereClause = query;
	//
	// if( !busca.isEmpty() ){
	//
	// whereClause += " WHERE nome_empresa LIKE '%";
	// whereClause += busca;
	// whereClause += "%'\n";
	//
	//
	// setQuery( whereClause );
	// }
	//
	// }

	@Override
	public int getColumnCount() {

		try {
			return dbConnection.getMetaData().getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public int getRowCount() {

		return numberOfRows;
	}

	@Override
	public Object getValueAt(int row, int column) {

		 try {
		        dbConnection.getResultset().absolute(row + 1);

		        Object columnValue = dbConnection.getResultset().getObject(column + 1);

		        if (columnValue instanceof Time) {
		            Time time = (Time) columnValue;
		            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
		            return timeFormat.format(time);
		        } else if (columnValue instanceof Date) {
		            Date date = (Date) columnValue;
		            return StringUtils.dateToString(date);
		        } else {
		            return columnValue;
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return "";
	}

	@Override
	public String getColumnName(int column) {

		try {
			return dbConnection.getMetaData().getColumnLabel(column + 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "";
	}

	public void disconnectFromDatabase() {

		try {
			dbConnection.disconnectFromDatabase();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
