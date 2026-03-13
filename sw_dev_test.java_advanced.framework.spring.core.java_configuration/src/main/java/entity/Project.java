package entity;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Project implements Serializable{
	private Integer id;
	private String name;
	private String technology;
	public Project() {
		super();
	}
	public Project(Integer id, String name, String technology) {
		super();
		this.id = id;
		this.name = name;
		this.technology = technology;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, technology);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(technology, other.technology);
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", technology=" + technology + "]";
	}
	
}
