package com.locker.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hoblocker")
public class Hoblocker{

		@Id
//		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long locker_id;
		private String size;
		private String discription;
		private String price;
		private String location;
		private String rating;
		
		
		public Hoblocker(Long locker_id, String size, String discription, String price, String location,
				String rating) {
			super();
			this.locker_id = locker_id;
			this.size = size;
			this.discription = discription;
			this.price = price;
			this.location = location;
			this.rating = rating;
		}
		
		public Hoblocker() {
			
		}

		public Long getLocker_id() {
			return locker_id;
		}
		public void setLocker_id(Long locker_id) {
			this.locker_id = locker_id;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getDiscription() {
			return discription;
		}
		public void setDiscription(String discription) {
			this.discription = discription;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getRating() {
			return rating;
		}
		public void setRating(String rating) {
			this.rating = rating;
		}
		@Override
		public String toString() {
			return "Hoblocker [locker_id=" + locker_id + ", size=" + size + ", discription=" + discription + ", price="
					+ price + ", location=" + location + ", rating=" + rating + "]";
		}
		

		
}
