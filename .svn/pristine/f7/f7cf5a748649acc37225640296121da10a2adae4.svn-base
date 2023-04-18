package de.ostfalia.aud.s23ss.base;

public enum Department {
    /**
     * Enum for the SERVICE department.
     */
    SERVICE("Service"), 
    /**
     * Enum for the DEVELOPMENT department.
     */
    DEVELOPMENT("Development"),
    /**
     * Enum for the SALES department.
     */ 
    SALES("Sales"), 
    /**
     * Enum for the PRODUCTION department.
     */ 
    PRODUCTION("Production"),
    /**
     * Enum for the MANPOWER department.
     */  
    MANPOWER("Manpower"), 
    /**
     * Enum for the RESEARCH department.
     */  
    RESEARCH("Research"), 
    /**
     * Enum for the MARKETING department.
     */  
    MARKETING("Marketing"), 
    /**
     * Enum for the MANAGEMENT department.
     */  
    MANAGEMENT("Management"), 
    /**
     * Enum for the FINANCE department.
     */  
    FINANCE("Finance");
    
    private String name;
    
    /**
     * Constructor for the Department.
     * 
     * @param name the name of the Department
     */
    private Department(String name) {
        this.name = name;
    }
    
    /**
     * Returns the Department.     * 
     * @return name: the name of the Department
     */
    public Department getDepartment() {
        return this;
    }
    

    @Override
    public String toString() {
        return name;
    }

    /**
     * Creates a Department from a String.
     * 
     * @param string the String to create the Department from
     * @return d: the Department or null if the String is not a Department
     */
    public static Department create(String string) {
        for (Department d : Department.values()) {
            if (d.toString().equals(string)) {
                return d;
            }
        }
        return null;
    }


}
