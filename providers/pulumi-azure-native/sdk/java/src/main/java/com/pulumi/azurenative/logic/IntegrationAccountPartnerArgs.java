// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic;

import com.pulumi.azurenative.logic.enums.PartnerType;
import com.pulumi.azurenative.logic.inputs.PartnerContentArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountPartnerArgs extends ResourceArgs {

    public static final IntegrationAccountPartnerArgs Empty = new IntegrationAccountPartnerArgs();

    /**
     * The partner content.
     * 
     */
    @Import(name="content", required=true)
    private Output<PartnerContentArgs> content;

    /**
     * @return The partner content.
     * 
     */
    public Output<PartnerContentArgs> content() {
        return this.content;
    }

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
    private Output<String> integrationAccountName;

    /**
     * @return The integration account name.
     * 
     */
    public Output<String> integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Object> metadata;

    /**
     * @return The metadata.
     * 
     */
    public Optional<Output<Object>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The integration account partner name.
     * 
     */
    @Import(name="partnerName")
    private @Nullable Output<String> partnerName;

    /**
     * @return The integration account partner name.
     * 
     */
    public Optional<Output<String>> partnerName() {
        return Optional.ofNullable(this.partnerName);
    }

    /**
     * The partner type.
     * 
     */
    @Import(name="partnerType", required=true)
    private Output<Either<String,PartnerType>> partnerType;

    /**
     * @return The partner type.
     * 
     */
    public Output<Either<String,PartnerType>> partnerType() {
        return this.partnerType;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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

    private IntegrationAccountPartnerArgs() {}

    private IntegrationAccountPartnerArgs(IntegrationAccountPartnerArgs $) {
        this.content = $.content;
        this.integrationAccountName = $.integrationAccountName;
        this.location = $.location;
        this.metadata = $.metadata;
        this.partnerName = $.partnerName;
        this.partnerType = $.partnerType;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountPartnerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountPartnerArgs $;

        public Builder() {
            $ = new IntegrationAccountPartnerArgs();
        }

        public Builder(IntegrationAccountPartnerArgs defaults) {
            $ = new IntegrationAccountPartnerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The partner content.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<PartnerContentArgs> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The partner content.
         * 
         * @return builder
         * 
         */
        public Builder content(PartnerContentArgs content) {
            return content(Output.of(content));
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(Output<String> integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        /**
         * @param integrationAccountName The integration account name.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            return integrationAccountName(Output.of(integrationAccountName));
        }

        /**
         * @param location The resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metadata The metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Object> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The metadata.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Object metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param partnerName The integration account partner name.
         * 
         * @return builder
         * 
         */
        public Builder partnerName(@Nullable Output<String> partnerName) {
            $.partnerName = partnerName;
            return this;
        }

        /**
         * @param partnerName The integration account partner name.
         * 
         * @return builder
         * 
         */
        public Builder partnerName(String partnerName) {
            return partnerName(Output.of(partnerName));
        }

        /**
         * @param partnerType The partner type.
         * 
         * @return builder
         * 
         */
        public Builder partnerType(Output<Either<String,PartnerType>> partnerType) {
            $.partnerType = partnerType;
            return this;
        }

        /**
         * @param partnerType The partner type.
         * 
         * @return builder
         * 
         */
        public Builder partnerType(Either<String,PartnerType> partnerType) {
            return partnerType(Output.of(partnerType));
        }

        /**
         * @param partnerType The partner type.
         * 
         * @return builder
         * 
         */
        public Builder partnerType(String partnerType) {
            return partnerType(Either.ofLeft(partnerType));
        }

        /**
         * @param partnerType The partner type.
         * 
         * @return builder
         * 
         */
        public Builder partnerType(PartnerType partnerType) {
            return partnerType(Either.ofRight(partnerType));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
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

        public IntegrationAccountPartnerArgs build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.partnerType = Objects.requireNonNull($.partnerType, "expected parameter 'partnerType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
