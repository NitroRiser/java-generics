package entities;

public class Student {
    private Integer mat;

    public Student(Integer mat) {
        this.mat = mat;
    }

    public Integer getMat() {
        return mat;
    }

    public void setMat(Integer mat) {
        this.mat = mat;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mat == null) ? 0 : mat.hashCode());
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
        Student other = (Student) obj;
        if (mat == null) {
            if (other.mat != null)
                return false;
        } else if (!mat.equals(other.mat))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [mat=" + mat + "]";
    }

    

}
