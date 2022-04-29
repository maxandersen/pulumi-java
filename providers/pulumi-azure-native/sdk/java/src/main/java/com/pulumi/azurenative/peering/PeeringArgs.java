// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering;

import com.pulumi.azurenative.peering.enums.Kind;
import com.pulumi.azurenative.peering.inputs.PeeringPropertiesDirectArgs;
import com.pulumi.azurenative.peering.inputs.PeeringPropertiesExchangeArgs;
import com.pulumi.azurenative.peering.inputs.PeeringSkuArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PeeringArgs extends ResourceArgs {

    public static final PeeringArgs Empty = new PeeringArgs();

    /**
     * The properties that define a direct peering.
     * 
     */
    @Import(name="direct")
    private @Nullable Output<PeeringPropertiesDirectArgs> direct;

    /**
     * @return The properties that define a direct peering.
     * 
     */
    public Optional<Output<PeeringPropertiesDirectArgs>> direct() {
        return Optional.ofNullable(this.direct);
    }

    /**
     * The properties that define an exchange peering.
     * 
     */
    @Import(name="exchange")
    private @Nullable Output<PeeringPropertiesExchangeArgs> exchange;

    /**
     * @return The properties that define an exchange peering.
     * 
     */
    public Optional<Output<PeeringPropertiesExchangeArgs>> exchange() {
        return Optional.ofNullable(this.exchange);
    }

    /**
     * The kind of the peering.
     * 
     */
    @Import(name="kind", required=true)
    private Output<Either<String,Kind>> kind;

    /**
     * @return The kind of the peering.
     * 
     */
    public Output<Either<String,Kind>> kind() {
        return this.kind;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The location of the peering.
     * 
     */
    @Import(name="peeringLocation")
    private @Nullable Output<String> peeringLocation;

    /**
     * @return The location of the peering.
     * 
     */
    public Optional<Output<String>> peeringLocation() {
        return Optional.ofNullable(this.peeringLocation);
    }

    /**
     * The name of the peering.
     * 
     */
    @Import(name="peeringName")
    private @Nullable Output<String> peeringName;

    /**
     * @return The name of the peering.
     * 
     */
    public Optional<Output<String>> peeringName() {
        return Optional.ofNullable(this.peeringName);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU that defines the tier and kind of the peering.
     * 
     */
    @Import(name="sku", required=true)
    private Output<PeeringSkuArgs> sku;

    /**
     * @return The SKU that defines the tier and kind of the peering.
     * 
     */
    public Output<PeeringSkuArgs> sku() {
        return this.sku;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PeeringArgs() {}

    private PeeringArgs(PeeringArgs $) {
        this.direct = $.direct;
        this.exchange = $.exchange;
        this.kind = $.kind;
        this.location = $.location;
        this.peeringLocation = $.peeringLocation;
        this.peeringName = $.peeringName;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeeringArgs $;

        public Builder() {
            $ = new PeeringArgs();
        }

        public Builder(PeeringArgs defaults) {
            $ = new PeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param direct The properties that define a direct peering.
         * 
         * @return builder
         * 
         */
        public Builder direct(@Nullable Output<PeeringPropertiesDirectArgs> direct) {
            $.direct = direct;
            return this;
        }

        /**
         * @param direct The properties that define a direct peering.
         * 
         * @return builder
         * 
         */
        public Builder direct(PeeringPropertiesDirectArgs direct) {
            return direct(Output.of(direct));
        }

        /**
         * @param exchange The properties that define an exchange peering.
         * 
         * @return builder
         * 
         */
        public Builder exchange(@Nullable Output<PeeringPropertiesExchangeArgs> exchange) {
            $.exchange = exchange;
            return this;
        }

        /**
         * @param exchange The properties that define an exchange peering.
         * 
         * @return builder
         * 
         */
        public Builder exchange(PeeringPropertiesExchangeArgs exchange) {
            return exchange(Output.of(exchange));
        }

        /**
         * @param kind The kind of the peering.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<Either<String,Kind>> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the peering.
         * 
         * @return builder
         * 
         */
        public Builder kind(Either<String,Kind> kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param kind The kind of the peering.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Either.ofLeft(kind));
        }

        /**
         * @param kind The kind of the peering.
         * 
         * @return builder
         * 
         */
        public Builder kind(Kind kind) {
            return kind(Either.ofRight(kind));
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param peeringLocation The location of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringLocation(@Nullable Output<String> peeringLocation) {
            $.peeringLocation = peeringLocation;
            return this;
        }

        /**
         * @param peeringLocation The location of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringLocation(String peeringLocation) {
            return peeringLocation(Output.of(peeringLocation));
        }

        /**
         * @param peeringName The name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(@Nullable Output<String> peeringName) {
            $.peeringName = peeringName;
            return this;
        }

        /**
         * @param peeringName The name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(String peeringName) {
            return peeringName(Output.of(peeringName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku The SKU that defines the tier and kind of the peering.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<PeeringSkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU that defines the tier and kind of the peering.
         * 
         * @return builder
         * 
         */
        public Builder sku(PeeringSkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PeeringArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
