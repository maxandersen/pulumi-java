// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomEntityStoreAssignmentArgs extends ResourceArgs {

    public static final CustomEntityStoreAssignmentArgs Empty = new CustomEntityStoreAssignmentArgs();

    /**
     * Name of the custom entity store assignment. Generated name is GUID.
     * 
     */
    @Import(name="customEntityStoreAssignmentName")
    private @Nullable Output<String> customEntityStoreAssignmentName;

    /**
     * @return Name of the custom entity store assignment. Generated name is GUID.
     * 
     */
    public Optional<Output<String>> customEntityStoreAssignmentName() {
        return Optional.ofNullable(this.customEntityStoreAssignmentName);
    }

    /**
     * The principal assigned with entity store. If not provided, will use caller principal. Format of principal is: [AAD type]=[PrincipalObjectId];[TenantId]
     * 
     */
    @Import(name="principal")
    private @Nullable Output<String> principal;

    /**
     * @return The principal assigned with entity store. If not provided, will use caller principal. Format of principal is: [AAD type]=[PrincipalObjectId];[TenantId]
     * 
     */
    public Optional<Output<String>> principal() {
        return Optional.ofNullable(this.principal);
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private CustomEntityStoreAssignmentArgs() {}

    private CustomEntityStoreAssignmentArgs(CustomEntityStoreAssignmentArgs $) {
        this.customEntityStoreAssignmentName = $.customEntityStoreAssignmentName;
        this.principal = $.principal;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomEntityStoreAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomEntityStoreAssignmentArgs $;

        public Builder() {
            $ = new CustomEntityStoreAssignmentArgs();
        }

        public Builder(CustomEntityStoreAssignmentArgs defaults) {
            $ = new CustomEntityStoreAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customEntityStoreAssignmentName Name of the custom entity store assignment. Generated name is GUID.
         * 
         * @return builder
         * 
         */
        public Builder customEntityStoreAssignmentName(@Nullable Output<String> customEntityStoreAssignmentName) {
            $.customEntityStoreAssignmentName = customEntityStoreAssignmentName;
            return this;
        }

        /**
         * @param customEntityStoreAssignmentName Name of the custom entity store assignment. Generated name is GUID.
         * 
         * @return builder
         * 
         */
        public Builder customEntityStoreAssignmentName(String customEntityStoreAssignmentName) {
            return customEntityStoreAssignmentName(Output.of(customEntityStoreAssignmentName));
        }

        /**
         * @param principal The principal assigned with entity store. If not provided, will use caller principal. Format of principal is: [AAD type]=[PrincipalObjectId];[TenantId]
         * 
         * @return builder
         * 
         */
        public Builder principal(@Nullable Output<String> principal) {
            $.principal = principal;
            return this;
        }

        /**
         * @param principal The principal assigned with entity store. If not provided, will use caller principal. Format of principal is: [AAD type]=[PrincipalObjectId];[TenantId]
         * 
         * @return builder
         * 
         */
        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public CustomEntityStoreAssignmentArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
