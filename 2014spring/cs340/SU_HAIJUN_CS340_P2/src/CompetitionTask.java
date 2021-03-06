

/**
 * @author Haijun Su
 *
 */
public interface CompetitionTask {
	public enum TaskType {Forest, Mountain, River, GoHome}

	/**
	 * Task type
	 * @return
	 */
	public TaskType getTaskType();

	/**
	 * Who owns this task
	 */
	public void setOwnerId(int id);

	/**
	 * Who own this task.
	 * @return
	 */
	public int getOwnerId();

	/**
	 * Total time to complete this task by prince
	 * @return
	 */
	public long totalTime();

	/**
	 * Rest time before he executes task
	 */
	public void setRestTime(long rest);

	/**
	 * Owner's age when this task has been done
	 * @return
	 */
	public long taskTime();

	public void process();

	/**
	 * True is pass. False is fail.
	 * @return
	 */
	public boolean result();
}
