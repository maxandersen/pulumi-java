// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.maps;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateAtlaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateAtlaseArgs Empty = new PrivateAtlaseArgs();

    /**
     * The name of the Maps Account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Private Atlas instance.
     * 
     */
    @Import(name="privateAtlasName")
    private @Nullable Output<String> privateAtlasName;

    public Optional<Output<String>> privateAtlasName() {
        return Optional.ofNullable(this.privateAtlasName);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PrivateAtlaseArgs() {}

    private PrivateAtlaseArgs(PrivateAtlaseArgs $) {
        this.accountName = $.accountName;
        this.location = $.location;
        this.privateAtlasName = $.privateAtlasName;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateAtlaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateAtlaseArgs $;

        public Builder() {
            $ = new PrivateAtlaseArgs();
        }

        public Builder(PrivateAtlaseArgs defaults) {
            $ = new PrivateAtlaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder privateAtlasName(@Nullable Output<String> privateAtlasName) {
            $.privateAtlasName = privateAtlasName;
            return this;
        }

        public Builder privateAtlasName(String privateAtlasName) {
            return privateAtlasName(Output.of(privateAtlasName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PrivateAtlaseArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
