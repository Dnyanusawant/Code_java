class Population
{
public static void main(String[] args)
{
     long currentPopulation = 312032486;
     long secondInYear = 365*24*60*60;
     long birthPerYear= secondInYear/7;
     long deathPerYear = secondInYear/13;
     long immigrant = secondInYear/45;
     long after5yearsPopulation = ((birthPerYear-deathPerYear+immigrant)*5);
     
     
     System.out.println("CurrentPopulation is ="+currentPopulation);
     System.out.println("current population - "+currentPopulation+" population after 5 years - " +after5yearsPopulation);

  }
}