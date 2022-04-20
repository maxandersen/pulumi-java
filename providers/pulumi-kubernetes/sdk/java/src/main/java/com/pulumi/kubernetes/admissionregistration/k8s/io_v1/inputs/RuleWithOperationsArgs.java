// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.admissionregistration.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * RuleWithOperations is a tuple of Operations and Resources. It is recommended to make sure that all the tuple expansions are valid.
 * 
 */
public final class RuleWithOperationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleWithOperationsArgs Empty = new RuleWithOperationsArgs();

    /**
     * APIGroups is the API groups the resources belong to. &#39;*&#39; is all groups. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    @Import(name="apiGroups")
      private final @Nullable Output<List<String>> apiGroups;

    public Output<List<String>> apiGroups() {
        return this.apiGroups == null ? Codegen.empty() : this.apiGroups;
    }

    /**
     * APIVersions is the API versions the resources belong to. &#39;*&#39; is all versions. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    @Import(name="apiVersions")
      private final @Nullable Output<List<String>> apiVersions;

    public Output<List<String>> apiVersions() {
        return this.apiVersions == null ? Codegen.empty() : this.apiVersions;
    }

    /**
     * Operations is the operations the admission hook cares about - CREATE, UPDATE, DELETE, CONNECT or * for all of those operations and any future admission operations that are added. If &#39;*&#39; is present, the length of the slice must be one. Required.
     * 
     */
    @Import(name="operations")
      private final @Nullable Output<List<String>> operations;

    public Output<List<String>> operations() {
        return this.operations == null ? Codegen.empty() : this.operations;
    }

    /**
     * Resources is a list of resources this rule applies to.
     * 
     * For example: &#39;pods&#39; means pods. &#39;pods/log&#39; means the log subresource of pods. &#39;*&#39; means all resources, but not subresources. &#39;pods/*&#39; means all subresources of pods. &#39;*{@literal /}scale&#39; means all scale subresources. &#39;*{@literal /}*&#39; means all resources and their subresources.
     * 
     * If wildcard is present, the validation rule will ensure resources do not overlap with each other.
     * 
     * Depending on the enclosing object, subresources might not be allowed. Required.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> resources() {
        return this.resources == null ? Codegen.empty() : this.resources;
    }

    /**
     * scope specifies the scope of this rule. Valid values are &#34;Cluster&#34;, &#34;Namespaced&#34;, and &#34;*&#34; &#34;Cluster&#34; means that only cluster-scoped resources will match this rule. Namespace API objects are cluster-scoped. &#34;Namespaced&#34; means that only namespaced resources will match this rule. &#34;*&#34; means that there are no scope restrictions. Subresources match the scope of their parent resource. Default is &#34;*&#34;.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> scope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    public RuleWithOperationsArgs(
        @Nullable Output<List<String>> apiGroups,
        @Nullable Output<List<String>> apiVersions,
        @Nullable Output<List<String>> operations,
        @Nullable Output<List<String>> resources,
        @Nullable Output<String> scope) {
        this.apiGroups = apiGroups;
        this.apiVersions = apiVersions;
        this.operations = operations;
        this.resources = resources;
        this.scope = scope;
    }

    private RuleWithOperationsArgs() {
        this.apiGroups = Codegen.empty();
        this.apiVersions = Codegen.empty();
        this.operations = Codegen.empty();
        this.resources = Codegen.empty();
        this.scope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleWithOperationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> apiGroups;
        private @Nullable Output<List<String>> apiVersions;
        private @Nullable Output<List<String>> operations;
        private @Nullable Output<List<String>> resources;
        private @Nullable Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleWithOperationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.apiVersions = defaults.apiVersions;
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
    	      this.scope = defaults.scope;
        }

        public Builder apiGroups(@Nullable Output<List<String>> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }
        public Builder apiGroups(@Nullable List<String> apiGroups) {
            this.apiGroups = Codegen.ofNullable(apiGroups);
            return this;
        }
        public Builder apiGroups(String... apiGroups) {
            return apiGroups(List.of(apiGroups));
        }
        public Builder apiVersions(@Nullable Output<List<String>> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }
        public Builder apiVersions(@Nullable List<String> apiVersions) {
            this.apiVersions = Codegen.ofNullable(apiVersions);
            return this;
        }
        public Builder apiVersions(String... apiVersions) {
            return apiVersions(List.of(apiVersions));
        }
        public Builder operations(@Nullable Output<List<String>> operations) {
            this.operations = operations;
            return this;
        }
        public Builder operations(@Nullable List<String> operations) {
            this.operations = Codegen.ofNullable(operations);
            return this;
        }
        public Builder operations(String... operations) {
            return operations(List.of(operations));
        }
        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = Codegen.ofNullable(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }        public RuleWithOperationsArgs build() {
            return new RuleWithOperationsArgs(apiGroups, apiVersions, operations, resources, scope);
        }
    }
}
