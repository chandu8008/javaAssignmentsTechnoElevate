package techno.java.collectin.asignA.Trainer;
	import java.util.Comparator;

	public class TrainerDec implements Comparator<TrainerDec>{

		private static final String experience = null;

		@Override
		public int compare(TrainerDec o1, TrainerDec o2) {
			
			return o2.experience.compareTo(o1.experience);
		}

	}
