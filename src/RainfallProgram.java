import java.io.*;

public class RainfallProgram {
	public static void main(String[] args) throws IOException, InvalidRainfallException {
		BufferedReader keyboard = new BufferedReader(
			new InputStreamReader(System.in)
		);
		
		RainfallStats stats = new RainfallStats();
		System.out.println("Enter rainfall measurements (in mm), or \"end\" to stop.");
		
		while(true) {
			System.out.print("> ");
			String line = keyboard.readLine();
			if("end".equals(line)) {
				break;
			}
			try {
			double measurement = Double.parseDouble(line);
			if(measurement<0) {
				System.out.println("ERROR negative number");
			}else  {
				
				stats.addMeasurement(Double.parseDouble(line));
			}

		}catch(NumberFormatException e) {
			System.out.println("Invalid measurement ");
			}
		}

		try {
		System.out.println(stats.getCount() + " measurement(s) entered.");
		
		// TODO: prevent the exception when no measurements have been entered.
		
		System.out.println("Mean rainfall: " + stats.getMean() + " mm");
		System.out.println("Maximum rainfall: " + stats.getMax() + " mm");
		}catch(IllegalStateException ie) {
			System.out.println("No measurements added ");
		}
	}
		
	}

