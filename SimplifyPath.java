class SimplifyPath {
    public String simplifyPath(String path) {
        Deque<String> s = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");

        for(int i = 0; i<p.length; i++) {
            if(!s.isEmpty() && p[i].equals("..")) s.poll();
            else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals("..")) 
            s.push(p[i]);
        }

        if(s.isEmpty()) return "/";
        while(!s.isEmpty()) {
            res.append('/').append(s.pollLast());
        }
        return res.toString();
    }
}