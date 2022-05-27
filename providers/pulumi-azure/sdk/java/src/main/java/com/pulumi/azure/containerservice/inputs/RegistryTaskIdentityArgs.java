// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryTaskIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryTaskIdentityArgs Empty = new RegistryTaskIdentityArgs();

    /**
     * Specifies a list of User Assigned Managed Identity IDs to be assigned to this Container Registry Task.
     * 
     */
    @Import(name="identityIds")
    private @Nullable Output<List<String>> identityIds;

    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this Container Registry Task.
     * 
     */
    public Optional<Output<List<String>>> identityIds() {
        return Optional.ofNullable(this.identityIds);
    }

    /**
     * The Principal ID associated with this Managed Service Identity.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The Principal ID associated with this Managed Service Identity.
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * The Tenant ID associated with this Managed Service Identity.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Tenant ID associated with this Managed Service Identity.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Specifies the type of Managed Service Identity that should be configured on this Container Registry Task. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Container Registry Task. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private RegistryTaskIdentityArgs() {}

    private RegistryTaskIdentityArgs(RegistryTaskIdentityArgs $) {
        this.identityIds = $.identityIds;
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryTaskIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryTaskIdentityArgs $;

        public Builder() {
            $ = new RegistryTaskIdentityArgs();
        }

        public Builder(RegistryTaskIdentityArgs defaults) {
            $ = new RegistryTaskIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this Container Registry Task.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(@Nullable Output<List<String>> identityIds) {
            $.identityIds = identityIds;
            return this;
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this Container Registry Task.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(List<String> identityIds) {
            return identityIds(Output.of(identityIds));
        }

        /**
         * @param identityIds Specifies a list of User Assigned Managed Identity IDs to be assigned to this Container Registry Task.
         * 
         * @return builder
         * 
         */
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }

        /**
         * @param principalId The Principal ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The Principal ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId The Tenant ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Tenant ID associated with this Managed Service Identity.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this Container Registry Task. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of Managed Service Identity that should be configured on this Container Registry Task. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RegistryTaskIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
