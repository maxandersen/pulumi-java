// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicyRule {
    /**
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
     * 
     */
    private final @Nullable List<String> apiGroups;
    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * 
     */
    private final @Nullable List<String> nonResourceURLs;
    /**
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * 
     */
    private final @Nullable List<String> resourceNames;
    /**
     * Resources is a list of resources this rule applies to. '*' represents all resources.
     * 
     */
    private final @Nullable List<String> resources;
    /**
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
     * 
     */
    private final List<String> verbs;

    @OutputCustomType.Constructor({"apiGroups","nonResourceURLs","resourceNames","resources","verbs"})
    private PolicyRule(
        @Nullable List<String> apiGroups,
        @Nullable List<String> nonResourceURLs,
        @Nullable List<String> resourceNames,
        @Nullable List<String> resources,
        List<String> verbs) {
        this.apiGroups = apiGroups;
        this.nonResourceURLs = nonResourceURLs;
        this.resourceNames = resourceNames;
        this.resources = resources;
        this.verbs = Objects.requireNonNull(verbs);
    }

    /**
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
     * 
     */
    public List<String> getApiGroups() {
        return this.apiGroups == null ? List.of() : this.apiGroups;
    }
    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * 
     */
    public List<String> getNonResourceURLs() {
        return this.nonResourceURLs == null ? List.of() : this.nonResourceURLs;
    }
    /**
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * 
     */
    public List<String> getResourceNames() {
        return this.resourceNames == null ? List.of() : this.resourceNames;
    }
    /**
     * Resources is a list of resources this rule applies to. '*' represents all resources.
     * 
     */
    public List<String> getResources() {
        return this.resources == null ? List.of() : this.resources;
    }
    /**
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
     * 
     */
    public List<String> getVerbs() {
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

        public Builder setApiGroups(@Nullable List<String> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }

        public Builder setNonResourceURLs(@Nullable List<String> nonResourceURLs) {
            this.nonResourceURLs = nonResourceURLs;
            return this;
        }

        public Builder setResourceNames(@Nullable List<String> resourceNames) {
            this.resourceNames = resourceNames;
            return this;
        }

        public Builder setResources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setVerbs(List<String> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }

        public PolicyRule build() {
            return new PolicyRule(apiGroups, nonResourceURLs, resourceNames, resources, verbs);
        }
    }
}
