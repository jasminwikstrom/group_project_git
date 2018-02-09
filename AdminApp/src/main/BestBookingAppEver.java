package main;

import java.util.ArrayList;

import Database.DataQuerys;
import Database.Database;
import Database.Objects.Anställd;
import Database.Objects.Pass;
import Database.Objects.Person;
import Database.Objects.Pos;
import Database.Objects.Sal;
import Database.Objects.Salbokning;
import Database.Objects.Träning;
import Database.Objects.Utrymme;
import Gui.GUI;
import Gui.Pages;

public class BestBookingAppEver {

	private Database DB;
	private DataQuerys DBQ;
	private GUI gui;
	private Pages pages;

	private ArrayList<Anställd> anställda;
	private ArrayList<Person> personer;
	private ArrayList<Sal> salar;
	private ArrayList<Träning> Träningar;
	private ArrayList<Utrymme> Utrymmen;
	private ArrayList<Salbokning> Salbokningar;
	private ArrayList<Pos> Positioner;
	private ArrayList<Pass> pass;

	public BestBookingAppEver(){
		this.DB = new Database();
		this.DBQ = new DataQuerys(this, DB);
		this.gui = new GUI(this);
		this.pages = new Pages(this, DBQ, gui);
		gui.initPages();
	}

	public Pages getPages(){
		return pages;
	}

	public static void main(String[] args){
		new BestBookingAppEver();
	}

	public ArrayList<Anställd> getAnställda() {
		return anställda;
	}

	public ArrayList<Person> getPersoner() {
		return personer;
	}

	public ArrayList<Sal> getSalar() {
		return salar;
	}

	public ArrayList<Träning> getTräningar() {
		return Träningar;
	}

	public ArrayList<Utrymme> getUtrymmen() {
		return Utrymmen;
	}

	public ArrayList<Salbokning> getSalbokningar() {
		return Salbokningar;
	}

	public ArrayList<Pos> getPositioner() {
		return Positioner;
	}

	public ArrayList<Pass> getPass() {
		return pass;
	}

	public void setAnställda(ArrayList<Anställd> anställda) {
		this.anställda = anställda;
	}

	public void setPersoner(ArrayList<Person> personer) {
		this.personer = personer;
	}

	public void setSalar(ArrayList<Sal> salar) {
		this.salar = salar;
	}

	public void setTräningar(ArrayList<Träning> träningar) {
		Träningar = träningar;
	}

	public void setUtrymmen(ArrayList<Utrymme> utrymmen) {
		Utrymmen = utrymmen;
	}

	public void setSalbokningar(ArrayList<Salbokning> salbokningar) {
		Salbokningar = salbokningar;
	}

	public void setPositioner(ArrayList<Pos> positioner) {
		Positioner = positioner;
	}

	public void setPass(ArrayList<Pass> pass) {
		this.pass = pass;
	}

}
