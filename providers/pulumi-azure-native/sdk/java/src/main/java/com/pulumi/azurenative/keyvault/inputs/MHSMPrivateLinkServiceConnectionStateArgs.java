// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.azurenative.keyvault.enums.ActionsRequired;
import com.pulumi.azurenative.keyvault.enums.PrivateEndpointServiceConnectionStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that represents the approval state of the private link connection.
 * 
 */
public final class MHSMPrivateLinkServiceConnectionStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final MHSMPrivateLinkServiceConnectionStateArgs Empty = new MHSMPrivateLinkServiceConnectionStateArgs();

    /**
     * A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    @Import(name="actionsRequired")
    private @Nullable Output<Either<String,ActionsRequired>> actionsRequired;

    /**
     * @return A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    public Optional<Output<Either<String,ActionsRequired>>> actionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }

    /**
     * The reason for approval or rejection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The reason for approval or rejection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Indicates whether the connection has been approved, rejected or removed by the key vault owner.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,PrivateEndpointServiceConnectionStatus>> status;

    /**
     * @return Indicates whether the connection has been approved, rejected or removed by the key vault owner.
     * 
     */
    public Optional<Output<Either<String,PrivateEndpointServiceConnectionStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    private MHSMPrivateLinkServiceConnectionStateArgs() {}

    private MHSMPrivateLinkServiceConnectionStateArgs(MHSMPrivateLinkServiceConnectionStateArgs $) {
        this.actionsRequired = $.actionsRequired;
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MHSMPrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MHSMPrivateLinkServiceConnectionStateArgs $;

        public Builder() {
            $ = new MHSMPrivateLinkServiceConnectionStateArgs();
        }

        public Builder(MHSMPrivateLinkServiceConnectionStateArgs defaults) {
            $ = new MHSMPrivateLinkServiceConnectionStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionsRequired A message indicating if changes on the service provider require any updates on the consumer.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(@Nullable Output<Either<String,ActionsRequired>> actionsRequired) {
            $.actionsRequired = actionsRequired;
            return this;
        }

        /**
         * @param actionsRequired A message indicating if changes on the service provider require any updates on the consumer.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(Either<String,ActionsRequired> actionsRequired) {
            return actionsRequired(Output.of(actionsRequired));
        }

        /**
         * @param actionsRequired A message indicating if changes on the service provider require any updates on the consumer.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(String actionsRequired) {
            return actionsRequired(Either.ofLeft(actionsRequired));
        }

        /**
         * @param actionsRequired A message indicating if changes on the service provider require any updates on the consumer.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(ActionsRequired actionsRequired) {
            return actionsRequired(Either.ofRight(actionsRequired));
        }

        /**
         * @param description The reason for approval or rejection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The reason for approval or rejection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param status Indicates whether the connection has been approved, rejected or removed by the key vault owner.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Either<String,PrivateEndpointServiceConnectionStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Indicates whether the connection has been approved, rejected or removed by the key vault owner.
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,PrivateEndpointServiceConnectionStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status Indicates whether the connection has been approved, rejected or removed by the key vault owner.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status Indicates whether the connection has been approved, rejected or removed by the key vault owner.
         * 
         * @return builder
         * 
         */
        public Builder status(PrivateEndpointServiceConnectionStatus status) {
            return status(Either.ofRight(status));
        }

        public MHSMPrivateLinkServiceConnectionStateArgs build() {
            return $;
        }
    }

}
