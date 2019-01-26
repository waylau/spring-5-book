package com.waylau.spring.reactive;

public class Stock {

	private String code;

	private String name;

	private String description;

	public Stock() {
	}

	public Stock(String code, String name, String description) {
		this.name = name;
		this.code = code;
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Stock person = (Stock) o;

		if (name != null ? !name.equals(person.name) : person.name != null) {
			return false;
		}
		if (code != null ? !code.equals(person.code) : person.code != null) {
			return false;
		}
		return description != null ? description.equals(person.description) : person.description == null;

	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (code != null ? code.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Person{" + "id='" + name + '\'' + ", firstname='" + code + '\'' + ", lastname='" + description + '\''
				+ '}';
	}
}
