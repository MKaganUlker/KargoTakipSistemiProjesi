package project2;

import java.util.ArrayList;

public class Branch {
	private String branchName;
	int numberOfCargos = 0;
	private ArrayList<Cargo> cargos;
	
	public Branch() {
		super();
		this.branchName = branchName;
		cargos = new ArrayList<Cargo>();
	}


	
	
	public void addCargo(Cargo c) {
		
	if(numberOfCargos<100) {
		cargos.add(c);
		numberOfCargos++;
		
	}
	else return;
		
		
		
		
	}
	
	
	public void cargoList() {
		
		for (int i=0; i<cargos.size(); i++) {
			System.out.println(cargos.get(i).toString());
			
		}
	}

	boolean deleteCargo(int cargoNo){
	        for (int i = 0;i<cargos.size();i++) {
	        	if (cargos.get(i).getCargoNo()==cargoNo) {
	        		cargos.remove(i);
	        		return true;
	        	}
	        }
	      

	        return false;
	    }
	 
	 public String getBranchName() {
	        return branchName;
	    }

	    
		public void setBranchName(String branchName) {
	        this.branchName = branchName;
	    }

	   

}
