// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyRuleArgs Empty = new ResourcePolicyRuleArgs();

    @InputImport(name="apiGroups", required=true)
    private final Input<List<String>> apiGroups;

    public Input<List<String>> getApiGroups() {
        return this.apiGroups;
    }

    @InputImport(name="clusterScope")
    private final @Nullable Input<Boolean> clusterScope;

    public Input<Boolean> getClusterScope() {
        return this.clusterScope == null ? Input.empty() : this.clusterScope;
    }

    @InputImport(name="namespaces")
    private final @Nullable Input<List<String>> namespaces;

    public Input<List<String>> getNamespaces() {
        return this.namespaces == null ? Input.empty() : this.namespaces;
    }

    @InputImport(name="resources", required=true)
    private final Input<List<String>> resources;

    public Input<List<String>> getResources() {
        return this.resources;
    }

    @InputImport(name="verbs", required=true)
    private final Input<List<String>> verbs;

    public Input<List<String>> getVerbs() {
        return this.verbs;
    }

    public ResourcePolicyRuleArgs(
        Input<List<String>> apiGroups,
        @Nullable Input<Boolean> clusterScope,
        @Nullable Input<List<String>> namespaces,
        Input<List<String>> resources,
        Input<List<String>> verbs) {
        this.apiGroups = Objects.requireNonNull(apiGroups, "expected parameter 'apiGroups' to be non-null");
        this.clusterScope = clusterScope;
        this.namespaces = namespaces;
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
        this.verbs = Objects.requireNonNull(verbs, "expected parameter 'verbs' to be non-null");
    }

    private ResourcePolicyRuleArgs() {
        this.apiGroups = Input.empty();
        this.clusterScope = Input.empty();
        this.namespaces = Input.empty();
        this.resources = Input.empty();
        this.verbs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> apiGroups;
        private @Nullable Input<Boolean> clusterScope;
        private @Nullable Input<List<String>> namespaces;
        private Input<List<String>> resources;
        private Input<List<String>> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.clusterScope = defaults.clusterScope;
    	      this.namespaces = defaults.namespaces;
    	      this.resources = defaults.resources;
    	      this.verbs = defaults.verbs;
        }

        public Builder setApiGroups(Input<List<String>> apiGroups) {
            this.apiGroups = Objects.requireNonNull(apiGroups);
            return this;
        }

        public Builder setApiGroups(List<String> apiGroups) {
            this.apiGroups = Input.of(Objects.requireNonNull(apiGroups));
            return this;
        }

        public Builder setClusterScope(@Nullable Input<Boolean> clusterScope) {
            this.clusterScope = clusterScope;
            return this;
        }

        public Builder setClusterScope(@Nullable Boolean clusterScope) {
            this.clusterScope = Input.ofNullable(clusterScope);
            return this;
        }

        public Builder setNamespaces(@Nullable Input<List<String>> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        public Builder setNamespaces(@Nullable List<String> namespaces) {
            this.namespaces = Input.ofNullable(namespaces);
            return this;
        }

        public Builder setResources(Input<List<String>> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setResources(List<String> resources) {
            this.resources = Input.of(Objects.requireNonNull(resources));
            return this;
        }

        public Builder setVerbs(Input<List<String>> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }

        public Builder setVerbs(List<String> verbs) {
            this.verbs = Input.of(Objects.requireNonNull(verbs));
            return this;
        }

        public ResourcePolicyRuleArgs build() {
            return new ResourcePolicyRuleArgs(apiGroups, clusterScope, namespaces, resources, verbs);
        }
    }
}
