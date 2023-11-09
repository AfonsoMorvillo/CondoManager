package utils;

import java.util.ArrayList;
import java.util.List;

public class Select {
    private List<String> fields;
    private String fromTable;
    private List<String> joinClauses;

    public Select() {
        fields = new ArrayList<>();
        joinClauses = new ArrayList<>();
    }

    public Select(String from) {
        fields = new ArrayList<>();
        joinClauses = new ArrayList<>();
        fromTable = from;
    }

    public void add(String field) {
        fields.add(field);
    }

    public void add(String field, String alias) {
        fields.add(field + " AS " + alias);
    }

    public void addLeftJoin(String joinTable, String onCondition) {
        String joinClause = "LEFT JOIN " + joinTable + " ON " + onCondition;
        joinClauses.add(joinClause);
    }

    public String build() {
        if (fields.isEmpty()) {
            return "";
        }

        StringBuilder selectQuery = new StringBuilder("SELECT ");
        selectQuery.append(String.join(", ", fields));

        if (!StringUtils.isEmpty(fromTable)) {
            selectQuery.append(" FROM ");
            selectQuery.append(fromTable);
        }

        if (!joinClauses.isEmpty()) {
            selectQuery.append(" ");
            selectQuery.append(String.join(" ", joinClauses));
        }

        return selectQuery.toString();
    }
}
        
