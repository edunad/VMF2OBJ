package com.lathrum.VMF2OBJ;

public class Vector3 {

	public double x;
	public double y;
	public double z;

	public Vector3() {
		this.x = 0.0;
		this.y = 0.0;
		this.z = 0.0;
	}
  public Vector3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	//No Operator Overloading :(
	public static Vector3 add(Vector3 tip, Vector3 tail) {
		return new Vector3(
			tip.x+tail.x,
			tip.y+tail.y,
			tip.z+tail.z);
	}
	public Vector3 add(Vector3 vector) {
		return new Vector3(
			this.x+vector.x,
			this.y+vector.y,
			this.z+vector.z);
	}
	public Vector3 add(double num) {
		return new Vector3(
			this.x+num,
			this.y+num,
			this.z+num);
	}
	public static Vector3 subtract(Vector3 tip, Vector3 tail) {
		return new Vector3(
			tip.x-tail.x,
			tip.y-tail.y,
			tip.z-tail.z);
	}
	public Vector3 subtract(Vector3 vector) {
		return new Vector3(
			this.x-vector.x,
			this.y-vector.y,
			this.z-vector.z);
	}
	public Vector3 subtract(double num) {
		return new Vector3(
			this.x-num,
			this.y-num,
			this.z-num);
	}
	public static Vector3 multiply(Vector3 vectorA, Vector3 vectorB) {
		return new Vector3(
			vectorA.x*vectorB.x,
			vectorA.y*vectorB.y,
			vectorA.z*vectorB.z);
	}
	public Vector3 multiply(Vector3 vector) {
		return new Vector3(
			this.x*vector.x,
			this.y*vector.y,
			this.z*vector.z);
	}
	public Vector3 multiply(double num) {
		return new Vector3(
			this.x*num,
			this.y*num,
			this.z*num);
	}
	public static Vector3 divide(Vector3 vectorA, Vector3 vectorB) {
		return new Vector3(
			vectorA.x/vectorB.x,
			vectorA.y/vectorB.y,
			vectorA.z/vectorB.z);
	}
	public Vector3 divide(Vector3 vector) {
		return new Vector3(
			this.x/vector.x,
			this.y/vector.y,
			this.z/vector.z);
	}
	public Vector3 divide(double num) {
		return new Vector3(
			this.x/num,
			this.y/num,
			this.z/num);
	}

	
	public static double magnitude(Vector3 vector) {
		return Math.sqrt(Math.pow(vector.x,2)+Math.pow(vector.y,2)+Math.pow(vector.z,2));
	}
	public double magnitude() {
		return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2));
	}

	
	public static Vector3 abs(Vector3 vector) {
		if (vector.x < 0)
			vector.x = -vector.x;
		if (vector.y < 0)
			vector.y = -vector.y;
		if (vector.z < 0)
			vector.z = -vector.z;
		return vector;
	}
	public Vector3 abs() {
		if (this.x < 0)
			this.x = -this.x;
		if (this.y < 0)
			this.y = -this.y;
		if (this.z < 0)
			this.z = -this.z;
		return this;
	}

	
	public static Vector3 cross(Vector3 vectorA, Vector3 vectorB) {
		return new Vector3(
			vectorA.y * vectorB.z - vectorA.z * vectorB.y,
			vectorA.z * vectorB.x - vectorA.x * vectorB.z,
			vectorA.x * vectorB.y - vectorA.y * vectorB.x);
	}
	public Vector3 cross(Vector3 vector) {
		return new Vector3(
			this.y * vector.z - this.z * vector.y,
			this.z * vector.x - this.x * vector.z,
			this.x * vector.y - this.y * vector.x);
	}

	public static double dot(Vector3 vectorA, Vector3 vectorB) {
		return (vectorA.x * vectorB.x) + (vectorA.y * vectorB.y) + (vectorA.z * vectorB.z);
	}
	public double dot(Vector3 vector) {
		return (this.x * vector.x) + (this.y * vector.y) + (this.z * vector.z);
	}

	public static Vector3 normalize(Vector3 vector) {
		double length = vector.magnitude();
		return vector.divide(new Vector3(length,length,length));
	}
	public Vector3 normalize() {
		double length = this.magnitude();
		return this.divide(new Vector3(length,length,length));
	}

	public String toString() {
		return "("+x+","+y+","+z+")";
	}

    public boolean equals(Object obj) {
        if (obj instanceof Vector3) {
            return ((this.x*31 + this.y)*31 + this.z) == ((((Vector3) obj).x*31 + ((Vector3) obj).y)*31 + ((Vector3) obj).z);
        }
        return false;
	}

	public int hashCode() {
		return Math.round(Math.round((x*31 + y)*31 + z));
	}

}