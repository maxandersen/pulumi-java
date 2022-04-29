// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights;

import com.pulumi.azurenative.timeseriesinsights.enums.AccessPolicyRole;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPolicyArgs extends ResourceArgs {

    public static final AccessPolicyArgs Empty = new AccessPolicyArgs();

    /**
     * Name of the access policy.
     * 
     */
    @Import(name="accessPolicyName")
    private @Nullable Output<String> accessPolicyName;

    /**
     * @return Name of the access policy.
     * 
     */
    public Optional<Output<String>> accessPolicyName() {
        return Optional.ofNullable(this.accessPolicyName);
    }

    /**
     * An description of the access policy.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An description of the access policy.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @Import(name="environmentName", required=true)
    private Output<String> environmentName;

    /**
     * @return The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    public Output<String> environmentName() {
        return this.environmentName;
    }

    /**
     * The objectId of the principal in Azure Active Directory.
     * 
     */
    @Import(name="principalObjectId")
    private @Nullable Output<String> principalObjectId;

    /**
     * @return The objectId of the principal in Azure Active Directory.
     * 
     */
    public Optional<Output<String>> principalObjectId() {
        return Optional.ofNullable(this.principalObjectId);
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The list of roles the principal is assigned on the environment.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<Either<String,AccessPolicyRole>>> roles;

    /**
     * @return The list of roles the principal is assigned on the environment.
     * 
     */
    public Optional<Output<List<Either<String,AccessPolicyRole>>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    private AccessPolicyArgs() {}

    private AccessPolicyArgs(AccessPolicyArgs $) {
        this.accessPolicyName = $.accessPolicyName;
        this.description = $.description;
        this.environmentName = $.environmentName;
        this.principalObjectId = $.principalObjectId;
        this.resourceGroupName = $.resourceGroupName;
        this.roles = $.roles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyArgs $;

        public Builder() {
            $ = new AccessPolicyArgs();
        }

        public Builder(AccessPolicyArgs defaults) {
            $ = new AccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicyName Name of the access policy.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyName(@Nullable Output<String> accessPolicyName) {
            $.accessPolicyName = accessPolicyName;
            return this;
        }

        /**
         * @param accessPolicyName Name of the access policy.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicyName(String accessPolicyName) {
            return accessPolicyName(Output.of(accessPolicyName));
        }

        /**
         * @param description An description of the access policy.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An description of the access policy.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(Output<String> environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        /**
         * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(String environmentName) {
            return environmentName(Output.of(environmentName));
        }

        /**
         * @param principalObjectId The objectId of the principal in Azure Active Directory.
         * 
         * @return builder
         * 
         */
        public Builder principalObjectId(@Nullable Output<String> principalObjectId) {
            $.principalObjectId = principalObjectId;
            return this;
        }

        /**
         * @param principalObjectId The objectId of the principal in Azure Active Directory.
         * 
         * @return builder
         * 
         */
        public Builder principalObjectId(String principalObjectId) {
            return principalObjectId(Output.of(principalObjectId));
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param roles The list of roles the principal is assigned on the environment.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<Either<String,AccessPolicyRole>>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles The list of roles the principal is assigned on the environment.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<Either<String,AccessPolicyRole>> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles The list of roles the principal is assigned on the environment.
         * 
         * @return builder
         * 
         */
        public Builder roles(Either<String,AccessPolicyRole>... roles) {
            return roles(List.of(roles));
        }

        public AccessPolicyArgs build() {
            $.environmentName = Objects.requireNonNull($.environmentName, "expected parameter 'environmentName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
