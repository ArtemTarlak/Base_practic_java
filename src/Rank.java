enum Rank {
    FIRED(0),
    INTERN(1),
    JUNIOR(2),
    MIDDLE(3),
    SENIOR(4);

    private final int value;

    Rank(int value) {
        this.value = value;
    }

    public static Rank fromJob(String job) {
        switch (job.toLowerCase()) {
            case "fired":
                return FIRED;
            case "intern":
                return INTERN;
            case "junior":
                return JUNIOR;
            case "middle":
                return MIDDLE;
            case "senior":
                return SENIOR;
            default:
                return FIRED; // Если неизвестная должность, считаем работника уволенным
        }
    }

    public String getJobTitle() {
        switch (this) {
            case FIRED:
                return "fired";
            case INTERN:
                return "intern";
            case JUNIOR:
                return "junior";
            case MIDDLE:
                return "middle";
            case SENIOR:
                return "senior";
            default:
                return "unknown";
        }
    }
}