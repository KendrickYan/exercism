class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder sb = new StringBuilder();

        if (id != null)
            sb.append("[")
                    .append(id)
                    .append("] - ");

        sb.append(name)
                .append(" - ")
                .append(department == null ? "OWNER" : department.toUpperCase());

        return sb.toString();
    }
}
