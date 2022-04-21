// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents an Azure resource group.
 * 
 */
public final class ResourceGroupValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceGroupValueArgs Empty = new ResourceGroupValueArgs();

    /**
     * Location of the resource group.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ResourceGroupValueArgs() {}

    private ResourceGroupValueArgs(ResourceGroupValueArgs $) {
        this.location = $.location;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceGroupValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceGroupValueArgs $;

        public Builder() {
            $ = new ResourceGroupValueArgs();
        }

        public Builder(ResourceGroupValueArgs defaults) {
            $ = new ResourceGroupValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ResourceGroupValueArgs build() {
            return $;
        }
    }

}
