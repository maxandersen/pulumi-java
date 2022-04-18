// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import com.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.inputs.PolicyRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 Role, and will no longer be served in v1.20.
 * 
 */
public final class RoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleArgs Empty = new RoleArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> apiVersion() {
        return this.apiVersion == null ? Codegen.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Standard object's metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Rules holds all the PolicyRules for this Role
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<PolicyRuleArgs>> rules;

    public Output<List<PolicyRuleArgs>> rules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    public RoleArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<List<PolicyRuleArgs>> rules) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.rules = rules;
    }

    private RoleArgs() {
        this.apiVersion = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<List<PolicyRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.rules = defaults.rules;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Codegen.ofNullable(apiVersion);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder rules(@Nullable Output<List<PolicyRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<PolicyRuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(PolicyRuleArgs... rules) {
            return rules(List.of(rules));
        }        public RoleArgs build() {
            return new RoleArgs(apiVersion, kind, metadata, rules);
        }
    }
}
