// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.enums.PrivateEndpointServiceConnectionStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A collection of information about the state of the connection between service consumer and provider.
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    @Import(name="actionsRequired")
    private @Nullable Output<String> actionsRequired;

    /**
     * @return A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    public Optional<Output<String>> actionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }

    /**
     * The reason for approval/rejection of the connection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The reason for approval/rejection of the connection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,PrivateEndpointServiceConnectionStatus>> status;

    /**
     * @return Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
     * 
     */
    public Optional<Output<Either<String,PrivateEndpointServiceConnectionStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    private PrivateLinkServiceConnectionStateArgs() {}

    private PrivateLinkServiceConnectionStateArgs(PrivateLinkServiceConnectionStateArgs $) {
        this.actionsRequired = $.actionsRequired;
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceConnectionStateArgs $;

        public Builder() {
            $ = new PrivateLinkServiceConnectionStateArgs();
        }

        public Builder(PrivateLinkServiceConnectionStateArgs defaults) {
            $ = new PrivateLinkServiceConnectionStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionsRequired A message indicating if changes on the service provider require any updates on the consumer.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(@Nullable Output<String> actionsRequired) {
            $.actionsRequired = actionsRequired;
            return this;
        }

        /**
         * @param actionsRequired A message indicating if changes on the service provider require any updates on the consumer.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(String actionsRequired) {
            return actionsRequired(Output.of(actionsRequired));
        }

        /**
         * @param description The reason for approval/rejection of the connection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The reason for approval/rejection of the connection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param status Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Either<String,PrivateEndpointServiceConnectionStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,PrivateEndpointServiceConnectionStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status Indicates whether the connection has been Approved/Rejected/Removed by the owner of the service.
         * 
         * @return builder
         * 
         */
        public Builder status(PrivateEndpointServiceConnectionStatus status) {
            return status(Either.ofRight(status));
        }

        public PrivateLinkServiceConnectionStateArgs build() {
            return $;
        }
    }

}
