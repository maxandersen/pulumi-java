// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationSecurityPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationSecurityPolicyArgs Empty = new OrganizationSecurityPolicyArgs();

    /**
     * A textual description for the organization security policy.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A textual name of the security policy.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The parent of this OrganizationSecurityPolicy in the Cloud Resource Hierarchy.
     * Format: organizations/{organization_id} or folders/{folder_id}
     * 
     */
    @Import(name="parent", required=true)
      private final Output<String> parent;

    public Output<String> parent() {
        return this.parent;
    }

    /**
     * The type indicates the intended use of the security policy.
     * For organization security policies, the only supported type
     * is &#34;FIREWALL&#34;.
     * Default value is `FIREWALL`.
     * Possible values are `FIREWALL`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public OrganizationSecurityPolicyArgs(
        @Nullable Output<String> description,
        Output<String> displayName,
        Output<String> parent,
        @Nullable Output<String> type) {
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.type = type;
    }

    private OrganizationSecurityPolicyArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.parent = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private Output<String> parent;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationSecurityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.parent = defaults.parent;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder parent(Output<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Output.of(Objects.requireNonNull(parent));
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public OrganizationSecurityPolicyArgs build() {
            return new OrganizationSecurityPolicyArgs(description, displayName, parent, type);
        }
    }
}
