package com.nit.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int p_id;
        private String p_name;
        private String loc;
        private long mob_num;
        
        @OneToOne(cascade = CascadeType.ALL)//is some changes any where it change automatically
        @JoinColumn(name="card_id")
        PanCard card;
        
		public int getP_id() {
			return p_id;
		}
		public void setP_id(int p_id) {
			this.p_id = p_id;
		}
		public String getP_name() {
			return p_name;
		}
		public void setP_name(String p_name) {
			this.p_name = p_name;
		}
		public String getLoc() {
			return loc;
		}
		public void setLoc(String loc) {
			this.loc = loc;
		}
		public long getMob_num() {
			return mob_num;
		}
		public void setMob_num(long mob_num) {
			this.mob_num = mob_num;
		}
		
		
		public PanCard getCard() {
			return card;
		}
		public void setCard(PanCard card) {
			this.card = card;
		}
		
		@Override
		public String toString() {
			return "Person [p_id=" + p_id + ", p_name=" + p_name + ", loc=" + loc + ", mob_num=" + mob_num + "]";
		}
        
        
}
