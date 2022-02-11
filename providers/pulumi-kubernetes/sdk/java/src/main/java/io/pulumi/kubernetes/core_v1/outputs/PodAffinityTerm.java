// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PodAffinityTerm {
    private final @Nullable LabelSelector labelSelector;
    private final @Nullable LabelSelector namespaceSelector;
    private final @Nullable List<String> namespaces;
    private final String topologyKey;

    @OutputCustomType.Constructor({"labelSelector","namespaceSelector","namespaces","topologyKey"})
    private PodAffinityTerm(
        @Nullable LabelSelector labelSelector,
        @Nullable LabelSelector namespaceSelector,
        @Nullable List<String> namespaces,
        String topologyKey) {
        this.labelSelector = labelSelector;
        this.namespaceSelector = namespaceSelector;
        this.namespaces = namespaces;
        this.topologyKey = Objects.requireNonNull(topologyKey);
    }

    public Optional<LabelSelector> getLabelSelector() {
        return Optional.ofNullable(this.labelSelector);
    }
    public Optional<LabelSelector> getNamespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }
    public List<String> getNamespaces() {
        return this.namespaces == null ? List.of() : this.namespaces;
    }
    public String getTopologyKey() {
        return this.topologyKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodAffinityTerm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LabelSelector labelSelector;
        private @Nullable LabelSelector namespaceSelector;
        private @Nullable List<String> namespaces;
        private String topologyKey;

        public Builder() {
    	      // Empty
        }

        public Builder(PodAffinityTerm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelSelector = defaults.labelSelector;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.namespaces = defaults.namespaces;
    	      this.topologyKey = defaults.topologyKey;
        }

        public Builder setLabelSelector(@Nullable LabelSelector labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        public Builder setNamespaceSelector(@Nullable LabelSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        public Builder setNamespaces(@Nullable List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        public Builder setTopologyKey(String topologyKey) {
            this.topologyKey = Objects.requireNonNull(topologyKey);
            return this;
        }

        public PodAffinityTerm build() {
            return new PodAffinityTerm(labelSelector, namespaceSelector, namespaces, topologyKey);
        }
    }
}
