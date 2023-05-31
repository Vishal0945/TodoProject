package com.entities;

//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class allData {
		

		private String todotitle;
		private String todocontent;
		private String tododata;
		
		public allData(String todotitle, String todocontent, String tododata) {
		super();
		this.todotitle = todotitle;
		this.todocontent = todocontent;
		this.tododata = tododata;

		}
		
		public allData() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getTodotitle() {
			return todotitle;
		}
		public void setTodotitle(String todotitle) {
			this.todotitle = todotitle;
		}
		public String getTodocontent() {
			return todocontent;
		}
		public void setTodocontent(String todocontent) {
			this.todocontent = todocontent;
		}
		public String getTododata() {
			return tododata;
		}
		public void setTododata(String tododata) {
			this.tododata = tododata;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.getTodotitle()+" :"+this.todocontent;
		}

	}


