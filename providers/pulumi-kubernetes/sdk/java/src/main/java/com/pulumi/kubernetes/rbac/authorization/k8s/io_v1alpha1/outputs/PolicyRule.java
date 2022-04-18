// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.authorization.k8s.io_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PolicyRule {
    /**
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
     * 
     */
    private final @Nullable List<String> apiGroups;
    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path This name is intentionally different than the internal type so that the DefaultConvert works nicely and because the ordering may be different. Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * 
     */
    private final @Nullable List<String> nonResourceURLs;
    /**
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * 
     */
    private final @Nullable List<String> resourceNames;
    /**
     * Resources is a list of resources this rule applies to.  ResourceAll represents all resources.
     * 
     */
    private final @Nullable List<String> resources;
    /**
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
     * 
     */
    private final List<String> verbs;

    @CustomType.Constructor
    private PolicyRule(
        @CustomType.Parameter("apiGroups") @Nullable List<String> apiGroups,
        @CustomType.Parameter("nonResourceURLs") @Nullable List<String> nonResourceURLs,
        @CustomType.Parameter("resourceNames") @Nullable List<String> resourceNames,
        @CustomType.Parameter("resources") @Nullable List<String> resources,
        @CustomType.Parameter("verbs") List<String> verbs) {
        this.apiGroups = apiGroups;
        this.nonResourceURLs = nonResourceURLs;
        this.resourceNames = resourceNames;
        this.resources = resources;
        this.verbs = verbs;
    }

    /**
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
     * 
    */
    public List<String> apiGroups() {
        return this.apiGroups == null ? List.of() : this.apiGroups;
    }
    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path This name is intentionally different than the internal type so that the DefaultConvert works nicely and because the ordering may be different. Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * 
    */
    public List<String> nonResourceURLs() {
        return this.nonResourceURLs == null ? List.of() : this.nonResourceURLs;
    }
    /**
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * 
    */
    public List<String> resourceNames() {
        return this.resourceNames == null ? List.of() : this.resourceNames;
    }
    /**
     * Resources is a list of resources this rule applies to.  ResourceAll represents all resources.
     * 
    */
    public List<String> resources() {
        return this.resources == null ? List.of() : this.resources;
    }
    /**
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
     * 
    */
    public List<String> verbs() {
        return this.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> apiGroups;
        private @Nullable List<String> nonResourceURLs;
        private @Nullable List<String> resourceNames;
        private @Nullable List<String> resources;
        private List<String> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.nonResourceURLs = defaults.nonResourceURLs;
    	      this.resourceNames = defaults.resourceNames;
    	      this.resources = defaults.resources;
    	      this.verbs = defaults.verbs;
        }

        public Builder apiGroups(@Nullable List<String> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }
        public Builder apiGroups(String... apiGroups) {
            return apiGroups(List.of(apiGroups));
        }
        public Builder nonResourceURLs(@Nullable List<String> nonResourceURLs) {
            this.nonResourceURLs = nonResourceURLs;
            return this;
        }
        public Builder nonResourceURLs(String... nonResourceURLs) {
            return nonResourceURLs(List.of(nonResourceURLs));
        }
        public Builder resourceNames(@Nullable List<String> resourceNames) {
            this.resourceNames = resourceNames;
            return this;
        }
        public Builder resourceNames(String... resourceNames) {
            return resourceNames(List.of(resourceNames));
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public Builder verbs(List<String> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }
        public Builder verbs(String... verbs) {
            return verbs(List.of(verbs));
        }        public PolicyRule build() {
            return new PolicyRule(apiGroups, nonResourceURLs, resourceNames, resources, verbs);
        }
    }
}
