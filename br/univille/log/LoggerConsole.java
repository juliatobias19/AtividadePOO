package br.univille.log;

class LoggerConsole implements Logger {

    @Override
    public void log(Level level, String message) {
        String color;

        switch (level) {
            case DEBUG:
                color = "\u001B[32m"; 
                break;
            case WARNING:
                color = "\u001B[33m"; 
                break;
            case ERROR:
                color = "\u001B[31m"; 
                break;
            default:
                color = "\u001B[0m"; 
        }

        String reset = "\u001B[0m";
        System.out.println(color + "[" + level + "] " + message + reset);
    }
}
