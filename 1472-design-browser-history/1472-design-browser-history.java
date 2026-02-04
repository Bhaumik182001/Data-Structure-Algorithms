class BrowserHistory {
    Stack<String> s1;
    Stack<String> s2;

    public BrowserHistory(String homepage) {
        s1 = new Stack<>();
        s2 = new Stack<>();
        s1.push(homepage);
    }
    
    public void visit(String url) {
        s2.clear();
        s1.push(url);
    }
    
    public String back(int steps) {

        
        while(steps--> 0 && s1.size() > 1){
            s2.push(s1.pop());
        }

        return s1.peek();
    }
    
    public String forward(int steps) {
        int count = 0;

        while(steps--> 0 && !s2.isEmpty()){
            s1.push(s2.pop());
        }

        return s1.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */