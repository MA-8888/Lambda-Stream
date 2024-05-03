package collection;

import java.time.LocalDate;

class Task implements Comparable<Task> {
	private LocalDate date;
	private String description;

	public Task(LocalDate date, String description) {
		this.date = date;
		this.description = description;
	}

	@Override
	public int compareTo(Task other) {
		return this.date.compareTo(other.date);
	}

	@Override
	public String toString() {
		return this.date + ": " + this.description;
	}
}
