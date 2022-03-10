// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AggregationRule {
    /**
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole's permissions will be added
     * 
     */
    private final @Nullable List<LabelSelector> clusterRoleSelectors;

    @OutputCustomType.Constructor
    private AggregationRule(@OutputCustomType.Parameter("clusterRoleSelectors") @Nullable List<LabelSelector> clusterRoleSelectors) {
        this.clusterRoleSelectors = clusterRoleSelectors;
    }

    /**
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole's permissions will be added
     * 
    */
    public List<LabelSelector> getClusterRoleSelectors() {
        return this.clusterRoleSelectors == null ? List.of() : this.clusterRoleSelectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AggregationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LabelSelector> clusterRoleSelectors;

        public Builder() {
    	      // Empty
        }

        public Builder(AggregationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterRoleSelectors = defaults.clusterRoleSelectors;
        }

        public Builder setClusterRoleSelectors(@Nullable List<LabelSelector> clusterRoleSelectors) {
            this.clusterRoleSelectors = clusterRoleSelectors;
            return this;
        }
        public AggregationRule build() {
            return new AggregationRule(clusterRoleSelectors);
        }
    }
}
