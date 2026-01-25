import java.util.*;

class RelativeDistance {

    private final Map<String, Set<String>> familyMap = new HashMap<>();

    RelativeDistance(Map<String, List<String>> familyTree) {
        for (Map.Entry<String, List<String>> entry: familyTree.entrySet()) {
            String parent = entry.getKey();
            Set<String> children = new HashSet<>(entry.getValue());

            if (!familyMap.containsKey(parent)) {
                familyMap.put(parent, children);
            } else {
                familyMap.get(parent).addAll(children);
            }

            for (String child: children) {
                if (!familyMap.containsKey(child)) {
                    Set<String> value = new HashSet<>();
                    value.add(parent);
                    value.addAll(children);
                    value.remove(child);
                    familyMap.put(child, value);
                } else {
                    Set<String> value = familyMap.get(child);
                    value.add(parent);
                    value.addAll(children);
                    value.remove(child);
                }
            }
        }
    }

    int degreeOfSeparation(String personA, String personB) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, Integer> relativeDistance = new HashMap<>();

        queue.add(personA);
        visited.add(personA);
        relativeDistance.put(personA, 0);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int distance = relativeDistance.get(current) + 1;

            for (String person: familyMap.getOrDefault(current, Set.of())) {
                if (visited.contains(person)) continue;

                queue.add(person);
                visited.add(person);
                relativeDistance.put(person, distance);

                if (person.equals(personB)) return distance;
            }
        }
        return -1;
    }
}
