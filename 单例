class Solution {
    /**
     单例 是最为最常见的设计模式之一。
     对于任何时刻，如果某个类只存在且最多存在一个具体的实例，那么我们称这种设计模式为单例。
     例如，对于 class Mouse (不是动物的mouse哦)，我们应将其设计为 singleton 模式。
     */
    private static Solution solution;
    private Solution(){};
    public static Solution getInstance() {
        if(solution == null){
        solution = new Solution();
        }    
    return solution;
    }
}
