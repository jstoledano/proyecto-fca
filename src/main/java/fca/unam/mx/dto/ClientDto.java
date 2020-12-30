package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
	private Long id;
	private String name;
	private String paterno;
	private String materno;
	private String rfc;
	
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    @ColumnName("apellido_paterno")
    public String getPaterno() {
    	return paterno;
    }
    
    public void setPaterno(String paterno) {
    	this.paterno = paterno;
    }
    
    @ColumnName("apellido_materno")
    public String getMaterno() {
    	return materno;
    }
    
    public void setMaterno(String materno) {
    	this.materno = materno;
    }
    
    @ColumnName("RFC")
    public String getRfc() {
    	return rfc;
    }
    
    public void setRfc(String rfc) {
    	this.rfc = rfc;
    }
}
