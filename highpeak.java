
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	import java.util.stream.Collectors;

	public class highpeak {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter no of jobs");
			int noOfJobs=scanner.nextInt();
			List<Jobs> jobList= new ArrayList<>();
			int[] jobsProfit = new int[noOfJobs];
			int max = 0;
			int total = 0;
			if(noOfJobs<=100) {
				for(int i=0;i<noOfJobs;i++) {
					System.out.println("Enter start time");
			int first=scanner.nextInt();
			System.out.println("Enter end time");
			int last=scanner.nextInt();
			System.out.println("Enter the profit");
			int profit=scanner.nextInt();
			total += profit;
			if(max < profit) {
				max = profit;
			}
			}
//			jobList.add(jobDetails(first, last, profit));
//				}
//				//this below line we are getting list of  valid jobs which has first time less than ending time
//				List<Jobs> filteredList = jobList.stream().filter((e1)-> e1.getfirst()<e1.getlast()).collect(Collectors.toList());
//				filteredList.remove(filteredList.stream().max((e1,e2)->e1.getProfit()-e2.getProfit()).get());
//				int size = filteredList.size();
//				int totalProfit=0;
//				for(int i=0;i<size;i++) {
//					Jobs j= filteredList.get(i);
//					totalProfit=totalProfit+j.getProfit();
//				}
//				int []arr= {size,totalProfit};
//				System.out.println("No of jobs remaning ="+arr[0]);
//				System.out.println("Total profit that can be earned by the employee = "+arr[1]);
//			
//				
				System.out.println(noOfJobs + " " + (total - max));
			}else {
				System.out.println("no of Jobs is greater than limit");
			}
		}
		public static Jobs jobDetails(int first,int last,int profit) {
			Jobs jobs  = new Jobs();
			jobs.setfirst(first);
			jobs.setlast(last);
			jobs.setProfit(profit);
			return jobs;
			
		}

	}
	class Jobs{
		private int first;
		private int last;
		private int profit;
		public int getfirst() {
			return first;
		}
		public void setfirst(int first) {
			this.first = first;
		}
		public int getlast() {
			return last;
		}
		public void setlast(int endTime) {
			this.last = last;
		}
		public int getProfit() {
			return profit;
		}
		public void setProfit(int profit) {
			this.profit = profit;
		}
	}
