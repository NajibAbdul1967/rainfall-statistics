import java.util.ArrayList;
import java.util.List;
public class RainfallStats {
	
	public List<String> rainfall = new ArrayList<String>();
	
	public int getCount() {
		// TODO Auto-generated method stub
		return rainfall.size();
	}

	public double getMean() throws IllegalStateException {
		if(rainfall.isEmpty()) {
			String message = "No measurement added";
			throw new IllegalStateException(message);
			
		} else {
		double mean = 0;
		for(String values: rainfall) {
		 mean=mean + Double.parseDouble(values);
		}
		return mean/getCount();
		}
	}

	public double getMax() throws IllegalStateException {
		if(rainfall.isEmpty()) {
			String message = "No measurements added";
			throw new IllegalStateException(message);
			
		}else {
		double max =0;
		for(String values: rainfall) {
			if(Double.parseDouble(values)>= max) {
				max = Double.parseDouble(values);
			}
			
		}
		return max;
		}
		
	}

	public void addMeasurement(double d) throws InvalidRainfallException {
		if(d< 0) {
			String message = "Invalid Measurement";
			throw new InvalidRainfallException(message);
		}
		rainfall.add(Double.toString(d));
		
	}



}
