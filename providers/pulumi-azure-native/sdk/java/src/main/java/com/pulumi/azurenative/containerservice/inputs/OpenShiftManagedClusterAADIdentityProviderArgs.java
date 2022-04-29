// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the Identity provider for MS AAD.
 * 
 */
public final class OpenShiftManagedClusterAADIdentityProviderArgs extends ResourceArgs {

    public static final OpenShiftManagedClusterAADIdentityProviderArgs Empty = new OpenShiftManagedClusterAADIdentityProviderArgs();

    /**
     * The clientId password associated with the provider.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The clientId password associated with the provider.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The groupId to be granted cluster admin role.
     * 
     */
    @Import(name="customerAdminGroupId")
    private @Nullable Output<String> customerAdminGroupId;

    /**
     * @return The groupId to be granted cluster admin role.
     * 
     */
    public Optional<Output<String>> customerAdminGroupId() {
        return Optional.ofNullable(this.customerAdminGroupId);
    }

    /**
     * The kind of the provider.
     * Expected value is &#39;AADIdentityProvider&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return The kind of the provider.
     * Expected value is &#39;AADIdentityProvider&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The secret password associated with the provider.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return The secret password associated with the provider.
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * The tenantId associated with the provider.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The tenantId associated with the provider.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private OpenShiftManagedClusterAADIdentityProviderArgs() {}

    private OpenShiftManagedClusterAADIdentityProviderArgs(OpenShiftManagedClusterAADIdentityProviderArgs $) {
        this.clientId = $.clientId;
        this.customerAdminGroupId = $.customerAdminGroupId;
        this.kind = $.kind;
        this.secret = $.secret;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenShiftManagedClusterAADIdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenShiftManagedClusterAADIdentityProviderArgs $;

        public Builder() {
            $ = new OpenShiftManagedClusterAADIdentityProviderArgs();
        }

        public Builder(OpenShiftManagedClusterAADIdentityProviderArgs defaults) {
            $ = new OpenShiftManagedClusterAADIdentityProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The clientId password associated with the provider.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The clientId password associated with the provider.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param customerAdminGroupId The groupId to be granted cluster admin role.
         * 
         * @return builder
         * 
         */
        public Builder customerAdminGroupId(@Nullable Output<String> customerAdminGroupId) {
            $.customerAdminGroupId = customerAdminGroupId;
            return this;
        }

        /**
         * @param customerAdminGroupId The groupId to be granted cluster admin role.
         * 
         * @return builder
         * 
         */
        public Builder customerAdminGroupId(String customerAdminGroupId) {
            return customerAdminGroupId(Output.of(customerAdminGroupId));
        }

        /**
         * @param kind The kind of the provider.
         * Expected value is &#39;AADIdentityProvider&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the provider.
         * Expected value is &#39;AADIdentityProvider&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param secret The secret password associated with the provider.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The secret password associated with the provider.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param tenantId The tenantId associated with the provider.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenantId associated with the provider.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public OpenShiftManagedClusterAADIdentityProviderArgs build() {
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            return $;
        }
    }

}
