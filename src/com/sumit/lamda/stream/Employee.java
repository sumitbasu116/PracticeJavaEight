package com.sumit.lamda.stream;
public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	public Employee(String name) {
        this.name = name;        
    }
	public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;        
        this.salary = salary;
    }
	public boolean salaryGreaterTha(Employee e)
	{
		return this.salary<e.salary;
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
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Employee salaryIncrement(Double percentage) {
        Double newSalary = salary + percentage * salary / 100;
        setSalary(newSalary);
        return this;
    }
    
    public Employee setNamePrefix(String prefix) {
        String name=this.name+prefix;
        setName(name);
        return this;
    }
    
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}
	public String toString() {
        return "Id: " + id + " Name:" + name + " Salary:" + salary;
    }
}
