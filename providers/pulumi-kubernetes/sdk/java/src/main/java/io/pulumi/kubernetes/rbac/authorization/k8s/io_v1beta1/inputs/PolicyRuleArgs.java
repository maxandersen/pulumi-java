// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyRuleArgs Empty = new PolicyRuleArgs();

    @InputImport(name="apiGroups")
    private final @Nullable Input<List<String>> apiGroups;

    public Input<List<String>> getApiGroups() {
        return this.apiGroups == null ? Input.empty() : this.apiGroups;
    }

    @InputImport(name="nonResourceURLs")
    private final @Nullable Input<List<String>> nonResourceURLs;

    public Input<List<String>> getNonResourceURLs() {
        return this.nonResourceURLs == null ? Input.empty() : this.nonResourceURLs;
    }

    @InputImport(name="resourceNames")
    private final @Nullable Input<List<String>> resourceNames;

    public Input<List<String>> getResourceNames() {
        return this.resourceNames == null ? Input.empty() : this.resourceNames;
    }

    @InputImport(name="resources")
    private final @Nullable Input<List<String>> resources;

    public Input<List<String>> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    @InputImport(name="verbs", required=true)
    private final Input<List<String>> verbs;

    public Input<List<String>> getVerbs() {
        return this.verbs;
    }

    public PolicyRuleArgs(
        @Nullable Input<List<String>> apiGroups,
        @Nullable Input<List<String>> nonResourceURLs,
        @Nullable Input<List<String>> resourceNames,
        @Nullable Input<List<String>> resources,
        Input<List<String>> verbs) {
        this.apiGroups = apiGroups;
        this.nonResourceURLs = nonResourceURLs;
        this.resourceNames = resourceNames;
        this.resources = resources;
        this.verbs = Objects.requireNonNull(verbs, "expected parameter 'verbs' to be non-null");
    }

    private PolicyRuleArgs() {
        this.apiGroups = Input.empty();
        this.nonResourceURLs = Input.empty();
        this.resourceNames = Input.empty();
        this.resources = Input.empty();
        this.verbs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> apiGroups;
        private @Nullable Input<List<String>> nonResourceURLs;
        private @Nullable Input<List<String>> resourceNames;
        private @Nullable Input<List<String>> resources;
        private Input<List<String>> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.nonResourceURLs = defaults.nonResourceURLs;
    	      this.resourceNames = defaults.resourceNames;
    	      this.resources = defaults.resources;
    	      this.verbs = defaults.verbs;
        }

        public Builder setApiGroups(@Nullable Input<List<String>> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }

        public Builder setApiGroups(@Nullable List<String> apiGroups) {
            this.apiGroups = Input.ofNullable(apiGroups);
            return this;
        }

        public Builder setNonResourceURLs(@Nullable Input<List<String>> nonResourceURLs) {
            this.nonResourceURLs = nonResourceURLs;
            return this;
        }

        public Builder setNonResourceURLs(@Nullable List<String> nonResourceURLs) {
            this.nonResourceURLs = Input.ofNullable(nonResourceURLs);
            return this;
        }

        public Builder setResourceNames(@Nullable Input<List<String>> resourceNames) {
            this.resourceNames = resourceNames;
            return this;
        }

        public Builder setResourceNames(@Nullable List<String> resourceNames) {
            this.resourceNames = Input.ofNullable(resourceNames);
            return this;
        }

        public Builder setResources(@Nullable Input<List<String>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setResources(@Nullable List<String> resources) {
            this.resources = Input.ofNullable(resources);
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

        public PolicyRuleArgs build() {
            return new PolicyRuleArgs(apiGroups, nonResourceURLs, resourceNames, resources, verbs);
        }
    }
}
