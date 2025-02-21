package hellojpa;

import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;

@Embeddable
public class Period {
	private LocalDateTime startDate;
	private LocalDateTime endDate;
}
