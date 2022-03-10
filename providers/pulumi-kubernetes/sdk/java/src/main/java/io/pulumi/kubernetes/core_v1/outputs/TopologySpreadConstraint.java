// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopologySpreadConstraint {
    /**
     * LabelSelector is used to find matching pods. Pods that match this label selector are counted to determine the number of pods in their corresponding topology domain.
     * 
     */
    private final @Nullable LabelSelector labelSelector;
    /**
     * MaxSkew describes the degree to which pods may be unevenly distributed. When `whenUnsatisfiable=DoNotSchedule`, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When `whenUnsatisfiable=ScheduleAnyway`, it is used to give higher precedence to topologies that satisfy it. It's a required field. Default value is 1 and 0 is not allowed.
     * 
     */
    private final Integer maxSkew;
    /**
     * TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each <key, value> as a "bucket", and try to put balanced number of pods into each bucket. It's a required field.
     * 
     */
    private final String topologyKey;
    /**
     * WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,
     *   but giving higher precedence to topologies that would help reduce the
     *   skew.
     * A constraint is considered "Unsatisfiable" for an incoming pod if and only if every possible node assignment for that pod would violate "MaxSkew" on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it *more* imbalanced. It's a required field.
     * 
     * Possible enum values:
     *  - `"DoNotSchedule"` instructs the scheduler not to schedule the pod when constraints are not satisfied.
     *  - `"ScheduleAnyway"` instructs the scheduler to schedule the pod even if constraints are not satisfied.
     * 
     */
    private final String whenUnsatisfiable;

    @OutputCustomType.Constructor
    private TopologySpreadConstraint(
        @OutputCustomType.Parameter("labelSelector") @Nullable LabelSelector labelSelector,
        @OutputCustomType.Parameter("maxSkew") Integer maxSkew,
        @OutputCustomType.Parameter("topologyKey") String topologyKey,
        @OutputCustomType.Parameter("whenUnsatisfiable") String whenUnsatisfiable) {
        this.labelSelector = labelSelector;
        this.maxSkew = maxSkew;
        this.topologyKey = topologyKey;
        this.whenUnsatisfiable = whenUnsatisfiable;
    }

    /**
     * LabelSelector is used to find matching pods. Pods that match this label selector are counted to determine the number of pods in their corresponding topology domain.
     * 
    */
    public Optional<LabelSelector> getLabelSelector() {
        return Optional.ofNullable(this.labelSelector);
    }
    /**
     * MaxSkew describes the degree to which pods may be unevenly distributed. When `whenUnsatisfiable=DoNotSchedule`, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When `whenUnsatisfiable=ScheduleAnyway`, it is used to give higher precedence to topologies that satisfy it. It's a required field. Default value is 1 and 0 is not allowed.
     * 
    */
    public Integer getMaxSkew() {
        return this.maxSkew;
    }
    /**
     * TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each <key, value> as a "bucket", and try to put balanced number of pods into each bucket. It's a required field.
     * 
    */
    public String getTopologyKey() {
        return this.topologyKey;
    }
    /**
     * WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,
     *   but giving higher precedence to topologies that would help reduce the
     *   skew.
     * A constraint is considered "Unsatisfiable" for an incoming pod if and only if every possible node assignment for that pod would violate "MaxSkew" on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it *more* imbalanced. It's a required field.
     * 
     * Possible enum values:
     *  - `"DoNotSchedule"` instructs the scheduler not to schedule the pod when constraints are not satisfied.
     *  - `"ScheduleAnyway"` instructs the scheduler to schedule the pod even if constraints are not satisfied.
     * 
    */
    public String getWhenUnsatisfiable() {
        return this.whenUnsatisfiable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopologySpreadConstraint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LabelSelector labelSelector;
        private Integer maxSkew;
        private String topologyKey;
        private String whenUnsatisfiable;

        public Builder() {
    	      // Empty
        }

        public Builder(TopologySpreadConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelSelector = defaults.labelSelector;
    	      this.maxSkew = defaults.maxSkew;
    	      this.topologyKey = defaults.topologyKey;
    	      this.whenUnsatisfiable = defaults.whenUnsatisfiable;
        }

        public Builder setLabelSelector(@Nullable LabelSelector labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        public Builder setMaxSkew(Integer maxSkew) {
            this.maxSkew = Objects.requireNonNull(maxSkew);
            return this;
        }

        public Builder setTopologyKey(String topologyKey) {
            this.topologyKey = Objects.requireNonNull(topologyKey);
            return this;
        }

        public Builder setWhenUnsatisfiable(String whenUnsatisfiable) {
            this.whenUnsatisfiable = Objects.requireNonNull(whenUnsatisfiable);
            return this;
        }
        public TopologySpreadConstraint build() {
            return new TopologySpreadConstraint(labelSelector, maxSkew, topologyKey, whenUnsatisfiable);
        }
    }
}
