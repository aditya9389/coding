public enum days {
    sunday, tuesday, wedneday;
    public double getdate()
    {
        return switch (this)
                {
                    case sunday -> 1;
                    case tuesday -> 2;
                    default ->  3;
                };
    }
}
