package bn_MicroBlog;
class MicroBlog {

    public String truncate(String input) {
        // input.
        if (input.length() >= 5)
            return input.substring(0, input.offsetByCodePoints(0, 5));
        return input;
    }
}