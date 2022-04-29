// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a Virtual Machine.
 * 
 */
public final class VM extends InvokeArgs {

    public static final VM Empty = new VM();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private VM() {}

    private VM(VM $) {
        this.id = $.id;
        this.location = $.location;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VM defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VM $;

        public Builder() {
            $ = new VM();
        }

        public Builder(VM defaults) {
            $ = new VM(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public VM build() {
            return $;
        }
    }

}
