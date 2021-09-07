package kr.ac.artTechManager.util;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class RConn {
	private RConnection r = null;
	private REXP x = null;
	private String retStr = "";
	
	public RConn() throws RserveException {
		this.r = new RConnection();
	}
	
	public String getGoodsClickGraph() throws REngineException, REXPMismatchException {
		//로그파일 읽기
		
		
		return "";
	}

}
