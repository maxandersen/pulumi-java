// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.RouteNextHopType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Route resource.
 * 
 */
public final class RouteArgs extends ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * The destination CIDR to which the route applies.
     * 
     */
    @Import(name="addressPrefix")
    private @Nullable Output<String> addressPrefix;

    /**
     * @return The destination CIDR to which the route applies.
     * 
     */
    public Optional<Output<String>> addressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }

    /**
     * A value indicating whether this route overrides overlapping BGP routes regardless of LPM.
     * 
     */
    @Import(name="hasBgpOverride")
    private @Nullable Output<Boolean> hasBgpOverride;

    /**
     * @return A value indicating whether this route overrides overlapping BGP routes regardless of LPM.
     * 
     */
    public Optional<Output<Boolean>> hasBgpOverride() {
        return Optional.ofNullable(this.hasBgpOverride);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance.
     * 
     */
    @Import(name="nextHopIpAddress")
    private @Nullable Output<String> nextHopIpAddress;

    /**
     * @return The IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance.
     * 
     */
    public Optional<Output<String>> nextHopIpAddress() {
        return Optional.ofNullable(this.nextHopIpAddress);
    }

    /**
     * The type of Azure hop the packet should be sent to.
     * 
     */
    @Import(name="nextHopType", required=true)
    private Output<Either<String,RouteNextHopType>> nextHopType;

    /**
     * @return The type of Azure hop the packet should be sent to.
     * 
     */
    public Output<Either<String,RouteNextHopType>> nextHopType() {
        return this.nextHopType;
    }

    /**
     * The type of the resource.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private RouteArgs() {}

    private RouteArgs(RouteArgs $) {
        this.addressPrefix = $.addressPrefix;
        this.hasBgpOverride = $.hasBgpOverride;
        this.id = $.id;
        this.name = $.name;
        this.nextHopIpAddress = $.nextHopIpAddress;
        this.nextHopType = $.nextHopType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteArgs $;

        public Builder() {
            $ = new RouteArgs();
        }

        public Builder(RouteArgs defaults) {
            $ = new RouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefix The destination CIDR to which the route applies.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefix(@Nullable Output<String> addressPrefix) {
            $.addressPrefix = addressPrefix;
            return this;
        }

        /**
         * @param addressPrefix The destination CIDR to which the route applies.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefix(String addressPrefix) {
            return addressPrefix(Output.of(addressPrefix));
        }

        /**
         * @param hasBgpOverride A value indicating whether this route overrides overlapping BGP routes regardless of LPM.
         * 
         * @return builder
         * 
         */
        public Builder hasBgpOverride(@Nullable Output<Boolean> hasBgpOverride) {
            $.hasBgpOverride = hasBgpOverride;
            return this;
        }

        /**
         * @param hasBgpOverride A value indicating whether this route overrides overlapping BGP routes regardless of LPM.
         * 
         * @return builder
         * 
         */
        public Builder hasBgpOverride(Boolean hasBgpOverride) {
            return hasBgpOverride(Output.of(hasBgpOverride));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nextHopIpAddress The IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIpAddress(@Nullable Output<String> nextHopIpAddress) {
            $.nextHopIpAddress = nextHopIpAddress;
            return this;
        }

        /**
         * @param nextHopIpAddress The IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance.
         * 
         * @return builder
         * 
         */
        public Builder nextHopIpAddress(String nextHopIpAddress) {
            return nextHopIpAddress(Output.of(nextHopIpAddress));
        }

        /**
         * @param nextHopType The type of Azure hop the packet should be sent to.
         * 
         * @return builder
         * 
         */
        public Builder nextHopType(Output<Either<String,RouteNextHopType>> nextHopType) {
            $.nextHopType = nextHopType;
            return this;
        }

        /**
         * @param nextHopType The type of Azure hop the packet should be sent to.
         * 
         * @return builder
         * 
         */
        public Builder nextHopType(Either<String,RouteNextHopType> nextHopType) {
            return nextHopType(Output.of(nextHopType));
        }

        /**
         * @param nextHopType The type of Azure hop the packet should be sent to.
         * 
         * @return builder
         * 
         */
        public Builder nextHopType(String nextHopType) {
            return nextHopType(Either.ofLeft(nextHopType));
        }

        /**
         * @param nextHopType The type of Azure hop the packet should be sent to.
         * 
         * @return builder
         * 
         */
        public Builder nextHopType(RouteNextHopType nextHopType) {
            return nextHopType(Either.ofRight(nextHopType));
        }

        /**
         * @param type The type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RouteArgs build() {
            $.nextHopType = Objects.requireNonNull($.nextHopType, "expected parameter 'nextHopType' to be non-null");
            return $;
        }
    }

}
