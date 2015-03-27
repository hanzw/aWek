package weka.classifiers.timeseries;

import java.util.ArrayList;
/**
 * Class to store the data of the classes.
 * @author HanzhangWang
 *
 */
public class Data {
	String cName;
	ArrayList<String[]> data;
	String[] aName;
	int[] diff;
	Data(){
		this.data=new ArrayList<String[]>();	
	}
	//0 means same data, 1 means different data
//	void checkDifference(){
//		diff=new int[aName.length];
//		
//		for (int i = 0; i<aName.length;i++){
//			int temp=0;
//			//for testing -3 only, data.size() for prediction.
//			for (int j=1; j<data.size();j++){
//				if( !data.get(0)[i].equals(data.get(j)[i])){
//					temp=1;
//					break;
//				}
//				
//			}
//			diff[i]=temp;
//		}
//	}

}
