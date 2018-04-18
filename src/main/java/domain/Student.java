package domain;

public class Student {
    private String stuid;
    private String stuname;
    private String grade;
    private String stuphone;
    private String mother;
    private String father;
    private String image;
	public Student(String stuid, String stuname, String grade, String stuphone, String mother, String father,String image) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.grade = grade;
		this.stuphone = stuphone;
		this.mother = mother;
		this.father = father;
	}
    
    public Student()
    {
    	super();
    }

	public String getStuid() {
		return stuid;
	}

	public void setStuid(String stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStuphone() {
		return stuphone;
	}

	public void setStuphone(String stuphone) {
		this.stuphone = stuphone;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}
	public String getImage(){
		return image;
	}
	public void setImage(String image){
		this.image=image;
	}
    
}
