// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationSecurityPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationSecurityPolicyArgs Empty = new OrganizationSecurityPolicyArgs();

    /**
     * A textual description for the organization security policy.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A textual name of the security policy.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The parent of this OrganizationSecurityPolicy in the Cloud Resource Hierarchy.
     * Format: organizations/{organization_id} or folders/{folder_id}
     * 
     */
    @Import(name="parent", required=true)
    private Output<String> parent;

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
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private OrganizationSecurityPolicyArgs() {}

    private OrganizationSecurityPolicyArgs(OrganizationSecurityPolicyArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.parent = $.parent;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationSecurityPolicyArgs $;

        public Builder() {
            $ = new OrganizationSecurityPolicyArgs();
        }

        public Builder(OrganizationSecurityPolicyArgs defaults) {
            $ = new OrganizationSecurityPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder parent(Output<String> parent) {
            $.parent = parent;
            return this;
        }

        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public OrganizationSecurityPolicyArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.parent = Objects.requireNonNull($.parent, "expected parameter 'parent' to be non-null");
            return $;
        }
    }

}
