// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IngressClassParametersReference identifies an API object. This can be used to specify a cluster or namespace-scoped resource.
 * 
 */
public final class IngressClassParametersReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressClassParametersReferenceArgs Empty = new IngressClassParametersReferenceArgs();

    /**
     * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    @Import(name="apiGroup")
      private final @Nullable Output<String> apiGroup;

    public Output<String> apiGroup() {
        return this.apiGroup == null ? Codegen.empty() : this.apiGroup;
    }

    /**
     * Kind is the type of resource being referenced.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Name is the name of resource being referenced.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Namespace is the namespace of the resource being referenced. This field is required when scope is set to &#34;Namespace&#34; and must be unset when scope is set to &#34;Cluster&#34;.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace == null ? Codegen.empty() : this.namespace;
    }

    /**
     * Scope represents if this refers to a cluster or namespace scoped resource. This may be set to &#34;Cluster&#34; (default) or &#34;Namespace&#34;.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> scope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    public IngressClassParametersReferenceArgs(
        @Nullable Output<String> apiGroup,
        Output<String> kind,
        Output<String> name,
        @Nullable Output<String> namespace,
        @Nullable Output<String> scope) {
        this.apiGroup = apiGroup;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespace = namespace;
        this.scope = scope;
    }

    private IngressClassParametersReferenceArgs() {
        this.apiGroup = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.namespace = Codegen.empty();
        this.scope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressClassParametersReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiGroup;
        private Output<String> kind;
        private Output<String> name;
        private @Nullable Output<String> namespace;
        private @Nullable Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressClassParametersReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.scope = defaults.scope;
        }

        public Builder apiGroup(@Nullable Output<String> apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }
        public Builder apiGroup(@Nullable String apiGroup) {
            this.apiGroup = Codegen.ofNullable(apiGroup);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Codegen.ofNullable(namespace);
            return this;
        }
        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }        public IngressClassParametersReferenceArgs build() {
            return new IngressClassParametersReferenceArgs(apiGroup, kind, name, namespace, scope);
        }
    }
}
